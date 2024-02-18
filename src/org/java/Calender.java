package org.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.path2usa.com/travel-companion/");
		
		Actions a=new Actions(driver);
		
		
		
		driver.findElement(By.cssSelector("input[placeholder=\"Date of travel\"]")).isEnabled();
		
		//driver.findElements(By.cssSelector("div.flatpickr-current-month"));

	}

}
