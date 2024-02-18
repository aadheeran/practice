package org.java;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamSelenium {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();


	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	    
	    //click the column
	    driver.findElement(By.xpath("//tr//th[1]")).click();
	    
	    //capture all webelement into list
	    List<WebElement>elementlist=driver.findElements(By.xpath("//tr/td[1]"));
	    
	    //capture text of all webelements into new(original list)
	    List<String> original=elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
	    //original.stream().forEach(s->System.out.println(s));
	    
	    //sort on the original list
	    List<String> sorted=original.stream().sorted().collect(Collectors.toList());
	   // sorted.stream().forEach(s->System.out.println(s));
	    
	    Assert.assertTrue(original.equals(sorted));
	    List<String>price;
	   do {
		   List<WebElement>list=driver.findElements(By.xpath("//tr/td[1]"));
	
	    //scan the name column get column print the price of beans
	  price=list.stream().filter(s->s.getText().contains("Rice"))
	    .map(s->getpriceveggie(s)).collect(Collectors.toList());
	    price.forEach(a->System.out.println(a));
	    if (price.size()<1) {
			
	    	driver.findElement(By.cssSelector("a[aria-label=\"Next\"]")).click();
		}
	   } while (price.size()<1);
		   
	}

	private static String getpriceveggie(WebElement s) {
		
		String pricevalue= s.findElement(By.xpath("following-sibling::td[2]")).getText();
		return pricevalue;
	}
	

}
