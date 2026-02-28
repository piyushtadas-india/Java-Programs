package com.practicejava8;

@FunctionalInterface
interface sam {

	int add();

}

public class LambdaDemo5 {

	public static void main(String[] args) {

		sam s1 = () -> 100;
		sam s2 = () -> 200;
		sam s3 = () -> 102;
		sam s4 = () -> 50;

		System.out.println(s1.add());
		System.out.println(s2.add());
		System.out.println(s3.add());
		System.out.println(s4.add());

	}

}
