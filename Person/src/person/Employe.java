package person;

public class Employe extends Person {
    
    private int employeeId;
    private String jobTitle;

    public Employe(String firstName, String lastName, int employeeId, String jobTitle) 
    {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        
        return super.getLastName() + "," + jobTitle;
    }
    
    
    
    
    
}
