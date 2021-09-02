package com.bridgelabz.algorithms;

public class PalindromeChecker {
	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int numberCopy = number;
		while(number>0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		return reverse == numberCopy ? true : false;
	}
}
