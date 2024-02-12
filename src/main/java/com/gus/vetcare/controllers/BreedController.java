package com.gus.vetcare.controllers;

import com.gus.vetcare.services.ICrud;
import com.gus.vetcare.models.BreedModel;

import java.util.ArrayList;
import java.util.List;

public class BreedController implements ICrud<BreedModel> {

    private List<BreedModel> breedModels = new ArrayList<>();

    @Override
    public void create(BreedModel data) {
        this.breedModels.add(data);
    }

    @Override
    public BreedModel getById(Long id) {
        BreedModel result = null;
        for(BreedModel aux: breedModels){
            if(aux.getId() == id){
                result = aux;
                break;
            }
        }
        return result;
    }

    @Override
    public void update(Long id, BreedModel data) {
        BreedModel breedModel = this.getById(id);
        breedModel.setId(data.getId());
        breedModel.setName(data.getName());
        breedModel.setOrigin(data.getOrigin());

        int position = breedModels.indexOf(breedModel);
        breedModels.add(position, breedModel);
    }

    @Override
    public List<BreedModel> getAll() {
        return breedModels;
    }

    @Override
    public boolean disable(Long id) {
        return breedModels.removeIf(x->x.getId().equals(id));
    }
}
