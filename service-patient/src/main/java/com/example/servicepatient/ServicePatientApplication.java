package com.example.servicepatient;

import com.example.servicepatient.model.Patient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.ArrayList;
import java.util.List;

@EnableEurekaClient
@SpringBootApplication
public class ServicePatientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicePatientApplication.class, args);
    }


    static List<Patient> patients;

    public static List<Patient> getPatients(){
        if (patients == null) {
            patients = new ArrayList<>();
            Patient p1 = new Patient(1, "azat","azat@gmail.com");
            Patient p2 = new Patient(2, "aika","aika@gmail.com");
            patients.add(p1);
            patients.add(p2);
        }
        return patients;
    }

}
