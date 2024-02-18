package org.java;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class e2e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));   //explictly wait
//		driver.manage().timeouts().implicitlyWait(5
//				,TimeUnit.SECONDS);   //implicitwair

		String[] items = { "Brocolli", "Tomato", "Onion", "Beans", "Carrot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
//		e2e ob=new e2e();
//		ob.additems(driver, items);
		additems(driver, items);  // we can direct call method when we use static method
		
		driver.findElement(By.cssSelector("img[alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),\"PROCEED TO CHECKOUT\")]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
//		driver.findElement(By.xpath("//button[text()=\"Place Order\"]")).click();

	}

	public static void additems(WebDriver driver, String[] items)

	{
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] expected = products.get(i).getText().split("-");
			String formattedname = expected[0].trim();

			List itemsneeded = Arrays.asList(items);

			if (itemsneeded.contains(formattedname)) {
				j++;
				driver.findElements(By.cssSelector("div.product-action")).get(i).click();

				if (j == itemsneeded.size()) {

					break;

				}
			}
		}
	}
}

