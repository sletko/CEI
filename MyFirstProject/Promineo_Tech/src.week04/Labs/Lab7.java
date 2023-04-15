package Labs;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

@SuppressWarnings("unused")
public class Lab7 {

	static void sumList(int num1, int num2, int num3, int num4) {
		// Write your code below this line
		
		List<Integer> nums = new ArrayList<>();
        nums.add(num1);
        nums.add(num2);
        nums.add(num3);
        nums.add(num4);
		
		for (int i =0; i < nums.size(); i++) {
			System.out.println((i+1) + nums.get(i));
		}
		
		int sum = 0;		
		for (int num : nums) {
			System.out.println(num);
		}

		// Write your code above this line
	}
    
    
    // DO NOT CHANGE THE CODE BELOW THIS LINE
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, num3, num4;
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		num4 = in.nextInt();
		sumList(num1, num2, num3, num4);
		
	}
}