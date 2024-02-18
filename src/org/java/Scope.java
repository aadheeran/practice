package org.java;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");

	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://qaclickacademy.com/practice.php");
	//total link count
//	  System.out.println(driver.findElements(By.tagName("a")).size());
	  
	  //particular footer link count
//	 WebElement footerdriver= driver.findElement(By.id("footer-part"));//limiting webdriver scope
//	 System.out.println(footerdriver.findElements(By.tagName("a")).size());
//	 
	 //1st column link count
	WebElement firstcolumn= driver.findElement(By.xpath("//div/table[@class=\"gf-t\"]/tbody/tr/td[1]/ul"));
	
	System.out.println(firstcolumn.findElements(By.tagName("a")).size());
	
	//check each link in the column and check if the pages are  and gettitle
	
	for(int i=1; i<firstcolumn.findElements(By.tagName("a")).size(); i++) {
		
		String clickkey=Keys.chord(Keys.CONTROL,Keys.ENTER);
		firstcolumn.findElements(By.tagName("a")).get(i).sendKeys(clickkey);
		Thread.sleep(5000);
	}
	Set<String> it=driver.getWindowHandles();
	Iterator<String> ITER=it.iterator();
	
	while (ITER.hasNext()) {
		
		driver.switchTo().window(ITER.next());
             System.out.println(driver.getTitle());
	}
	
}
}


