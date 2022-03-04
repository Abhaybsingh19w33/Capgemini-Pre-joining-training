package Abhay;
import Abhay.entity.Product;
import Abhay.entity.Person;

public class Main
{
    public static void main(String args[]) {
        Product p1;
        
        p1 = new Product(12);
        p1.init(1,"somename", 23.0);
        // p1.setId(100);
        System.out.println(p1);
        // System.out.println(p1.getId());
        // System.out.println(p1.getName());
        // System.out.println(p1.getPrice());
        Product.print(p1);

        Person p;
        
        p = new Product();
        // p1.init(1,"somename", 23.0);

        p.setFirstName("Abhay");
        p.setLastName("Singh");
        p.setCity("Pune");
        System.out.println(p1);
        Product.print(p1);
    }
}
