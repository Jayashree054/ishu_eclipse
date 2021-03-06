package com.alert;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Type {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Automation1\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");

		// simple alert
		WebElement simple = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		simple.click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.accept();

		// confirm alert
		WebElement confirm = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		confirm.click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.dismiss();

		WebElement result1 = driver.findElement(By.id("result"));
		System.out.println("result1 :" + result1.getText());
		// prompt alert

		WebElement prompt = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		prompt.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Welcome to Selenium");
		Thread.sleep(2000);
		alert3.accept();

		WebElement result2 = driver.findElement(By.id("result1"));
		System.out.println("result2 :" + result2.getText());

		// screenshot alert
		TakesScreenshot js = (TakesScreenshot) driver;
		File src = js.getScreenshotAs(OutputType.FILE);
		File dist = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Automation1\\Screenshot\\img.png");
		FileUtils.copyFile(src, dist);
	}

}
