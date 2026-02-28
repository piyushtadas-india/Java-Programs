package com.practicejava8;

@FunctionalInterface
interface Laptop {
	void mouse();
}

public class LClass {
	public static void main(String[] args) {
		
		Laptop l = ()->  System.out.println("laptop is done");
             l.mouse();			
		
	}

}
