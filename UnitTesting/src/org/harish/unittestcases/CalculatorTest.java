package org.harish.unittestcases;

import static org.junit.Assert.*;

import org.harish.unittestsource.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	
	@BeforeClass
	public static void before()
	{
		System.out.println("before");
	}
	
	@AfterClass
	public static void after()
	{
		System.out.println("after");
	}
	

	@Test
	public void testAdd() {
		
		System.out.println("Testadd called");
		
		Calculator calculator = new Calculator();
		assertEquals(7, calculator.add(3, 4));
	}
	
	@Test
	public void testSub()
	{
		System.out.println("Test sub called");
		Calculator calculator = new Calculator();
		assertEquals(4, calculator.sub(8, 4));
	}

}
