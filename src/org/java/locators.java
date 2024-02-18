package org.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");
	
		WebDriverManager.edgedriver().setup();
	    WebDriver driver=new EdgeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    
	    driver.findElement(By.id("inputUsername")).sendKeys("ananda");
	    
	    driver.findElement(By.name("inputPassword")).sendKeys("admin");
	    
	    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	    
	   System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	   
	   driver.findElement(By.linkText("Forgot your password?")).click();
	   
//	   Thread.sleep(2);
	   
	   driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("ananda");
	   
	   driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("anandavadivel32@gmail.com");
	   
	   driver.findElement(By.xpath("//input[@type=\"text\"][2]")).clear();
	   
	   driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(3)")).sendKeys("ananda@gmail.com");
	   
	   
	   driver.findElement(By.xpath("//form/input[3]")).sendKeys("9952368783");
	   
	   driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	   
	  System.out.println(driver.findElement(By.cssSelector("form p.infoMsg")).getText());
	  
	  driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]/button[1]")).click();
	  
	  driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
	  
	  driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.id("chkboxOne")).click();
	  
	  driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	  
	  
	}
}
