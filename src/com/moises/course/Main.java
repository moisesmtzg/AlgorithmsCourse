package com.moises.course;

public class Main {

	public static void main(String[] args) {
		int[] intArray = new int[7];
		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;
		
		//BubbleSort bubble = new BubbleSort();
		//bubble.sort(intArray);
		
		//SelectionSort ss = new SelectionSort();
		//ss.sort(intArray);
		
		InsertionSort is = new InsertionSort();
		is.sort(intArray);
		
		
		//ShellSort shs = new ShellSort();
		//shs.sort(intArray);
		
		for(int i : intArray) {
			System.out.println(i);
		}

		//Factorial fac = new Factorial();
		//System.out.println(fac.factorialIterative(5));
		
	}
}
