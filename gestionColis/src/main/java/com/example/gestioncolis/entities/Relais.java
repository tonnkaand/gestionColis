package com.example.gestioncolis.entities;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Relais {
    // Attributs
    private int numeroColis;
    private int idAgence;
    private Timestamp date_arrivee;
    private Timestamp date_depart;

    // Constructeur
    public Relais(int numeroColis, int idAgence, Timestamp date_arrivee, Timestamp date_depart) {
        this.numeroColis = numeroColis;
        this.idAgence = idAgence;
        this.date_arrivee = date_arrivee;
        this.date_depart = date_depart;
    }

    // Getters et setters (si nécessaire)
    public int getNumeroColis() {
        return numeroColis;
    }

    public void setNumeroColis(int numeroColis) {
        this.numeroColis = numeroColis;
    }

    public int getIdAgence() {
        return idAgence;
    }

    public void setIdAgence(int idAgence) {
        this.idAgence = idAgence;
    }

    public Timestamp getDateArrivee() {
        return date_arrivee;
    }

    public void setDateArrivee(Timestamp date_arrivee) {
        this.date_arrivee = date_arrivee;
    }

    public Timestamp getDateDepart() {
        return date_depart;
    }

    public void setDateDepart(Timestamp date_depart) {
        this.date_depart = date_depart;
    }

}