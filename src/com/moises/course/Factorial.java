package com.moises.course;

public class Factorial {

	//Iterativo
	public int factorialIterative(int num) {
		if(num == 0) return 1;
		int factorial = 1;
		for(int multiplier = 1; multiplier <= num; multiplier++) {
			factorial *= multiplier;
		}
		return factorial;
	}

	public int factorialRec( int num) {
		//caso base
		if(num == 0) return 1;
		
		//n! = n * (n-1)!
		return num * factorialRec(num-1);
	}
}
