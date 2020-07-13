package vivo.mobile.testing.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class EasyMyTrip 
{
	@Test
	public void test_EasyMyTrip()
	{

	//Handle Notification popup
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--disable-notifications");
	
	WebDriver driver = new ChromeDriver(opt);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.easemytrip.com/");
	
	driver.findElement(By.xpath("//a[@class='crs-hp closeFilePanel']")).click();
	
	//From
	WebElement from = driver.findElement(By.id("FromSector_show"));
	from.click();
	from.sendKeys("Bangalore");
	WebElement selectFrom = driver.findElement(By.xpath("//li[@class='ui-menu-item']/div[1]/span[2]"));
	selectFrom.click();
	
	//To
	WebElement to = driver.findElement(By.id("Editbox13_show"));
	to.click();
	to.sendKeys("Bhopal");
	WebElement selectTo = driver.findElement(By.xpath("//ul[@id='ui-id-2']/li/div[1]/span[2]"));
	selectTo.click();
	
	//Select Date
	WebElement date = driver.findElement(By.id("ddate"));
	date.click();
	driver.findElement(By.id("frth_4_23/07/2020")).click();
	
	//Select number of passenger
	WebElement traveller = driver.findElement(By.xpath("//span[text()='1 Traveller(s)']"));
	traveller.click();
	//Adult count(12+)
	WebElement adult = driver.findElement(By.xpath("//input[@id='optAdult']/../following-sibling::div[1]/input"));
	adult.click();
	//Child count(2+ - 12)
	WebElement child = driver.findElement(By.xpath("//input[@id='optChild']/../following-sibling::div[1]/input"));
	child.click();
	child.click();
	//infabts(below 2yrs)
	WebElement infants = driver.findElement(By.xpath("//input[@id='optInfant']/../following-sibling::div[1]/input"));
	infants.click();
	//click Done
	driver.findElement(By.id("traveLer")).click();
	
	//select class
	driver.findElement(By.xpath("//a[@class='dropbtn_n10']")).click();
	//click Economy
	driver.findElement(By.xpath("id(\"myDropdown_n9\")/div/child::label[1]/span")).click();
	//click Done
	driver.findElement(By.id("tripType")).click();
	
	//Click on Search option
	driver.findElement(By.xpath("//div[@class='s_col_v4 ripplen']")).click();
	}
}
