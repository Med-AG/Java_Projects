package employe;


public class Employe {
    
    private String nom;
    private int age;
    private double salaire;
    
    public Employe() 
    {
        System.out.println("constructor par defaut");
    }
    
    public Employe(String nom, int age, double salaire) 
    {
        this.nom = nom;
        this.age = age;
        this.salaire = salaire;
    }
    
    public Employe(Employe e1)
    {
        this(e1.nom, e1.age, e1.salaire);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public double calculSalaire() {
        return salaire;
    }
    
    public void augmentation(double aug)
    {
        this.salaire += aug;
        System.out.println("salaire after augmentation : "+calculSalaire());
    }

    @Override
    public String toString() {
        return "Employe{" + "nom=" + nom + ", salaire=" + salaire + '}';
    }
    
    public void afficher()
    {
        System.out.println("[ "+getNom()+", "+getAge()+" ans, "+calculSalaire()+" $ ]");
    }
    
}
