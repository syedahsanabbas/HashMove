package com.hashmove.pageobjects;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllUsersPage {

	// Create object of Webdriver
	WebDriver ldriver;

	// Creating Constructor
	public AllUsersPage(WebDriver rdriver)

	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// Identify All Web Elements on All Users Page

	@FindBy(xpath = "//span[normalize-space()='Add a new user']")
	@CacheLookup
	WebElement lnktextaddnewuser;
	
	@FindBy(xpath = "//input[@placeholder='Your first name']")
	@CacheLookup
	WebElement txtboxfirstname;

	@FindBy(xpath = "//input[@placeholder='Your last name']")
	@CacheLookup
	WebElement txtboxlastname;
	
	@FindBy(id = "typeahead-basic")
	@CacheLookup
	WebElement txtboxcity;
	
	@FindBy(xpath = "//input[@placeholder='123456789']")
	@CacheLookup
	WebElement txtboxcontact;
	
	@FindBy(xpath = "//input[@placeholder='john@company.com']")
	@CacheLookup
	WebElement txtboxemail;
	
	@FindBy(xpath = "//input[@placeholder='Please Select']")
	@CacheLookup
	WebElement txtboxuserrole;
	
	@FindBy(xpath = "//div[@role='combobox']//input[@type='text']")
	@CacheLookup
	WebElement ddbuinessunit;
	
	@FindBy(xpath = "//span[@class='switch switch-small']")
	@CacheLookup
	WebElement tglbtnagreement;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-register hvr-sweep-to-right']")
	@CacheLookup
	WebElement btncreateaccount;
	
	

	// Identify Action on all Web Elements

	public void clickaddnewuser()  {
		lnktextaddnewuser.click();
		

	}
	
	public void setfirstname(String firstname) {
		txtboxfirstname.clear();
		txtboxfirstname.sendKeys(firstname);

	}
	
	public void setlastname(String lastname) {
		txtboxlastname.clear();
		txtboxlastname.sendKeys(lastname);

	}
	
	public void setcity(String city) throws InterruptedException {
		txtboxcity.clear();
		txtboxcity.sendKeys(city);
		Thread.sleep(3000);
		txtboxcity.sendKeys(Keys.ENTER);

	}
		
	public void setcontact(String contact) throws InterruptedException {
		txtboxcontact.clear();
		txtboxcontact.sendKeys(contact);

	}
	
	public void setemail(String email) throws InterruptedException {
		txtboxemail.clear();
		txtboxemail.sendKeys(email);

	}
	
	public void setuserrole(String userrole) throws InterruptedException {
		txtboxuserrole.clear();
		txtboxuserrole.sendKeys(userrole);
		Thread.sleep(2000);
		txtboxuserrole.sendKeys(Keys.ENTER);

	}
	
	public void selectagreement()  {
		tglbtnagreement.click();
		

	}
	
	public void clickcreateaccount()  {
		btncreateaccount.click();
		

	}
	
	public void clickbusinessunitdropdown()  {
		ddbuinessunit.click();
		

	}
	

	public void setbusinessunit(String businessunit) {
		List<WebElement> allOptions = ldriver
				.findElements(By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']//div[@aria-selected = 'false']"));

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(businessunit)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}
	
	public String getSaltString() {
		String SALTCHARS = "1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 5) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;

	}
}
