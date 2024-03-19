package ExamFinalJava;


public class Voiture {
    
    String matricule;
    private String marque;
    private String carburant;

    public Voiture(){}
    
    public Voiture(String matricule, String marque, String carburant) {
        this.matricule = matricule;
        this.marque = marque;
        this.carburant = carburant;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }
    
    
    
}
