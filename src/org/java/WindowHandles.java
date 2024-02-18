package org.java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandles {

	public static void main(String[] args) {

		System.setProperty("webdriver.Edge.driver", "D:\\D eclipse\\NOTHING\\driver\\Edgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector("a[class=\"blinkingText\"]")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		String parent=it.next();
		String child=it.next();
		
		driver.switchTo().window(child);
		
		System.out.println(driver.findElement(By.cssSelector("p[class=\"im-para red\"]")).getText());
		driver.findElement(By.cssSelector("p[class=\"im-para red\"]")).getText();
		
		String mailid=driver.findElement(By.cssSelector("p[class=\"im-para red\"]")).getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(mailid);
		
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(mailid);
	}
	

}

