package Abhay.entity;

public class Employee
{
    private int id;
    private String name;
    private double salary;
    // private Department department; // aggregated member

    // this will prevent null exception
    private Department department = new Department(); // aggregated member
    
    
    public Employee() {
        // this will prevent null exception
        // department = new Department();
    }

    public Employee(String name, double salary) {
        this.name = name;;
        this.salary = salary;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setDepartment(Department department){
        this.department = department;
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

    public Department getDepartment(){
        return department;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }

    public void print() {
        System.out.println("Employee information : ");
        System.out.println("Id       = " + id);
        System.out.println("Name     = " + name);

        // this will prevent null exception
        // if(department != null) {
            department.print();
        // }
    }

    // Delegate method
    public String getDepartmentName() {
        return department.getName();
    }
}
