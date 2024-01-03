package fr.cda.TP1.exercice5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class RomanToNumberTest {

    private RomanToNumber romanToNumber;

    @BeforeEach
    public void setUp(){
        romanToNumber = new RomanToNumber();
    }
    @Test
    @DisplayName("Usage normal de la methode convertirNombreRomainEnNombreArabe")
    public void testconvertirNombreRomainEnNombreArabe() {

        RomanToNumber romanToNumber = new RomanToNumber();

        int result = romanToNumber.convertirNombreRomainEnNombreArabe("XXIV");
        int expected = 24;

        assertEquals(expected, result);
    }
}