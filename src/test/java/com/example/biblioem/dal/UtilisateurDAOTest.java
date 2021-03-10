package com.example.biblioem.dal;

import com.example.biblioem.domain.Utilisateur;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UtilisateurDAOTest {

    @InjectMocks
    private Utilisateur utilisateur;

    @Mock
    private UtilisateurDAO utilisateurDAO;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void findByNomAndPrenom() {
        utilisateur = new Utilisateur(666l, "Test", "Utilisateur", "utilisateur.testgmail.com", "23 rue laliloula", "0612345678", null);

        when(utilisateurDAO.findByNomAndPrenom(utilisateur.getNom(), utilisateur.getPrenom())).thenReturn(utilisateur);

        Utilisateur utilisateurFound = utilisateurDAO.findByNomAndPrenom("Test", "Utilisateur");
        verify(utilisateurDAO).findByNomAndPrenom("Test", "Utilisateur");
        assertNotNull(utilisateurFound);
        assertEquals("utilisateur.testgmail.com", utilisateurFound.getEmail());
    }
}
