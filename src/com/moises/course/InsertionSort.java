package com.moises.course;

public class InsertionSort {

	private int firstUnsortedIndex = 1;
	public void sort(int[] arr) {
		for(;firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
			int newElement = arr[firstUnsortedIndex];
			int i;
			for(i = firstUnsortedIndex; i > 0 && arr[i-1] > newElement; i--) {
				//shift left to right
				arr[i] = arr[i -1];
			}
			arr[i] = newElement;
		}
	}
}
