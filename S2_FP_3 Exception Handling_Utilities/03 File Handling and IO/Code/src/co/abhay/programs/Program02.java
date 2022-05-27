package co.abhay.programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Program02 {

	public static void main(String[] args) throws IOException, Exception {
		
//		FileWriter writer;
//		
//		writer  = new FileWriter("info.txt");
//		
//		writer.write("abhay\n");
//		writer.write("singh\n");
//		
//		writer.close();
//		
//		System.out.println("End of demo");
		
//		-----------------------------------------------------------------
		
//		FileWriter writer;
//		
//		writer  = new FileWriter("more-info.txt");
//		
//		PrintWriter out = new PrintWriter(writer);
//		
//		out.println("my name is abhay");
//		out.println(23);
//		
//		out.close();
//		writer.close();

//		-----------------------------------------------------------------
		
		FileWriter writer = new FileWriter("buffer.txt");
		
		BufferedWriter bf = new BufferedWriter(writer);
		
		PrintWriter out = new PrintWriter(bf);
		
		out.println("this is buffered writer");
		
		out.close();
		bf.close();
		writer.close();
		
		System.out.println("End of demo");
	}

}
