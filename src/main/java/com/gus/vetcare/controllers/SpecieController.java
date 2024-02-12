package com.gus.vetcare.controllers;

import com.gus.vetcare.models.SpecieModel;
import com.gus.vetcare.services.ICrud;

import java.util.List;

public class SpecieController implements ICrud<SpecieModel> {

    @Override
    public void create(SpecieModel data) {

    }

    @Override
    public SpecieModel getById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, SpecieModel data) {

    }

    @Override
    public List<SpecieModel> getAll() {
        return null;
    }

    @Override
    public boolean disable(Long id) {
        return false;
    }
}
