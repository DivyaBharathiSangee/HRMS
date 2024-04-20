package org.ss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Applyleave {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Divyabharathy\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://hrms.unitytech.in:3000/login");
		driver.manage().window().maximize();
		WebElement se = driver.findElement(By.id("formBasicEmail"));
		se.sendKeys("zorohr@theunitytech.in");
		WebElement se2 = driver.findElement(By.name("password"));
		se2.sendKeys("123");
		WebElement sub = driver.findElement(By.xpath("//button[@type='submit']"));
		sub.click();

		// Leave permission click -- apply leave
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlContains("/dashboard"));
		WebElement lp = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Leave/ Permission']")));
		lp.click();

		driver.findElement(By.xpath("//span[text()='Apply Leave']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,6000)");
		wait.until(ExpectedConditions.urlContains("/applyleave"));

		WebElement lt = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=' leavetype '])[1]")));
		lt.click();
		String lt1 = lt.getText();
		System.out.println(lt1);

		WebElement hd = driver.findElement(By.xpath("//label[text()='Half Day']"));

		WebElement hd1 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Full Day']")));
		hd.click();
		if (hd.isEnabled()) {
			// JavascriptExecutor js=(JavascriptExecutor) driver ;
			js.executeScript("window.scrollBy(0,6000)");
			wait.until(ExpectedConditions.urlContains("/applyleave"));

			WebElement dt = driver.findElement(By.xpath("//select[@class='dayTYPE form-select']"));
			Select s = new Select(dt);
			s.selectByVisibleText("First Half");
			// driver.switchTo().alert().accept();
			// WebElement from =
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("From")));
			WebElement from = driver.findElement(By.name("From"));
			from.sendKeys("30042024");
			// driver.switchTo().alert().accept();
			js.executeScript("window.scrollBy(0,6000)");
		} else {
			js.executeScript("window.scrollBy(0,6000)");
			wait.until(ExpectedConditions.urlContains("/applyleave"));
			WebElement from = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("From")));
			from.sendKeys("29032024");
			driver.switchTo().alert().accept();
			WebElement to = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("to")));
			to.sendKeys("29032024");
			driver.switchTo().alert().accept();
		}

		js.executeScript("window.scrollBy(0,6000)");
		WebElement reason = driver.findElement(By.name("reason"));
		// WebElement reason =
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reason")));
		reason.sendKeys("ss");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//button[text()='Apply Leave']"));
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].scrollIntoView(true);", element);
		//element.click();
		js.executeScript("window.scrollBy(0,-6000)");
		//notification view 
		//WebElement bell = driver.findElement(By.id("bell-1"));
		//bell.click();
		Thread.sleep(2000);
		//bell.click();
		//js.executeScript("window.scrollBy(0,-3000)");
		// Get the handle of the current window
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		System.out.println(currentWindowHandle);

		// team status module
		driver.findElement(By.xpath("//span[text()='Team Status']")).click();
		WebElement date = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"root\"]/div/main/div/div[1]/div/div[1]/div[2]/div/input")));
		date.sendKeys("2024-03-30");
		// add holiday
		driver.findElement(By.xpath("//img[@class='add-optional-leave']")).click();
		WebElement hn = driver.findElement(By.id("holiday_name"));
		hn.sendKeys("Casual");
		WebElement hda = driver.findElement(By.id("holiday_date"));
		hda.sendKeys("03062024");
		WebElement hty = driver.findElement(By.name("holiday_type"));
		Select holiday = new Select(hty);
		holiday.selectByValue("Mandatory");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		// leavelist

		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		driver.findElement(By.xpath("//span[text()='My Leave List']")).click();
		//leave request 
		wait.until(ExpectedConditions.urlContains("/myleavelist"));
		WebElement lr = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/nav[2]/div/div/div/a[4]/div[1]/span")));
		//WebElement lr= driver.findElement(By.xpath("//span[text()='Leave Requests']"));
		lr.click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("leave1")).click();// approved
		Thread.sleep(3000);
		driver.findElement(By.id("leave2")).click();// rejected
		WebElement pl = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='My Permission List']")));
		pl.click();
		
		WebElement ss = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='rechange form-select']")));
		Select s1 = new Select(ss);
		// s1.selectByVisibleText("Dec 21 - Jan 20");
		// apply permission
		Thread.sleep(1000);
		WebElement ap = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Apply Permission']")));
		ap.click();
	//	WebElement date1 = driver.findElement(By.id("exampleForm.ControlInput1"));

		WebElement stime = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/div[1]/label/div/div/div/input")));
		stime.click();
		driver.findElement(By.xpath("(//div[text()='09'])[1]")).click();
		//click ok 
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[2]/ul/li[2]/button")).click();
		//end time
		WebElement ed=driver.findElement(By.name("end_time"));
		Select endtime=new Select(ed);
		endtime.selectByVisibleText("10:00 AM");
		//reason
		WebElement re=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/label/div/textarea"));
		re.sendKeys("fgsfdgh");
		//apply permission
		driver.findElement(By.xpath("(//button[text()='Apply Permission'])[2]")).click();
		
		driver.findElement(By.linkText("Permission Request")).click();
		
		

		WebElement appro = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.id("permission1")));
		appro.click();
		driver.findElement(By.id("permission2")).click();
		WebElement search=driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[1]/div[2]/div/input"));
		search.sendKeys("ste");

	}

}
