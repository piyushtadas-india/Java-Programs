package com.nit.math;
// fibonacci series is a sequence of numbers where each number is the sum of the previous numbers staring from o and 1.

// 0,1,1,2,3,5,8,13,21,34....

public class Fibonacci {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1;

		for (int i = 1; i <= 10; i++) {
			
			int n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}

	}

}
