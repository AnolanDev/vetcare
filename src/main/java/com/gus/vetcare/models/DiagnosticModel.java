package com.gus.vetcare.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiagnosticModel {

    private Long id;
    private String code;
    private String description;

    public DiagnosticModel(Long id, String code, String description) {
        this.id = id;
        this.code = code;
        this.description = description;
    }
}
