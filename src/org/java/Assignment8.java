package org.java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
public class Assignment8 {

	public static void main(String[] args) throws InterruptedException, IOException  {
		System.setProperty("webdriver.chrome.driver", "D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[id=\"autocomplete\"]")).sendKeys("usa");
		
		Thread.sleep(5000);
List<WebElement> options =driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] div"));
	    
	    for (WebElement option: options) {
			
	    	if (option.getText().equalsIgnoreCase("United States (USA)")) {
				
	    		option.click();
	    		break;
			}
		}
		
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //FileUtils.copyFile(src,new File("E:\screenshot.png"));
	}

}

