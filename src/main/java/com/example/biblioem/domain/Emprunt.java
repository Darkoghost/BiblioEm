package com.example.biblioem.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Emprunt implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private Utilisateur utilisateur;

    private Long Livre;

    public Emprunt(Long id, Utilisateur utilisateur, Long Livre) {
        this.id = id;
        this.utilisateur = utilisateur;
        this.Livre = Livre;
    }

    public Emprunt() {

    }

    public Long getId() {
        return id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public Long getLivre() {
        return Livre;
    }
}
