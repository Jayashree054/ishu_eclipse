package com.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Automation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");
	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement implicit = driver.findElement(By.xpath("//a[@data-group='women']"));
		implicit.click();
		
		System.out.println("implicit done");
		WebElement explicit = driver.findElement(By.xpath("//a[@data-reactid='17']"));
		
		WebDriverWait w = new WebDriverWait(driver, 100);
		w.until(ExpectedConditions.visibilityOf(explicit));
		System.out.println("ixplicit done");
		
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,8000)", "");// scroll down
		Thread.sleep(4000);
		js.executeScript("window.scroll(0,-4000)", "");// scroll down
		Thread.sleep(2000);

		System.out.println("done");

		driver.close();
	}
}