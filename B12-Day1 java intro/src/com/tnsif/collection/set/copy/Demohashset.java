package com.tnsif.collection.set.copy;

import java.util.HashSet;
import java.util.Iterator;

public class Demohashset {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(20);
		hs.add(10);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		System.out.println("Using advanced for loop: ");
		for(Integer s:hs)
		{
			System.out.println(s);

		}
		
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println("Using iterator: "+it.next());

		}
		System.out.println("After Delete ");
		hs.clear();
		for(Integer s:hs)
		{
			System.out.println(s);

		}

			
	}

}
