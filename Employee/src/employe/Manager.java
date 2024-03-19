package employe;

public class Manager extends Employe {
    
    private int numberOfSubordinates;
    
    public Manager(String name, String address, double salary, int numberOfSubordinates) 
    {
        super(name, address, salary, "Manager");
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance report for manager " + super.getName() + ": Excellent"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculateBonus() {
        return super.getSalary() * 0.15; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void managingProjects() 
    {
        System.out.println("Manager " + getName() + " is managing a project.");
    }
    
    
}
