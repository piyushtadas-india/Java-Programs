package com.practicejava8;

@FunctionalInterface
interface my {
	void add(int a, int b);

}

public class LambdaDemo2 {
 
	public static void main(String[] args) {
		 
		my t = (int a, int b)-> System.out.println(a+b);
        t.add(10, 30);		
	}
}
