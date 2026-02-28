package com.practicejava8;

@FunctionalInterface
interface you {

	int add();

}

public class LambdaDemo3 {

	public static void main(String[] args) {

		you t = () -> {
			return 100;
		};
		System.out.println(t.add());

		you t1 = () -> {
			return 57;
		};
		System.out.println(t1.add());

	}

}
