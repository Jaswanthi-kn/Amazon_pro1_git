package package1_practice_amazon.amazon_system_practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Cart_Page {
 
	WebDriver driver;

@FindBy(xpath="//div[@class='a-section aok-relative s-image-tall-aspect'][1]")
WebElement first_pro;

public void First_Product()
{
	first_pro.click();
}

@FindBy(id="add-to-cart-button")
WebElement addtocart;

public void Add_To_Cart()
{
	addtocart.click();
}


@FindBy(linkText="Go to Cart")  //its working with linktext -testcase10
		
WebElement gocart;

public void Go_cart()
{
	gocart.click();
}
/* @FindBy(xpath="(//span[@class='a-button-inner'])[10]")
WebElement update;

public void update_option()
{
	update.click();
	update.sendKeys("6");
}

@FindBy(id="sc-update-quantity-input")
WebElement box;
public void box_qa()
{
	box.sendKeys("5");
} */
@FindBy(xpath="(//i[@class='a-icon a-icon-dropdown'])[1]")
WebElement update;

public void update_option()
{
	update.click();
	update.sendKeys(Keys.ARROW_DOWN);
	update.sendKeys(Keys.ARROW_DOWN);
}
@FindBy(id="quantity_3")
WebElement thirdqty;

public void qty3()
{
	thirdqty.sendKeys(Keys.ENTER);
}

@FindBy(xpath="(//input[@class='a-color-link'])[5]")
WebElement remove;
public void item_remove()  //some doubt not removing
{
	remove.click();
}

public Amazon_Cart_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
