package fr.cda.TP3.exercice1;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThermometerTest {

    @Test
    public void arrayEmptyReturn0() {

        Thermometer thermometer = new Thermometer();
        int expected = 0;
        int actual = thermometer.closestToZero(new int[] {});
        assertEquals(expected, actual);
    }

    @Test
    public void arrayWithPositivesReturnsClosestToZero() {

        Thermometer thermometer = new Thermometer();
        int expected = 1;
        int actual = thermometer.closestToZero(new int[] {1, 2, 3});
        assertEquals(expected,actual);
    }

    @Test
    public void arrayWithNegativesAndPositivesReturnsClosestToZero() {

        Thermometer thermometer = new Thermometer();
        int expected = -1;
        int actual = thermometer.closestToZero(new int[] {-1, -8, 3, 23});
        assertEquals(expected, actual);
    }



}
