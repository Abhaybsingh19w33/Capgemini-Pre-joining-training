package co.abhay.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import co.abhay.util.KeyboardUtil;

public class Program08 {

	public static void main(String[] args) throws Exception{

//		String name = "";
//		
//		int ch;
//		System.out.println("Enter your name: ");
//		
////		ch = System.in.read();
//		
//		while((ch = System.in.read()) != '\r') {
//			name += (char)ch;
//		}
//		
//		System.out.println("Input was : " + (char)ch);
		
//		-----------------------------------------------------
		
//		String name, city;
//		
//		byte[] bytes = new byte[100];
//		System.out.println("Enter your name: ");
//		System.in.read(bytes);
//		name = new String(bytes).trim();
//		
//		System.out.println("Enter your city	: ");
//		System.in.read(bytes);
//		city = new String(bytes).trim();
//		
//		System.out.println("name : " + name);
//		System.out.println("city : " + city);
		
		
//		-------------------------------------------------------
//		bufferedReader
//		
//		InputStreamReader reader =  new InputStreamReader(System.in);
//		BufferedReader in =  new BufferedReader(reader);
//		
//		System.out.println("Enter name : ");
//		String name = in.readLine();
//		
//		System.out.println("Enter city : ");
//		String city = in.readLine();
//		
//		System.out.println("name : " + name);
//		System.out.println("city : " + city);
//		-------------------------------------------------------
		
//		Scanner scanner =  new Scanner(System.in);
//		String name;
//		int age;
//		String city;
//		
//		System.out.println("Enter name : ");
//		name = scanner.nextLine();
//		
//		System.out.println("Enter age : ");
//		age = scanner.nextInt();
//		
//		scanner.nextLine();
////		another solution for this, to create another scanner
////		scanner = new Scanner(System.in);
//		
//		System.out.println("Enter city : ");
//		city = scanner.nextLine();
//		
//		System.out.println("name : " + name);
//		System.out.println("age : " + age + " years.");
//		System.out.println("city : " + city);
//		scanner.close();
		
//		------------------------------------------------
//		using custom class
		
		String name;
		int age;
		String city;
		
		name = KeyboardUtil.getString("Enter name : ");
		age = KeyboardUtil.getInt("Enter age : ");
		city = KeyboardUtil.getString("Enter city : ");
		
		System.out.println("name : " + name);
		System.out.println("age : " + age + " years.");
		System.out.println("city : " + city);
	}

}
