package com.bridgelabz.algorithms;

import java.util.*;

public class GuessNumber {
	public static Scanner scanner = new Scanner(System.in);
	public static double log2(int N) {
		double result = (Math.log(N) / Math.log(2));
        return result;
	}
	
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		if(log2(N) - Math.floor(log2(N))!=0) {
			System.err.println("N must be a power of 2");
			System.exit(0);
		}
		System.out.println("Think of a number between 0 and "+(N-1));
		int number = guessNumber(0,N-1);
		System.out.println("Enter 1 for YES and 0 for NO");
	}
	
	public static int guessNumber(int start, int end) {
		if(start==end) {
			return start;
		}
		int mid = (start+end)/2;
		System.out.println("Is your number between "+(start)+" and "+(mid));
		int response = scanner.nextInt();
		
		switch(response) {
		case 1: return guessNumber(start,mid);
		case 0: return guessNumber(mid+1,end);
		default: System.err.println("Invalid Response");
		System.exit(0);
		return -1;
		}
	}
}
