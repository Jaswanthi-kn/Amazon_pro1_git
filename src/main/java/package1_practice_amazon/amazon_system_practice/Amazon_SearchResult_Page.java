package package1_practice_amazon.amazon_system_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchResult_Page {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='a-link-normal s-no-outline'][1]")
	WebElement first_pro;
	public void firstProduct()
	{
		first_pro.click();
	}
	@FindBy(className="a-price-whole")
	WebElement price;
	public void pro_price()
	{
		price.click();
	}
	@FindBy(className="a-declarative")
	WebElement rating;
	public void pro_rating()
	{
		rating.click();
	}
	
	@FindBy(id="acrPopoverLink")
	WebElement customer_review;
	public void cus_review()
	{
		customer_review.click();
	}
	
	public Amazon_SearchResult_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

