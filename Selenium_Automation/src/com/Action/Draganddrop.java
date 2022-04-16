package com.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+
				"\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/drop.html");
		Actions a = new Actions(driver);

		WebElement drag = driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);

		a.dragAndDrop(drag, drop).build().perform();

		a.clickAndHold(drag).moveToElement(drop).build().perform();

	}
}
