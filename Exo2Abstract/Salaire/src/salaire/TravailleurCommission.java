package salaire;

public class TravailleurCommission extends Salaire {
    
    private double salaire;
    private double commission;
    private int quantite;

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    
    
    public TravailleurCommission() {}

    public TravailleurCommission(double salaire, double commission, String nom, String prenom) 
    {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "TravailleurCommission [ " + getNom() + ", " + getPrenom() + "commission par article vendue = " + commission + '}';
    }

    @Override
    public double gains() {
        return getSalaire();
    }
    
    
    
    
    
}
