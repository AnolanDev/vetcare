package com.gus.vetcare.controllers;

import com.gus.vetcare.models.VetModel;
import com.gus.vetcare.services.ICrud;

import java.util.List;

public class VetController implements ICrud<VetModel> {

    @Override
    public void create(VetModel data) {

    }

    @Override
    public VetModel getById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, VetModel data) {

    }

    @Override
    public List<VetModel> getAll() {
        return null;
    }

    @Override
    public boolean disable(Long id) {
        return false;
    }
}
