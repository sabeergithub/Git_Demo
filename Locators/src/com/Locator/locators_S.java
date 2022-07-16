package com.Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_S {

	public static void main(String[] args) {
		// Key and value
		
		System.setProperty("webdriver.chrome.driver","C:\\Chrome_webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         // Call the URL
         driver.get("https://www.facebook.com/r.php");
         driver.manage().window().maximize();
        
		//driver.findElement(By.id("u_0_j_Cs")).sendKeys("Sabir");
	
         driver.findElement(By.name("firstname")).sendKeys("Sabir");
         driver.findElement(By.name("lastname")).sendKeys("Hussain");
	     driver.findElement(By.name("reg_email__")).sendKeys("B.sabeer92@gmail.com");
	     driver.findElement(By.id("password_step_input")).sendKeys("Sab239654");
	     driver.findElement(By.id("day")).sendKeys("12");
	     driver.findElement(By.name("birthday_month")).sendKeys("July");
	     driver.findElement(By.id("year")).sendKeys("1992");
	     
	     // Linktext 
	     driver.findElement(By.linkText("Already have an account?")).click();
	     
	     //driver.navigate().back();
	
	     driver.findElement(By.partialLinkText("Already have an")).click();
	
	}
	
	

}
