package com.tnsif.demojunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled

class Demotest {

	 @Test
	 void test() {
		System.out.println("Welcome to Junit testing");

	}
	 @Test
	 public void testFact()
	 {
		 int t1=App.fact(4);
		 assertTrue(t1==120);
		 
	 }
	 @Test
	    public void testsum() {
	    	int r=sum.sum(10, 55);
	    	assertEquals(r,1000);
	    }

	 

}
