package package1_practice_amazon.amazon_system_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Profile_Page {

	WebDriver driver;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement Accounts_List;  ;
	public void Account_Lists(WebDriver driver)
	{
	Actions a1=new Actions(driver);
	a1.moveToElement(Accounts_List).perform();
	}
	@FindBy(xpath="(//span[@class='sc-ksBlkl sc-jRwbcX fedVjG fqsXfW'])[1]")
	WebElement Manageprofiles;
	public void Manage_profiles()
	{
		Manageprofiles.click();
	}
	
	@FindBy(linkText="View")
	WebElement viewprofile;
	public void view_profile() throws InterruptedException
	{
		Thread.sleep(2000);
		viewprofile.click();
	}

	@FindBy(xpath="(//div[@class='accordion-trigger-content desktop'])[1]")
	WebElement prefedDpt;
	public void prefered_department()
	{
		prefedDpt.click();
	}
	@FindBy(xpath="(//button[@class='attribute-action'])[1]")
	WebElement PrfdptADD;
	public void prefered_dpt_add()
	{
		PrfdptADD.click();
	}
	@FindBy(xpath="//button[@class='text-option  '][1]")
	WebElement womenBox;
	public void women_button()
	{
		womenBox.click();
	}
	@FindBy(xpath="//div[@class='inline-button-container desktop']")
	WebElement saveBox;
	public void save_button()
	{
		saveBox.click();
	}

	@FindBy(xpath="(//div[@class='accordion-trigger-content desktop'])[2]")
	WebElement HeightandWeight  ;
	public void Height_Weight() throws InterruptedException
	{
		Thread.sleep(2000);
		HeightandWeight.click();
	}

	@FindBy(xpath="//button[contains(.,'Add')]")
	WebElement Add_H_W_box;
	public void Add_heightandweight_button() throws InterruptedException
	{
		Thread.sleep(2000);
		Add_H_W_box.click();
	}

	@FindBy(xpath="(//button[@class='unit-toggle-button desktop '])[1]")
	WebElement Height_ft;
	public void Height_ft_option() throws InterruptedException
	{
		Thread.sleep(2000);
		Height_ft.click();
	}
	
	@FindBy(xpath="(//input[@class='number-input-box'])[1]")
	WebElement Height_ft_value;
	public void Height_ft_option_value() throws InterruptedException
	{
		Thread.sleep(2000);
		Height_ft_value.sendKeys("3");
	}
	@FindBy(xpath="(//input[@class='number-input-box'])[2]")
	WebElement Height_in_value;
	public void Height_in_option_value() throws InterruptedException
	{
		Thread.sleep(2000);
		Height_in_value.sendKeys("3");
	}
	
	@FindBy(xpath="(//button[@class='unit-toggle-button desktop selected'])[2]")
	WebElement weight_lbs;
	public void weight_lbs_option() throws InterruptedException
	{
		Thread.sleep(2000);
		weight_lbs.click();;
	}
	
	@FindBy(xpath="(//input[@class='number-input-box'])[3]")
	WebElement weight_lbs_value;
	public void weight_lbs_option_value() throws InterruptedException
	{
		Thread.sleep(2000);
		weight_lbs_value.sendKeys("3");
	}
	@FindBy(xpath="(//button[@class='unit-toggle-button desktop selected'])[2]")
	WebElement weight_kg;
	public void weight_kg_option() throws InterruptedException
	{
		Thread.sleep(2000);
		weight_kg.click();;
	}
	@FindBy(xpath="//input[@class='number-input-box'][3]")
	WebElement weight_kg_value;
	public void weight_kg_option_value() throws InterruptedException
	{
		Thread.sleep(2000);
		weight_kg_value.sendKeys("3");
	}
	@FindBy(xpath="(//div[@class='inline-button-container desktop'])")
	WebElement H_W_save;
	public void heightWeight_save_button() throws InterruptedException
	{
		Thread.sleep(2000);
		H_W_save.click();
	}

	@FindBy(xpath="(//div[@class='accordion-trigger-content desktop'])[3]")
	WebElement AgeGroup;
	public void Age_Group() throws InterruptedException
	{
		Thread.sleep(2000);
		AgeGroup.click();
	}
	@FindBy(xpath="(//button[@class='attribute-action'])[3]")
	WebElement agegroupADD;
	public void Age_Group_add() throws InterruptedException
	{
		Thread.sleep(2000);
		agegroupADD.click();
	}
	
	
	public Amazon_Profile_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
