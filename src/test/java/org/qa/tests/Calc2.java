package org.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Calc2 {
	int a = 10 , b = 20;
	
	@Test
	public void multiply2() {
		System.out.println("Multiply2");
		Assert.assertEquals(a*b, 200);
	}
	
	@Test
	public void divide2() {
		System.out.println("Divide2");
		Assert.assertEquals(b/a, 2);
	}
	
	@Test
	public void add2() {
		System.out.println("Add2");
		Assert.assertEquals(a+b, 30);
	}
	
	@Test
	public void subtract2() {
		System.out.println("Substract2");
		Assert.assertEquals(b-a, 10);
	}
}
