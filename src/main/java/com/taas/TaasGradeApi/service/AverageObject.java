package com.taas.TaasGradeApi.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class AverageObject {
     Grade AverageGrade(float grade_bacc,float grade_competition,float min_passed_value,String passed,float minMath,float wait){
        Grade grade = new Grade();
            passed = "Admis";
        float total = (grade_bacc+grade_competition)/2;
        grade.setTotal(total);
        if(total<min_passed_value || grade_bacc<minMath || grade_bacc<wait){
           grade.setPassed("Récâlé");
        }
        return grade;
    }

}
