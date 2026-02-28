package com.practicejava8;

@FunctionalInterface
interface Ram {
// passing array in lambda function
	void fun(int[] arr);

}

public class LambdaDemo6 {

	public static void main(String[] args) {
		// passing array in lambda function
		Ram r = (int[] arr) -> {
			for (int x : arr) {
				System.out.println(x);
			}
		};
		int num[] = { 1, 2, 3, 4, 5, 6 };
		r.fun(num);

	}

}
