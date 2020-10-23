package com.example.doctorservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Consultation {
    private Doctor doc;
    private Patient pat;
    private Diagnosis diagnosis;

}
