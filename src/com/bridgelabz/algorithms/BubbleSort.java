package com.bridgelabz.algorithms;

public class BubbleSort {
	public static <T extends Comparable<T>> void bubbleSort(T array[]) {
		int length = array.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (array[j].compareTo(array[j + 1])>0) {

					T temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		printArray(array);
	}

	public static <T> void printArray(T arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		Integer[] array = { 18, 86, 61, 31, 41, 5, 3 };
		bubbleSort(array);
	}
}
