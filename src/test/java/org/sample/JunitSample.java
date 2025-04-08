package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitSample {
	
	static WebDriver driver;

	
	@Test
	public void tc05() {
		driver.findElement(By.id("email")).sendKeys("Hanno@123");
		driver.findElement(By.id("pass")).sendKeys("1234567");
		driver.findElement(By.name("login")).click();

	}
	
	
	@After
	public void tc02() throws IOException, InterruptedException {
		
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\newDaySample\\selenium\\junitsnaps.png");
		Thread.sleep(3000);
		FileUtils.copyFile(source, target);
		
		
		

	}
	
	@AfterClass
	public static void tc04() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();

	}
	
	
	@BeforeClass
	public static void tc01() {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	@Before
	public void tc03() {
		driver.get("https://www.facebook.com/");

	}

}
