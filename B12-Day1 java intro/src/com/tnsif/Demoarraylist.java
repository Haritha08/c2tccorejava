package com.tnsif;

import java.util.ArrayList;
import java.util.Collections;

public class Demoarraylist {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Haritha");
		al.add("Rohan");
		al.add("John");
		
		for(String s:al)
		{
			System.out.println(s);
		}
		System.out.println("After Insertion \n");
		al.add(0,"ruhi");
		for(String s:al)
		{
			System.out.println(s);
		}
		System.out.println("After Deletion \n");
		al.remove("John");
		for(String s:al)
		{
			System.out.println(s);
		}
		System.out.println("After Sorting \n");
		Collections.sort(al);
		for(String s:al)
		{
			System.out.println(s);
		}
		System.out.println("After updation \n");
		al.set(0,"john");  // it will replace the element
		for(String s:al)
		{
			System.out.println(s);
		}
		System.out.println("After clear \n");
		al.clear();
		for(String s:al)
		{
			System.out.println(s);
		}
				
	}

}
