package com.gus.vetcare.models;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserModel {

    private Long    id;
    private String  name;
    private String  lastname;
    private String  email;
    private String  phone;
    private String  address;
    private String  type; //Medico - Asistente - Cliente
    private String  state; //activo - desactivado


    public UserModel(Long id, String name, String lastname, String email, String phone, String address, String state) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.state = state;
    }
}


