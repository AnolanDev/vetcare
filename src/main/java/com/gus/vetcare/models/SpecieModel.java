package com.gus.vetcare.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SpecieModel {

    private Long    id;
    private String  name;

    public SpecieModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
