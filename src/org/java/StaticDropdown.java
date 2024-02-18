package org.java;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticdropdown= driver.findElement(By.xpath("//select[@name=\"ctl00$mainContent$DropDownListCurrency\"]"));
		
		Select dropdown=new Select(staticdropdown);
		
		/*dropdown.selectByIndex(2);
		
		dropdown.selectByValue("USD");*/
		
		dropdown.selectByVisibleText("USD");
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		
		

	}

}
