package co.abhay.programs;

import java.util.*;
import java.io.*;

public class Program01
{
    public static void main( String args[]) {
        
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
        catch (ArraylndexOutOfBoundsException e) {
            System.out.println("two inputs required!");
        }
        catch (ArithmeticException e) {
            System.out.println("Second number cannot be zero");
        }
        catch(Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
