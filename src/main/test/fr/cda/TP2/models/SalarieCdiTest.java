package fr.cda.TP2.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SalarieCdiTest {

    private SalarieCdi salarieCdi;

    @BeforeEach
    public void setUp() {

        double tauxHoraire = 10;

        Salaire salaireMock = mock(Salaire.class);
        salaireMock.setTauxHoraire(tauxHoraire);
        when(salaireMock.payer(150)).thenReturn(1500.0);

        Identite identiteMock = mock(Identite.class);
        when(identiteMock.getNom()).thenReturn("Epstein");
        when(identiteMock.getPrenom()).thenReturn("Jeffrey");

        salarieCdi = new SalarieCdi(
                salaireMock,
                identiteMock
        );
    }

    @Test
    public void testGetNom() {
        String expectedNom = "Epstein";
        String actualNom = salarieCdi.getIdentite().getNom();

        assertEquals(expectedNom, actualNom);
    }

    @Test
    public void testGetPrenom() {
        String expectedPrenom = "Jeffrey";
        String actualPrenom = salarieCdi.getIdentite().getPrenom();

        assertEquals(expectedPrenom, actualPrenom);
    }

    @Test
    public void testPayer() {
        double expectedSalaire = 1500;
        double actualSalaire = salarieCdi.getSalaire().payer(150);

        assertEquals(expectedSalaire, actualSalaire);
    }
}