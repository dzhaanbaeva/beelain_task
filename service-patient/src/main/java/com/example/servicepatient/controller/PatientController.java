package com.example.servicepatient.controller;


import com.example.servicepatient.ServicePatientApplication;
import com.example.servicepatient.model.Patient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patient")
public class PatientController {

    @GetMapping("/list")
    public List<Patient> getAll(Model model){
        return ServicePatientApplication.getPatients();
    }

    @GetMapping("/{patientId}")
    public Patient getById(@PathVariable("patientId") int patientId){
        Patient patient = ServicePatientApplication.getPatients().stream().filter(x -> x.getId() == patientId).findFirst().orElse(null);
        return patient;
    }
}
