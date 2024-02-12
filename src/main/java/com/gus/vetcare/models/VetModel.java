package com.gus.vetcare.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VetModel extends UserModel {
    private String degree;
    private String grad_year;
    private String university;

    public VetModel(Long id, String name, String lastname, String email, String phone, String address, String state, String degree, String grad_year, String university) {
        super(id, name, lastname, email, phone, address, state);
        this.degree = degree;
        this.grad_year = grad_year;
        this.university = university;
    }
}



