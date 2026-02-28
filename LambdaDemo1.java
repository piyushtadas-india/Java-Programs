package com.practicejava8;

@FunctionalInterface
interface MMinterface {
	void ma();

}

public class LambdaDemo1  {
	public static void main(String[] args) {

		MMinterface i = () -> System.out.println("hi i am using lambda function");

		i.ma();
	}

}
