package com.nit.math;

// factorial Number
// 5! = 1x2x3x4x5 
 
public class FactorialDemo7 {
	
 	public static void main(String[] args) {
    
 		int f = 1;
 		
 		for(int i=1; i<=5; i++)
 		{
 			f = f * i;
 		}
 		System.out.println("factoril : " + f);
 		 	 
	}
}

// output :- factoril : 120
//   1x2x3x4x5 = 120 