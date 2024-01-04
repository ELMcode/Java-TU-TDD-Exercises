package fr.cda.TP2.models;

public class Adresse {
    private String voie;
    private String rue;
    private Integer cp;
    private String ville;
    private String pays;

    public Adresse(String voie, String rue, Integer cp, String ville, String pays) {
        this.voie = voie;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
        this.pays = pays;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}