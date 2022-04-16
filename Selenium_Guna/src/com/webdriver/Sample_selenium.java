package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_selenium {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium_Guna\\driver\\chromedriver.exe");
             
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com/watch?v=YFYiTS46x-8&list=RDKen0cVUrhEI&index=46");
			
			driver.manage().window().maximize();
			WebElement findElement = driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button ytp-play-button-playlist']"));
			findElement.click();
}

}
