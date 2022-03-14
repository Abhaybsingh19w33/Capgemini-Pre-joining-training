package Abhay.entity;

public class Circle {
    private double radius;
    // private double pi = 3.1416;
    // private static final double pi = 3.1416;
    public static final double PI = 3.1416;
    // constructors
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // setters
    // getters
    
    public void printArea() {
        double area = PI * radius * radius;
        System.out.println("Area = " + area);
        
    }
}