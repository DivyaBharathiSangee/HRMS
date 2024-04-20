package org.ss;

import java.awt.Desktop.Action;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel_Pro {

	@SuppressWarnings("null")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Divyabharathy\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://hrms.unitytech.in:3000/login");
		driver.manage().window().maximize();
		WebElement se = driver.findElement(By.id("formBasicEmail"));
		se.sendKeys("varshahr@theunity.com");
		WebElement se2 = driver.findElement(By.name("password"));
		se2.sendKeys("321");
		WebElement sub = driver.findElement(By.xpath("//button[@type='submit']"));
		sub.click();
		// WebElement log= driver.findElement(By.xpath("//span[text()='Login Time']"));
		// log.click();
		// Wait for login page to load
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlContains("/dashboard")); // Adjust URL as needed

		try {
			// Click on login time
			WebElement loginTime = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//div[@id='root']/div/nav[2]/div/div/a[2]")));
			loginTime.click();
			// driver.findElement(By.xpath("//button[text()='Apply Permission']")).click();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.urlContains("/logintime"));

		WebElement bh = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='nav-link mx-2']")));
		bh.click();

		wait1.until(ExpectedConditions.urlContains("logintime"));

		WebElement lp = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Leave/ Permission']")));
		lp.click();
		wait1.until(ExpectedConditions.urlContains("logintime"));

		WebElement al = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Apply Leave']")));
		al.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,6000)");
		wait1.until(ExpectedConditions.urlContains("/applyleave"));

		WebElement lt = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=' leavetype '])[2]")));
		lt.click();
		wait1.until(ExpectedConditions.urlContains("/applyleave"));

		js.executeScript("window.scrollBy(0,6000)");

		// WebElement to =
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("to")));
		// to.sendKeys("29032024");
		// driver.switchTo().alert().accept();

		// Thread.sleep(6000);
		WebElement hd = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Half Day']")));
		hd.click();

		// Thread.sleep(4000);
		// wait1.until(ExpectedConditions.urlContains("/applyleave"));
		WebElement le = wait1.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='dayTYPE form-select']")));

		Select s = new Select(le);
		s.selectByVisibleText("First Half");

		WebElement from = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("From")));
		from.sendKeys("29032024");
		driver.switchTo().alert().accept();
		js.executeScript("window.scrollBy(0,6000)");

		WebElement reason = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reason")));
		reason.sendKeys("ss");
		//Thread.sleep(4000);

		wait1.until(ExpectedConditions.urlContains("/applyleave"));

		WebElement emp = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Apply Leave']")));
		emp.click();
	//	WebElement se = driver.findElement(By.id("formBasicEmail"));
	//	se.sendKeys("divyabharathy@theunitytech.com");
	//	driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
	}
}
