package Abhay.entity;

public class Triangle implements Shape
{
    private double base;
    private double height;

    public Triangle() {
    }

    public Triangle (double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
    
    public void printArea(){
        System.out.println("Area of Triangle " + base * height);
    }    
    
    public void info() {
        System.out.println("Triangle info");
    }
}
