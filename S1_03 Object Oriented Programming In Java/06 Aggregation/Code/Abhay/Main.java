package Abhay;

import Abhay.entity.Employee;
import Abhay.entity.Department;

public class Main {

  public static void main(String args[]) {
    Department d1 = new Department(10, "ADMINISTRATION","Bengalore");

    Employee e1 = new Employee();
    e1.setId(0);
    e1.setName("Scott");
    e1.setSalary(3300.0);
    e1.setDepartment(d1);

    e1.print();

    Employee e2 = new Employee();
    e2.print();

    // Employee e2 = new Employee("Smith", 800.0);
    // e1.setId(2);
    // System.out.println(e1);
    // System.out.println(e2);
  }
}

