package org.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowactivities {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();

	   
	    driver.manage().window().maximize();
	    
	    driver.get("https://google.com");
	    
	    driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    driver.navigate().back();
	    
	    driver.navigate().forward();
	}

}
