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
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(xpath = "//div[@class='d-flex flex-column info ml-5 pl-2 pointer']")
	@CacheLookup
	WebElement lnktextbookingrequest;

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
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	@CacheLookup
	WebElement btnsavemainconsigneeinfo;
	
	@FindBy(xpath = "//input[@placeholder='Select Shipper']")
	@CacheLookup
	WebElement txtboxshippername;
	
	@FindBy(xpath = "//input[@placeholder='Select Consignee']")
	@CacheLookup
	WebElement txtboxmainconsigneename;
	
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
	
	@FindBy(xpath = "//p[@class='uploader-btn font-italic pb-0 mb-1']")
	@CacheLookup
	WebElement lnktextselectafile2;
	
	@FindBy(xpath = "//p[@class='uploader-btn font-italic pb-0 mb-1']")
	@CacheLookup
	WebElement lnktextselectafile3;
	
	@FindBy(xpath = "//button[normalize-space()='Upload']")
	@CacheLookup
	WebElement btnupload;
	
	@FindBy(xpath = "//button[normalize-space()='Upload']")
	@CacheLookup
	WebElement btnupload2;
	
	@FindBy(xpath = "//button[normalize-space()='Upload']")
	@CacheLookup
	WebElement btnupload3;
	
	@FindBy(xpath = "//span[@class='menu-text'][normalize-space()='Bookings']")
	@CacheLookup
	WebElement lnktextbookings;
	
	@FindBy(xpath = "//span[normalize-space()='Booking Confirmation Document (CRO/BC/SC)']")
	@CacheLookup
	WebElement lnktextbookingconfirmationdocument;
	
	@FindBy(xpath = "//span[normalize-space()='Loading Plan']")
	@CacheLookup
	WebElement lnktextloadingplan;
	
	@FindBy(xpath = "//button[normalize-space()='Yes']")
	@CacheLookup
	WebElement btnconfirmbookingyes;
	
	@FindBy(xpath = "//button[normalize-space()='Yes']")
	@CacheLookup
	WebElement btnintransityes;
	
	@FindBy(xpath = "//textarea[@placeholder='Details']")
	@CacheLookup
	WebElement txtboxshipmentdetails;
	
	@FindBy(xpath = "//textarea[@placeholder='Details']")
	@CacheLookup
	WebElement txtboxintransitshipmentdetails;
	
	@FindBy(xpath = "//button[normalize-space()='SUBMIT']")
	@CacheLookup
	WebElement btnconfirmbookingsubmit;
	
	@FindBy(xpath = "//button[normalize-space()='SUBMIT']")
	@CacheLookup
	WebElement	btnintransitsubmit;
	
	@FindBy(xpath = "//button[normalize-space()='I accept the terms & conditions']")
	@CacheLookup
	WebElement btniacceptthetermsandconditions;
	
	@FindBy(xpath = "//button[normalize-space()='Add Schedule']")
	@CacheLookup
	WebElement btnaddschedule;
	
	@FindBy(xpath = "//input[@placeholder= 'From ' and @class='form-control departure-date ng-untouched ng-pristine ng-valid']")
	@CacheLookup
	WebElement datepickerdeparturefrom;
	
	@FindBy(xpath = "(//input[@placeholder= 'To' and @class='form-control departure-date ng-untouched ng-pristine ng-valid'])[1]")
	@CacheLookup
	WebElement datepickerarrivalto;
	
	@FindBy(xpath = "//div[@class='row animated fadeIn']//input[@placeholder='Vessel Name']")
	@CacheLookup
	WebElement txtboxvesselname;
	
	@FindBy(xpath = "//input[@placeholder='Voyage Name']")
	@CacheLookup
	WebElement txtboxvoyagenumber;
	
	@FindBy(xpath = "//button[normalize-space()='Update Schedule']")
	@CacheLookup
	WebElement btnupdateschedule;
	
	@FindBy(xpath = "//span[normalize-space()='Bill Of Lading']")
	@CacheLookup
	WebElement lnktextbilloflading;
	
	@FindBy(xpath = "//input[@placeholder='BL No']")
	@CacheLookup
	WebElement txtboxbillnumber;
	
	@FindBy(xpath = "//input[@placeholder='BL Date']")
	@CacheLookup
	WebElement datepickerbldate;
	
	@FindBy(xpath = "//span[normalize-space()='Update Status']")
	@CacheLookup
	WebElement lnktextupdatestatus;
	
	@FindBy(id = "bkStatus")
	@CacheLookup
	WebElement ddshipmentstatus;
	
	@FindBy(xpath = "//button[normalize-space()='SUBMIT']")
	@CacheLookup
	WebElement btnsubmitshipmentstatus;
	
	// Identify Action on all Web Elements

	public void clickbookings() {
		lnktextbookings.click();
		
	}
	
	public void clickaddshipper() {
		btnaddshipper.click();
		
	}
	
	public void clickaddconsignee() {
		btnaddconsignee.click();
		
	}
	
	public String setconsigneename(String consigneename) {
		txtboxconsigneename.sendKeys(consigneename);
		return consigneename;

	}
	
	public String setconsigneename2(String consigneename) {
		txtboxconsigneename2.sendKeys(consigneename);
		return consigneename;

	}
	
	public void setcontactperson(String contactperson) {
		txtboxcontactperson.sendKeys(contactperson);

	}
	
	public void setcontactperson2(String contactperson) {
		txtboxcontactperson2.sendKeys(contactperson);

	}
	
	public void setcity(String city) throws InterruptedException {
		txtboxcity.sendKeys(city);
		Thread.sleep(5000);
		txtboxcity.sendKeys(Keys.ENTER);

	}
	
	public void setcity2(String city) throws InterruptedException {
		txtboxcity2.sendKeys(city);
		Thread.sleep(5000);
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
	
	public void clicksavemainconsigneeinfo() {
		btnsavemainconsigneeinfo.click();
		
	}
	
	public void setshippername(String shippername) throws InterruptedException {
		txtboxshippername.sendKeys(shippername);
		Thread.sleep(2000);
		txtboxshippername.sendKeys(Keys.ENTER);

	}
	
	public void setmainconsigneename(String mainconsigneename) throws InterruptedException {
		txtboxmainconsigneename.sendKeys(mainconsigneename);
		Thread.sleep(2000);
		txtboxmainconsigneename.sendKeys(Keys.ENTER);

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
	
	public void clickselectafile2() {
		lnktextselectafile2.click();
		
	}
	
	public void clickselectafile3() {
		lnktextselectafile3.click();
		
	}
	
	public void clickupload() {
		btnupload.click();
		
	}
	
	public void clickupload2() {
		btnupload2.click();
		
	}
	
	public void clickupload3() {
		btnupload3.click();
		
	}
	
	public void clickbookingrequestlink() {
		lnktextbookingrequest.click();
		
	}
	
	public void clickbookingconfirmationdocument() {
		lnktextbookingconfirmationdocument.click();
		
	}
	
	public void clickloadingplan() {
		lnktextloadingplan.click();
		
	}
	
	public void clickconfirmbookingyes() {
		btnconfirmbookingyes.click();
		
	}
	
	public void clickintransityes() {
		btnintransityes.click();
		
	}
	
	public void setshipmentdetails(String shipmentdetails)  {
		txtboxshipmentdetails.sendKeys(shipmentdetails);
		
	}
	
	public void setshipmentdetailsintransit(String shipmentdetailsintransit)  {
		txtboxintransitshipmentdetails.sendKeys(shipmentdetailsintransit);
		
	}
	
	public void clicksubmit() {
		btnconfirmbookingsubmit.click();
		
	}
	
	public void clicksubmitintransit() {
		btnintransitsubmit.click();
		
	}
	
	public void clickiacceptthetermsandconditions() {
		btniacceptthetermsandconditions.click();
		
	}
	
	public void clickaddschedule() {
		btnaddschedule.click();
		
	}
	
	public void clickdeparturefrom() {
		datepickerdeparturefrom.click();

	}
	
	public void clickarrivalto() {
		datepickerarrivalto.click();

	}
	
	
	public void setdeparturedatemonthyear(String departuredatemonthyear) {
		while (true) {
			WebElement monthyeartext = ldriver
					.findElement(By.xpath("//div[@class='ngb-dp-month-name ng-star-inserted']"));
			String monthyear = monthyeartext.getText();
			System.out.println(monthyear);
			if (monthyear.equals(departuredatemonthyear)) {
				break;

			}

			else {
				ldriver.findElement(By.xpath("//button[@title='Next month']//span[@class='ngb-dp-navigation-chevron']"))
						.click();
			}
		}
	}

	public void setdeparturedateday(String departuredateday) {
		List<WebElement> allOptions = ldriver.findElements(By.xpath(
				"//div[@class='ngb-dp-content ngb-dp-months']//div[@class='ngb-dp-week ng-star-inserted']//div[@class = 'ngb-dp-day ng-star-inserted']//div[@class='btn-light ng-star-inserted']"));
		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(departuredateday)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}
	
	
	public void setarrivaldatemonthyear(String arrivaldatemonthyear) {
		while (true) {
			WebElement monthyeartext = ldriver
					.findElement(By.xpath("//div[@class='ngb-dp-month-name ng-star-inserted']"));
			String monthyear = monthyeartext.getText();
			System.out.println(monthyear);
			if (monthyear.equals(arrivaldatemonthyear)) {
				break;

			}

			else {
				ldriver.findElement(By.xpath("//button[@title='Next month']//span[@class='ngb-dp-navigation-chevron']"))
						.click();
			}
		}
	}

	public void setarrivaldateday(String arrivaldateday) {
		List<WebElement> allOptions = ldriver.findElements(By.xpath(
				"//div[@class='ngb-dp-content ngb-dp-months']//div[@class='ngb-dp-week ng-star-inserted']//div[@class = 'ngb-dp-day ng-star-inserted']//div[@class='btn-light ng-star-inserted']"));
		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(arrivaldateday)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}
	
	public void setvesselname(String vesselname) throws InterruptedException  {
		txtboxvesselname.sendKeys(vesselname);
		Thread.sleep(2000);
		txtboxvesselname.sendKeys(Keys.ENTER);
		
		
	}
	
	public void setvoyagenumber(String voyagenumber)  {
		txtboxvoyagenumber.sendKeys(voyagenumber);
		
	}
	
	public void clickupdateschedule() {
		btnupdateschedule.click();
		
	}
	
	public void clickbilloflading() {
		lnktextbilloflading.click();
		
	}
	
	public void setbillnumber(String billnumber)  {
		txtboxbillnumber.sendKeys(billnumber);
		
	}
	
	public void clickbldate() {
		datepickerbldate.click();

	}
	
	public void setbldatemonthyear(String bldatemonthyear) {
		while (true) {
			WebElement monthyeartext = ldriver
					.findElement(By.xpath("//div[@class='ngb-dp-month-name ng-star-inserted']"));
			String monthyear = monthyeartext.getText();
			System.out.println(monthyear);
			if (monthyear.equals(bldatemonthyear)) {
				break;

			}

			else {
				ldriver.findElement(By.xpath("//button[@title='Next month']//span[@class='ngb-dp-navigation-chevron']"))
						.click();
			}
		}
	}

	public void setbldateday(String bldateday) {
		List<WebElement> allOptions = ldriver.findElements(By.xpath(
				"//div[@class='ngb-dp-content ngb-dp-months']//div[@class='ngb-dp-week ng-star-inserted']//div[@class = 'ngb-dp-day ng-star-inserted']//div[@class='btn-light ng-star-inserted']"));
		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(bldateday)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}
	
	public void clickupdatestatus() {
		lnktextupdatestatus.click();
		
	}
	
	public void clickshipmentstatusdropdown() {
		ddshipmentstatus.click();
		
	}
	
	public  void setshipmentstatus(String shipmentstatus) {
	      WebElement ddshipmentstatus = ldriver.findElement(By.id("bkStatus"));
	      Select drop = new Select(ddshipmentstatus);
	      drop.selectByVisibleText(shipmentstatus); 
	}
	
	public void clicksubmitshipmentstatus() {
		btnsubmitshipmentstatus.click();
		
	}
	
	public String getSaltString() {
        String SALTCHARS = "1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 4) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
	
	
}
