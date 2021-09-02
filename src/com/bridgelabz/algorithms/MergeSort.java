package com.bridgelabz.algorithms;

public class MergeSort {
	public static void merge(String words[], int start, int middle, int end)
    {
		String temp[] = new String[end - start + 1];
		int i = start, j = middle+1, k = 0;

		while(i <= middle && j <= end) {
			if(words[i].compareTo(words[j])<=0) {
				temp[k] = words[i];
				k++;
				i++;
			}
			else {
				temp[k] = words[j];
				k++;
				j++;
			}
		}

		while(i <= middle) {
			temp[k] = words[i];
			k += 1; i += 1;
		}

		while(j <= end) {
			temp[k] = words[j];
			k += 1; j += 1;
		}

		for(i = start; i <= end; i += 1) {
			words[i] = temp[i - start];
		}
    }

    public static void mergeSort(String words[], int start, int end)
    {
        if (start < end) {
            int middle =start+ (end-start)/2;

            mergeSort(words, start, middle);
            mergeSort(words, middle + 1, end);
 
            merge(words, start, middle, end);
        }
    }
 
    public static void printArray(String words[])
    {
        for (int index = 0; index < words.length; index++) {
            System.out.print(words[index] + " ");
        }
        System.out.println();
    }
 
    public static void main(String args[])
    {
        String sentence = "Fusce consequat eros quam Ipsum Lorum";
        String words[] = sentence.toLowerCase().split(" ");
 
        mergeSort(words, 0, words.length - 1);
        printArray(words);
    }
}
