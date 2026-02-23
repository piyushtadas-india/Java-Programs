package com.nit.math;

// Basic math methods
/*   
 * 	Math.max(x,y)
 *  Math.min(x,y)
 *  abs(x) , random() , log() , pow()  
 */

public class BasicMaths1 {
	public static void main(String[] args) {

		int a = 10, b = 20;
        System.out.println("max value ");
		System.out.println(Math.max(a, b ));
		System.out.println("-------------");
		
		System.out.println("min value");
		System.out.println(Math.min(a, b));
		System.out.println("-------------");
		
		
		System.out.println("log value");
		System.out.println(Math.log(0));
		System.out.println("-------------");
		
		
		System.out.println("pow value");
		System.out.println(Math.pow(2, 8));
	}
}
