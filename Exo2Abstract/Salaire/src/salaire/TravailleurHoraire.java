package salaire;

public class TravailleurHoraire extends Salaire {
    
    private double retribution;
    private int heures;

    public double getRetribution() {
        return retribution;
    }

    public void setRetribution(double retribution) {
        this.retribution = retribution;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }
    
    

    public TravailleurHoraire() {}

    public TravailleurHoraire(double retribution, String nom, String prenom) {
        super(nom, prenom);
        this.retribution = retribution;
    }

    @Override
    public String toString() {
        return "TravailleurHoraire[ " + getNom() + ", " + getPrenom()  + "heures de travail : "  + getHeures() + " ]";
    }
    
    @Override
    public double gains() {
        return retribution * getHeures();
    }
    
    
    
    
    
    
    
    
    
}
