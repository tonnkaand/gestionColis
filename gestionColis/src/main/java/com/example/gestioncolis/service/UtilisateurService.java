package com.example.gestioncolis.service;

import com.example.gestioncolis.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    public void create(Utilisateur utilisateur);
    public void update(Utilisateur utilisateur);
    public void delete(Utilisateur utilisateur);
    public Utilisateur getById(Utilisateur utilisateur);
    public List<Utilisateur> getAll();
}
