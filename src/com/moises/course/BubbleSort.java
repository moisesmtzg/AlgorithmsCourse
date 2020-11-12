package com.moises.course;

public class BubbleSort {

	private int lastUnsorted;

	//esta implementacion ordena de derecha a izq
	public void sort(int[] array) {
		lastUnsorted = array.length -1;
		for(;lastUnsorted > 0; lastUnsorted--) {
			for(int i = 0; i < lastUnsorted; i++) {
				if(array[i] > array[i+1]) {
					swap(array, i, i+1);
				}
			}
		}
	}
	
	private void swap(int[] array, int i, int b) {
		if(i == b) {
			return;
		}
		int temp = array[i];
		array[i] = array[b];
		array[b] = temp;
	}
}
