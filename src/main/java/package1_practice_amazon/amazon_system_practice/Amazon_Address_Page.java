package package1_practice_amazon.amazon_system_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Address_Page {
WebDriver driver;

@FindBy(xpath="(//span[@class='a-button-inner'])[1]")  //testcase 11
WebElement proceedbuy;

public void procced_To_Buy()
{
	proceedbuy.click();
}

@FindBy(xpath="(//span[@class='a-button-inner'])[6]")  //testcase 11
WebElement country;
/*{
Select s1=new Select(country);
s1.selectByVisibleText("India");
} */
public void country_region()
{
	country.click();
	//Select s1 = null;
	//s1.selectByVisibleText("India");
}
@FindBy(id="address-ui-widgets-enterAddressFullName")
WebElement fullname;

public void first_last_name()
{
	fullname.sendKeys("Jaswanthi K N");
}

@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
WebElement number;

public void mobile_number()
{
	number.sendKeys("9620941056");
}

@FindBy(id="address-ui-widgets-enterAddressPostalCode")
WebElement pin;
public void PIN_code()
{
	pin.sendKeys("560039");
}

@FindBy(id="address-ui-widgets-enterAddressLine1")
WebElement houseno ;
public void House_address()
{
	houseno.sendKeys("#499 ITI layout Naindahalli");
}
@FindBy(id="address-ui-widgets-enterAddressLine2")
WebElement Area  ;
public void Area_address()
{
	Area.sendKeys("opposite to RR nagar Gopalanmall");
}
@FindBy(id="address-ui-widgets-landmark")
WebElement landmark;
public void nearBy_landmark()
{
	landmark.sendKeys("near Ganesha Temple");
}
@FindBy(id="address-ui-widgets-enterAddressCity")
WebElement town;
public void city_town()
{
	town.sendKeys("Bangalore");
}
@FindBy(linkText="Choose a state")
WebElement state;
@FindBy(linkText="KARNATAKA")
WebElement state1;		
public void state_s()
{
state.click();
state1.click();
}
//@FindBy(xpath="(//span[@class='a-button-inner'])[8]")
//@FindBy(id="shipToThisAddressButton")
//@FindBy(xpath="(//span[@class='a-button-text a-text-center'])[1]")
@FindBy(className="a-button-input")
WebElement address;
public void use_address()
{
	address.click();
}













public Amazon_Address_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
