package com.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brower_Launch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Automation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // upcasting

		//webdriver methods
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title :" + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("CurrentUrl :" + currentUrl);

		String pageSource = driver.getPageSource();
		System.out.println("PageSource :" + pageSource);
		
		//navigate methods
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.close();//current tab
		
		driver.quit();//browser 
		
	}

}
