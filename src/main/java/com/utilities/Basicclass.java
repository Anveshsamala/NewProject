package com.utilities;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


public class Basicclass {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void opentheBrower() throws EncryptedDocumentException, IOException
	{
		String url=ReadData.readdatafromexcel("Sheet1", 1, 0);
		String browser=ReadData.readdatafromexcel("Sheet1", 1, 3);
		if(browser.equals("Chrome"))
				{
			System.setProperty("webdriver.chrome.driver", "c://drivers.chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
				}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "c://drivers.geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(url);
		}
			
	}
	
	@AfterTest
	public void closetheBrowser()
	{
		driver.close();
	}
	
	@BeforeClass
	public void login() throws EncryptedDocumentException, IOException
	{
		String un=ReadData.readdatafromexcel("Sheet1", 1, 1);
		String pwd=ReadData.readdatafromexcel("Sheet1", 1, 2);
		driver.findElement(By.id("usernam")).sendKeys(un);
		driver.findElement(By.id("passwor")).sendKeys(pwd);
		driver.findElement(By.id("loginbtn")).click();
		
		
	}
	
	@AfterClass
	public void logout()
	{
		driver.findElement(By.id("logoutbtn")).click();
	}
	

}
