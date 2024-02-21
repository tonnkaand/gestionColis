package com.example.gestioncolis.service;

import com.example.gestioncolis.entities.Relais;

import java.util.List;

public interface RelaisService {
    public void create(Relais relais);
    public void update(Relais relais);
    public void delete(Relais relais);
    public Relais getById(Relais relais);
    public List<Relais> getAll();
}
