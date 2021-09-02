package com.bridgelabz.algorithms;

import java.util.*;

public class AnagramChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two words");
		String word1 = scanner.next();
		String word2 = scanner.next();

		if (checkAnagram(word1.toLowerCase(), word2.toLowerCase())) {
			System.out.println("They are anagrams");
		} else {
			System.out.println("They are not anagrams");
		}
	}

	public static boolean checkAnagram(String word1, String word2) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int index = 0; index < word1.length(); index++) {
			hashMap.put(word1.charAt(index), hashMap.getOrDefault(word1.charAt(index), 0) + 1);
		}
		
		for(int index = 0;index<word2.length();index++) {
			Integer frequency = hashMap.get(word2.charAt(index));
			if(frequency == null) {
				return false;
			}
			hashMap.put(word2.charAt(index), frequency - 1);
		}
		
		Iterator iterator = hashMap.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Character, Integer> mapElement = (Map.Entry) iterator.next();
			if(!mapElement.getValue().equals(0)) {
				return false;
			}
		}
		
		return true;
	}
}
