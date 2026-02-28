package com.practicejava8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ConstructorRef4 {

	public static void main(String[] args) {

		Supplier<List<String>> s = ArrayList::new;

		// ArrayList::new means
		// ArrayList cha constructor

		List<String> list = s.get();
		list.add("java");
		list.add("spring");
		list.add("hibernet");

		System.out.println(list);

	}

}
