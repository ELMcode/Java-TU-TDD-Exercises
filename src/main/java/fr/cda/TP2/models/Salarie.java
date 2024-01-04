package fr.cda.TP2.models;

public class Salarie {
    private Salaire salaire;
    private Identite identite;

    public Salarie(Salaire salaire, Identite identite) {
        this.salaire = salaire;
        this.identite = identite;
    }

    public Salaire getSalaire() {
        return salaire;
    }

    public void setSalaire(Salaire salaire) {
        this.salaire = salaire;
    }

    public Identite getIdentite() {
        return identite;
    }

    public void setIdentite(Identite identite) {
        this.identite = identite;
    }

    /**
     * Method 'travailler' calculate the salary earned
     * @param  heures  the number of hours worked
     */
    public void travailler(double heures) {
        double salaire = this.salaire.payer(heures);
        System.out.println("Le salarié " + identite.getPrenom() + " " + identite.getNom() + " a travaillé " +
                heures + " heures et a touché un salaire de " + salaire + " euros");
    }

    /**
     * Method 'travailler' without param calculate the salary earned based on 151.67 hours worked
     */
    public void travailler() {
        travailler(151.67);
    }

    /**
     * Move the salary to a new address
     * @param  adresse  the new address
     */
    public void demenager(Adresse adresse) {
        identite.setAdresse(adresse);
    }

    /**
     * A function to augment the hourly rate of the salary
     * @param  pourcentage the percentage by which to increase the hourly rate
     */
    public void augmenter(double pourcentage) {
        double nouveauTauxHoraire = salaire.getTauxHoraire() * (1 + pourcentage / 100);
        salaire.setTauxHoraire(nouveauTauxHoraire);
    }
}