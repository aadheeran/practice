package org.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class Relativelocator {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://rahulshettyacademy.com/angularpractice/");
	    
	   WebElement drop= driver.findElement(By.cssSelector("input[name=\"name\"]"));
	   
	   System.out.println(driver.findElement(with(By.tagName("Label")).above(drop)).getText());
	    
       WebElement date=driver.findElement(By.cssSelector("[for=\"dateofBirth\"]"));
       
       driver.findElement(with(By.tagName("input")).below(date)).click();
       
      WebElement checkbox= driver.findElement(By.cssSelector("[for=\"exampleCheck1\"]"));
      
      driver.findElement(with(By.tagName("input")).toLeftOf(checkbox)).click();
      
      WebElement radiobutton=driver.findElement(By.cssSelector("input#inlineRadio1"));
      
      radiobutton.click();
      
     System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radiobutton)).getText());
     
     
      
      
	}

}
