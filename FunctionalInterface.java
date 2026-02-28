package com.practicejava8;

import java.util.function.Function;

public class FunctionalInterface {
	public static void main(String[] args) {
		Function<Integer, Integer> square = x -> x * x;
		System.out.println("square of 5 : " + square.apply(5));
		System.out.println("square of 9 : " + square.apply(9));

		System.out.println("-------------------------");

		/*
		 * Function<Integer, String>
		 * 
		 * Integer → input type 
		 * String → output type
		 */

		Function<Integer, String> f = n -> "Number is: " + n;
		System.out.println(f.apply(10));

		System.out.println("----------------------------");

		Function<String, Integer> p = s -> s.length();
		System.out.println(p.apply("Piyush"));

	}
}
