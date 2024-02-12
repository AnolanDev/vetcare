package com.gus.vetcare.controllers;

import com.gus.vetcare.models.DiagnosticModel;
import com.gus.vetcare.services.ICrud;

import java.util.List;

public class DiagnosticController implements ICrud<DiagnosticModel> {

    @Override
    public void create(DiagnosticModel data) {

    }

    @Override
    public DiagnosticModel getById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, DiagnosticModel data) {

    }

    @Override
    public List<DiagnosticModel> getAll() {
        return null;
    }

    @Override
    public boolean disable(Long id) {
        return false;
    }
}
