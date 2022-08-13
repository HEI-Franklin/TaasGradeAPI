package com.taas.TaasGradeApi.service;


import com.taas.TaasGradeApi.model.Candidate;
import com.taas.TaasGradeApi.model.Grade;
import com.taas.TaasGradeApi.model.Grade_french;
import com.taas.TaasGradeApi.model.Grade_math;
import com.taas.TaasGradeApi.repository.CandidateRepository;
import com.taas.TaasGradeApi.repository.GradeRepository;
import com.taas.TaasGradeApi.repository.Grade_frenchs;
import com.taas.TaasGradeApi.repository.Grade_maths;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

@Service
@AllArgsConstructor
public class NoteService {

    @Autowired
    private final GradeRepository gradeRepository;

    @Autowired
    private final CandidateRepository Candidate_Repository;

    @Autowired
    private final Grade_frenchs grade_frenchs;

    @Autowired
    private final Grade_maths grade_maths;
    public List<Grade> getAllNotes (){
        return  this.gradeRepository.findAll();
    }

   public List<?> findAllGrade (){
      return this.gradeRepository.findAllGrade();

   }
}
