package org.java;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Redbus {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");
    ChromeOptions options=new ChromeOptions();
    options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
	WebDriver driver = new ChromeDriver();
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	
	driver.get("https://www.redbus.in/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	driver.findElement(By.cssSelector("input[id=\"src\"]")).sendKeys("bangalore");
	
	
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
	
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//text[text()=\"Marathahalli\"]")));
	driver.findElement(By.xpath("//text[text()=\"Marathahalli\"]")).click();

	
	driver.findElement(By.cssSelector("input[id=\"dest\"]")).sendKeys("udumalai");
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//text[text()=\"Udumalaipettai(tamil Nadu)\"]")));
	
	driver.findElement(By.xpath("//text[text()=\"Udumalaipettai(tamil Nadu)\"]")).click();
	
//	driver.findElement(By.cssSelector("span.dateText")).click();
//	
//	//driver.findElement(By.xpath("//span[text()=\"Date\"]")).click();
//	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//text[text()=\"30 Jul\"]")));
//	driver.findElement(By.xpath("//text[text()=\"30 Jul\"]")).click();
	
	System.out.println(driver.findElements(By.cssSelector("div.sc-kAzzGY.llxTcS span.dateText")).size());
	
	driver.findElement(By.cssSelector("div[class=\"sc-kAzzGY llxTcS\"]"));
}
}




