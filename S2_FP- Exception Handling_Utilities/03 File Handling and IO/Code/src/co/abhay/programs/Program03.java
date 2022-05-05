package co.abhay.programs;

import java.io.FileReader;
import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the complete path of the file to read");
		String path = sc.nextLine();
		
		FileReader reader = new FileReader(path);
		
		int ch;
		while((ch = reader.read()) != -1) {
			System.out.println((char) ch);
		}
		
		reader.close();
		sc.close();
		
	}

}
