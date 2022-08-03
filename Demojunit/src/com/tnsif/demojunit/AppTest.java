package com.tnsif.demojunit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
	@Test
	 public void testFact() {
    	int r1=App.fact(5);
    	assertTrue(r1==120);
    }
	@Test
	public void testSum()
	{
		int s1=sum.sum(10,25);
		assertTrue(s1==35);
				
	}

	

}
