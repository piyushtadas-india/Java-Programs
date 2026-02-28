package com.practicejava8;

import java.util.function.Predicate;

public class PredicateDemo2 {
	public static void main(String[] args) {
		
  // isEqual ----> check the quality of two strings
 // Predicate.isEqual(obj  targetRef)
		System.out.println("-----------Predicate.isEqual()----------");
		Predicate<String> i = Predicate.isEqual("here is my name");
		System.out.println(i.test("here is my name"));
		System.out.println(i.test("here is my surname"));
		
		
		  // Predicate.add()		
		
		System.out.println("------------Predicate.add()----------");
		Predicate<Integer> adultyet = m -> m >= 18;
		Predicate<Integer> adultstill = m -> m < 65;
		System.out.println(adultyet.and(adultstill).test(5));
		System.out.println(adultyet.and(adultstill).test(38));
		System.out.println(adultyet.and(adultstill).test(90));
		

		
	}
}
