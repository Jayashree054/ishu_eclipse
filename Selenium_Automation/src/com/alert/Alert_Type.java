package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Type {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Automation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/Alert.html");

		WebElement simple = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		simple.click();

		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

		WebElement confirm = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		confirm.click();

		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		Thread.sleep(2000);

		WebElement getvalue = driver.findElement(By.id("result"));
		System.out.println(getvalue.getText());

		WebElement prompt = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		prompt.click();

		Thread.sleep(2000);
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert3.sendKeys("Welcome To Java");
		alert3.accept();

		Thread.sleep(2000);

		WebElement getvalue1 = driver.findElement(By.id("result1"));
		System.out.println(getvalue1.getText());

		driver.close();

	}
}
