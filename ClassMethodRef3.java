package com.practicejava8;

import java.util.function.Function;

public class ClassMethodRef3 {

	public static void main(String[] args) {

		Function<String, String> f = String::toUpperCase;
		System.out.println(f.apply("java"));

		/*
		 * 👉 toUpperCase() ही String class ची instance method आहे 
		 * 👉 Lambda internally object create करतो
		 * 
		 */

	}

}
