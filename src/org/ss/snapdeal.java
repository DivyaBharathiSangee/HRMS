package org.ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divyabharathy\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.snapdeal.com/");
	    driver.manage().window().maximize();
	   Actions a=new Actions(driver);
	   WebElement se= driver.findElement(By.xpath("//li[@navindex='1']"));
	
	   a.moveToElement(se).perform();
	   WebElement se1=driver.findElement(By.linkText("View All"));
	   se1.click();
	   WebElement pin=driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']"));
	   pin.sendKeys("613403");
	   driver.findElement(By.xpath("//button[@class='pincode-check']")).click();
	  // driver.findElement(By.xpath("//div[@class='child-cat-name selected']")).click();
	   //driver.findElement(By.linkText("Sports Shoes")).click();
	//WebElement se2= driver.findElement(By.xpath("//div[@class='top-cat-name ']"));
	   
	   
	/*   import javax.mail.*;
	   import javax.mail.internet.*;
	   import java.util.Properties;

	   public class GmailReader {
	       public static void main(String[] args) {
	           String host = "imap.gmail.com";
	           String username = "your-email@gmail.com"; // Your Gmail address
	           String password = "your-password"; // Your Gmail password or app password

	           Properties properties = new Properties();
	           properties.put("mail.imap.ssl.enable", "true");
	           properties.put("mail.imap.host", host);
	           properties.put("mail.imap.port", "993");

	           try {
	               Session session = Session.getInstance(properties);
	               Store store = session.getStore("imap");
	               store.connect(host, username, password);

	               Folder inbox = store.getFolder("INBOX");
	               inbox.open(Folder.READ_ONLY);

	               Message[] messages = inbox.getMessages();

	               for (Message message : messages) {
	                   System.out.println("Subject: " + message.getSubject());
	                   System.out.println("From: " + InternetAddress.toString(message.getFrom()));
	                   System.out.println("To: " + InternetAddress.toString(message.getRecipients(Message.RecipientType.TO)));
	                   System.out.println("Date: " + message.getSentDate());
	                   System.out.println("-----");
	               }

	               inbox.close(false);
	               store.close();
	           } catch (Exception e) {
	               e.printStackTrace();
	           }
	       }
	   }*/

	

	}

}
