package com.example.gestioncolis.service;

import com.example.gestioncolis.entities.Nature;

import java.util.List;

public interface NatureService {
    public void create(Nature nature);
    public void update(Nature nature);
    public void delete(Nature nature);
    public Nature getById(Nature nature);
    public List<Nature> getAll();
}
