package com.gus.vetcare.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PetModel {
    private Long id;
    private String name;
    private String birthdate;
    private String gender;
    private SpecieModel specieModel;
    private BreedModel breedModel;
    private String color;
    private MedicalTreatmentModel medicalTreatmentModel;
    private CustomerModel ownerModel;

    public PetModel(Long id, String name, String birthdate, String gender, SpecieModel specieModel, BreedModel breedModel, String color, CustomerModel ownerModel) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
        this.specieModel = specieModel;
        this.breedModel = breedModel;
        this.color = color;
        this.ownerModel = ownerModel;
    }

}
