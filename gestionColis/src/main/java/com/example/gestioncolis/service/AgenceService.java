package com.example.gestioncolis.service;

import com.example.gestioncolis.entities.Agence;

import java.util.List;

public interface AgenceService {
    public void create(Agence agence);
    public void update(Agence agence);
    public void delete(Agence agence);
    public Agence getById(Agence agence);
    public List<Agence> getAll();
}
