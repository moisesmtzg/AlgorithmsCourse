package com.moises.course;

public class ShellSort {

	public void sort(int[] array) {
		
		//recorremos de acuerdo a la gap hasta llegar a 1
		for(int gap = array.length/2; gap > 0; gap/=2) {
			//asignamos valor de gap a un temp y vemos si
			// la posicion sin el gap es mayor, si es mayor
			// se hace un cam
			for(int i = gap; i< array.length; i++) {
				int temp = array[i];
				int j = i;
				while(j >= gap && array[j -gap] > temp) {
					array[j] = array[j-gap];
					j-= gap;
				}
				array[j] = temp;
			}
			
		}
	}
}
