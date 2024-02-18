package org.java;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cal {

	public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.path2usa.com/travel-companions");
//April 23
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(209,1355)");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div[class*=\"elementor-field-type-date\"]")).click();

		driver.findElement(By.cssSelector("input[name=\"form_fields[travel_comp_date]\"]")).click();

		while (!driver.findElement(By.cssSelector("span.cur-month")).getText().contains("September")) {
			driver.findElement(By.cssSelector("span.flatpickr-next-month")).click();

		}

		List<WebElement> dates = driver.findElements(By.cssSelector("span.flatpickr-day"));
//Grab common attribute//Put into list and iterate
		int count = driver.findElements(By.cssSelector("span.flatpickr-day")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector("span.flatpickr-day")).get(i).getText();
			if (text.equalsIgnoreCase("21")) {
				driver.findElements(By.cssSelector("span.flatpickr-day")).get(i).click();
				break;
			}

		}
	}

}
