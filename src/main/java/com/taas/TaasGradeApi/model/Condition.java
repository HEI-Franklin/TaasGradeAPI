package com.taas.TaasGradeApi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Condition {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id_condition;
        private float admission;
        private float minMath;
        private float waiting;
}


