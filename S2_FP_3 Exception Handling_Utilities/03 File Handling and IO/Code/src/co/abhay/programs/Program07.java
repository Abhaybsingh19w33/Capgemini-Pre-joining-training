package co.abhay.programs;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Program07 {

	public static void main(String[] args) throws Exception{
		
//		without buffer it will take, multiple hits to read data 
		FileInputStream file = new FileInputStream("products.dat");
//		using buffer will take few read operations
		BufferedInputStream bis = new BufferedInputStream(file);
		ObjectInputStream in = new ObjectInputStream(bis);
		
		while(true) {
			try {
				Object obj = in.readObject();
				System.out.println(obj);				
			}
			catch(EOFException e) {
				break;
			}
		}
		
		in.close();
		file.close();
	}

}
