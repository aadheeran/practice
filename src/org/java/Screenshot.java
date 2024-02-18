package org.java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
	//System.setProperty("WebDriver.chrome.driver", "D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	
	WebDriverManager.chromedriver().setup();
	
	driver.get("https://mvnrepository.com/");
	driver.manage().window().maximize();
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	File des=new File("E:\\e\\mvn.png");
	
	FileUtils.copyFile(src, des);
	
	
}}
