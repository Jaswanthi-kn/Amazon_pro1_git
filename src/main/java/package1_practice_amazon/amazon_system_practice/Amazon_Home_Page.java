package package1_practice_amazon.amazon_system_practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home_Page {

	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	public void searchfield()
	{
		search.sendKeys("shoe");
	}
	
	//@FindBy(xpath="//input[@class='nav-input nav-progressive-attribute'][2]")
	@FindBy(id="nav-search-submit-button")
	WebElement search_button;
	
	public void s_button()
	{
		search_button.click();
	}
	


	
public Amazon_Home_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}

