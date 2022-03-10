package Abhay;

import Abhay.entity.Person;
import Abhay.entity.Product;

public class Main {

  public static void main(String args[]) {
    Product p;

    p = new Product();
    p.setId(1);
    p.setName("Chai");
    p.setPrice(10.2);

    System.out.println(p);

    Product p2;

    p2 = new Product(1, "Someone", 12.3);
    System.out.println(p2);
  }
}
