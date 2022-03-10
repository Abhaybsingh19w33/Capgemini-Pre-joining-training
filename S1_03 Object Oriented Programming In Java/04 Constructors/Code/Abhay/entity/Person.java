package Abhay.entity;

public class Person
{
    private String firstName;
    private String lastName;
    private String city;
    
    // public void init(String id, String name, double price) {
    //     if(id <= 0){
    //         throw new RuntimeException("invalid ID");
    //     }
        
    //     if(price <= 0){
    //         throw new RuntimeException("invalid Price");
    //     }        
        
    //     if(name == null || name.trim().length() == 0){
    //         throw new RuntimeException("invalid Name");            
    //     }
        
    //     this.id = id;
    //     this.name = name;
    //     this.price = price;
    // }
    
    
    // public void setId(String _id) {
    //     if(_id <= 0){
    //         throw new RuntimeException("invalid ID");
    //     }
    //     id = _id;
    // }

    public Person() {
    }

    public Person(String firstName) {
        this(firstName, "", "Banglore");
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
}