package org.ss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divyabharathy\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    WebElement se= driver.findElement(By.id("twotabsearchtextbox"));
	    se.sendKeys("iphone");
	    
	    WebElement sub=driver.findElement(By.xpath("//input[@type='submit']"));
	    sub.click();
	    driver.findElement(By.linkText("Samsung")).click();
	    JavascriptExecutor js=(JavascriptExecutor) driver ;
	    js.executeScript("window.scrollBy(0,3000)");
	    
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    //driver.navigate().to("http://hrms.unitytech.in:3000/login");
	   // Thread.sleep(4000);
	   // driver.navigate().back();
	    //driver.quit();*/
		driver.get("http://hrms.unitytech.in:3000/login");
	    driver.manage().window().maximize();
	    WebElement se= driver.findElement(By.id("formBasicEmail"));
	    se.sendKeys("varshahr@theunity.com");
	    WebElement se2= driver.findElement(By.name("password"));
	    se2.sendKeys("321");
	    WebElement sub=driver.findElement(By.xpath("//button[@type='submit']"));
	    sub.click();
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	       wait.until(ExpectedConditions.urlContains("/dashboard")); 
 //wait1.until(ExpectedConditions.urlContains("/applyleave")); 
	       
	       WebElement emp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/nav[2]/div/div/a[5]/div[1]")));
	       emp.click(); 
	       driver.findElement(By.id("dropdown-basic")).click();
	       driver.findElement(By.xpath("//span[text()=' View Profile']")).click();
	       //wait.until(ExpectedConditions.urlContains("/user-profile"));
	       WebElement g = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='nav-link w-100 p-0 policy active']")));
	       g.click(); 
	      // driver.findElement(By.id("nav-gadget-tab")).click();
	       

	}

}
