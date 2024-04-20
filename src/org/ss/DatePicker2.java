package org.ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divyabharathy\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.ca/");
	    driver.manage().window().maximize();
	    ////*[@id="checkin"]
	    driver.findElement(By.name("EGDSDateRange-date-selector-trigger")).click();
	   // driver.findElement(By.id("checkin")).click();
	    String e_date="May 2024";
	    while(true)
	    {
	    	//driver.findElement(By.xpath("(//span[@class='uitk-align-center uitk-month-label'])[1]"));
	    	String t=driver.findElement(By.xpath("(//span[@class='uitk-align-center uitk-month-label'])[1]")).getText();
	    	if(t.equals(e_date))
	    	{
	    		break;
	    	}
	    	else
	    	{
	    		driver.findElement(By.xpath("//button[@data-stid='uitk-calendar-navigation-controls-next-button']")).click();
	    	}
	    }
	    driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/div[1]/div/div[3]/div/div/div[3]/div/div[1]/table/tbody/tr[2]/td[7]/div/div[2]")).click();

	}

}
