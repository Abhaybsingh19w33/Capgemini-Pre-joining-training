package co.abhay.programs;

import java.io.File;
import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
//		File file;
//		
//		file = new File("sample.txt");
//		
//		if(file.exists()) {
//			System.out.println("The file already exists");
//			System.out.println("Path to the file is " + file.getAbsolutePath());
//		}
//		else {
//			System.out.println("The file does not exists as sample.txt");
//		}
		
//		------------------------------------------------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a valid directory name : ");
//		
//		String filename = sc.nextLine();
//		
//		File file = new File(filename);
//		
//		if(!file.isDirectory()) {
//			System.out.println("Input was not a valid directory name");
//			return;
//		}
//		
//		File[] files = file.listFiles();
//		
//		for (File f: files) {
//			System.out.printf("[%s] %s\n",  f.isDirectory()? "Dir":"File", f.getName());
//			
//		}
//		
//		sc.close();
		
//		------------------------------------------------------------------------
		
		String path = "C:\\Users\\abhay\\Desktop\\Capgemini Pre joining training\\S2_FP- Exception Handling_Utilities\\03 File Handling and IO\\Code\\a\\b\\c";
		
		File file = new File(path);
		
		file.mkdirs();
	}
}
