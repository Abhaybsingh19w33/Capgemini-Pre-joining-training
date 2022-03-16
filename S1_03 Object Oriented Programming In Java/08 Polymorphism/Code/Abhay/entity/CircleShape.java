package Abhay.entity;

public class CircleShape extends AbstractShape
{
    private double radius;

    public CircleShape() {}

    public CircleShape (double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void printArea() {
        System.out.println("Area of CircleShape = " + Math.PI * radius * radius);
    }
}
