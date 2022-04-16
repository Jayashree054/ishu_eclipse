package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Min_Project {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Guna\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("maha2303");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Maha@23");
		WebElement Submit = driver.findElement(By.xpath("//input[@type='Submit']"));
		Submit.click();
		WebElement location= driver.findElement(By.id("location"));
		Select s =new Select(location);
		s.selectByValue("New York");
		WebElement Hotels=driver.findElement(By.id("hotels"));
		Select s1= new Select(Hotels);
		s1.selectByValue("Hotel Sunshine");
		WebElement RoomType= driver.findElement(By.id("room_type"));
		Select s2= new Select(RoomType);
		s2.selectByValue("Super Deluxe");
	WebElement datepick_in=driver.findElement(By.id("datepick_in"));
	datepick_in.clear();
	datepick_in.sendKeys("07/05/2022");
	WebElement datepick_out=driver.findElement(By.id("datepick_out"));	
	datepick_out.clear();
	datepick_out.sendKeys("09/05/2022");
	WebElement AdultsperRoom=driver.findElement(By.id("adult_room"));
	Select	s3=new Select(AdultsperRoom);
	s3.selectByValue("2");
	WebElement ChildrenperRoom=driver.findElement(By.id("child_room"));
	Select	s4=new Select(ChildrenperRoom);
	s4.selectByValue("0");
	WebElement Submit1= driver.findElement(By.id("Submit"));
	Submit1.click();
	WebElement Radiobutton= driver.findElement(By.id("radiobutton_0"));
	Radiobutton.click();
	WebElement Continue=driver.findElement(By.id("continue"));
	Continue.click();
	WebElement Firstname=driver.findElement(By.id("first_name"));
	Firstname.sendKeys("Mahalakshmi");
	WebElement Lastname= driver.findElement(By.id("last_name"));
	Lastname.sendKeys("Ragavan");
	WebElement Address= driver.findElement(By.id("address"));
	Address.sendKeys("tirumala,tirupathi");
	WebElement creditcard=driver.findElement(By.id("cc_num"));
	creditcard.sendKeys("1234567891011218");
	WebElement card	=driver.findElement(By.id("cc_type"));
	Select s5=new Select(card);
	s5.selectByValue("MAST");
	WebElement expirydate	=driver.findElement(By.id("cc_exp_month"));
	Select s6=new Select(expirydate);
	s6.selectByValue("4");
	WebElement expirydate1	=driver.findElement(By.id("cc_exp_year"));
	Select s7=new Select(expirydate1);
	s7.selectByValue("2022");
	WebElement number=driver.findElement(By.id("cc_cvv"));
	number.sendKeys("765");
	WebElement button=driver.findElement(By.id("book_now"));
	button.click();
	
	
	
}
}