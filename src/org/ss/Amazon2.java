package org.ss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divyabharathy\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	   
	    driver.findElement(By.id("nav-hamburger-menu")).click();
	  WebElement aa= driver.findElement(By.xpath("(//div[text()='Echo & Alexa'])[1]"));
	  aa.click();
	 // Actions a1=new Actions(driver);
	//  a1.moveToElement(aa).perform();
	   // driver.findElement(By.xpath("//span[text()='Policy']")).click();
	//  a1.keyDown(aa, Keys.ENTER);
	 

	}

}
