package com.practicejava8;

import java.util.function.Consumer;
import java.util.jar.Attributes.Name;

public class ConsumerInterface {

	public static void main(String[] args) {
		Consumer<String> c = name -> System.out.println("Hello  " + name);
		c.accept("piyush");

		/* 👉 Consumer<T> takes input and returns nothing using accept() method.
		 * 
		 * 👉 Real use cases (कुठे वापरतो?)
		 * 
		 *  ✅ forEach() 
		 *  ✅ Logging
		 *  ✅ Printing 
		 *  ✅ Database save 
		 *  ✅ Email / SMS send
		 * 
		 */

	}

}
