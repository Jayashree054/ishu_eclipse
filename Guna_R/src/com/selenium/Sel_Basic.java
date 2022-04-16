package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Basic {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Guna_R\\Driver1\\chromedriver.exe");
		
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.facebook.com/");	}
	

}
