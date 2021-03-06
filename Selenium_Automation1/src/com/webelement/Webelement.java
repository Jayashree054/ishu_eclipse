package com.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Automation1\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("Ishwarya1234@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Ishwarya_123");

		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

	}
}
