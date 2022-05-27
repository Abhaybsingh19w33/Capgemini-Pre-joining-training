package co.abhay.programs;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import co.abhay.entity.Product;

public class Program06 {
	
	public static void main(String[] args) throws Exception{
		
		Product[] products = {
				new Product (0 , "prod" , 1),
				new Product (1 , "prod1" , 2),
				new Product (2 , "prod2" , 3),
				new Product (3 , "prod3" , 4)
		};	
		
		FileOutputStream file = new FileOutputStream("products.dat");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		for( int i = 0; i < products.length; i++) {
			out.writeObject(products[i]);
		}
		
		out.close();
		file.close();
		
		System.out.println("End of demo");
	}
}
