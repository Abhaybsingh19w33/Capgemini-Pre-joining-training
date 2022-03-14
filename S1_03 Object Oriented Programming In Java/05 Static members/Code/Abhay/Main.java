package Abhay;

import Abhay.entity.Person;
import Abhay.entity.Product;
import Abhay.entity.Circle;

public class Main {

  public static void main(String args[]) {
    // Product p;

    // p = new Product();
    // p.setId(1);
    // p.setName("Chai");
    // p.setPrice(10.2);

    // System.out.println(p);

    // Product p2;

    // p2 = new Product(1, "Someone", 12.3);
    // System.out.println(p2);

    Circle c1, c2, c3;

    c1 = new Circle(1.2);
    c2 = new Circle(2.3);
    c3 = new Circle(4.5);

    c1.printArea();
    c2.printArea();
    c3.printArea();

    System.out.println("Value of pi is : " + Circle.PI);
  }
}

