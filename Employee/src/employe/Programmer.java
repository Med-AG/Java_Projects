/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;


public class Programmer extends Developer {
    
    
    public Programmer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Programmer", programmingLanguage);
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance report for Programmer " + getName() + ": Excellent";//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.12; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void debugCode() {
        // Custom method for debugging code
        System.out.println("Programmer " + getName() + " is debugging code in " + getProgrammingLanguage());
    }
    
    
    
    
    
}
