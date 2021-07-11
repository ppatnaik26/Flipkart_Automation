package com.qa.flipkart.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.flipkart.TestBase.DriverClass;

public class EthinicSelection extends DriverClass{
	
	@FindBy(xpath="//span[text()='Cart']")
	WebElement Cart;
	
	
	public EthinicSelection()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void GotoCart()
	{
		Cart.click();
	}

}
