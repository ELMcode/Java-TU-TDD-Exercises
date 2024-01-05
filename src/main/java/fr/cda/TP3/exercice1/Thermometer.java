package fr.cda.TP3.exercice1;

public class Thermometer {

    public int closestToZero(int[] temperatures) {

        if (temperatures.length == 0) {
            return 0;
        }

        int closest = temperatures[0];

        for (int temp : temperatures) {
            if (Math.abs(temp) < Math.abs(closest) || (Math.abs(temp)) == (Math.abs(closest)) && temp > 0){
                closest = temp;
            }
        }
        return closest;
    }
}