package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public static WebElement element = null;

	public static void browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else {

			System.out.println("Enter correct browser");

		}

	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void minimize() {
		driver.manage().window().minimize();

	}

	public static void setSize(int width, int height) {

		Dimension dimension = new Dimension(width, height);
		driver.manage().window().setSize(dimension);

	}

	public static void setPosition(int x, int y) {
		Point point = new Point(x, y);
		driver.manage().window().setPosition(point);

	}
	
	
	public static void sendkeys(String value) {
		element.sendKeys("value");

	}

	public static WebElement findElements(String locator, String value) {

		WebElement element = null;

		if (locator.equalsIgnoreCase("id")) {

			element = driver.findElement(By.id(value));

		}

		else if (locator.equalsIgnoreCase("name")) {

			element = driver.findElement(By.name(value));

		} else if (locator.equalsIgnoreCase("classname")) {

			element = driver.findElement(By.className(value));

		}

		else if (locator.equalsIgnoreCase("tagname")) {

			element = driver.findElement(By.tagName(value));

		}

		else if (locator.equalsIgnoreCase("linktext")) {

			element = driver.findElement(By.linkText(value));

		}

		else if (locator.equalsIgnoreCase("partiallinktext")) {

			element = driver.findElement(By.partialLinkText(value));

		}

		else if (locator.equalsIgnoreCase("xpath")) {

			element = driver.findElement(By.xpath(value));

		}

		else if (locator.equalsIgnoreCase("cssselector")) {

			element = driver.findElement(By.cssSelector(value));

		}

		else {
			
			System.out.println("Enter correct webElemnet");

		}
		return element;

	}
	
	public static void quit() {
		driver.quit();

	}
	
public static void Screenshotsample(String file) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target=new File("file");
		
		FileUtils.copyFile(source, target);

	}

}
