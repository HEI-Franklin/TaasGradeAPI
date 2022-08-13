package com.taas.TaasGradeApi.controller;

import com.taas.TaasGradeApi.exceptions.CandidateExceptions;
import com.taas.TaasGradeApi.model.Candidate;
import com.taas.TaasGradeApi.model.Grade;
import com.taas.TaasGradeApi.repository.CandidateRepository;
import com.taas.TaasGradeApi.service.Candidateservice;
import com.taas.TaasGradeApi.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class CandidateController {

    @Autowired
    private final Candidateservice candidateservice;

    @Autowired
    private final CandidateRepository Candidate_Repository;

    @Autowired
    private final NoteService noteService;

    @GetMapping("/")
    public String hello(){
        return "Hello wolrd";
    }

    @GetMapping("/all")
    public List<Candidate> getAll(){
        return this.Candidate_Repository.findAll();
    }


    @GetMapping("/all/{id}")
    public Candidate getCandidateById(@PathVariable(value = "id") Long id){
        return this.Candidate_Repository.findById(id).orElseThrow(()-> new CandidateExceptions("Candidate not submited"));
    }

    @PostMapping("/NewCandidate")
    public Candidate createcandidate(@RequestBody Candidate candidate){
        return Candidate_Repository.save(candidate);
    }

    @PutMapping("/NewCandidate")
    public Candidate updatecandidate(@RequestBody Candidate candidate) {
        return this.candidateservice.updatecandidate(candidate);
    }
    @DeleteMapping("/candidates/{id}")
    public ResponseEntity<Candidate> rejectCandidate(@PathVariable(value = "id") Long id) {
        this.candidateservice.rejectCandidate(id);
        return ResponseEntity.ok().build();
    }
}
