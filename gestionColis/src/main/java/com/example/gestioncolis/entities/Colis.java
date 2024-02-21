package com.example.gestioncolis.entities;

public class Colis {
    // Attributs
    private int numeroColis;
    private int type;
    private int CNIDestinataire;
    private int CNIExpediteur;
    private String etat;
    private int idAgenceDestination;

    // Constructeur
    public Colis(int numeroColis, int type, int CNIDestinataire, int CNIExpediteur, String etat, int idAgenceDestination) {
        this.numeroColis = numeroColis;
        this.type = type;
        this.CNIDestinataire = CNIDestinataire;
        this.CNIExpediteur = CNIExpediteur;
        this.etat = etat;
        this.idAgenceDestination = idAgenceDestination;
    }

    // Getters et setters (si nécessaire)
    public int getNumeroColis() {
        return numeroColis;
    }

    public void setNumeroColis(int numeroColis) {
        this.numeroColis = numeroColis;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCNIDestinataire() {
        return CNIDestinataire;
    }

    public void setCNIDestinataire(int CNIDestinataire) {
        this.CNIDestinataire = CNIDestinataire;
    }

    public int getCNIExpediteur() {
        return CNIExpediteur;
    }

    public void setCNIExpediteur(int CNIExpediteur) {
        this.CNIExpediteur = CNIExpediteur;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getIdAgenceDestination() {
        return idAgenceDestination;
    }

    public void setIdAgenceDestination(int idAgenceDestination) {
        this.idAgenceDestination = idAgenceDestination;
    }
}

