package com.gus.vetcare.controllers;

import com.gus.vetcare.models.PetModel;
import com.gus.vetcare.services.ICrud;

import java.util.List;

public class PetController implements ICrud<PetModel> {


    @Override
    public void create(PetModel data) {

    }

    @Override
    public PetModel getById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, PetModel data) {

    }

    @Override
    public List<PetModel> getAll() {
        return null;
    }

    @Override
    public boolean disable(Long id) {
        return false;
    }
}
