package com.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Automation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("123gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

		password.sendKeys("i09987761");

		Thread.sleep(2000);

		WebElement button = driver.findElement(By.xpath("//button[@value='1']"));
		button.click();

		System.out.println("done");

		driver.quit();
	}

}
