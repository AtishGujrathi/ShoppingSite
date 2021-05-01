package shoppingSite.pagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import shoppingSite.basePackage.TestBase;

public class MyWishlistPage extends TestBase{

	
	@FindBy(xpath="//input[@id='name']")
	@CacheLookup
	WebElement wishlistName;
	@FindBy(xpath="//button[@id='submitWishlist']")
	@CacheLookup
	WebElement saveButton;
	@FindBy(xpath="//tbody/tr[@id='wishlist_32300']/td[6]/a[1]")
	@CacheLookup
	WebElement deleteWishlist;
}
