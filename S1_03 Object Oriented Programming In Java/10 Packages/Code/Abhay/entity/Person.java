package Abhay.entity;

public class Person
{
    private String firstName;
    private String lastName;
    private String city;

    public Person() {
    }
    
    public Person(String firstName, String lastName, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public static void prString(Person p) {
        System.out.println(p.firstName);                
        System.out.println(p.lastName);                        
        System.out.println(p.city);
    }

    public String toString() {
        return firstName + " " + lastName + " " + city;
    }
}