package com.moises.course;

public class SelectionSort {

	private int lastUnsortedIndex;
	private int max;

	public void sort(int[] arr) {
		lastUnsortedIndex = arr.length-1;

		for(;lastUnsortedIndex > 0; lastUnsortedIndex--) {
			max = 0;
			for(int i = 1; i <= lastUnsortedIndex; i++) {
				if(arr[i] > arr[max]) {
					max = i;
				}
			}
			swap(arr, max, lastUnsortedIndex);
		}
	}

	private void swap(int[] arr, int i, int j) {
		if( i == j) {
			return;
		}
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
