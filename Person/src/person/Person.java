package person;


public class Person {

    private String firstName;
    private String lastName;
    
    public Person(String firstN, String lastN) 
    {
        this.firstName = firstN;
        this.lastName = lastN;
    }
    
    public String getFirstName() 
    {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    
}
