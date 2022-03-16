package Abhay.entity;

public class Circle extends Shape
{
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public void info() {
        System.out.println("Circle Class Info");
    }

    public void printArea() {
        System.out.println("Area of Circle = " + Math.PI * radius * radius);
    }

    // final public void finalMethod() {
    //     System.out.println("Final method in Circle Class");
    // }
}
