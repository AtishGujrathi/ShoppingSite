package shoppingSite.pagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import shoppingSite.basePackage.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how= How.XPATH, using = "//a[contains(text(),'Sign in')]")
	@CacheLookup
	WebElement signin;
	
	@FindBy(how= How.XPATH, using = "//input[@id='email']")
	@CacheLookup
	WebElement email;
	
	@FindBy(how= How.XPATH, using = "//input[@id='passwd']")
	@CacheLookup
	WebElement password;
		
	@FindBy(how= How.XPATH, using = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
	@CacheLookup
	WebElement submit;
	
	public String validateLoginPageTitlle()
	{
		
		return driver.getTitle();
	}
	
	public MyAccountPage login(String uname, String pass)
	{
		signin.click();
		email.sendKeys(uname);
		password.sendKeys(pass);
		submit.click();
		//My account - My Store
		return new MyAccountPage();
	}
	
}
