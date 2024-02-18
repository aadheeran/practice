package org.java;



import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;
public class prac {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(5000);
		
		driver.switchTo().frame(2);
		
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("anand");
		
	}		
}
