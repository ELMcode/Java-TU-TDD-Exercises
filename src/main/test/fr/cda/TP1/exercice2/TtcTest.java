package fr.cda.TP1.exercice2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class TtcTest {
    private Ttc ttc;

    @BeforeEach
    public void setUp() {
        ttc = new Ttc();
    }

    @ParameterizedTest
    @DisplayName("Usage normal de la methode HtToTtc")
    @ValueSource(ints = {10})
    public void testHtToTtc(int prixHt) {

        double expected = prixHt * ttc.TVA;
        double result = ttc.HtToTtc(prixHt);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @DisplayName("Le prix HT est negatif")
    @ValueSource(ints = {-7})
    public void testHtToTtcPrixHtNegatif(int prixHt) {

        assertThrows(
                IllegalArgumentException.class,
                () -> ttc.HtToTtc(prixHt));
    }

    @ParameterizedTest
    @DisplayName("le prix HT est nul")
    @ValueSource(ints = {0})
    public void testHtToTtcPrixHtNul(int prixHt) {

        double expected = 0;
        double result = ttc.HtToTtc(prixHt);
        assertEquals(expected, result);
    }
}