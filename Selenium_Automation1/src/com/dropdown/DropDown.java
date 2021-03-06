package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Automation1\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));

		Select s = new Select(dropdown1);
		s.selectByIndex(2);

		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select s1 = new Select(dropdown2);
		s1.selectByValue("4");

		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select s2 = new Select(dropdown3);
		s2.selectByVisibleText("Selenium");

		WebElement multiple = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select s4 = new Select(multiple);
		boolean multiple2 = s4.isMultiple();
		System.out.println("multiple2 :" + multiple2);

		List<WebElement> options = s4.getOptions();
		// for (datatype eachitem: arrayreF)
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
	}
}
