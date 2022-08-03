package com.tnsif.demojunit;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
	}
	public static int fact(int num) {
		int fact=1;
		while(num!=0) {
			fact=fact*num;
			num--;
		}
		return fact;
	}


}
