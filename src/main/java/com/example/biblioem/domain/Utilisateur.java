package com.example.biblioem.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idUser;

    @Column(length = 25)
    private String nom;
    @Column(length = 25)
    private String prenom;
    @Column(length = 50)
    private String email;
    @Column(length = 80)
    private String adresse;
    private String telephone;

    @OneToMany(mappedBy = "Utilisateur")
    private List<Emprunt> empruntList;


    public Utilisateur(Long idUser, String nom, String prenom, String email, String adresse, String telephone, List<Emprunt> empruntList) {
        this.idUser = idUser;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
        this.empruntList = empruntList;
    }

    public Utilisateur() {

    }

    public Long getIdUser() {
        return idUser;
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

    public String getTelephone() { return telephone; }

    public List<Emprunt> getEmpruntList() {
        return empruntList;
    }
}
