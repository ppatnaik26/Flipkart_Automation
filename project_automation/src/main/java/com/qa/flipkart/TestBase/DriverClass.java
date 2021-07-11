package com.qa.flipkart.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DriverClass {
	public static Properties prop;
	public static WebDriver driver;
	
	
	public DriverClass()  {
		
		try {
			 prop=new Properties();
			FileInputStream fis = new FileInputStream("/Users/PRACHI/workspace/project_automation"
					+"/src/main/java/com/qa/flipkart/config/config.properties");
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public  static void Intialization()
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Software Backup\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			
			 driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.get(prop.getProperty("url")); 
		
		
		
	}
}
