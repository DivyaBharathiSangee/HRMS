package org.ss;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mytimesheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divyabharathy\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mytimesheet.in/");
	    driver.manage().window().maximize();
	    WebElement se= driver.findElement(By.id("email"));
	    se.sendKeys("divyabharathy@theunitytech.com");
	    WebElement se2= driver.findElement(By.id("password"));
	    se2.sendKeys("Bharathi@100");
	    WebElement sub=driver.findElement(By.xpath("//button[@type='submit']"));
	    sub.click();
	   // driver.switchTo().frame("iframeName");
	  // driver.findElement(By.xpath("//div[@id='downloadApp_clsbtn1'])")).click();
	  //  driver.findElement(By.className("side_bar")).click();
	    //driver.findElement(By.className("view-more btn-outline-success btn-dark-green px-2  btn btn-primary w-auto  mb-3")).click();
	   // driver.findElement(By.xpath("//span[text()='Check In']")).click();
	   /* String pid=driver.getWindowHandle();
	    System.out.println(pid);
	    Set<String> aid= driver.getWindowHandles();
	    for(String wid:aid) {
	    	if(wid!=pid)
	    	{
	    		//driver.switchTo().window(wid);
	    		 //driver.findElement(By.xpath("//span[text()='Check In']")).click();
	    		 driver.findElement(By.className("side_bar")).click();
	    	}
	    }*/
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    WebElement iframe=driver.findElement(By.id("downloadApp_clsbtn1"));
	    js.executeScript("arguments[0].scrollIntoView()", iframe);
	    driver.switchTo().frame(iframe);

	}

}
