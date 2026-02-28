package com.practicejava8;

import java.util.function.Predicate;
import java.util.jar.Attributes.Name;

import javax.swing.border.EmptyBorder;

@FunctionalInterface
interface Preinterface {
	void pred();
}

public class PredicateDemo1 {
	public static void main(String[] args) {

		Predicate<Integer> even = x -> x % 2 == 0;
		// test number is even or not
		System.out.println("give number 4 even" + even.test(4));
		System.out.println("give number 7 even" + even.test(7));
		
		Predicate<String> p = name -> name.length() > 3;
		System.out.println(p.test("piyush"));
		System.out.println(p.test("ram"));
		System.out.println(p.test("java"));
		System.out.println(p.test("it"));
	}
}
