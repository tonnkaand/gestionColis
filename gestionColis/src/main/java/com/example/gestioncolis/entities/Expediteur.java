package com.example.gestioncolis.entities;

public class Expediteur {
    private int cni;
    private String nom;
    private int tel;
    private String email;
    private String adresse;
    private String login;
    private String password;

    public Expediteur(int cni, String nom, int tel, String email, String adresse, String login, String password) {
        this.cni = cni;
        this.nom = nom;
        this.tel = tel;
        this.email = email;
        this.adresse = adresse;
        this.login = login;
        this.password = password;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
