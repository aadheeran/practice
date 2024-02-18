package org.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdowns {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		 driver.findElement(By.cssSelector("input[placeholder=\"Type to Select\"]")).sendKeys("IND");
		 Thread.sleep(5000);

	    List<WebElement> options =driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"));
	    
	    for (WebElement option: options) {
			
	    	if (option.getText().equalsIgnoreCase("India")) {
				
	    		option.click();
	    		break;
			}
		}
        //checkbox
	  
	    driver.findElement(By.cssSelector("div[id*=\"SeniorCitizenDiv\"]")).click();
	    System.out.println(driver.findElement(By.cssSelector("div[id*=\"SeniorCitizenDiv\"]")).isSelected());
	    
	    System.out.println(driver.findElements(By.xpath("//*[@type=\"checkbox\"]")).size());
}
}



