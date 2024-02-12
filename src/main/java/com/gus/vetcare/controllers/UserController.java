package com.gus.vetcare.controllers;

import com.gus.vetcare.models.UserModel;
import com.gus.vetcare.services.ICrud;

import java.util.List;

public class UserController implements ICrud<UserModel> {

    @Override
    public void create(UserModel data) {

    }

    @Override
    public UserModel getById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, UserModel data) {

    }

    @Override
    public List<UserModel> getAll() {
        return null;
    }

    @Override
    public boolean disable(Long id) {
        return false;
    }
}
