package com.hashmove.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

	@FindBy(xpath = "//img[@alt='user_icon']")
	@CacheLookup
	public WebElement imageicon;

	@FindBy(xpath = "//span[normalize-space()='Sea Shipment - LCL']")
	@CacheLookup
	WebElement btnseashipmentlcl;

	@FindBy(xpath = "//span[normalize-space()='Warehousing']")
	@CacheLookup
	WebElement btnwarehousing;

	@FindBy(id = "hashDatepicker")
	@CacheLookup
	WebElement datepickercargoreadiness;

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

	@FindBy(xpath = "//input[@id='typeahead-basic2' and @placeholder= 'Search for port of deliver']")
	@CacheLookup
	WebElement txtboxportofdelivery;

	@FindBy(xpath = "//input[@id='typeahead-basic']")
	@CacheLookup
	WebElement txtboxoriginport;

	@FindBy(xpath = "//input[@id='typeahead-basic2']")
	@CacheLookup
	WebElement txtboxdestinationport;
	
	@FindBy(xpath = "//input[@placeholder='Reference No']")
	@CacheLookup
	WebElement txtboxreferencenumber;

	@FindBy(xpath = "//div[@id='fcl_cont_ddl']")
	@CacheLookup
	WebElement ddcontainersize;

	@FindBy(xpath = "//div[@id='fcl_cont_ddl']")
	@CacheLookup
	WebElement ddpackagetype;

	@FindBy(xpath = "//div[@class='card-body section-body pt-0']//input[@name='counter']")
	@CacheLookup
	WebElement txtboxquantity;

	@FindBy(xpath = "//div[@class='card-body section-body pt-2']//input[@placeholder='Quantity']")
	@CacheLookup
	WebElement txtboxlclquantity;

	@FindBy(xpath = "//input[@placeholder='Length']")
	@CacheLookup
	WebElement txtboxlength;

	@FindBy(xpath = "//input[@placeholder='Width']")
	@CacheLookup
	WebElement txtboxwidth;

	@FindBy(xpath = "//input[@placeholder='Height']")
	@CacheLookup
	WebElement txtboxheight;

	@FindBy(xpath = "//input[@placeholder='Weight ']")
	@CacheLookup
	WebElement txtboxfclweight;

	@FindBy(xpath = "//input[@placeholder='Weight']")
	@CacheLookup
	WebElement txtboxlclweight;

	@FindBy(xpath = "//div[@class='card-body section-body pt-2']//div//select")
	@CacheLookup
	WebElement ddunit;

	@FindBy(xpath = "//div[@class='card-body section-body pt-0']//span[contains(text(),'Payment Terms')]")
	@CacheLookup
	WebElement lnktextpaymentterms;

	@FindBy(xpath = "(//div//ui-switch//span)[1]")
	@CacheLookup
	public WebElement tglbtnadvancepayment;

	@FindBy(xpath = "(//div//ui-switch//span)[2]")
	@CacheLookup
	public WebElement tglbtndaysaftertheissuanceofbl;

	@FindBy(xpath = "(//label[@class='pt-0 d-flex flex-row align-items-center']//input[@type = 'text'])[1]")
	@CacheLookup
	public WebElement txtboxdaysaftertheissuanceofblpaymenttermsdays;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement btnrequestspotrate;

	@FindBy(xpath = "//button[@type='button' and normalize-space()='Save']")
	@CacheLookup
	WebElement btnsavepaymentterms;

	@FindBy(xpath = "//img[@alt='close']")
	@CacheLookup
	WebElement btnclosepaymentterms;

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

	public void clickseashipmentlcl() {
		btnseashipmentlcl.click();

	}

	public void clickwarehousing() {
		btnwarehousing.click();

	}

	public void clickcargoreadiness() {
		datepickercargoreadiness.click();

	}

	public void setcargoreadinessmonthyear(String cargoreadinessmonthyear) {
		while (true) {
			WebElement monthyeartext = ldriver
					.findElement(By.xpath("//div[@class='ngb-dp-month-name ng-star-inserted']"));
			String monthyear = monthyeartext.getText();
			if (monthyear.equals(cargoreadinessmonthyear)) {
				break;

			}

			else {
				ldriver.findElement(By.xpath("//button[@title='Next month']//span[@class='ngb-dp-navigation-chevron']"))
						.click();
			}
		}
	}

	public void setcargoreadinessday(String cargoreadinessday) throws InterruptedException {

		List<WebElement> allOptions = ldriver
				.findElements(By.xpath("//div//div//div//div//div[@class= 'btn-light ng-star-inserted']"));
		for (int i = 0; i < allOptions.size(); i++) {
			System.out.println("Excel" + cargoreadinessday);
			System.out.println("Application" + allOptions.get(i).getText().toString());
			System.out.println("Size" + allOptions.size());
			if (allOptions.get(i).getText().toString().equals(cargoreadinessday)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}
		}

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

	public void setdeliverylocation(String deliverylocation) {
		List<WebElement> allOptions = ldriver
				.findElements(By.xpath("//div[@aria-labelledby='dropdownMenuButton']//ul//li/a"));

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(deliverylocation)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}

	public void setportofdelivery(String portofdelivery) throws InterruptedException {
		txtboxportofdelivery.clear();
		txtboxportofdelivery.sendKeys(portofdelivery);
		Thread.sleep(1000);
		txtboxportofdelivery.sendKeys(Keys.ENTER);

	}

	public void setoriginport(String originport) throws InterruptedException {
		txtboxoriginport.clear();
		txtboxoriginport.sendKeys(originport);
		Thread.sleep(2000);
		txtboxoriginport.sendKeys(Keys.ENTER);

	}

	public void setdestinationport(String destinationport) throws InterruptedException {
		txtboxdestinationport.clear();
		txtboxdestinationport.sendKeys(destinationport);
		Thread.sleep(2000);
		txtboxdestinationport.sendKeys(Keys.ENTER);

	}

	public String setreferencenumber(String referencenumber) {

		txtboxreferencenumber.sendKeys(referencenumber);
		return referencenumber;

	}

	public void clickcontainersizedropdown() {
		ddcontainersize.click();

	}

	public void setcontainersize(String containersize) {
		List<WebElement> allOptions = ldriver
				.findElements(By.xpath("//div[@aria-labelledby = 'fcl_cont_ddl']//div//span"));

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(containersize)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}

	public void clickpackagetypedropdown() {
		ddpackagetype.click();

	}

	public void setpackagetype(String packagetype) {
		List<WebElement> allOptions = ldriver
				.findElements(By.xpath("//div[@aria-labelledby = 'fcl_cont_ddl']//div//span"));

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(packagetype)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}

	public void setquantity(String quantity) {
		txtboxquantity.sendKeys(quantity);

	}

	public void setlclquantity(String lclquantity) {
		txtboxlclquantity.clear();
		txtboxlclquantity.sendKeys(lclquantity);

	}

	public void setlength(String length) {
		txtboxlength.sendKeys(length);

	}

	public void setwidth(String width) {
		txtboxwidth.sendKeys(width);

	}

	public void setheight(String width) {
		txtboxheight.sendKeys(width);

	}

	public void setweight(String weight) {
		txtboxfclweight.clear();
		txtboxfclweight.sendKeys(weight);

	}

	public void setlclweight(String weight) {
		txtboxlclweight.clear();
		txtboxlclweight.sendKeys(weight);

	}

	public void clickunitdropdown() {
		ddunit.click();

	}

	public void setunit(String unit) {
		WebElement ddunit = ldriver.findElement(By.xpath("//div[@class='card-body section-body pt-2']//div//select"));
		Select drop = new Select(ddunit);
		drop.selectByVisibleText(unit);
	}

	public void clickpaymentterms() {
		lnktextpaymentterms.click();

	}

	public void setpaymenttermsdays(String daysaftertheissuanceofblpaymenttermsdays) {
		txtboxdaysaftertheissuanceofblpaymenttermsdays.clear();
		txtboxdaysaftertheissuanceofblpaymenttermsdays.sendKeys(daysaftertheissuanceofblpaymenttermsdays);

	}

	public void clicksavepaymentterms() {
		btnsavepaymentterms.click();

	}

	public void clickclosepaymentterms() {
		btnclosepaymentterms.click();

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

	public void selectadvancepayment() {
		tglbtnadvancepayment.click();

	}

	public void selectdaysaftertheissuanceofbl() {
		tglbtndaysaftertheissuanceofbl.click();

	}

}
