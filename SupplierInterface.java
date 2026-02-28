package com.practicejava8;

import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
		Supplier<Double> randomNumber = () -> Math.random();
		System.out.println("Random Number 1 : " + randomNumber.get());
		System.out.println("Random Number 2 : " + randomNumber.get());

		System.out.println("----------------------------------");

		Supplier<String> s = () -> "Hello world";
		System.out.println(s.get());

		/*
		 * 👉 Supplier<T> supplies data without taking any input using get() method.
		 * 
		 * 
		 * 👉 Real use cases (कुठे वापरतो?)
		 *  ✅ Default values
		 *  ✅ Object creation 
		 *  ✅ Lazy loading 
		 *  ✅ UUID / Date generate
		 */

	}

}
