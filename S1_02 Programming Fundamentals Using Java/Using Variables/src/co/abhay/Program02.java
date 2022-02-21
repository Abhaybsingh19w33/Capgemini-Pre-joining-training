package co.abhay;

import java.util.Arrays;
import java.util.List;

public class Program02 {
	public static void main(String[] args) {
		//		unary: -- ++
		//		binary: + -* /%
		//		ternary ? :

		String[] names =  {"Vinod", "Shyam", "satya", "John", "Saith", "Scott"};
		List<String> list  = Arrays.asList(names);

		for (String str: list){
			System.out.println("Welcome back " + str);
		}

		int n = 10;
		int sum = 0;
		while( n-- >= 0) {
			sum += n--;	
		}
		System.out.println(sum);

		// int [][] nums = new int[3][4];

		int[][] nums;
		nums = new int[3][];
		nums[0] = new int[]{29, 39, 404, 44};
		nums[1] = new int[6];
		nums[2] = new int[]{100, 200};

		for(int i =0; i< nums.length; i++){
			System.out.println(Arrays.toString(nums[i]));
		}
		
		
	}
}
