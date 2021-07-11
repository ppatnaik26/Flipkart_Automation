package com.qa.flipkart.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.qa.flipkart.Pages.HomePage;
import com.qa.flipkart.Pages.LoginPage;
import com.qa.flipkart.TestBase.DriverClass;

public class HomePageTest extends DriverClass{
	
	LoginPage lp;
	HomePage hp;
	
	public HomePageTest() {
		
		super();
	}
	
	@BeforeSuite
	
	public void SetUp() throws IOException, InterruptedException
	{
		Intialization();
		 lp=new LoginPage();
		hp=lp.LoginIn(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void VerifyTitle() throws InterruptedException
	{
		hp.doVerifyTitel(prop.getProperty("title"));
		
	}

	@Test(priority=2)
	public void Verify_Ethinic() throws InterruptedException
	{
		hp.doVerify_Ethinic();
		
	}
	
	
}
