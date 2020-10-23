package com.example.diagnosissevice;

import com.example.diagnosissevice.model.Diagnosis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.ArrayList;
import java.util.List;

@EnableEurekaClient
@SpringBootApplication
public class DiagnosisSeviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiagnosisSeviceApplication.class, args);
    }
public static List<Diagnosis> list;
    public static List<Diagnosis> getDiagnosis(){
        if(list == null){
            list = new ArrayList<>();
            Diagnosis d1 = new Diagnosis(1,"covid", "Symptoms like flu");
            Diagnosis d2 = new Diagnosis(2,"flu", "Symptoms like covid");
            list.add(d1);
            list.add(d2);

        }
        return list;
    }
}
