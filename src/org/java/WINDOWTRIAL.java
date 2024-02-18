package org.java;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WINDOWTRIAL {

	public static void main(String[] args) throws AWTException, InterruptedException {
		

	
	WebDriverManager.edgedriver().setup();
	
	WebDriver driver=new EdgeDriver();
	
	Robot r=new Robot();
	
	Actions a=new Actions(driver);
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//span[@role='button']")).click();
	
	
	WebElement se=driver.findElement(By.cssSelector(".Pke_EE"));
	
	a.moveToElement(se).click().sendKeys("laptop").build().perform();
	
	r.keyPress(KeyEvent.VK_ENTER);
	
	
	driver.findElement(By.xpath("(//img[@loading='eager'])[1]")).click();
	
	Set<String> windows=driver.getWindowHandles();
	
	java.util.Iterator<String> it=windows.iterator();
	
	String parent=it.next();
	String child=it.next();
	//String subchild=it.next();
	
	
	driver.switchTo().window(child);
	
	
}}
