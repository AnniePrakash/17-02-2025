package org.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGSample {
	
	@BeforeClass
	private void tc01() {
		System.out.println("Before class");

	}
	
	@AfterClass
	private void tc03() {
		System.out.println("After class");

	}

	
	@BeforeMethod
	private void tc04() {
		System.out.println("Before method");

	}

	
	@AfterMethod
	private void tc02() {
		System.out.println("After method");

	}
	
	@Test(priority = 1,invocationCount = 2)
	private void tc06() {
		System.out.println("Test 2");

	}

	
	@Test(priority = 3,enabled = false)
	private void tc05() {
		System.out.println("Test 1");

	}
	
	@Test(priority = 2)
	private void tc08() {
		System.out.println("Test 3");

	}

	
	


}
