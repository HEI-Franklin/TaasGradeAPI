package com.taas.TaasGradeApi.service;

import com.taas.TaasGradeApi.exceptions.CandidateExceptions;
import com.taas.TaasGradeApi.model.Candidate;
import com.taas.TaasGradeApi.repository.CandidateRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;


@AllArgsConstructor
@Service
public class Candidateservice {
        @Autowired
        private final CandidateRepository candidateRepository;

        public List<Candidate> getAll(){
            return candidateRepository.findAll();
        }


        public Candidate getCandidateById(Long id){
            return candidateRepository.findById(id).orElseThrow(()-> new CandidateExceptions("Candidate not submited"));
        }

        public Candidate createcandidate(Candidate candidate){
            return candidateRepository.save(candidate);
        }

        public Candidate updatecandidate(Candidate candidate){
            return this.candidateRepository.findById(candidate
                            .getId_candidate())
                    .map(candidate1 ->{
                        candidate1.setId_candidate(candidate.getId_candidate());
                        candidate1.setFirst_name(candidate.getFirst_name());
                        candidate1.setLast_name(candidate.getLast_name());
                        return this.candidateRepository.save(candidate1);
                    }).orElseGet(
                            ()-> this.candidateRepository.save(candidate));
        }
        public ResponseEntity<Candidate> rejectCandidate( Long id) {
            Candidate ToReject = this.candidateRepository.findById(id)
                    .orElseThrow(() -> new CandidateExceptions("Candidate not found"));
            this.candidateRepository.delete(ToReject);
            return ResponseEntity.ok().build();
        }
    }

