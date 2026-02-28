package com.practicejava8;

import java.util.*;

public class StreamApi1 {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		numbers.stream()
		.filter(n -> n % 2 == 0)
		.forEach(n -> System.out.println(n));
		
		
		System.out.println("------------------------------------");
		
		List<String> name = Arrays.asList("Amit","pooja","Akash");
		
		name.stream()
		 .filter(na -> na.startsWith("A"))
		 .forEach(System.out::println);
	}
}
