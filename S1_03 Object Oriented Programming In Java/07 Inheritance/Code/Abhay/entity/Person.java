package Abhay.entity;

public class Person
{
    private String name;
    private String city;
    
    public Person() {
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public void print() {
       System.out.println("Person information : ");
       System.out.println("Name     = " + name);
       System.out.println("City     = " + city);
    }
}