package org.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrametestDradandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		
		WebElement fra=driver.findElement(By.cssSelector("iframe.demo-frame"));
		
		driver.switchTo().frame(fra);
		
		Actions a=new Actions(driver);
		
		WebElement source=driver.findElement(By.cssSelector("div#draggable"));
		
		WebElement target=driver.findElement(By.cssSelector("div#droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();
	}

}

