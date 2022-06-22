package com.tnsif;

import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(3);
		ll.add(4);
		ll.add(5);
		for(int i:ll)
		{
			System.out.println(i);
		}
		System.out.println("First and last node inserion");
		ll.addFirst(1);
		ll.addLast(7);
		for(int i:ll)
		{
			System.out.println(i);
		}
		System.out.println("after remove");
		ll.remove(4);
		for(int i:ll)
		{
			System.out.println(i);
		}
		System.out.println("First and last node removed");
		ll.removeFirst();
		ll.removeLast();
		for(int i:ll)
		{
			System.out.println(i);
		}
	}

}
