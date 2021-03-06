package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Type {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Automation1\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Dimension d = new Dimension(800, 1000);

		driver.manage().window().setSize(d);

		driver.get("http://www.leafground.com/pages/frame.html");

		driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
		System.out.println("Text1: " + frame1.getText());

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement frame2 = driver.findElement(By.id("Click1"));
		frame2.click();
		System.out.println("Text2: " + frame2.getText());
	}
}
