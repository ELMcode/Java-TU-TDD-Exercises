package fr.cda.TP2.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class SalaireTest {

    @ParameterizedTest
    @DisplayName("Testing 'Payer' with hours worked lower than 151.67")
    @CsvSource({"10.5, 115, 1207.5"})
    public void testPayerLower(double tauxHoraire, double heuresTravaillees, double expectedSalaire) {
        Salaire salaire = new Salaire(tauxHoraire);
        assertEquals(expectedSalaire, salaire.payer(heuresTravaillees));
    }

    @ParameterizedTest
    @DisplayName("Testing 'Payer' with hours worked higher than 151.67")
    @CsvSource({"10.5, 160, 1701.86625"})
    public void testPayerHigher(double tauxHoraire, double heuresTravaillees, double expectedSalaire) {
        Salaire salaire = new Salaire(tauxHoraire);
        assertEquals(expectedSalaire, salaire.payer(heuresTravaillees));
    }
}