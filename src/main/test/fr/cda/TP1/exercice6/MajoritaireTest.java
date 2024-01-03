package fr.cda.TP1.exercice6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
public class MajoritaireTest {

    private Majoritaire majoritaire;

    @BeforeEach
    public void setUp(){
        majoritaire = new Majoritaire();
    }

    @ParameterizedTest
    @DisplayName("Usage normal de la methode hashMap")
    @MethodSource("tableauMajoritaire")
    public void testHashMap(int[] nombres) {

        int result = majoritaire.hashMap(nombres);
        int expected = 2;
        assertEquals(expected, result);
    }

    private static Stream<int[]> tableauMajoritaire() {
        return Stream.of(
                new int[]{1, 2, 2, 2, 6, 9, 1, 2, 2}
        );
    }
}