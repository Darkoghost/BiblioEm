package com.example.biblioem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Emprunt implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private int numero;

    public Emprunt(int numero) {
        this.numero = numero;
    }

    public Emprunt() {

    }

    public int getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }
}