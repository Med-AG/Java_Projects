package person;


public class Main {
    
    public static void main(String[] args) {
        
        Employe e1 = new Employe("Kortney", "Rosalee", 4451, "HR Manager");
        System.out.println(e1.getFirstName() + " " + e1.getLastName() + " " + 
                e1.getEmployeeId());
        Employe e2 = new Employe("Junior", "Philipa", 4452, "Software Manager");
        System.out.println(e2.getFirstName() + " " + e2.getLastName() + " (" + e2.getEmployeeId() + ")");
      
    }
    
}
