package Abhay.entity;

public class Product
{
    final private int initial_id;
    private int id;
    private String name;
    private double price;
    
    public void init(int id, String name, double price) {
        if(id <= 0){
            throw new RuntimeException("invalid ID");
        }
        
        if(price <= 0){
            throw new RuntimeException("invalid Price");
        }        
        
        if(name == null || name.trim().length() == 0){
            throw new RuntimeException("invalid Name");            
        }
        
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public Product(int _initial_id) {
        initial_id = _initial_id;
    }
    
    public void setId(int _id) {
        if(_id <= 0){
            throw new RuntimeException("invalid ID");
        }
        
        id = _id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setName(String _name) {
        name = _name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setPrice(double _price) {
        price = _price;
    }
    
    public double getPrice() {
        return price;
    }
    
    public static void print(Product p) {
        System.out.println(p.initial_id); 
        System.out.println(p.id);                
        System.out.println(p.name);                        
        System.out.println(p.price);
    }
}
