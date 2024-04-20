package org.ss;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mytimesheet2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Divyabharathy\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mytimesheet.in/");
		driver.manage().window().maximize();

		WebElement se = driver.findElement(By.id("email"));
		se.sendKeys("divyabharathy@theunitytech.com");
		WebElement se2 = driver.findElement(By.id("password"));
		se2.sendKeys("Bharathi@100");
		WebElement sub = driver.findElement(By.xpath("//button[@type='submit']"));
		sub.click();
		driver.findElement(By.xpath("(//div[@class='downloadApp_clsbtn'])[1]")).click();

		Actions a = new Actions(driver);
		// driver.findElement(By.xpath("//*[@id=\"comPopup\"]/div/svg")).click();
		// driver.switchTo().alert().dismiss();
		WebElement p = driver.findElement(By.linkText("Policy"));
		// p.click();
		a.moveToElement(p).perform();
		// a.keyDown(p, Keys.ENTER).perform();

	}

}
