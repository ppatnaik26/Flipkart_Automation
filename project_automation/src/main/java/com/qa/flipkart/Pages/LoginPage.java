package com.qa.flipkart.Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.flipkart.TestBase.DriverClass;
import com.qa.flipkart.testUtil.CommonFunctionality;

public class LoginPage extends DriverClass{
	
	CommonFunctionality util=new CommonFunctionality();
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	WebElement Username;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElement Password;
	
	@FindBy(xpath="//span[text()='Login']//parent::button[@type='submit']")
	WebElement LoginButton;
	
	
	
	public LoginPage()throws IOException  {
		PageFactory.initElements(driver, this);
	}

	
	//for login
	
	public HomePage LoginIn(String un,String Pass) throws IOException, InterruptedException
	{
		
		Username.sendKeys(un);
		
		Password.sendKeys(Pass);
		
		LoginButton.click();
		Thread.sleep(8000);
		
		
		
		return new HomePage();
	}
	
	
	public void LogOut(String name) throws InterruptedException
	{
		
		String Title_xpath="//div[@class='_1psGvi _3BvnxG']";
		WebElement Title=driver.findElement(By.xpath(Title_xpath));
		Boolean b=testTit(Title);
		if(b)
		{
			Actions act=new Actions(driver);
			act.moveToElement(Title).build().perform();
			Thread.sleep(3000);
			
			List<WebElement> list= driver.findElements(By.xpath("//div[@class='_1bQ5Pp']//ul//li//div"));
			for(int i=0;i<=list.size()-1;i++)
			{
				Boolean b1=testTit(list.get(i));
				if(b1)
				{
					String nme=list.get(i).getText();
					if(nme.equals("Logout"))
					{
						list.get(i).click();
					}
					
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
