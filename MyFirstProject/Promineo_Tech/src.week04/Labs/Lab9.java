package Labs;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

	@SuppressWarnings("unused")
	public class Lab9 {

		static void beginEnd(int endNum) {
			// Add your code below this line 
		       if (endNum < 1) {
		            System.out.println("Your List cannot be created with a number less than one.");
		            return;
		        }

		        List<Integer> numList = new ArrayList<>();
		        for (int i = 1; i <= endNum; i++) {
		            numList.add(i);
		        }

		        System.out.println("The first number in the List is " + numList.get(0));
		        System.out.println("The last number in the List is " + numList.get(numList.size() - 1));
		      




			// Add your code above this line
		}
		
		
	    //DO NOT CHANGE THE CODE BELOW THIS LINE 
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int endNum = in.nextInt();
		
			beginEnd(endNum);
		}
	
}
