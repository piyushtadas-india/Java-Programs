package com.nit.math;

import java.util.Scanner;

// print the number by taking user input 

public class TakingUserInput10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number ");
		
		int n = sc.nextInt();
				
		for (int i = 1; i <= n; i++) {
		    
			System.out.println(i);
		}
	}
}