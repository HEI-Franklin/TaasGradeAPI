package com.taas.TaasGradeApi.repository;

import com.taas.TaasGradeApi.model.Grade_french;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface Grade_frenchs extends JpaRepository<Grade_french,Long> {
}
