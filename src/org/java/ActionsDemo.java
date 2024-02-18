package org.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
		Actions a=new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("a[id=\"nav-link-accountList\"]"));
		
		//move to specific element
		
		a.moveToElement(driver.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]")))
		.click().keyDown(Keys.SHIFT).sendKeys("watch").doubleClick()
		.build().perform();
		
		
		a.moveToElement(move).contextClick().build().perform();
		
		
	}}