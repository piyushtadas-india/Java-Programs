package com.nit.math;

// palindrome number is a number that remains the same when its digits are reversed
// 121,   12321,   555

public class PalindromeNumber {
	public static void main(String[] args) {
		int n = 123321;
		int temp = n; // store the original number
		int rem, rev = 0;

		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (temp == rev) {
			System.out.println(temp + " is a palindrome. ");
		} else {
			System.out.println(temp + "is not a palindrome. ");
		}

	}

}
