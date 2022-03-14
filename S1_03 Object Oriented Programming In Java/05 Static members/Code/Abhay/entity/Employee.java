package Abhay.entity;

public class Employee
{
    public static int counter = 0;

    // static block is used for initialization of varibale where loops or conditions statement are required
    static {
        counter = 1000;
    }

    private final int id;
    private String name;
    private double salary;
    
    public Employee() {
        this.id = ++counter;
    }

    public Employee(String name, double salary) {
        this();
        this.name = name;;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}
