package com.taas.TaasGradeApi.service;


import com.taas.TaasGradeApi.model.Candidate;
import com.taas.TaasGradeApi.model.Grade_french;
import com.taas.TaasGradeApi.repository.CandidateRepository;
import com.taas.TaasGradeApi.repository.Grade_frenchs;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class FrenchService {
    @Autowired
    private final Grade_frenchs grade_frenchs;

    @Autowired
    private final CandidateRepository candidateRepository;

    public Optional<Grade_french> getGradeFrenchById(Long id){
        return this.grade_frenchs.findById(id);

    }

    public Grade_french getGradeByName(String name){
       Candidate candidate = candidateRepository.findByname(name);
       Grade_french grade_french = new Grade_french();
      grade_french.setId_french(candidate.getId_candidate());

      return grade_french;
    }
}
