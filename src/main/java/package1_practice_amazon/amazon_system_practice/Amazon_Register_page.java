package package1_practice_amazon.amazon_system_practice;

import org.openqa.selenium.WebDriver;

	//package package1_practice_amazon.amazon_system_practice;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


	public class Amazon_Register_page {
	WebDriver driver;
		
		@FindBy(id="ap_email_login")
		WebElement emailid;

		@FindBy(id="continue")
		WebElement con_id;
		
		@FindBy(id="ap_customer_name")
		WebElement name;
		
		@FindBy(id="ap_phone_number")
		WebElement number;
		
		@FindBy(id="ap_password")
		WebElement password;
		
		@FindBy(id="continue")
		WebElement verifymono;
		
	public void createaccount()
	{
		emailid.sendKeys("kn.jaswanthi@gmail.com");

	}
	public void createaccount_con()
	{
		con_id.click();

	}
	public void yourname()
	{
		name.sendKeys("jaswanthi KN");

	}
	public void mobileno()
	{
		number.sendKeys("9620941056");

	}

	public void pwd()
	{
		password.sendKeys("Jassy@123");

	}
	public void verifynumber()
	{
		verifymono.click();;

	}
	public  Amazon_Register_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	}

