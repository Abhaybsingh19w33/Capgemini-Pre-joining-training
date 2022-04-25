package co.abhay.programs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Program01
{
    public static void main( String args[]) {
        
        // By default it will take the time from pc
        Date dt = new Date();
        
        System.out.println(dt);
        System.out.println();

        DateFormat df;
        
        df = DateFormat.getDateInstance();
        System.out.println(df.format(dt));
        System.out.println();

        df = DateFormat.getDateTimeInstance();
        System.out.println(df.format(dt));
        System.out.println();
        
        df = DateFormat.getTimeInstance();
        System.out.println(df.format(dt));
        System.out.println();

        df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(df.format(dt));
        System.out.println();

        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(df.format(dt));
        System.out.println();

        df = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(df.format(dt));
        System.out.println();

        df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(dt));
        System.out.println();

        // DateFormat has some limitations, which can be overcome with SimpleDateFormat

        Date dt2 = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        // to perform date validation
        sdf.setLenient(false);

        System.out.println(sdf.format(dt2));

        System.out.println("Enter your date of birth in DD-MM-YYYY format: ");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        try {
            dt2 = sdf.parse(input);
            System.out.println(dt2);
        } catch (ParseException e) {
            System.err.println("Invalid Input. Expecting date in DD-MM-YYYY format");
            // e.printStackTrace();
        }

        scanner.close();
    }
}
