package exemple_heritage;

public class Employe {

    String name;
    String emailAdress;
    String phone;
    String departement;
    String adress;
    int yearOfBirth;
    
    public Employe() 
    {
        System.out.println("no parameter constructor !");
    }

    public Employe(String name, String emailAdress, String phone, String departement, String adress, int yearOfBirth) {
        this.name = name;
        this.emailAdress = emailAdress;
        this.phone = phone;
        this.departement = departement;
        this.adress = adress;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    
    
    
    
    
    
    
    
    
}
