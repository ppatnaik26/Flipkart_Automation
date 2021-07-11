package com.qa.flipkart.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.flipkart.Pages.HomePage;
import com.qa.flipkart.Pages.LoginPage;
import com.qa.flipkart.TestBase.DriverClass;

public class LoginPageTest extends DriverClass{
	LoginPage lp;
	HomePage hp;
	
	public LoginPageTest() {
		
		super();
	}
	
	@BeforeSuite
	
	public void SetUp() throws IOException
	{
		
		Intialization();
		 lp=new LoginPage();
		 hp=new HomePage();
		
	}
	
	
	
	@Test(priority=1)
	public void doVerifyLoginPage() throws IOException, InterruptedException
	{
		HomePage hm=lp.LoginIn(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	/*@Test(priority=2)
	public void LogOut()    	
	{
		try {
			lp.LogOut("Prachi");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/

}
