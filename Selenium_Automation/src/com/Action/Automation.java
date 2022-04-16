package com.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Automation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(
				"http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");

		WebElement findElement = driver.findElement(By.xpath("(//input[@type='text'])[2]"));

		findElement.sendKeys("eragavan4978@gmail.com");

		WebElement findElement2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		findElement2.click();

		Thread.sleep(5000);

		WebElement findElement3 = driver.findElement(By.id("id_gender2"));
		findElement3.click();

		WebElement findElement4 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		findElement4.sendKeys("ishwarya");

	}

}
