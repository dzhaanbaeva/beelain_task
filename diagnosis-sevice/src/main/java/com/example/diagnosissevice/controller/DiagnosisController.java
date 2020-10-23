package com.example.diagnosissevice.controller;

import com.example.diagnosissevice.DiagnosisSeviceApplication;
import com.example.diagnosissevice.model.Diagnosis;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/diagnosis")
public class DiagnosisController {
    @GetMapping("/list")
    public List<Diagnosis> getAll(){
        return DiagnosisSeviceApplication.getDiagnosis();
    }

    @GetMapping("/{diagnosisId}")
    public Diagnosis getById(@PathVariable("diagnosisId") int diagnosisId){
        Diagnosis diagnosis = DiagnosisSeviceApplication.getDiagnosis().stream().filter(x -> x.getId() ==diagnosisId).
                findFirst().orElse(null);

        return diagnosis;
    }
}
