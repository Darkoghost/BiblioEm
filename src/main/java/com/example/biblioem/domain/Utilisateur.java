package com.example.biblioem.domain;

import javax.persistence.*;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(length = 25)
    private String nom;
    @Column(length = 25)
    private String prenom;
    @Column(length = 50)
    private String email;
    @Column(length = 80)
    private String adresse;
    private int telephone;

    public Utilisateur(String nom, String prenom, String email, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public Utilisateur() {

    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getTelephone() { return telephone; }
}
