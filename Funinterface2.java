package com.practicejava8;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

@FunctionalInterface
interface Secinterface {
	void a1();

	default void b1() {
		System.out.println(" default --->call by object name ");
	}

	static void c1() {
		System.out.println("static ---> call by class/interface name ");
	}

}

public class Funinterface2 implements Secinterface {
	@Override
	public void a1() {
		System.out.println("this is funcitonal interface method which is 1 abstract class ");

	}

	public static void main(String[] args) {
		Funinterface2 ob = new Funinterface2();
		ob.a1(); // 1 abstract method
		ob.b1(); // default method

		Secinterface.c1(); // static method
	}

}
