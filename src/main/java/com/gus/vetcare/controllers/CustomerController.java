package com.gus.vetcare.controllers;

import com.gus.vetcare.models.CustomerModel;
import com.gus.vetcare.services.ICrud;

import java.util.List;

public class CustomerController implements ICrud<CustomerModel> {

    @Override
    public void create(CustomerModel data) {

    }

    @Override
    public CustomerModel getById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, CustomerModel data) {

    }

    @Override
    public List<CustomerModel> getAll() {
        return null;
    }

    @Override
    public boolean disable(Long id) {
        return false;
    }
}
