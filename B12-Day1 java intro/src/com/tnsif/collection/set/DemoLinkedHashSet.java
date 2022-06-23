package com.tnsif.collection.set;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Haritha");
		lhs.add("Sitara");
		lhs.add(" ");
		lhs.add("Madhu");
		lhs.add("Damini");
		lhs.add("Damini");
		lhs.add("Damini");
		lhs.add("Damini");
		lhs.add("Damini");
		for(String s:lhs)
		{
			System.out.println(s);
		}
		
		}

}
