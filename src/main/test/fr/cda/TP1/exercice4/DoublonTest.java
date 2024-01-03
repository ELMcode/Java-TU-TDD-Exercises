package fr.cda.TP1.exercice4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class DoublonTest {

    private Doublon doublon;

    @BeforeEach
    public void setUp(){
        doublon = new Doublon();
    }

    @ParameterizedTest
    @DisplayName("Usage normal de la methode verifierSiDoublons")
    @MethodSource("tableauAvecDoublons")
    public void testVerifierSiDoublons(int[] nombres) {

        boolean expected = true;
        boolean result = doublon.verifierSiDoublons(nombres);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> tableauAvecDoublons() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 8, 0, 9, 9})
        );
    }

    @ParameterizedTest
    @DisplayName("plusieurs tableaux pour la methode verifierSiDoublons")
    @MethodSource("tableauxAvecDoublons")
    public void testPlusieursTableaux(int[] nombres) {

        boolean expected = true;
        boolean result = doublon.verifierSiDoublons(nombres);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> tableauxAvecDoublons() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 8, 0, 9, 9}),
                Arguments.of((Object) new int[]{1, 8, 0, 7, 7})

        );
    }

    @ParameterizedTest
    @DisplayName("Un tableau sans doublon")
    @MethodSource("tableauSansDoublon")
    public void testSansDoublon(int[] nombres) {

        boolean result = doublon.verifierSiDoublons(nombres);
        assertFalse(result);
    }

    private static Stream<Arguments> tableauSansDoublon() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 8, 0, 6, 9})
        );
    }

    @ParameterizedTest
    @DisplayName("Plusieurs tableaux sans doublon")
    @MethodSource("tableauxSansDoublon")
    public void testPlusieursTableauxSansDoublon(int[] nombres) {

        boolean result = doublon.verifierSiDoublons(nombres);
        assertFalse(result);
    }

    private static Stream<Arguments> tableauxSansDoublon() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 8, 0, 6, 9}),
                Arguments.of((Object) new int[]{1, 2, 0, 4, 5})
        );
    }
}