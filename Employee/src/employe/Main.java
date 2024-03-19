package employe;


public class Main {
    
    public static void main(String[] args) {
        
        Manager manager = new Manager("El Mokhtar Aglili", "1 ABC St", 200000.0, 5);
        Developer developer = new Developer("Iver Dipali", "2 PQR St", 72000.0,"Developer", "Java");
        Programmer programmer = new Programmer("Yaron Gabriel", "3 ABC St", 76000.0, "Python");

        System.out.println("Manager's Bonus: $" + manager.calculateBonus());
        System.out.println("Developer's Bonus: $" + developer.calculateBonus());
        System.out.println("Programmer's Bonus: $" + programmer.calculateBonus());

        System.out.println(manager.generatePerformanceReport());
        System.out.println(developer.generatePerformanceReport());
        System.out.println(programmer.generatePerformanceReport());

        manager.managingProjects();
        developer.writeCode();
        programmer.debugCode();
    }
    
}
    
    
    
    
