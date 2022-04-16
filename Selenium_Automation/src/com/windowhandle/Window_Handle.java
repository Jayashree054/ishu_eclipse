package com.windowhandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handle {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Automation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement mobile = driver.findElement(By.xpath("//a[@class='nav-a  '][2]"));

		Actions a = new Actions(driver);
		a.contextClick(mobile).build().perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement fashion = driver.findElement(By.xpath("//a[@class='nav-a  '][5]"));

		a.contextClick(fashion).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement deals = driver.findElement(By.xpath("//a[@class='nav-a  '][4]"));
		a.contextClick(deals).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		int size = driver.getWindowHandles().size();
		System.out.println("size :" + size);

		String parentid = driver.getWindowHandle();
		System.out.println("parentid :" + parentid);

		Set<String> allwindow = driver.getWindowHandles();

		for (String all : allwindow) {

			String title = driver.switchTo().window(all).getTitle();

			System.out.println("title :" + title);

		}

		String child = "Amazon.in - Today's Deals";

		for (String childtit : allwindow) {

			if (driver.switchTo().window(childtit).getTitle().equalsIgnoreCase(child)) {
				break;
			}

		}

		for (String parent : allwindow) {

			if (!parent.equals(parentid)) {

			driver.switchTo().window(parent);
				driver.close();
		}

}

		//driver.quit();
	}

}
