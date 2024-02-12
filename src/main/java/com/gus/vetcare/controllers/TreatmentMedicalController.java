package com.gus.vetcare.controllers;

import com.gus.vetcare.models.MedicalTreatmentModel;
import com.gus.vetcare.services.ICrud;

import java.util.List;

public class TreatmentMedicalController implements ICrud<MedicalTreatmentModel> {
    @Override
    public void create(MedicalTreatmentModel data) {

    }

    @Override
    public MedicalTreatmentModel getById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, MedicalTreatmentModel data) {

    }

    @Override
    public List<MedicalTreatmentModel> getAll() {
        return null;
    }

    @Override
    public boolean disable(Long id) {
        return false;
    }
}
