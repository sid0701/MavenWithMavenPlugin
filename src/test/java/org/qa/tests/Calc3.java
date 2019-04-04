package org.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Calc3 {
	int a = 10 , b = 20;
	
	@Test
	public void multiply3() {
		System.out.println("Multiply3");
		Assert.assertEquals(a*b, 200);
	}
	
	@Test
	public void divide3() {
		System.out.println("Divide3");
		Assert.assertEquals(b/a, 2);
	}
	
	@Test
	public void add3() {
		System.out.println("Add3");
		Assert.assertEquals(a+b, 30);
	}
	
	@Test
	public void subtract3() {
		System.out.println("Substract3");
		Assert.assertEquals(b-a, 10);
	}
}
