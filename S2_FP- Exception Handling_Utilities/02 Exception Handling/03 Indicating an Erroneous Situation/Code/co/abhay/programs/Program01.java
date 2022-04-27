package co.abhay.programs;

import java.util.*;

import co.abhay.entity.Product;

import java.io.*;

public class Program01
{
    public static void main( String args[]) {
        

        Product p1 = new Product();

        p1.setId(1);
        p1.setName("Chai");
        p1.setPrice(18.4);

        System.out.println(p1);
        
        // String name;
        // name = null;
        // int len = name.length();

        // System.out.println(name); // NUllPointerException

        FileReader reader;
        // compilatioon fails when no try catch block is found
        reader = new FileReader("dummy.txt");

        reader.close();
        System.out.println("demo finished");

        try {
            int n, d, q;
            // ArraylndexOutOfBoundsException
            // NumberFormatException
            n = Integer.parseInt (args [0]);
            d = Integer.parseInt (args [1]);
            q = n/d; // ArithmeticException
            System.out.println("Quotient = " + q);
        }
        catch (NumberFormatException e) {
            System.out.println("only works with integers");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("two inputs required!");
        }
        catch (ArithmeticException e) {
            System.out.println("Second number cannot be zero");
            // return; // to go to jre main function
            // but finally block will be executed even using return

            // throw new RuntimeException("Custom throwing");
            // even using throw finally block is still executed

            System.exit(0); // in this case finally will not be executed // jvm quits immediately
        }
        catch(Exception e) {
            System.out.println("Something went wrong.");
        }
        finally {
            System.out.println("Inside Finally");
        }
    }
}
