package com.example.gestioncolis.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class DepartArriver {
    private LocalTime heure;
    private LocalDate date;
    private int numero_colis;
    private int id_agence;
    private String etat;

    public DepartArriver(LocalTime heure, LocalDate date, int numero_colis, int id_agence, String etat) {
        this.heure = heure;
        this.date = date;
        this.numero_colis = numero_colis;
        this.id_agence = id_agence;
        this.etat = etat;
    }

    public LocalTime getHeure() {
        return heure;
    }

    public void setHeure(LocalTime heure) {
        this.heure = heure;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNumero_colis() {
        return numero_colis;
    }

    public void setNumero_colis(int numero_colis) {
        this.numero_colis = numero_colis;
    }

    public int getId_agence() {
        return id_agence;
    }

    public void setId_agence(int id_agence) {
        this.id_agence = id_agence;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
