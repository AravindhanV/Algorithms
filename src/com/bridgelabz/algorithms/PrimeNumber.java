package com.bridgelabz.algorithms;

public class PrimeNumber {
	public static void main(String[] args) {
		for (int number = 2; number <= 1000; number++) {
			if (isPrime(number)) {
				System.out.print(number + " ");
			}
			if(number%100==0) {
				System.out.println();
			}
		}
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
