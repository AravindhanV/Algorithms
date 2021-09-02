package com.bridgelabz.algorithms;

public class BubbleSort {
	public static void bubbleSort(int array[]) {
		int length = array.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (array[j] > array[j + 1]) {

					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		printArray(array);
	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		int[] array = { 18, 86, 61, 31, 41, 5, 3 };
		bubbleSort(array);
	}
}
