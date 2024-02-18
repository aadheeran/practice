package org.java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public Assignment() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise");
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("learning");
		driver.findElement(By.xpath("(//label[@class=\"customradio\"])[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement a1=driver.findElement(By.cssSelector("select.form-control"));
		
		Select dropdown=new Select(a1);
		dropdown.selectByIndex(2);
		//dropdown.selectByValue("Consultant");
		driver.findElement(By.cssSelector("input#signInBtn")).click();
		
	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class=\"nav-link btn btn-primary\"]")));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"btn btn-info\"]")));
		List<WebElement> options=driver.findElements(By.xpath("//button[@class=\"btn btn-info\"]"));
		
		for(int i=0; i<options.size(); i++)
		{
			options.get(i).click();
		}
		
		
	driver.findElement(By.cssSelector("a[class=\"nav-link btn btn-primary\"]")).click();
	}

}


