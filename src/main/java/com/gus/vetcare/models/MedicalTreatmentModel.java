package com.gus.vetcare.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedicalTreatmentModel {
    private Long id;
    private String code;
    private String name;
    private String dosage; //dosis

    public MedicalTreatmentModel(Long id, String code, String name, String dosage) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.dosage = dosage;
    }
}
