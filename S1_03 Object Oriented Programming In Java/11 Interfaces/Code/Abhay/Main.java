package Abhay;

import Abhay.entity.Circle;
import Abhay.entity.Shape;
import Abhay.entity.Triangle;
import Abhay.entity.Product;
import Abhay.dao.DaoFactory;
import Abhay.dao.ProductDao;
import Abhay.dao.ProductDaoFileImpl;

public class Main {

  public static void main(String args[]) {

    // Shape s1 = new Shape(); //error
    Shape s1;
    // s1.info(); //error
    // s1.printArea(); //error

    s1 = new Circle(12.97);
    s1.printArea();
    s1.info();
    
    Circle c1 = new Circle(14);    
    c1.printArea();
    c1.info();

    // c1 = (Shape) c1; // error
    // c1.printArea();
    // c1.info();
    
    s1 = new Triangle(3,4);
    s1.printArea();
    s1.info();

    ProductDao dao;
    dao = new ProductDaoFileImpl(); // tight coupling
    dao.getProduct(12);
    dao.deleteProduct(14);

    Product p = new Product();
    dao.saveProduct(p);

    
    ProductDao dao1;
    dao1 = DaoFactory.getProductDao("jdbc"); // loose coupling
    dao1.getProduct(12);
    dao1.deleteProduct(14);

    Product p1 = new Product();
    dao1.saveProduct(p);
  }
}

