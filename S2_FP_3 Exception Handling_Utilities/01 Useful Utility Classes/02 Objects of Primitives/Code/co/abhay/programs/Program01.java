package co.abhay.programs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Program01
{
    public static void main( String args[]) {
        
        String str = "101000101";
        // 2 for binary
        // 10 for decimal
        int num = Integer.parseInt(str, 2);

        System.out.println(num);
    }
}
