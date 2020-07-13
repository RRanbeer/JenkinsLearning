package vivo.mobile.testing.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchApp 
{
	
	@Test
	public void test_LaunchApp()
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	System.out.println("Title of the WebPage --> "+driver.getTitle());
	
	}
}
