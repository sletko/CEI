package Week04;

import java.util.Arrays;

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
// 1.		
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
// 1.a	
	int i = ages[ages.length -1] - ages[1]; 
	System.out.println(i);
	
// 1.b
	ages = Arrays.copyOf(ages, ages.length + 1);
	ages [ages.length - 1] = 32;
	i = (ages[ages.length -1] - ages[1]); 
		System.out.println(i);
	
//1.c
	double sum = 0;
	double aver;
	
	for (int x = 0; x < ages.length; x++) {
		sum += ages[x];
		}
	aver = sum / ages.length;
	
	System.out.println(aver);}

// 2.
	{
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

// 2.a
	double averN = 0; 
	for (int i = 0; i < names.length; i++) {
		averN += names[i].length();
	}
	averN /= names.length;
	System.out.println(averN);
	
//2.b
	for (String nameP : names ){
		System.out.print(nameP + " ");
		}
	System.out.println("\n");
// 3.
	System.out.println(names[names.length -1]);
	
// 4.
	System.out.println(names[0]);
	System.out.println("\n");
// 5.
	int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length();
		}
		for (int i = 0; i < names.length; i++) {
		System.out.println(names[i] + " " + nameLengths[i]);
		}
		
// 6.
		int sum = 0; 
		for (String name : names) {
			sum += name.length();
			}
		System.out.println(sum);
	}
	}
}