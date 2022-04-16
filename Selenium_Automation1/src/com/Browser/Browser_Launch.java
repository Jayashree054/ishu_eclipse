package com.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Automation1\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // oops concept

		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("title:" + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl:" + currentUrl);

		String pageSource = driver.getPageSource();
		System.out.println("pageSource :" + pageSource);

		driver.navigate().to("https://www.flipkart.com/");

		driver.navigate().refresh();

		driver.navigate().back();

		driver.navigate().forward();

		//driver.close();
		
		driver.quit();
		
	}

}
