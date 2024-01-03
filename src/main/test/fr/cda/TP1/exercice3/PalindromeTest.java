package fr.cda.TP1.exercice3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    private Palindrome palindrome;

    @BeforeEach
    public void setUp(){
        palindrome = new Palindrome();
    }

    @ParameterizedTest
    @DisplayName("Usage normal de la methode estUnPalindrome")
    @ValueSource(ints={141})
    public void testEstUnPalindrome(long nombre){

        boolean expected = true;
        boolean result = palindrome.estUnPalindrome(nombre);
        assertEquals(expected,result);
    }

    @ParameterizedTest
    @DisplayName("Plusieurs nombres pour la methode estUnPalindrome")
    @CsvSource({"141", "1991", "2442", "2445442"})
    public void testEstUnPalindromePlusieursNombres(long nombre) {

        boolean result = palindrome.estUnPalindrome(nombre);
        assertTrue(result);
    }

    @ParameterizedTest
    @DisplayName("Le nombre n'est pas un palindrome")
    @ValueSource(ints={178})
    public void testEstUnPalindromeNonPalindrome(long nombre) {

        boolean result = palindrome.estUnPalindrome(nombre);
        assertFalse(result);
    }

    @ParameterizedTest
    @DisplayName("Le nombre est inférieur à 10")
    @ValueSource(ints={8})
    public void testEstUnPalindromeNombreInferieurA10(long nombre) {

        assertThrows(
                IllegalArgumentException.class,
                () -> palindrome.estUnPalindrome(nombre));
    }
}