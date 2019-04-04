package org.qa.tests;

import org.qa.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Calc1 {
	int a = 10 , b = 20;
	
	@Test
	public void multiply1() {
		System.out.println("Multiply1");
		Assert.assertEquals(a*b, 200);
		HomePage.test();
	}
	
	@Test
	public void divide1() {
		System.out.println("Divide1");
		Assert.assertEquals(b/a, 2);
	}
	
	@Test
	public void add1() {
		System.out.println("Add1");
		Assert.assertEquals(a+b, 30);
	}
	
	@Test
	public void subtract1() {
		System.out.println("Substract1");
		Assert.assertEquals(b-a, 10);
	}
}
