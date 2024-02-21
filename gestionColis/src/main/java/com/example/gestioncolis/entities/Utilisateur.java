package com.example.gestioncolis.entities;

public class Utilisateur {
    // Attributs
    private int CNI;
    private String nom;
    private int tel;
    private String email;
    private String adresse;
    private String login;
    private String password;

    // Constructeur
    public Utilisateur(int CNI, String nom, int tel, String email, String adresse, String login, String password) {
        this.CNI = CNI;
        this.nom = nom;
        this.tel = tel;
        this.email = email;
        this.adresse = adresse;
        this.login = login;
        this.password = password;
    }

    // Getters et setters (si nécessaire)
    public int getCNI() {
        return CNI;
    }

    public void setCNI(int CNI) {
        this.CNI = CNI;
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

