package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Type {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Automation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://letcode.in/table");

		List<WebElement> findElements = driver.findElements(By.xpath("//table[@name='table']/tbody/tr/td"));

		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());

		}
		System.out.println("****************************************************");
		List<WebElement> row = driver.findElements(By.xpath("//table[@name='table']/tbody/tr[2]/td"));

		for (WebElement rows : row) {
			System.out.println(rows.getText());
		}
		System.out.println("****************************************************");
		List<WebElement> col = driver.findElements(By.xpath("//table[@name='table']/tbody/tr/td[2]"));
		for (WebElement webElement : col) {
			System.out.println(webElement.getText());
		}
		System.out.println("****************************************************");

		WebElement particular = driver.findElement(By.xpath("//table[@name='table']/tbody/tr[2]/td[2]"));

		System.out.println(particular.getText());
		System.out.println("****************************************************");

		
		WebElement findElements2 = driver.findElement(By.xpath("//table[@name='table']//tr/th[2]"));
	
				System.out.println(findElements2.getText());
		
	}

}
