package com.bridgelabz.algorithms;

import java.util.*;

public class BinarySearch {
	static String[] words="apple ball cat dog elephant".split(" ");
	
	public static boolean binarySearch(String key) {
		int length=words.length;
		int low=0;
		int high=length-1,middle=0;
		int comparison;
		while(low <=high) {
			middle=(low+high)/2;
			comparison=key.compareTo(words[middle]);
			if(comparison==0) {
				return true;
			}
			else if(comparison<0) {
				high=middle-1;
			}
			else {
				low=middle+1;
			}
				
		}
		return false;
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter word to be searched");
		String key=scanner.nextLine();
		scanner.close();
		boolean isKeyFound=binarySearch(key);
		if(isKeyFound)
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
	}
}
