package com.example.gestioncolis.service;

import com.example.gestioncolis.entities.Colis;

import java.util.List;

public interface ColisService {
    public void create(Colis colis);
    public void update(Colis colis);
    public void delete(Colis colis);
    public Colis getById(Colis colis);
    public List<Colis> getAll();
}
