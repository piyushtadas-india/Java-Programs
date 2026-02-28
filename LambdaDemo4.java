package com.practicejava8;

@FunctionalInterface
interface mam {

	String getName(String name);

}

public class LambdaDemo4 {

	public static void main(String[] args) {

		mam m = (name) -> {
			return name;
		};
		System.out.println(m.getName("piyush"));

		mam m1 = (name) -> {
			return name.toUpperCase();
		};
		System.out.println(m1.getName("tadas"));

		mam m2 = (name) -> {
			return name.replace("s", "a");
		};
		System.out.println(m2.getName("tadas"));
		
	}

}
