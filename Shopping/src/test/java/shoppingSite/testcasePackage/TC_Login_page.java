package shoppingSite.testcasePackage;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import shoppingSite.basePackage.TestBase;
import shoppingSite.pagePackage.LoginPage;
import shoppingSite.pagePackage.MyAccountPage;

public class TC_Login_page extends TestBase{
	LoginPage lp;
	MyAccountPage myAccountPage;

	public TC_Login_page()
	{
		super();	
	}
	
	@BeforeMethod
	public void steup()
	{
		getBrowser();
		lp = new LoginPage();	
	}
		
	@Test(priority = 2)
	public void loginTest()
	{
		myAccountPage = lp.login(prop.getProperty("username"), prop.getProperty("password"));	
		
		String loginTitle = lp.validateLoginPageTitlle();
		Assert.assertEquals(loginTitle, "My account - My Store");
	}
	
	@Test(priority=1)
	public void loginPageTitle()
	{
		String loginTitle = lp.validateLoginPageTitlle();
		Assert.assertEquals(loginTitle, "My Store");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		
		driver.quit();
	}
	
	
}
