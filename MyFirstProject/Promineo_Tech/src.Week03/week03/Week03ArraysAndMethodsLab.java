//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {

		//
		// Arrays:
		//

		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6

		int[] i = { 1, 5, 2, 8, 13, 6 };

		// 2. Print out the first element in the array
		System.out.println(i[0]);

		// 3. Print out the last element in the array without using the number 5
		System.out.println(i[i.length - 1]);

		// 4. Print out the element in the array at position 6, what happens?
		// System.out.println(i[6]); Out of bound message as the array has no values
		// past 5

		// 5. Print out the element in the array at position -1, what happens?
		// System.out.println(i[-1]); Out of bound message as the array has no values
		// before 0

		// 6. Write a traditional for loop that prints out each element in the array

		for (int a = 0; a < i.length; a++) {
			// i[a] = a + 1a;

			System.out.print(i[a] + " ");

		}
		System.out.println();
		// 7. Write an enhanced for loop that prints out each element in the array
		{
			for (int b : i)
				System.out.print(b + " ");
		}
		System.out.println();
		// 8. Create a new variable called sum, write a loop that adds
		// each element in the array to the sum

		double sum = 0;

		for (int z = 0; z < i.length; z++) {
			sum += i[z];
		}
		System.out.println(sum);

		// 9. Create a new variable called average and assign the average value of the
		// array to it
		double average = sum / i.length;

		System.out.println(average);

		// 10. Write an enhanced for loop that prints out each number in the array
		// only if the number is odd
		for (int x : i) {
			if (x % 2 != 0) {
				System.out.println(x);
			}
		}

		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and
		// "Robert"
		String[] j = { "Sam", "Sally", "Thomas", "Robert" };

		// 12. Calculate the sum of all the letters in the new array
		int sumLetters = 0;

		for (int z = 0; z < j.length; z++) {
			sumLetters += j[z].length();
		}
		System.out.println(sumLetters);

		//
		// Methods:
		//

		// 13. Write and test a method that takes a String name and prints out a
		// greeting.
		// This method returns nothing.

		// 14. Write and test a method that takes a String name and
		// returns a greeting. Do not print in the method.

		// Compare method 13 and method 14:
		// a. Analyze the difference between these two methods.
		// b. What do you find?
		// c. How are they different?

		// 15. Write and test a method that takes a String and an int and
		// returns true if the number of letters in the string is greater than the int

		// 16. Write and test a method that takes an array of string and a string and
		// returns true if the string passed in exists in the array

		// 17. Write and test a method that takes an array of int and
		// returns the smallest number in the array

		// 18. Write and test a method that takes an array of double and
		// returns the average

		// 19. Write and test a method that takes an array of Strings and
		// returns an array of int where each element
		// matches the length of the string at that position

		// 20. Write and test a method that takes an array of strings and
		// returns true if the sum of letters for all strings with an even amount of
		// letters
		// is greater than the sum of those with an odd amount of letters.

		// 21. Write and test a method that takes a string and
		// returns true if the string is a palindrome

	}

	// Method 13:

	// Method 14:

	// Method 15:

	// Method 16:

	// Method 17:

	// Method 18:

	// Method 19:

	// Method 20:

	// Method 21:

}
