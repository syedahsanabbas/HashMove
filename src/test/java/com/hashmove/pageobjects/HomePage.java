package com.hashmove.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// Create object of Webdriver
	WebDriver ldriver;

	// Creating Constructor
	public HomePage(WebDriver rdriver)

	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// Identify All Web Elements on Home Page

	@FindBy(xpath = "//span[normalize-space()='Sea Shipment - FCL']")
	@CacheLookup
	WebElement btnseashipmentfcl;
	
	@FindBy(id = "hashDatepicker")
	@CacheLookup
	WebElement txtboxdatepicker;
	
	@FindBy(xpath = "//div[@class='btn-light ng-star-inserted'][normalize-space()='20']")
	@CacheLookup
	WebElement txtboxdatepicker2;
	
	@FindBy(id = "fcl_cargo_ddl")
	@CacheLookup
	WebElement ddcargotype;
	
	@FindBy(id = "commTypeAhead")
	@CacheLookup
	WebElement txtboxhscode;
	
	@FindBy(xpath = "//input[@placeholder='Cargo Description']")
	@CacheLookup
	WebElement txtboxcargodescription;
	
	@FindBy(id = "typeahead-basic")
	@CacheLookup
	WebElement ddpickuplocation;
	
	@FindBy(xpath = "//input[@id='typeahead-basic' and @placeholder= 'Search for port of pickup']")
	@CacheLookup
	WebElement txtboxportofpickup;
	
	@FindBy(id = "typeahead-basic2")
	@CacheLookup
	WebElement dddeliverylocation;
	
	@FindBy(xpath = "//p[contains(text(),'Deliver to port would mean you are responsible to get your cargo delivered to your warehouse.')]")
	@CacheLookup
	WebElement dddeliverylocation2;
	
	@FindBy(xpath = "//input[@id='typeahead-basic2' and @placeholder= 'Search for port of deliver']")
	@CacheLookup
	WebElement txtboxportofdelivery;
	
	@FindBy(xpath = "//div[@id='fcl_cont_ddl']")
	@CacheLookup
	WebElement ddcontainersize;
	
	@FindBy(xpath = "//div[@class='form-group ng-tns-c209-0 mb-0']//input[@name='counter']")
	@CacheLookup
	WebElement txtboxquantity;
	
	@FindBy(xpath = "//input[@placeholder='Weight ']")
	@CacheLookup
	WebElement txtboxweight;
	
	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement btnrequestspotrate;
	
	
	@FindBy(xpath = "(//div[@class='row']//div[@class='pr-0 col-12'])[1]")
	@CacheLookup
	public WebElement labelrequest;
	
	@FindBy(id = "dropdownBasic1")
	@CacheLookup
	WebElement ddoptions;
	
	@FindBy(xpath = "//span[normalize-space()='Users']")
	@CacheLookup
	WebElement lnktextusers;
	
	@FindBy(xpath = "//span[normalize-space()='Spot Rates']")
	@CacheLookup
	WebElement lnktextspotrates;
	
	// Identify Action on all Web Elements

	public void clickseashipmentfcl() {
		btnseashipmentfcl.click();

	}
	

	
	public void setdate() {
		txtboxdatepicker.click();
		txtboxdatepicker2.click();
		

	}
	
	
	
	
	public void clickcargotypedropdown() {
		ddcargotype.click();

	}

	public void setcargotype(String cargotype) {
		List<WebElement> allOptions = ldriver
				.findElements(By.xpath("//div[@aria-labelledby='fcl_cargo_ddl']//div//span"));

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(cargotype)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}
	
	public void sethscode(String hscode) {
		txtboxhscode.clear();
		txtboxhscode.sendKeys(hscode);
		txtboxhscode.sendKeys(Keys.TAB);

	}
	
	public void setcargodescription(String cargodescription) {
		txtboxcargodescription.clear();
		txtboxcargodescription.sendKeys(cargodescription);

	}
		
	public void clickpickuplocationdropdown() {
		ddpickuplocation.click();

	}
	
	
	public void setpickuplocation(String pickuplocation) {
		List<WebElement> allOptions = ldriver
				.findElements(By.xpath("//div[@aria-labelledby='dropdownMenuButton']//ul//li/p"));

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(pickuplocation)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}
	
	public void setportofpickup(String portofpickup) throws InterruptedException {
		txtboxportofpickup.clear();
		txtboxportofpickup.sendKeys(portofpickup);
		Thread.sleep(1000);
		txtboxportofpickup.sendKeys(Keys.ENTER);

	}
	
	public void clickdeliverylocationdropdown() {
		dddeliverylocation.click();

	}
	
	public void setdeliverylocation() {
		dddeliverylocation2.click();
	}
	
	/*
	public void setdeliverylocation(String deliverylocation) {
		List<WebElement> allOptions = ldriver
				.findElements(By.xpath("//div[@aria-labelledby='dropdownMenuButton']//ul/li"));
		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(deliverylocation)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
				
			}

		}
	}
	*/
	public void setportofdelivery(String portofdelivery) throws InterruptedException {
		txtboxportofdelivery.clear();
		txtboxportofdelivery.sendKeys(portofdelivery);
		Thread.sleep(1000);
		txtboxportofdelivery.sendKeys(Keys.ENTER);

	}
	
	public void clickcontainersizedropdown() {
		ddcontainersize.click();

	}
	
	
	public void setcontainersize(String containersize) {
		List<WebElement> allOptions = ldriver
				.findElements(By.xpath("//div[@aria-labelledby = 'fcl_cont_ddl']//div[@class='row ng-tns-c209-0']//div//span"));

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(containersize)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}
	
	
	public void setquantity(String quantity) {
		txtboxquantity.sendKeys(quantity);

	}
	
	
	public void setweight(String weight) {
		txtboxweight.clear();
		txtboxweight.sendKeys(weight);

	}
	
	
	public void clickrequestspotrate() {
		btnrequestspotrate.click();

	}
	
	public void clickoptionsdropdown() {
		ddoptions.click();

	}
	
	public void clickusers() {
		lnktextusers.click();

	}
	
	public void clickspotrates() {
		lnktextspotrates.click();

	}
}
