package org.java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class streamfilter {

	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver","D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();

	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	    
	    driver.findElement(By.cssSelector("input[id=\"search-field\"]")).sendKeys("Pineapple");
	    
	    List <WebElement> name=driver.findElements(By.xpath("//tr/td[1]"));
	    
       List<WebElement>filteredlist= name.stream().filter(s->s.getText().contains("Pineapple")).collect(Collectors.toList());

     // List<Boolean> v=name.stream().map(s->s.getText().contains("Pineapple")).collect(Collectors.toList());
      
       Assert.assertEquals(name.size(),filteredlist.size());
	    
     // System.out.println(v);
      }

      }
