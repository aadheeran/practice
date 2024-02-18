package org.java;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updateddropdown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\D eclipse\\NOTHING\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("div.paxinfo")).click();
		Thread.sleep(5000);
		
		/*int i=1;
		while (i<5) {
			
			driver.findElement(By.cssSelector("span#hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.cssSelector("input#btnclosepaxoption")).click();*/
		
		for(int i=0; i<5; i++)
		{
			driver.findElement(By.cssSelector("span#hrefIncAdt")).click();
		}
		
		driver.findElement(By.cssSelector("input#btnclosepaxoption")).click();
		
		
		//DYNAMIC DROPDOWN
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value=\"MAA\"]")).click();
		driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
	}

}
