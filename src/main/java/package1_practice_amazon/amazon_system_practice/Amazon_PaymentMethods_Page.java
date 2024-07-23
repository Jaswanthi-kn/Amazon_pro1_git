package package1_practice_amazon.amazon_system_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_PaymentMethods_Page {
WebDriver driver;
// testcase -12 
	//coopancode
	@FindBy(id="spc-gcpromoinput")
	WebElement co_code;
	public void paymentmethod()
	{
		co_code.sendKeys("123456789");
	}
	@FindBy(xpath="(//span[@class='a-button-inner'])[10]")
	WebElement apply;

	public void apply_promotion()
	{
		apply.click();
	}
	//another payment method

	@FindBy(id="pp-m0jvdN-97")
	WebElement rodiobutton;
public void c_d_card()
{
	rodiobutton.click();
}
@FindBy(linkText="Enter card details")
WebElement entercard_d;
public void card_details()
{
	entercard_d.click();
}
// iframe syntax
{
driver.switchTo().frame(driver.findElement(By.name("ApxSecureIframe")));  

driver.switchTo().defaultContent();
}

@FindBy(name="addCreditCardNumber")
WebElement cardno;
public void cardnumber()
{
	cardno.sendKeys("123456789012");
}

@FindBy(name="ppw-instrumentRowSelection")
WebElement netbanking;
public void Net_Banking()
{
	netbanking.click();
}

@FindBy(id="pp-m0jvdN-123")
WebElement upi;
public void other_upi_apps()
{
	upi.click();
}
@FindBy(id="pp-m0jvdN-128")
WebElement EMI;
public void EMI_payment()
{
	EMI.click();
}
@FindBy(id="pp-m0jvdN-141")
WebElement COD;
public void cash_on_delivery()
{
	COD.click();
}

public Amazon_PaymentMethods_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}


