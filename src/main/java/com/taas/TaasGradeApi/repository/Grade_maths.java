package com.taas.TaasGradeApi.repository;

import com.taas.TaasGradeApi.model.Grade_math;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface Grade_maths extends JpaRepository<Grade_math,Long> {
}
