package com.hashmove.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingDetailPage {

	// Create object of Webdriver
	WebDriver ldriver;

	// Creating Constructor
	public BookingDetailPage(WebDriver rdriver)

	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// Identify All Web Elements on Booking Detail Page

	@FindBy(xpath = "//span[@ngbtooltip='Add Shipper']//img[@alt='edit']")
	@CacheLookup
	WebElement btnaddshipper;
	
	@FindBy(xpath = "//input[@id='typeahead-basic2']")
	@CacheLookup
	WebElement txtboxconsigneename;
	
	@FindBy(xpath = "//input[@id='typeahead-basic2']")
	@CacheLookup
	WebElement txtboxconsigneename2;
	
	@FindBy(xpath = "//input[@placeholder='eg: John Doe']")
	@CacheLookup
	WebElement txtboxcontactperson;
	
	@FindBy(xpath = "//input[@placeholder='eg: John Doe']")
	@CacheLookup
	WebElement txtboxcontactperson2;
	
	@FindBy(xpath = "//div[@class='col-xl-6 col-lg-12 col-md-12 icon-input form-group']//input[@id='typeahead-basic']")
	@CacheLookup
	WebElement txtboxcity;
	
	@FindBy(xpath = "//div[@class='col-xl-6 col-lg-12 col-md-12 icon-input form-group']//input[@id='typeahead-basic']")
	@CacheLookup
	WebElement txtboxcity2;
	
	@FindBy(xpath = "//input[@placeholder='eg: 123456789']")
	@CacheLookup
	WebElement txtboxcontactphone;
	
	@FindBy(xpath = "//input[@placeholder='eg: 123456789']")
	@CacheLookup
	WebElement txtboxcontactphone2;
	
	@FindBy(xpath = "//input[@placeholder='eg: john@company.com']")
	@CacheLookup
	WebElement txtboxcontactemail;
	
	@FindBy(xpath = "//input[@placeholder='eg: john@company.com']")
	@CacheLookup
	WebElement txtboxcontactemail2;
	
	@FindBy(xpath = "//img[@class='icon-size-20']")
	@CacheLookup
	WebElement btnaddressicon;
	
	@FindBy(xpath = "//img[@class='icon-size-20']")
	@CacheLookup
	WebElement btnaddressicon2;
	
	@FindBy(xpath = "//input[@placeholder='Enter at a minimum, the street and town']")
	@CacheLookup
	WebElement txtboxconsigneepinaddress;
	
	@FindBy(xpath = "//input[@placeholder='Enter at a minimum, the street and town']")
	@CacheLookup
	WebElement txtboxconsigneepinaddress2;
	
	@FindBy(xpath = "//button[@class='col btn btn-primary hvr-sweep-to-right']")
	@CacheLookup
	WebElement btnsubmitconsigneeaddress;
	
	@FindBy(xpath = "//button[@class='col btn btn-primary hvr-sweep-to-right']")
	@CacheLookup
	WebElement btnsubmitconsigneeaddress2;

	@FindBy(xpath = "//input[@placeholder='Address']")
	@CacheLookup
	WebElement txtboxmainconsigneeaddress;
	
	@FindBy(xpath = "//input[@placeholder='Address']")
	@CacheLookup
	WebElement txtboxmainconsigneeaddress2;
	
	@FindBy(xpath = "//button[normalize-space()='SAVE']")
	@CacheLookup
	WebElement btnsaveconsigneeinfo;
	
	@FindBy(xpath = "//button[normalize-space()='SAVE']")
	@CacheLookup
	WebElement btnsaveconsigneeinfo2;
	
	@FindBy(xpath = "//input[@placeholder='Select Shipper']")
	@CacheLookup
	WebElement txtboxshippername;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	@CacheLookup
	WebElement btnsaveshipperinfo;
	
	@FindBy(xpath = "//span[@ngbtooltip='Add Consignee']//img[@alt='edit']")
	@CacheLookup
	WebElement btnaddconsignee;
	
	@FindBy(xpath = "//span[normalize-space()='Packing List']")
	@CacheLookup
	WebElement lnktextpackagelist;
	
	@FindBy(xpath = "//p[@class='uploader-btn font-italic pb-0 mb-1']")
	@CacheLookup
	WebElement lnktextselectafile;
	
	// Identify Action on all Web Elements

	public void clickaddshipper() {
		btnaddshipper.click();
		
	}
	
	public void clickaddconsignee() {
		btnaddconsignee.click();
		
	}
	
	public void setconsigneename(String consigneename) {
		txtboxconsigneename.sendKeys(consigneename);

	}
	
	public void setconsigneename2(String consigneename) {
		txtboxconsigneename2.sendKeys(consigneename);

	}
	
	public void setcontactperson(String contactperson) {
		txtboxcontactperson.sendKeys(contactperson);

	}
	
	public void setcontactperson2(String contactperson) {
		txtboxcontactperson2.sendKeys(contactperson);

	}
	
	public void setcity(String city) throws InterruptedException {
		txtboxcity.sendKeys(city);
		Thread.sleep(3000);
		txtboxcity.sendKeys(Keys.ENTER);

	}
	
	public void setcity2(String city) throws InterruptedException {
		txtboxcity2.sendKeys(city);
		Thread.sleep(3000);
		txtboxcity2.sendKeys(Keys.ENTER);

	}
	
	public void setcontactphone(String contactphone) {
		txtboxcontactphone.sendKeys(contactphone);

	}
	
	public void setcontactphone2(String contactphone) {
		txtboxcontactphone2.sendKeys(contactphone);

	}
	
	public void setcontactemail(String contactemail) {
		txtboxcontactemail.sendKeys(contactemail);

	}
	
	public void setcontactemail2(String contactemail) {
		txtboxcontactemail2.sendKeys(contactemail);

	}
	
	public void clickaddressicon() {
		btnaddressicon.click();
		
	}
	
	public void clickaddressicon2() {
		btnaddressicon2.click();
		
	}
	
	public void setconsigneepinaddress(String consigneepinaddress) throws InterruptedException {
		txtboxconsigneepinaddress.sendKeys(consigneepinaddress);
		Thread.sleep(1000);
		txtboxconsigneepinaddress.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		txtboxconsigneepinaddress.sendKeys(Keys.ENTER);

	}
	
	public void setconsigneepinaddress2(String consigneepinaddress) throws InterruptedException {
		txtboxconsigneepinaddress2.sendKeys(consigneepinaddress);
		Thread.sleep(1000);
		txtboxconsigneepinaddress2.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		txtboxconsigneepinaddress2.sendKeys(Keys.ENTER);

	}
	
	public void clicksubmitconsigneeaddress() {
		btnsubmitconsigneeaddress.click();
		
	}
	
	public void clicksubmitconsigneeaddress2() {
		btnsubmitconsigneeaddress2.click();
		
	}
	
	public void setconsigneemainaddress(String consigneemainaddress)  {
		txtboxmainconsigneeaddress .sendKeys(consigneemainaddress);
		
	}
	
	public void setconsigneemainaddress2(String consigneemainaddress)  {
		txtboxmainconsigneeaddress2 .sendKeys(consigneemainaddress);
		
	}
	
	public void clicksaveconsigneeinfo() {
		btnsaveconsigneeinfo.click();
		
	}
	
	public void clicksaveconsigneeinfo2() {
		btnsaveconsigneeinfo2.click();
		
	}
	
	public void setshippername(String shippername) throws InterruptedException {
		txtboxshippername.sendKeys(shippername);
		Thread.sleep(2000);
		txtboxshippername.sendKeys(Keys.ENTER);

	}
	
	public void clicksaveshipperinfo() {
		btnsaveshipperinfo.click();
		
	}
	
	public void clickpackagelist() {
		lnktextpackagelist.click();
		
	}
	
	public void clickselectafile() {
		lnktextselectafile.click();
		
	}
	
}
