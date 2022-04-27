package co.abhay.entity;


public class Product
{
    private int id;
    private String name;
    private double price;
    
    public Product() {
    }
    
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public void setId(int id) {
      if(id < 1) {
        throw new InvalidIdException("Invalid id, must be positive");
      }
      this.id = id;
    }
  
    public int getId() {
      return id;
    }
  
    public void setName(String name) {
      if(name == null || name.trim().length() == 0) {
        throw new InvalidNameException("Name cannot be empty or null");
      }
      this.name = name;
    }
  
    public String getName() {
      return name;
    }
  
    public void setPrice(double price) {
      if(price < 1) {
        throw new InvalidPriceException("Price must be more than or equals to 1");
      }
      this.price = price;
    }
  
    public double getPrice() {
      return price;
    }
  
    @Override
    public String toString() {
      return id + " " + name + " " + price;
    }

}
