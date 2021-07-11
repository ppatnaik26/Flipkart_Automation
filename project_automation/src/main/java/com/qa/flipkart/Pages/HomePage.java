package com.qa.flipkart.Pages;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;	
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.qa.flipkart.TestBase.DriverClass;

public class HomePage extends DriverClass {
	
		
	@FindBy(xpath="//div[text()='Fashion']")
	WebElement Fashion;
	
	@FindBy(xpath="//a[text()='Women Ethnic']")
	WebElement WomenEthinic;
	

	
	
	public HomePage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}

	public void doVerifyTitel(String name) throws InterruptedException
	{
		
		String Title_xpath="//div[@class='_1psGvi _3BvnxG']//div[text()='"+name+"']";
		Thread.sleep(5000);
		WebElement Title=driver.findElement(By.xpath(Title_xpath));
		Title.isDisplayed();
		Assert.assertEquals(Title.getText(), name);
		
	}
	
	public EthinicSelection doVerify_Ethinic() throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.moveToElement(Fashion).build().perform();
		act.moveToElement(WomenEthinic).build().perform();
		WomenEthinic.click();
		Thread.sleep(5000);
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo( 0, document.body.scrollHeight)");
		
		Thread.sleep(5000);
		
		
		
	
		
		return new EthinicSelection();
	}
	
	
}
