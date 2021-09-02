package com.bridgelabz.algorithms;

import java.util.*;

public class Permutation {
	private static void swap(char[] letters, int first, int second) {
		char temp = letters[first];
		letters[first] = letters[second];
		letters[second] = temp;
	}

	private static void findPermutations(char[] chars, int currentIndex) {
		if (currentIndex == chars.length - 1) {
			System.out.println(String.valueOf(chars));
		}

		for (int i = currentIndex; i < chars.length; i++) {
			swap(chars, currentIndex, i);
			findPermutations(chars, currentIndex + 1);
			swap(chars, currentIndex, i);
		}
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String:");
		String word = scanner.nextLine();
		char[] letters = word.toCharArray();
		scanner.close();
		
		findPermutations(letters,0);
	}
}
