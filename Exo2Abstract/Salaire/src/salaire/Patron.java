package salaire;

public class Patron extends Salaire {
    
    private double salaire;
    
    public Patron() {}

    public Patron(double salaire, String nom, String prenom) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    
    @Override
    public String toString() 
    {
        return "Patron [ " + getNom() + ", " + getNom() + ", " + this.salaire + " ]";
    }

    @Override
    public double gains() 
    {
        return getSalaire();
    }
    
    
    
    
    
    
    
    
    
}
