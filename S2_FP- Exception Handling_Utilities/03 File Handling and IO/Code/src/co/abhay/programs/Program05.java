package co.abhay.programs;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;

public class Program05 {
	
	public static void main(String[] args) throws Exception{

//		1 byte at a time
//		FileInputStream file = new FileInputStream("numbers.dat");
//		DataInputStream in = new DataInputStream(file);
//		
//		while (true)  {
//			try {
//				double d = in.readDouble();
//				System.out.println (d);					
//			}
//			catch (EOFException e) {					
//				break;
//			}
//		}
//		in.close();
//		file.close();
		
		FileInputStream file = new FileInputStream("numbers.dat");
		BufferedInputStream bif = new BufferedInputStream(file);
		DataInputStream in = new DataInputStream(bif);
		
		while (true)  {
			try {
				double d = in.readDouble();
				System.out.println (d);					
			}
			catch (EOFException e) {					
				break;
			}
		}
		in.close();
		file.close();
		
		System.out.println("End of demo.");			
	}
}
