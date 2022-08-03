package com.tnsif.demojunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest {
	Calculate obj=new Calculate();
	int sum=obj.sum(2,20);
	int testsum=22;
	
	@Test
	public void testsum()
	{
		assertEquals(sum,testsum); 
	}

}
