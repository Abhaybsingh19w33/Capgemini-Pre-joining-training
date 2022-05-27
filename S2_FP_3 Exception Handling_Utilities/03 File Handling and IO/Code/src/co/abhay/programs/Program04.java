package co.abhay.programs;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Program04 {

	public static void main(String[] args) throws Exception{
		
//		PrintWriter out = new PrintWriter (new FileWriter ("numbers.txt"));
//		
//		out.print (100);
//		out.print (200);
//		out.print (1.2);
//		out.print (23.45);
//		
//		out.close ();
//		System.out.println("End of demo. ");
		
		
		FileOutputStream file = new FileOutputStream("numbers.dat");
		
		DataOutputStream out = new DataOutputStream(file);
		
		out.writeDouble (1.2);
		out.writeDouble (1.6e-5);
		out.writeDouble (22.3);
		out.writeDouble (1.6e-5);
		out.writeDouble (1.2);
		out.writeDouble (1.6e-5);
		
		out.close();
		file.close();
		System.out.println("End of demo. ");
	}

}
