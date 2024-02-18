package org.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		String a=driver.getTitle();
		System.out.println(a);
		
	}
}
