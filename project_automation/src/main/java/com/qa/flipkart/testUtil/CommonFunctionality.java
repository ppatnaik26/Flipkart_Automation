package com.qa.flipkart.testUtil;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.flipkart.TestBase.DriverClass;

public class CommonFunctionality extends DriverClass{

	
	public void ExplicitWaitConditions(WebElement el)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(el));
		
	}
	
}
