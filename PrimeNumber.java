package com.nit.math;

// it is diviors 1 and itself
public class PrimeNumber {

	public static void main(String[] args) {
		int start = 1 , end = 10;
		
		System.out.println("Prime number between " + start + " and " + end + " : ");
        for(int n=start; n<=end; n++) {
        	if(isPrime(n)) {
        		System.out.println(n + " ");
        	}
        }
	}
	
	static boolean isPrime(int n) {
		if(n<=1) return false;
		for(int i=2; i*i<=n; i++) {
			if(n%i==0) return false;
		}
		return true;
		}
	
	}

