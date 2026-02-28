package com.practicejava8;

import java.util.function.Function;

public class StaticMethodRef1 {

	// static method
	static int convert(String s) {
		return Integer.parseInt(s);
		// "123" → 123
		// String → Integer convert hoto
	}

	public static void main(String[] args) {

		Function<String, Integer> f = StaticMethodRef1::convert;

		System.out.println(f.apply("123"));

	}

}
