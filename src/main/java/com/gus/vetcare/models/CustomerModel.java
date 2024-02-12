package com.gus.vetcare.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerModel extends UserModel {

    private String code;

    public CustomerModel(Long id, String name, String lastname, String email, String phone,String address, String code, String state) {
        super(id, name, lastname, email, phone, address, state);
        this.code = code;
    }
}


