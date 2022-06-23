package com.tnsif.collection.set;

import java.util.HashSet;
import java.util.TreeSet;

public class Demotreeset {

	public static void main(String[] args) {
		/* TreeSet<String> ts=new TreeSet<String>();
		ts.add("A");
		ts.add("E");
		ts.add("B");
		ts.add("D");
		ts.add("G");
		ts.add("C");
		for(String s:ts)
		{
			System.out.println(s);
		} */

		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(20);
		hs.add(9);
		hs.add(30);
		hs.add(40);
		hs.add(15);
		hs.add(35);
		for(Integer s:hs)
		{
			System.out.println(s);
		}
		System.out.println("Returning data using Treeset");
		
		TreeSet<Integer> ts=new TreeSet<Integer>(hs);
		for(Integer s:ts)
		{
			System.out.println(s);
		}
		
		

		
	}

}
