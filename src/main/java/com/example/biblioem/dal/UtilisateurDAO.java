package com.example.biblioem.dal;

import com.example.biblioem.domain.Utilisateur;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UtilisateurDAO extends CrudRepository<Utilisateur, Long> {

    Utilisateur findByNomAndPrenom(String nom, String prenom);
}
