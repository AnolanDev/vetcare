package com.gus.vetcare.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BreedModel {

    private Long    id;
    private String  name;
    private String  origin;

    public BreedModel(String name, String origin) {
        this.id = id;
        this.name = name;
        this.origin = origin;
    }


}
