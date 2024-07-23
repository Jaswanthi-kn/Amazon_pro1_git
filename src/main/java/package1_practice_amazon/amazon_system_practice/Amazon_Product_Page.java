package package1_practice_amazon.amazon_system_practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Product_Page {

	WebDriver driver;
	
	/* //@FindBy(linkText="Category") //span[@class='a-size-base a-color-base puis-bold-weight-text'][3]
	@FindBy(xpath="//span[@class='a-size-base a-color-base puis-bold-weight-text'][3]")
	WebElement cate;
	public void category()
	{
		cate.click();
	}
	@FindBy(linkText="Shoes")
	WebElement shoes;
	public void cat_shoes()
	{
		shoes.click();
	}*/
	
	@FindBy(className="a-icon a-icon-popover")
	WebElement rate;
	public void ratings()
	{
		rate.click();
	}
	@FindBy(className="//span[@class='a-price-whole'][1]")
	WebElement price;
	public void pricing()
	{
		price.click();
	}
	
	//testcase 8 related code
	
	//@FindBy(xpath="//a[@class='a-link-normal s-navigation-item'][22]")
	//@FindBy(xpath="//span[@class='a-size-base a-color-base']")
	//@FindBy(className="a-link-normal s-navigation-item")
	@FindBy(css="a-size-base a-color-base")
	WebElement womens_running_shoes;
	
	public void womensshoes()
	{
		womens_running_shoes.click();
	}
	@FindBy(id="a-autoid-268-announce")
	WebElement sort;
	
	@FindBy(id="a-autoid-0-announce")
	WebElement sortby_L_H;
	public void sortby_featured_LH()
	{
		sort.click();
		sortby_L_H.sendKeys(Keys.ARROW_DOWN);
		sortby_L_H.click();//low to high price
	}
	@FindBy(id="a-autoid-0-announce")
	WebElement sortby_H_L;
	public void sortby_featured_HL()
	{
		sort.click();
		sortby_H_L.sendKeys(Keys.ARROW_DOWN);
		sortby_H_L.sendKeys(Keys.ARROW_DOWN);
		sortby_H_L.click();//high to low price
	}
	
	@FindBy(id="s-result-sort-select_3")
	WebElement customer_rivews;
	public void avg_rivews()
	{
		sort.click();
		customer_rivews.sendKeys(Keys.ARROW_DOWN);
		customer_rivews.sendKeys(Keys.ARROW_DOWN);
		customer_rivews.sendKeys(Keys.ARROW_DOWN);
		customer_rivews.click();//average cus review
	}
	
	
	
	public Amazon_Product_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
