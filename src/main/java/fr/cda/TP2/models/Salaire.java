package fr.cda.TP2.models;

public class Salaire {
    private double tauxHoraire;

    public Salaire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    /**
     * Calculates the salary based on the number of hours worked
     * @param  heuresTravaillees the number of hours worked
     * @return the calculated salary
     */
    public double payer(int heuresTravaillees) {
        double salaire = 0;
        if (heuresTravaillees <= 151.67) {
            salaire = tauxHoraire * heuresTravaillees;
        } else {
            double heuresNormales = 151.67;
            double heuresSupp = heuresTravaillees - heuresNormales;
            salaire = (tauxHoraire * heuresNormales) + (tauxHoraire * 1.25 * heuresSupp);
        }
        return salaire;
    }
}
