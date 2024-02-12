package com.gus.vetcare.services;

import java.util.List;

public interface ICrud <T> {

    void create(T data);

    T getById(Long id);

    void update(Long id, T data);

    List<T> getAll();

    boolean disable(Long id);
}
