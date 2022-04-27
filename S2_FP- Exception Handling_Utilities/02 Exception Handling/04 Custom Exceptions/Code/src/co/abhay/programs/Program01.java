package co.abhay.programs;


import co.abhay.entity.InvalidIdException;
import co.abhay.entity.InvalidNameException;
import co.abhay.entity.InvalidPriceException;
import co.abhay.entity.Product;

import java.io.*;

public class Program01
{
    public static void main( String args[]) {
        
        try {

            Product p1 = new Product();
            
            p1.setId(1);
            p1.setName("Chai");
            p1.setPrice(18.4);
            
            System.out.println(p1);
        }
        catch(InvalidIdException e) {
        	System.out.println("Id must be > 0");
        }
        catch(InvalidNameException e) { 
        	System.out.println("Name cannot be empty");
        }
        catch(InvalidPriceException e) {
        	System.out.println("Price must be > 1");
        }
        catch (RuntimeException e) {
            System.out.println("Something went wrong");
        }
        
        // ---------------------------------------------------------------
        // String name;
        // name = null;
        // int len = name.length();

        // System.out.println(name); // NUllPointerException

        FileReader reader = null;
        // compilation fails when no try catch block is found
        try {
			reader = new FileReader("dummy.txt");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

        try {
			reader.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
        
        System.out.println("demo finished");
        
        // ---------------------------------------------------------------
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

            System.exit(0); // in this case finally will not be executed 
            // jvm quits immediately
        }
        catch(Exception e) {
            System.out.println("Something went wrong.");
        }
        finally {
            System.out.println("Inside Finally");
        }
    }
}
