package com.Dropdown;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Single_Dropdown {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Automation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement index = driver.findElement(By.id("dropdown1"));
		Select s = new Select(index);
		s.selectByIndex(3);

		WebElement value = driver.findElement(By.name("dropdown2"));
		Select s1 = new Select(value);
		s1.selectByValue("2");

		WebElement visibletext = driver.findElement(By.id("dropdown3"));

		Select v = new Select(visibletext);
		v.selectByVisibleText("Loadrunner");

		WebElement option = driver.findElement(By.xpath("//select[@class='dropdown']"));

		Select si = new Select(option);

		si.selectByIndex(3);

		// narrowing
		TakesScreenshot ts = (TakesScreenshot) driver; // downcasting
		File a = ts.getScreenshotAs(OutputType.FILE);
		File b = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Automation\\Screenshot\\img.png");
		FileUtils.copyFile(a, b);

		WebElement options = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select o = new Select(options);
		List<WebElement> options2 = o.getOptions();

		for (WebElement i : options2) {
			System.out.println(i.getText());
		}

		boolean multiple = o.isMultiple();
		System.out.println("multiple :" + multiple);

		WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
		Select m = new Select(multi);
		boolean multiple2 = m.isMultiple();
		System.out.println("multiple2:" + multiple2);

		List<WebElement> options3 = m.getOptions();

		for (WebElement k : options3) {
			System.out.println(k.getText());
		}
		int size = options3.size();
		System.out.println("size: " + size);

		for (int i = 0; i < options3.size(); i++) {
			m.selectByIndex(i);
		}

		m.deselectByIndex(2);

		m.deselectByVisibleText("Selenium");

	}

}
