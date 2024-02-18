package org.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentwebtable {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver", "D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://qaclickacademy.com/practice.php");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrolltop");
		
		WebElement table=driver.findElement(By.cssSelector("table[class=\"table-display\"]"));
		
		System.out.println(table.findElements(By.tagName("tr")).size());
		
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		List<WebElement> aa=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		System.out.println(aa.get(0).getText());
		
		System.out.println(aa.get(1).getText());
		System.out.println(aa.get(2).getText());
	}
	

}

