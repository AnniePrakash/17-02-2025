package org.sample;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOne extends BaseClass {
	
	@Test
	private void tc01() throws InterruptedException {
		findElements("id", "email");
		sendkeys("Hanno@123");
		
		findElements("id", "pass");
		sendkeys("2345678");
		
		Thread.sleep(3000);
		
		findElements("name", "login").click();

	}
	
	@BeforeClass
	private void tco2() throws InterruptedException {
		browserLaunch("chrome");
		maximize();
		Thread.sleep(3000);

	}
	
	@BeforeMethod
	private void tco3() throws InterruptedException {
		loadUrl("https://www.facebook.com/");
		
		Thread.sleep(3000);

	}
	
	@AfterMethod
	private void tc04() throws IOException {
		Screenshotsample("C:\\SecondJan\\amazon.png");

	}
	
	@AfterClass
	private void tc05() {
		quit();

	}

}
