package co.abhay.util;

import java.util.Scanner;
public class KeyboardUtil {
	
	private KeyboardUtil() {
	}
	
	public static String getString (String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		String ret = scanner.nextLine ();
		return ret;
	}
	
	public static int getInt (String message) {
		Scanner scanner = new Scanner (System.in);
		System.out.println (message);
		int ret = scanner.nextInt ();		
		return ret;			
	}
}
