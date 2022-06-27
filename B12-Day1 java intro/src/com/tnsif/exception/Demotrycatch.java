package com.tnsif.exception;

public class Demotrycatch extends Exception{

	public static void main(String[] args) {
		 int n1=50/2;
		System.out.println(n1);
		

		int[] arr=new int[5];
		try
		{
		
			int a[]=new int [5];
			a[8]= 30/4;
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		} 
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("end of block");
		}
	}

}
