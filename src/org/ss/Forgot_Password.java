package org.ss;


/*
import javax.mail.*;



import javax.mail.Session;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Forgot_Password{

    public static void main(String[] args) {
        final String username = "vaishnavi.s@theunitytech.com"; // Replace with your email
        final String password = "bxbq qefs hrhn wxvn"; // Replace with your password

        Properties properties = new Properties();

       
        properties.setProperty("gmail_from", "meenapsk274@gmail.com");
        properties.setProperty("to", "vaishnavi.s@theunitytech.com");
        properties.setProperty("gmail_username", "vaishnavi.s@theunitytech.com");
        properties.setProperty("gmail_password", "bxbq qefs hrhn wxvn");
        properties.setProperty("gamil.port", "587");
        
      //  properties.setProperty("mail.smtp.starttls.enable", "true");

        // Obtain a new Session instance using getInstance() method
       // Session session = Session.getInstance(properties);

        try {
        	 // Obtain a new Session instance using getInstance() method
            Session session = Session.getInstance(properties);
           // Session session = Session.getInstance(props);
            Store store = ((javax.mail.Session) session).getStore();
            store.connect("imap.gmail.com", username, password);

            Folder inbox = store.getFolder("Inbox");
            inbox.open(Folder.READ_ONLY);

            Message[] messages = inbox.getMessages();

            for (Message message : messages) {
                if (message.getSubject() != null && message.getSubject().contains("Subject of the email")) { // Adjust this condition based on your OTP email format
                    String otp = extractOTP(message.getContent().toString());
                    if (otp != null) {
                        System.out.println("OTP: " + otp);
                        break; // Assuming you only need one OTP and can exit loop after finding one
                    }
                }
            }

            inbox.close(false);
            store.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String extractOTP(String body) {
        Pattern pattern = Pattern.compile("(\\d{6})"); // Assuming OTP is a 6-digit number, modify regex as per your OTP format
        Matcher matcher = pattern.matcher(body);

        if (matcher.find()) {
            return matcher.group(1); // Extract first occurrence of 6-digit number
        }

        return null; // Return null if no OTP found
    }

    }

*/

import javax.mail.*;
import javax.mail.internet.InternetAddress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testing.framework.EmailUtils;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Forgot_Password {

    public static void main(String[] args) throws Exception {
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Divyabharathy\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");

		/*WebDriver driver = new ChromeDriver();
		driver.get("http://hrms.unitytech.in:3000/login");
		driver.manage().window().maximize();
		WebElement se = driver.findElement(By.id("formBasicEmail"));
		se.sendKeys("divyabharathy@theunitytech.com");
		
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
      /*  String username = "muthuvelraj.k@theunitytech.com"; // Replace with your email
        String password = "ixiq keon oasx xgxt"; // Replace with your password
        String host = "imap.gmail.com";
        Properties properties = new Properties();
       // properties.setProperty("mail.store.protocol", "imap");
        properties.setProperty("mail.imap.ssl.enable", "true");
        properties.setProperty("mail.imap.host", host);
        properties.setProperty("mail.imap.port", "993");
        

       try {
            // Obtain a new Session instance using getInstance() method
            Session session = Session.getInstance(properties);
            Store store = session.getStore("imap");
            store.connect(host, username, password);

            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);

            Message[] messages = inbox.getMessages();

            for (Message message : messages) {
                if (message.getSubject() != null && message.getSubject().contains("Subject of the email")) { // Adjust this condition based on your OTP email format
                    String otp = extractOTP(message.getContent().toString());
                    String regex = "[^\\d]+";
                    
            		String[] arrOTP = messages.length.split(regex );
                    String OTP1 = arrOTP[1];
                    System.out.println("OTP is " + OTP1);
                    
                    if (otp != null) {
                        System.out.println("OTP: " + otp);
                        break; // Assuming you only need one OTP and can exit loop after finding one
                    }
                }
            }

            inbox.close(false);
            store.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String extractOTP(String body) {
       // Pattern pattern = Pattern.compile("\\b(\\d+)\\b"); // Assuming OTP is a 4-digit number, modify regex as per your OTP format
        //Matcher matcher = pattern.matcher(body);
    	String regex = "[^\\d]+";
        
		String[] arrOTP = emailText.get(0).split(regex );
        String OTP1 = arrOTP[1];
        System.out.println("OTP is " + OTP1);
       // if (matcher.find()) {
        //    return matcher.group(1); // Extract first occurrence of 4-digit number
       // }

       return null; 
       // Return null if no OTP found*/
		
		EmailUtils email=new EmailUtils();
		Properties prop=new Properties();
		prop.load(new FileInputStream("C:\\Users\\Divyabharathy\\Desktop\\emailuitils.properties"));
		Store connection=email.connectToGmail(prop);
		email.getUnreadMessages(connection, "Inbox");
		List<String> emailtext=email.getMessageByFromEmail(connection, "Inbox", "meenapsk274@gmail.com", "Subject of the email");
		//List<String> emailtext=email.getMessageByFromEmail(connection, "Inbox", "meenapsk274@gmail.com","Subject of the email");
		/*if(emailtext.size()<1)
		{
			System.out.println("No mail received ");
		}
		else
		{
			String regex = "[^\\d]+";
	        String[] arrOTP = emailtext.get(0).split(regex );
	        String OTP1 = arrOTP[1];
	        System.out.println("OTP is " + OTP1);
		}*/
		//String regex = "[^\\d]+";
		
		if (emailtext != null && emailtext.size() >=0 && emailtext.get(0) != null) 
		
		{
			String regex = "[^\\d]+";
		    String[] arrOTP = emailtext.get(0).split(regex);
		   
		    if (arrOTP.length > 1) {
		        String OTP1 = arrOTP[0];
		        System.out.println("OTP is " + OTP1);
		    } 
		    
		    else 
		    {
		        System.out.println("No OTP found in email text.");
		    }
		} else
		{
		    System.out.println("Email text is null or empty.");
		}
        
      
    }
} 






