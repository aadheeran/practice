package org.java;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> li=driver.findElements(By.cssSelector("li[class=\"gf-li\"] a"));
		SoftAssert a=new SoftAssert();
		for (WebElement link : li) {
			
			String url=link.getAttribute("href");
			
			System.out.println(url);
		   
		   HttpURLConnection conn1=(HttpURLConnection) new URL(url).openConnection();
		   conn1.setRequestMethod("HEAD");
		   conn1.connect();
		   int respcode=conn1.getResponseCode();
		   System.out.println(respcode);
		   
		   a.assertTrue(respcode<400,"the link with text"+link.getText()+"is broken with code"+respcode);
		   /*if (respcode>400) {
			System.out.println("the link with text"+link.getText()+"is broken with code"+respcode);
			   Assert.assertTrue(false);*/
		}
		a.assertAll();
		}
		
		/*String url=driver.findElement(By.cssSelector("//a[text()=\"Broken Link\"]")).getAttribute("href");
		
		System.out.println(url);
		
	  
	   
	   
	   HttpURLConnection conn1=(HttpURLConnection) new URL(url).openConnection();
	   conn1.setRequestMethod("HEAD");
	   conn1.connect();
	   int respcode=conn1.getResponseCode();
	   System.out.println(respcode);*/
	}


