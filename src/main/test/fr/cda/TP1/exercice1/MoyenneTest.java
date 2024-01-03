package fr.cda.TP1.exercice1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class MoyenneTest {
    private Moyenne moyenne;

    @BeforeEach
    public void setUp() {
        moyenne = new Moyenne();
    }

    @ParameterizedTest
    @DisplayName("Usage normal de la méthode")
    @CsvSource({"10, 12, 14"})
    public void testMoyenne(int note1, int note2, int note3) {
        int[] notes = {note1, note2, note3};
        int expected = (note1 + note2 + note3) / 3;
        int result = moyenne.moyenne(notes);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @DisplayName("Le tableau a moins de 3 notes")
    @CsvSource({"10, 12"})
    public void testMoyenneMoinsDe3Notes(int note1, int note2) {
        int[] notes = {note1, note2};
        assertThrows(IllegalArgumentException.class, () -> moyenne.moyenne(notes));
    }

    @ParameterizedTest
    @DisplayName("Le tableau a plus de 3 notes")
    @CsvSource({"8, 12, 9, 16"})
    public void testMoyennePlusDe3Notes(int note1, int note2, int note3, int note4) {
        int[] notes = {note1, note2, note3, note4};
        assertThrows(IllegalArgumentException.class, () -> moyenne.moyenne(notes));
    }

    @ParameterizedTest
    @DisplayName("Une note est inférieure à 0")
    @CsvSource({"7, -2, 14"})
    public void testMoyenneNoteInferieureA0(int note1, int note2, int note3) {
        int[] notes = {note1, note2, note3};
        assertThrows(IllegalArgumentException.class, () -> moyenne.moyenne(notes));
    }

    @ParameterizedTest
    @DisplayName("Une note est supérieure à 20")
    @CsvSource({"10, 28, 13"})
    public void testMoyenneNoteSuperieureA20(int note1, int note2, int note3) {
        int[] notes = {note1, note2, note3};
        assertThrows(IllegalArgumentException.class, () -> moyenne.moyenne(notes));
    }
}