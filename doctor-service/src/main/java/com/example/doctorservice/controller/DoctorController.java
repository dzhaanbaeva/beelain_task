package com.example.doctorservice.controller;

import com.example.doctorservice.model.Consultation;
import com.example.doctorservice.model.Diagnosis;
import com.example.doctorservice.model.Doctor;
import com.example.doctorservice.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/doctor")
public class DoctorController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public Consultation getAll(@RequestParam("patientId") int patientId, @RequestParam("diagnosisId") int diagnosisId){
        Patient patient = restTemplate.getForObject("http://patient-server/api/v1/patient/" + patientId, Patient.class);

        Diagnosis diagnosis = restTemplate.getForObject("http://diagnosis-server/api/v1/diagnosis/" + diagnosisId, Diagnosis.class);

        Consultation consultation = new Consultation();
        Doctor doctor = new Doctor(1,"Asylbekova");
        consultation.setPat(patient);
        consultation.setDiagnosis(diagnosis);
        consultation.setDoc(doctor);

        return  consultation;
    }
}
