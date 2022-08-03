package com.tnsif.viittest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class AssertionsTestDemo {
	
	private ArrayList testList;
	
	
	@BeforeClass
	public static void onceExecutedBeforeAll()
	{
		System.out.println("This is before class"); 
	}
	
	@Before
	public void beforeEach()
	{
		testList=new ArrayList();
		System.out.println("This is before each"); 
	}
	
	@AfterClass
	public static void executeAfterClass()
	{
		System.out.println("This is after class"); 

	}
	
	@After
	public void executeAfter()
	{
		System.out.println("This is after each");
	}
	

	@Test
	void emptyList() {
		assertTrue(testList.isEmpty());
		System.out.println("The list is empty");

	}
	@Test
	void addElements()
	{
		testList.add(45);
		assertEquals(1,testList.size());
		System.out.println("The test is success with one element");
		
	}

}
