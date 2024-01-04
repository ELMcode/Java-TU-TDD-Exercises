package fr.cda.TP2.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalarieTest {

    private Salarie salarie;

    @BeforeEach
    public void setup() {
        Salaire salaire = new Salaire(11.5);
        Adresse adresse1 = new Adresse(
                "Residence du test2",
                "Rue du test2",
                59100, "Lille",
                "France"
        );
        Identite identite1 = new Identite("Macron", "Brigitte", adresse1);
        salarie = new Salarie(salaire, identite1);
    }

    @Test
    @DisplayName("Testing 'travailler' method with given hours")
    public void testTravaillerWithParam() {
        double heuresTravaillees = 8;
        double expectedSalaire = 92;

        salarie.travailler(heuresTravaillees);

        double actualSalaire = salarie.getSalaire().payer(heuresTravaillees);

        assertEquals(expectedSalaire, actualSalaire);
    }

    @Test
    @DisplayName("Testing 'travailler' method without specifying hours (without param")
    public void testTravaillerWithoutParam() {
        double expectedSalaire = 1744.205;

        salarie.travailler();

        double actualSalaire = salarie.getSalaire().payer(151.67);

        assertEquals(expectedSalaire, actualSalaire);
    }

    @Test
    @DisplayName("Testing 'demenager' method")
    public void testDemenager() {
        Adresse nouvelleAdresse = new Adresse(
                "Residence nouvelle",
                "25 Rue de la NouvelleAddr",
                25000, "Arras",
                "France"
        );
        salarie.demenager(nouvelleAdresse);

        Adresse actualAdresse = salarie.getIdentite().getAdresse();

        assertEquals(nouvelleAdresse, actualAdresse);
    }

    @Test
    @DisplayName("Testing 'augmenter' method")
    public void testAugmenter() {
        double pourcentageAugmentation = 10;
        double tauxHoraireInitial = salarie.getSalaire().getTauxHoraire();

        salarie.augmenter(pourcentageAugmentation);

        double tauxHoraireApresAugmentation = tauxHoraireInitial * (1 + pourcentageAugmentation / 100);
        double actualTauxHoraire = salarie.getSalaire().getTauxHoraire();

        assertEquals(tauxHoraireApresAugmentation, actualTauxHoraire);
    }
}