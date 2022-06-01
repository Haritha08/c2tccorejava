package com.tnsif.Scannerbuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//8kb
public class bufferDemo {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a value");
		//String str=br.readLine();
		int str=Integer.parseInt(br.readLine());
		System.out.println("The entered value is "+str);
		
		
	}

}
