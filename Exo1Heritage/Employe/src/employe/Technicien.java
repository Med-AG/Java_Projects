package employe;

public class Technicien extends Employe {
    
    private int grade, prime;
    
    public Technicien()
    {
        super();
        grade = 1;
        prime = 0;
    }
    
    public Technicien(int grade, String nom, int age, double salaire) {
        super(nom, age, salaire);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }
    
    
    
    public void prime() 
    {
        switch(grade)
        {
            case 1: prime=100; break;
            case 2: prime=200; break;
            case 3: prime=300;break;
            default: System.out.println("dont existe !"); 
        }
    }

    @Override
    public String toString() {
        return "Technicien{" + getNom() + ", salaire = " + calculSalaire() + '}';
    }

    @Override
    public double calculSalaire() 
    {
        return super.calculSalaire() + prime; 
    }
    
    
    
    
    
    
}
