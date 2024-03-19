package exemple_heritage;

public class Developer extends Employe {
    
    String projectName;
    
    public Developer() 
    {
        System.out.println("sub-class");
    }

    public Developer(String projectName, String name, String emailAdress, String phone, String departement, String adress, int yearOfBirth) {
        super(name, emailAdress, phone, departement, adress, yearOfBirth);
        this.projectName = projectName;
    }

    
    
    
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    
    
    
    
    
    
    
    
    
}
