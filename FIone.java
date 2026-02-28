package com.practicejava8;

@FunctionalInterface
interface Myinterface{
	void a1();
}


public class FIone implements Myinterface {
	 @Override
	public void a1() {
	 System.out.println("i am giving the information in myinterface which is functional interface ");
	 
	}
	 
	 public static void main(String[] args) {
		FIone  ob = new FIone();
		ob.a1();
	}

}
