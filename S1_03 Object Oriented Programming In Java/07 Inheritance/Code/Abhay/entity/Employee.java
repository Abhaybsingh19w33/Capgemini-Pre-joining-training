package Abhay.entity;

public class Employee extends Person
{
    private int id;
    private double salary;
    
    public Employee() {}

    public void setId(int id){
        this.id = id;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public double getSalary(){
        return salary;
    }

    public String toString() {
        return id  + " " + salary;
    }

    public void print() {
        super.print();
        System.out.println("Employee information : ");
        System.out.println("Id       = " + id);
        System.out.println("Salary     = " + salary);
    }
}
