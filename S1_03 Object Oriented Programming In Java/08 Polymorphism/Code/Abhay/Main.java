package Abhay;

import Abhay.entity.Circle;
import Abhay.entity.Shape;
import Abhay.entity.Triangle;
import Abhay.entity.AbstractShape;
import Abhay.entity.CircleShape;

public class Main {

  public static void main(String args[]) {

    Shape s1 = new Shape();
    s1.info();
    s1.printArea();

    System.out.println();
    s1 = new Circle(12.97);
    s1.printArea();
    s1.info();

    System.out.println();
    s1 = new Triangle(12.97, 45.67);
    s1.printArea();
    s1.info();
    
    System.out.println();
    System.out.println();
    AbstractShape s = new CircleShape(12.97);
    s1.printArea();
  }
}

