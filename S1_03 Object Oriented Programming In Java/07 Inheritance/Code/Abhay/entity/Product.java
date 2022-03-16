package Abhay.entity;

public class Product {

  private int id;
  private String name;
  private double price;

  public Product() {}

  public Product(int id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public void setId(int _id) {
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

  @Override
  public String toString() {
    return id + " " + name + " " + price;
  }

  public void print() {
    System.out.println("ID    = " + id);
    System.out.println("Name  = " + name);
    System.out.println("Price  = " + price);
  }
}
