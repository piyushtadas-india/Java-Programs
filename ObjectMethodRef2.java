package com.practicejava8;

import java.util.function.Consumer;

public class ObjectMethodRef2 {

	// instance method
	void printMsg(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {

		ObjectMethodRef2 obj = new ObjectMethodRef2();

		Consumer<String> c = obj::printMsg;
		c.accept("Hello java");
	}

}
