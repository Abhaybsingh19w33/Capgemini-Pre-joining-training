package Abhay;

import Abhay.entity.Person;
import Abhay.entity.Product;
import Abhay.entity.Circle;
import Abhay.entity.Employee;

public class Main2 {

  public static void main(String args[]) {
    Employee e1 = new Employee();
    e1.setName("Scott");
    e1.setSalary(3300.0);

    Employee e2 = new Employee("Smith", 800.0);
    System.out.println(e1);
    System.out.println(e2);
  }
}

