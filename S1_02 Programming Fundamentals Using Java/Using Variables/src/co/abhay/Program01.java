package co.abhay;

public class Program01 {

	public static void main(String[] args) {
		
//		primitives : byte short, int, long, float, double, boolean,char
//		in java.lang
//		this wrapper for each primitive datatypes, this classes have specific information that will help us in identify how much the range of the value we can store 
//		wrapper : Byte, Short, Integer, Long,Double,Boolean, Character 
		int num;
		num = 10;
		System.out.println("Num = " + num);
		System.out.println("Max value in a byte variable is " + Byte.MAX_VALUE);
		System.out.println("Min value in a byte variable is " + Byte.MIN_VALUE);
		
		System.out.println("Min value in a Long variable is " + Long.MAX_VALUE);
		System.out.println("Min value in a Long variable is " + Long.MIN_VALUE);
		
		
//		float f1;
//		f1 = 1.0; this will give an error since compiler is treating 1.0 as double storing in float
		
		float f2;
		f2 = 1.0f; // suffice f or F should be used, so it won't give an error
		System.out.println("f2 = " + f2);
		
		double d = 1.34e-49;
		
		System.out.println("d = " + d);
		
		boolean tf;
		tf = true;
		System.out.println("tf = " + tf);
		tf = false;
		System.out.println("tf = " + tf);
		
		char ch;
		ch =100;
		System.out.println("ch  = " + ch);
		
		int a = 1;
		int b = ~a;
		System.out.println(b); // will print-2
		
	} 
}
