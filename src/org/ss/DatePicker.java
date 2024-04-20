package org.ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divyabharathy\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/");
	    driver.manage().window().maximize();
	    ////*[@id="checkin"]
	    driver.findElement(By.linkText("Hotels")).click();
	    driver.findElement(By.id("checkin")).click();
	    String m="March 2024";
	    String d="28";
	    while(true)
	    {
	    	String te=  driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[6]/div[1]/table/thead/tr[1]/th[2]")).getText();
	    	if(te.equals(m))
	    	{
	    		break;
	    	}
	    	else
	    	{
	    		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[6]/div[1]/table/thead/tr[1]/th[3]"));
	    	}
	    }
	    ////*[@id="fadein"]/div[6]/div[1]/table/tbody/tr[6]/td[6]
	    
	    driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[6]/div[1]/table/tbody/tr[6]/td[7]")).click();

	
	}

}
