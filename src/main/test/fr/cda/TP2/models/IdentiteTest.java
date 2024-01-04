package fr.cda.TP2.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentiteTest {

    private Identite identite;

    @BeforeEach
    public void  setUp(){
        Adresse adresse = new Adresse(
                "Residence du test",
                "Rue du test",
                59000,
                "Lille",
                "France");
        identite = new Identite("Elm","Amine", adresse);
    }

    @Test
    @DisplayName("testing relation of Identite class with Adresse class")
    public void testGetAdresse(){
        Adresse expected = new Adresse(
                "Residence du test",
                "Rue du test",
                59100,
                "Lille",
                "France");
        Adresse actual = identite.getAdresse();

        assertEquals(expected.getRue(), actual.getRue());
        assertEquals(expected.getCp(), actual.getCp());
        assertEquals(expected.getVille(), actual.getVille());
        assertEquals(expected.getPays(), actual.getPays());
    }
}