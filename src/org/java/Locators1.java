package org.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		
	String name="rahul";
	
	System.setProperty("webdriver.chrome.driver","D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");
	
    WebDriver driver=new ChromeDriver();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    String password= getparse(driver);
    
    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    
    driver.findElement(By.id("inputUsername")).sendKeys(name);
    
    driver.findElement(By.name("inputPassword")).sendKeys(password);
    
    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    
    System.out.println(driver.findElement(By.cssSelector("p[style=\"color: rgb(27, 179, 102); font-size: 18px; text-align: center;\"]")).getText());
    
    Assert.assertEquals(driver.findElement(By.cssSelector("p[style=\"color: rgb(27, 179, 102); font-size: 18px; text-align: center;\"]")).getText(),"You are successfully logged in.");
    
    Assert.assertEquals(driver.findElement(By.cssSelector("div[class=\"login-container\"] h2")).getText(),"Hello "+name+",");
    
    driver.findElement(By.xpath("//button[text()=\"Log Out\"]")).click();
    
	}
	
	public static String getparse(WebDriver driver) throws InterruptedException
	{
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 Thread.sleep(2000);
		 
		   driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		   
		 String passwordtext=driver.findElement(By.cssSelector("form p.infoMsg")).getText();

		 //Please use temporary password 'rahulshettyacademy' to Login.
		 String[] passwordarray=passwordtext.split("'");
		// String[] passwordArray2 = passwordArray[1].split("'");

		// passwordArray2[0]
		 
		 String password=passwordarray[1].split("'")[0]; 
		 return password;
		 
		//0th index - Please use temporary password

		//1st index - rahulshettyacademy' to Login.



		//0th index - rahulshettyacademy

		//1st index - to Login.
		  
	}
}
