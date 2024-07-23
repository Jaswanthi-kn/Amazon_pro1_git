package package1_practice_amazon.amazon_system_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Invalid_Login_Page {
	WebDriver driver;
	@FindBy(className="a-input-text")
	WebElement mobileno;
	
	@FindBy(id="continue")
	WebElement con;
	
	@FindBy(id="ap_password")
	WebElement pwd;
	
	@FindBy(id="signInSubmit")
	WebElement signin;
	
	public void mono()
	{
		mobileno.sendKeys("9620941056");
	}
	public void conti()
	{
		con.click();
	}
	public void password()
	{
		pwd.sendKeys("Jassy@1231234");
	}
	public void sign_in()
	{
		signin.click();;
	}
	
	public Amazon_Invalid_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}

