package shoppingSite.pagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import shoppingSite.basePackage.TestBase;

public class MyAccountPage extends TestBase {
	
	
	public MyAccountPage()
	{
				PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	@CacheLookup
	WebElement myWishlist;
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")
	@CacheLookup
	WebElement personalInfo;
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	@CacheLookup
	WebElement myAddress;
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	@CacheLookup
	WebElement myCreditSlips;
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	@CacheLookup
	WebElement orderHistory;
	@FindBy(xpath="//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
	@CacheLookup
	WebElement women;
	@FindBy(xpath="//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	@CacheLookup
	WebElement tshirt;
	
	public MyWishlistPage goToWishlistPage()
	{
		
		myWishlist.click();
		return new MyWishlistPage();	
	}
	
	public MyPersonalInformationPage goToPersonalInformationpage()
	{
		personalInfo.click();
		return new MyPersonalInformationPage();	
	}
	public MyCreditSlipPage goToMyCreditSlipPage(){
		myCreditSlips.click();
		return new MyCreditSlipPage();
		
	}
	public MyAddressPage goToMyAddressPage()
	{
		myAddress.click();
		return new MyAddressPage();
	}
	public OrderHistoryPage goToOrderHistoryPage()
	{
		orderHistory.click();
		return new OrderHistoryPage();
	}
	
	public SearchTshirtPage searchWomwnTshirt()
	{
		Actions womenMenuBuilder = new Actions(driver);      
		womenMenuBuilder.moveToElement(women).build().perform();
		womenMenuBuilder.moveToElement(tshirt).click().build().perform();
		return new SearchTshirtPage();
	}
	
	
}
