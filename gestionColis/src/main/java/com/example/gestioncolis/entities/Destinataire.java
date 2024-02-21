package com.example.gestioncolis.entities;

public class Destinataire {
    private int cni;
    private String nom;
    private int tel;
    private String email;
    private String adresse;

    public Destinataire(int cni, String nom, int tel, String email, String adresse) {
        this.cni = cni;
        this.nom = nom;
        this.tel = tel;
        this.email = email;
        this.adresse = adresse;
    }

    public int getCni() {
        return cni;
    }

    public void setCni(int cni) {
        this.cni = cni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
