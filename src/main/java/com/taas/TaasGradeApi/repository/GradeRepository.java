package com.taas.TaasGradeApi.repository;

import com.taas.TaasGradeApi.model.Grade;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
public interface GradeRepository extends JpaRepository<Grade,Long> {

@Query(value = "SELECT c.first_name as first_name,c.last_name as last_name,m.grade_bacc as grade_bacc1,m.grade_competition as grade_competition1,f.grade_bacc as grade_bacc, f.grade_competition as grade_competition FROM Candidate c INNER JOIN Grade g ON c.id_candidate = g.id_candidate INNER JOIN Grade_math m on m.id_math = g.id_math INNER JOIN Grade_french f on f.id_french = g.id_french",nativeQuery = true)
List findAllGrade ();


}
