package org.java;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

		driver.findElement(By.xpath("//button[contains(text(),\"Start\")]")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement flu=wait.until(new Function<WebDriver, WebElement>(){

			@Override
			public WebElement apply(WebDriver t) {
				// TODO Auto-generated method stub
				if (driver.findElement(By.xpath("//h4[contains(text(),\"Hello World!\")]")).isDisplayed()) {
					return driver.findElement(By.xpath("//h4[contains(text(),\"Hello World!\")]"));
				} 
				else {
					return null;
				}
			}
			
		});

		System.out.println(driver.findElement(By.xpath("//h4[contains(text(),\"Hello World!\")]")).isDisplayed());

		System.out.println(driver.findElement(By.xpath("//h4[contains(text(),\"Hello World!\")]")).getText());
	}

}
