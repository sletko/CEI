package Week04;

import java.util.*;

/*
 * 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
	a.	Programmatically subtract the value of the first element in the array 
		from the value in the last element of the array (i.e. do not use ages[7] in your code). 
		Print the result to the console.  
	b.	Add a new age to your array and repeat the step above to ensure it is 
		dynamic (works for arrays of different lengths).
	c.	Use a loop to iterate through the array and calculate the average age. 
		Print the result to the console.
	2.	Create an array of String called names that contains the following values: 
		“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
	b.	Use a loop to iterate through the array again and concatenate all the names together, 
		separated by spaces, and print the result to the console.
	3.	How do you access the last element of any array?
	4.	How do you access the first element of any array?
	5.	Create a new array of int called nameLengths. 
		Write a loop to iterate over the previously created names array and add the 
		length of each name to the nameLengths array.
	6.	Write a loop to iterate over the nameLengths array and 
		calculate the sum of all the elements in the array. Print the result to the console.
	7.	Write a method that takes a String, word, and an int, n, as arguments and 
		returns the word concatenated to itself n number of times. 
		(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	8.	Write a method that takes two Strings, firstName and lastName, and 
		returns a full name (the full name should be the first and the last name as a 
		String separated by a space).
	9.	Write a method that takes an array of int and returns true if the sum of all 
		the ints in the array is greater than 100.
	10.	Write a method that takes an array of double and returns the average of all the 
		elements in the array.
	11.	Write a method that takes two arrays of double and returns true if the average 
		of the elements in the first array is greater than the average of the elements 
		in the second array.
	12.	Write a method called willBuyDrink that takes a boolean isHotOutside, 
		and a double moneyInPocket, and returns true if it is hot outside and if 
		moneyInPocket is greater than 10.50.
	13.	Create a method of your own that solves a problem. In comments, write what 
		the method does and why you created it.
 */

public class Week03_04Assignment {
	public static void main(String[] args) {
		{
// 1.	Create an array of set int	
			int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
// 1.a	Find the last value in the array
			int i = ages[ages.length - 1] - ages[1];
			System.out.println(i);

// 1.b  Add a value to the last index of the array
			ages = Arrays.copyOf(ages, ages.length + 1);
			ages[ages.length - 1] = 32;
			i = (ages[ages.length - 1] - ages[1]);
			System.out.println(i);

//1.c  Find the average age in the array
			double sum = 0;
			double aver;

			for (int x = 0; x < ages.length; x++) {
				sum += ages[x];
			}
			aver = sum / ages.length;

			System.out.println(aver);
		}

// 2.  Create an array of First names
		{
			String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

// 2.a  Find the average length of the names in the array
			double averN = 0;
			for (int i = 0; i < names.length; i++) {
				averN += names[i].length();
			}
			averN /= names.length;
			System.out.println(averN);

//2.b  List the names on a single print line
			for (String nameP : names) {
				System.out.print(nameP + " ");
			}
			System.out.println("\n");
// 3.  Print the last element
			System.out.println(names[names.length - 1]);

// 4.  Print the name in the first element
			System.out.println(names[0]);
			System.out.println("\n");
// 5.  Pint the names and include the number of char in each name.
			int[] nameLengths = new int[names.length];
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
			}
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i] + " " + nameLengths[i]);
			}

// 6.  Sum the the char in the name array
			int sum = 0;
			for (String name : names) {
				sum += name.length();
			}
			System.out.println(sum);
		}

		{
// 7.  Variables and out for question 7 and then print after running through the method.
			String h = "hello";
			int a = 3;
			String j = bob(h, a);

			System.out.println(j);
		}

		{
// 8.  Variables create first and last name.  Then use method to output full name.
			String firstName = "Jane";
			String lastName = "Smith";
			String fullName = names(firstName, lastName);

			System.out.println(fullName);
		}

		{
// 9.Create an array of int and random numbers between 1 -100,then applying to method then outputs equal or great than 100 else less than 100.

			int[] nums = new int[2];
			Random random = new Random();
			for (int i = 0; i < nums.length; i++) {
				nums[i] = random.nextInt(100);
			}
			int sum = sumArray(nums);
			if (sum >= 100) {
				System.out.println(sum + " Great than 100");
			} else {
				System.out.println(sum + " Less than 100");
			}
		
		}
		
// 10. Create an array of double and average of all the elements from the method
		Random random = new Random(); {
		
			double[] numb = new double[20];
			for (int i = 0; i < numb.length; i++) {
					numb[i] = random.nextDouble();
			}
			double ave = sam(numb); {
				System.out.println(ave);
			}
			
// 11.  Create two double arrays use the method to find the average and compare which array is larger.
						
			double[] num1 = new double[5];
			for (int i = 0; i < num1.length; i++) {
					num1[i] = random.nextDouble();
			}
			double[] num2 = new double[20];
			for (int x = 0; x < num2.length; x++) {
					num2[x] = random.nextDouble();
			}
			double ave1 = sam(num1);
			double ave2 = sam(num2);
			if (ave1 > ave2) {
				System.out.println("The 1st value is larger " + ave1);
			}else {
				System.out.println("The 2nd value is larger " + ave2);
		}

// 12. Because it was an easy array more or less copy from above.  
//Created an array for temp and Money.  
//Time money by 20 to give better chance of values over 10.50
// Use for method in the boolean to compare true or false over 80 and enough money
			int[] temp = new int[2];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = random.nextInt(100);
			}
			double[] money = new double[20];
			for (int x = 0; x < money.length; x++) {
					money[x] = random.nextDouble() * 20;
			}
			boolean shouldBuyDrink = willBuyDrink(temp[0] > 80, money[0]);
			System.out.println(shouldBuyDrink);
		}
			int dozen = 12;  //How many dozen per month
			int feed = 100;  //price of feed per month
			
			double ave = cSeed(feed, dozen); {
				System.out.println(ave);
			}
}
	

// 7.  Creating a loop to repeat a word using an int number of times.
	public static String bob(String h, int a) {
		String x = "";
		for (int i = 0; i < a; i++) {
			x += h;
		}
		return x;
	}

// 8.  Method to combine first and last name with a space to create full name.
	public static String names(String firstName, String lastName) {
		String z = "";
		{
			z = (firstName + " " + lastName);
		}
		return z;
	}

// 9.  Method to sum the number in an array
	public static int sumArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
//  10. & 11.  A method that takes an array of double
	public static double sam(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}
	
// 12.  Method for if should buy a drink using a boolean
	public static boolean willBuyDrink(boolean hotOutside, double moneyLeft) {
		if (hotOutside && moneyLeft >= 10.50) {
			return true;
		}else {
			return false;
		}
	}

//13.  My Method
	public static int cSeed(int d, int b) {
		int price = d/b; {
			return price;
		}
	}
	
}