package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Type {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Automation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/frame.html");

		driver.switchTo().frame(0);

		WebElement frame = driver.findElement(By.id("Click"));
		frame.click();

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);

		driver.switchTo().frame("frame2");

		WebElement frame2 = driver.findElement(By.id("Click1"));
		frame2.click();
		
		Thread.sleep(2000);
		driver.close();

	}

}
