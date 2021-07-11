package com.qa.flipkart.TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class PageTest {

	WebDriver driver;
	
	
	@Test
	public void testCase() throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Software Backup\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/"); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://www.flipkart.com/"); 
		 WebElement el=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		WebElement el1= driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		 WebDriverWait wait=new WebDriverWait(driver, 15);
		 wait.until(ExpectedConditions.visibilityOf(el));
		 
		 
		 WebElement el2=driver.findElement(By.xpath("//span[text()='Login']//parent::button[@type='submit']"));
		 
		 
		 
		 el.sendKeys("prchpattnaik1@gmail.com");
		 el1.sendKeys("Ilovefood2");
		 el2.click();
		 
		 
		 String Title_xpath="//div[@class='go_DOp']//div[text()='Prachi']";
		 WebElement Title=driver.findElement(By.xpath(Title_xpath));
		 Boolean b=testTit(Title);
		 System.out.println(b);
		 
		 Actions act=new Actions(driver);
			act.moveToElement(Title).build().perform();
			
			List<WebElement> list= driver.findElements(By.xpath("//div[@class='_1bQ5Pp']//ul//li//div"));
			for(int i=0;i<=list.size()-1;i++)
			{
				Boolean b1=testTit(list.get(i));
				if(b1)
				{
					String name=list.get(i).getText();
					if(name.equals("Logout"))
					{
						list.get(i).click();
					}
					
				}
				
			}
			
			
			
		
		
		
		
		 
		 
		 
	}
	
	
	public static Boolean testTit(WebElement title)
	{
		try {
	        return title.isDisplayed();
	      } catch (StaleElementReferenceException elementHasDisappeared) {
	        return false;
	      }
		
	}
}
