package com.bridgelabz.algorithms;

public class InsertionSort {

	public static <T extends Comparable<T>> void insertionSort(T[] array) {
		for (int currentIndex = 1; currentIndex < array.length; currentIndex++) {
			T key = array[currentIndex];
			int movingPointer = currentIndex - 1;
			while (movingPointer >= 0 && array[movingPointer].compareTo(key) > 0) {
				array[movingPointer + 1] = array[movingPointer];
				movingPointer = movingPointer - 1;
			}
			array[movingPointer + 1] = key;
		}

		printArray(array);

	}

	public static <T> void printArray(T[] array) {
		for (T word : array) {
			System.out.print(word + " ");
		}

	}

	public static void main(String[] args) {
		String wordList = "banana orange mango apple pear";
		String[] array = wordList.split(" ");
		insertionSort(array);
	}

}
