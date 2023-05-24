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
	WebElement txtboxshipperename;

	@FindBy(xpath = "//input[@id='typeahead-basic2']")
	@CacheLookup
	WebElement txtboxconsigneename;

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

	@FindBy(xpath = "//button[normalize-space()='SAVE']")
	@CacheLookup
	WebElement btnsaveshipperinfo;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	@CacheLookup
	WebElement btnsavemainshipperinfo;

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

	@FindBy(xpath = "//div[@class='card-header']//span[normalize-space()='Goods Declaration']")
	@CacheLookup
	WebElement lnktextgoodsdeclaration;

	@FindBy(xpath = "//input[@placeholder='BL No']")
	@CacheLookup
	WebElement txtboxbillnumber;

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
	WebElement txtboxshipmentdetails2;

	@FindBy(xpath = "//textarea[@placeholder='Details']")
	@CacheLookup
	WebElement txtboxintransitshipmentdetails;

	@FindBy(xpath = "//button[normalize-space()='SUBMIT']")
	@CacheLookup
	WebElement btnconfirmbookingsubmit;

	@FindBy(xpath = "//button[normalize-space()='SUBMIT']")
	@CacheLookup
	WebElement btnintransitsubmit;

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

	@FindBy(xpath = "//input[@placeholder='GD No']")
	@CacheLookup
	WebElement txtboxgoodsdeclarationnumber;

	@FindBy(xpath = "//input[@placeholder='GD Date']")
	@CacheLookup
	WebElement datepickergddate;

	@FindBy(xpath = "//input[@placeholder='BL Date']")
	@CacheLookup
	WebElement datepickerbldate;

	@FindBy(xpath = "//span[normalize-space()='Update Status']")
	@CacheLookup
	WebElement lnktextupdatestatus;

	@FindBy(id = "bkStatus")
	@CacheLookup
	WebElement ddshipmentstatus;

	@FindBy(id = "bkStatus")
	@CacheLookup
	WebElement ddshipmentstatus2;

	@FindBy(xpath = "//button[normalize-space()='SUBMIT']")
	@CacheLookup
	WebElement btnsubmitshipmentstatus;

	@FindBy(xpath = "//button[normalize-space()='SUBMIT']")
	@CacheLookup
	WebElement btnsubmitshipmentstatus2;

	@FindBy(xpath = "//div[@class='dropdown-toggle form-control']//img[@class='pointer']")
	@CacheLookup
	WebElement btnaddservice;

	@FindBy(xpath = "//span[normalize-space()='Inbound Shipment']")
	@CacheLookup
	WebElement btninboundshipment;

	@FindBy(xpath = "//input[@placeholder='Delivery Note #']")
	@CacheLookup
	WebElement txtboxreferencenumber;

	@FindBy(xpath = "//input[@placeholder='Delivery Note #']")
	@CacheLookup
	WebElement txtboxreferencenumber2;

	@FindBy(xpath = "//div[@id='fcl_cont_ddl']")
	@CacheLookup
	WebElement ddtruckcategory;
	
	@FindBy(xpath = "//div[@id='fcl_cont_ddl']")
	@CacheLookup
	WebElement ddtruckcategory2;

	@FindBy(xpath = "//div[@id='ftl_cont_ddl']")
	@CacheLookup
	WebElement ddtrucktype;
	
	@FindBy(xpath = "//div[@id='ftl_cont_ddl']")
	@CacheLookup
	WebElement ddtrucktype2;

	@FindBy(xpath = "//input[@placeholder='e.g: ABC-XXXX']")
	@CacheLookup
	WebElement txtboxtruckregnumber;
	
	@FindBy(xpath = "//input[@placeholder='e.g: ABC-XXXX']")
	@CacheLookup
	WebElement txtboxtruckregnumber2;

	@FindBy(xpath = "//input[@placeholder='eg: Services related details']")
	@CacheLookup
	WebElement txtboxremarks;

	@FindBy(xpath = "//input[@placeholder='eg: Services related details']")
	@CacheLookup
	WebElement txtboxremarks2;
	
	@FindBy(xpath = "//button[normalize-space()='Add SKU']")
	@CacheLookup
	WebElement btnaddsku;
	
	@FindBy(xpath = "//button[normalize-space()='Add SKU']")
	@CacheLookup
	WebElement btnaddsku2;

	@FindBy(xpath = "//input[@placeholder='SKU #']")
	@CacheLookup
	WebElement txtboxyourskucode;
	
	@FindBy(xpath = "//input[@placeholder='SKU #']")
	@CacheLookup
	WebElement txtboxyourskucode2;

	@FindBy(xpath = "//input[@placeholder='Description']")
	@CacheLookup
	WebElement txtboxskudescription;

	@FindBy(xpath = "//input[@placeholder='HS Code']")
	@CacheLookup
	WebElement txtboxhscode;

	@FindBy(xpath = "(//div//select)[1]")
	@CacheLookup
	WebElement dduom;

	@FindBy(xpath = "(//div//select)[2]")
	@CacheLookup
	WebElement ddweightuom;

	@FindBy(xpath = "//div[label[contains(., 'GROSS WEIGHT')]]/input")
	@CacheLookup
	WebElement txtboxgrossweight;

	@FindBy(xpath = "//div[label[contains(., 'NET WEIGHT')]]/input")
	@CacheLookup
	WebElement txtboxnetweight;

	@FindBy(xpath = "//span[normalize-space()='Package Type']")
	@CacheLookup
	WebElement ddpackagetype;

	@FindBy(xpath = "//input[@placeholder='SKU Qty / Package']")
	@CacheLookup
	WebElement txtboxuomperpackage;

	@FindBy(xpath = "//span[normalize-space()='Pallet Type']")
	@CacheLookup
	WebElement ddpallettype;

	@FindBy(xpath = "//input[@placeholder='Package / Pallet']")
	@CacheLookup
	WebElement txtboxpackageperpallet;

	@FindBy(xpath = "//input[@placeholder='Enter Pallet Qty']")
	@CacheLookup
	WebElement txtboxtotalpalletqty;
	
	@FindBy(xpath = "//input[@placeholder='Enter Pallet Qty']")
	@CacheLookup
	WebElement txtboxtotalpalletqty2;

	@FindBy(xpath = "//input[@placeholder='Enter Package Qty']")
	@CacheLookup
	WebElement txtboxtotalpackageqty;
	
	@FindBy(xpath = "//input[@placeholder='Enter Package Qty']")
	@CacheLookup
	WebElement txtboxtotalpackageqty2;

	@FindBy(xpath = "//input[@placeholder='Enter UOM Qty']")
	@CacheLookup
	WebElement txtboxtotaluomqty;

	@FindBy(xpath = "//button[normalize-space()='Submit']")
	@CacheLookup
	WebElement btnsubmitsku;

	@FindBy(xpath = "//a[normalize-space()='Services Details']")
	@CacheLookup
	WebElement lnktextinboundservicesdetails;
	
	@FindBy(xpath = "//a[normalize-space()='Services Details']")
	@CacheLookup
	WebElement lnktextoutboundservicesdetails;

	@FindBy(xpath = "//div[@container = 'body']//span[@class='switch switch-small']")
	@CacheLookup
	WebElement btntglbatchnumber;
	
	@FindBy(xpath = "//input[@placeholder='Batch #']")
	@CacheLookup
	WebElement txtboxbatchnumber;
	
	@FindBy(xpath = "//div[@class='row mt-3 ng-star-inserted']//input[@placeholder= 'Production Date' and @id ='dpicker']")
	@CacheLookup
	WebElement datepickerproduction;
	
	@FindBy(xpath = "//div[@class='row mt-3 ng-star-inserted']//input[@placeholder= 'Expiry Date' and @id ='dpicker']")
	@CacheLookup
	WebElement datepickerexpiry;

	@FindBy(xpath = "//button[contains(normalize-space(), 'Submit') and contains(normalize-space(), 'Shipment')]")
	@CacheLookup
	WebElement btninboundsubmitshipment;
	
	@FindBy(xpath = "//button[contains(normalize-space(), 'Submit') and contains(normalize-space(), 'Shipment')]")
	@CacheLookup
	WebElement btnoutboundsubmitshipment;

	@FindBy(xpath = "//button[normalize-space()='BOOK & PAY']")
	@CacheLookup
	WebElement btnbookandpay;
	
	@FindBy(xpath = "//button[normalize-space()='BOOK & PAY']")
	@CacheLookup
	WebElement btnbookandpay2;

	@FindBy(xpath = "//div[@class='dropdown-toggle form-control']//img[@class='pointer']")
	@CacheLookup
	WebElement btnaddservice2;

	@FindBy(xpath = "//span[normalize-space()='Outbound Shipment']")
	@CacheLookup
	WebElement btnoutboundshipment;
	
	@FindBy(xpath = "//span[@class='input-group-text']")
	@CacheLookup
	WebElement btndeliveryaddresspinlocation;
	
	@FindBy(xpath = "//input[@placeholder='Enter at a minimum, the street and town']")
	@CacheLookup
	WebElement txtboxpinaddress;
	
	@FindBy(xpath = "//input[@placeholder='Delivery Address']")
	@CacheLookup
	WebElement txtboxmaindeliveryaddress;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	@CacheLookup
	WebElement btnsubmitpinaddress;
	
	@FindBy(xpath = "//label[@for='rdBond']")
	@CacheLookup
	WebElement btntglbypallet;
	
	@FindBy(xpath = "//label[@for='rdNonBond']")
	@CacheLookup
	WebElement btntglbypackage;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	@CacheLookup
	WebElement btnsubmitoutbound;
	
	@FindBy(xpath = "//a[normalize-space()='View Summary']")
	@CacheLookup
	WebElement lnktextviewsummary;
	
	@FindBy(xpath = "(//div[@class='d-flex flex-column justify-content-between']//div//span)[8]")
	@CacheLookup
	WebElement lblnettotalonviewsummary;
	
	@FindBy(xpath = "(//li//span[@style='text-transform: uppercase !important;'])[1]")
	@CacheLookup
	WebElement lblwarehousechargesonviewsummary;
	
	@FindBy(xpath = "//p[@class='blue-txt']")
	@CacheLookup
	WebElement lbltotalamountinskudetailsgrid;
	
	@FindBy(xpath = "//p[@class='blue-txt']")
	@CacheLookup
	WebElement lbltotalamountinskudetailsgrid2;
	
	@FindBy(xpath = "//img[@alt='close']")
	@CacheLookup
	WebElement btncloseviewsummary;
	
	@FindBy(xpath = "(//li//span[@style='text-transform: uppercase !important;'])[1]")
	@CacheLookup
	WebElement lblemptywoodenpalletsvalueexcludingvat;
	
	@FindBy(xpath = "//span[text()='Net Total']/following-sibling::span/text()")
	@CacheLookup
	WebElement lblnettotaloninboundshipment;
	
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

	public String setshipperename(String shipperename) {
		txtboxshipperename.sendKeys(shipperename);
		return shipperename;

	}

	public String setconsigneename(String consigneename) {
		txtboxconsigneename.sendKeys(consigneename);
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
		Thread.sleep(2000);
		txtboxconsigneepinaddress.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		txtboxconsigneepinaddress.sendKeys(Keys.ENTER);

	}

	public void setconsigneepinaddress2(String consigneepinaddress) throws InterruptedException {
		txtboxconsigneepinaddress2.sendKeys(consigneepinaddress);
		Thread.sleep(2000);
		txtboxconsigneepinaddress2.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		txtboxconsigneepinaddress2.sendKeys(Keys.ENTER);

	}

	public void clicksubmitconsigneeaddress() {
		btnsubmitconsigneeaddress.click();

	}

	public void clicksubmitconsigneeaddress2() {
		btnsubmitconsigneeaddress2.click();

	}

	public void setconsigneemainaddress(String consigneemainaddress) {
		txtboxmainconsigneeaddress.sendKeys(consigneemainaddress);

	}

	public void setconsigneemainaddress2(String consigneemainaddress) {
		txtboxmainconsigneeaddress2.sendKeys(consigneemainaddress);

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

	public void clicksavemainshipperinfo() {
		btnsavemainshipperinfo.click();

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

	public void clickgoodsdeclaration() {
		lnktextgoodsdeclaration.click();

	}

	public void clickconfirmbookingyes() {
		btnconfirmbookingyes.click();

	}

	public void clickintransityes() {
		btnintransityes.click();

	}

	public void setshipmentdetails(String shipmentdetails) {
		txtboxshipmentdetails.sendKeys(shipmentdetails);

	}

	public void setshipmentdetails2(String shipmentdetails) {
		txtboxshipmentdetails2.sendKeys(shipmentdetails);

	}

	public void setshipmentdetailsintransit(String shipmentdetailsintransit) {
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
			System.out.println(departuredatemonthyear);
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
			if (allOptions.get(i).getText().toString().equals(departuredateday)) {
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
			if (allOptions.get(i).getText().toString().equals(arrivaldateday)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}

	public void setvesselname(String vesselname) throws InterruptedException {
		txtboxvesselname.sendKeys(vesselname);
		Thread.sleep(2000);
		txtboxvesselname.sendKeys(Keys.ENTER);

	}

	public void setvoyagenumber(String voyagenumber) {
		txtboxvoyagenumber.sendKeys(voyagenumber);

	}

	public void clickupdateschedule() {
		btnupdateschedule.click();

	}

	public void clickbilloflading() {
		lnktextbilloflading.click();

	}

	public void setbillnumber(String billnumber) {
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

	public void clickshipmentstatusdropdown2() {
		ddshipmentstatus2.click();

	}

	public void setshipmentstatus(String shipmentstatus) {
		WebElement ddshipmentstatus = ldriver.findElement(By.id("bkStatus"));
		Select drop = new Select(ddshipmentstatus);
		drop.selectByVisibleText(shipmentstatus);
	}

	public void setshipmentstatus2(String shipmentstatus) {
		WebElement ddshipmentstatus = ldriver.findElement(By.id("bkStatus"));
		Select drop = new Select(ddshipmentstatus);
		drop.selectByVisibleText(shipmentstatus);
	}

	public void clicksubmitshipmentstatus() {
		btnsubmitshipmentstatus.click();

	}

	public void clicksubmitshipmentstatus2() {
		btnsubmitshipmentstatus2.click();

	}

	public void setgoodsdeclarationnumber(String goodsdeclarationnumber) {
		txtboxgoodsdeclarationnumber.sendKeys(goodsdeclarationnumber);

	}

	public void clickgddate() {
		datepickergddate.click();

	}

	public void setgddatemonthyear(String gddatemonthyear) {
		while (true) {
			WebElement monthyeartext = ldriver
					.findElement(By.xpath("//div[@class='ngb-dp-month-name ng-star-inserted']"));
			String monthyear = monthyeartext.getText();
			if (monthyear.equals(gddatemonthyear)) {
				break;

			}

			else {
				ldriver.findElement(By.xpath("//button[@title='Next month']//span[@class='ngb-dp-navigation-chevron']"))
						.click();
			}
		}
	}

	public void setgddateday(String gddateday) throws InterruptedException {

		List<WebElement> allOptions = ldriver
				.findElements(By.xpath("//div//div//div//div[@class='btn-light ng-star-inserted']"));
		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().equals(gddateday)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}
		}

	}

	public void clickaddservice() {
		btnaddservice.click();

	}

	public void clickinboundshipment() {
		btninboundshipment.click();

	}

	public void setreferencenumber(String referencenumber) {
		txtboxreferencenumber.sendKeys(referencenumber);

	}

	public void setreferencenumber2(String referencenumber) {
		txtboxreferencenumber2.sendKeys(referencenumber);

	}

	public void clicktruckcategorydropdown() {
		ddtruckcategory.click();

	}
	
	public void clicktruckcategorydropdown2() {
		ddtruckcategory2.click();

	}

	public void settruckcategory(String truckcategory) {
		List<WebElement> allOptions = ldriver
				.findElements(By.xpath("//div[@aria-labelledby = 'fcl_cont_ddl']//div//span"));

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(truckcategory)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}
	
	public void settruckcategory2(String truckcategory) {
		List<WebElement> allOptions = ldriver
				.findElements(By.xpath("//div[@aria-labelledby = 'fcl_cont_ddl']//div//span"));

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(truckcategory)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}

	public void clicktrucktypedropdown() {
		ddtrucktype.click();

	}
	
	public void clicktrucktypedropdown2() {
		ddtrucktype2.click();

	}

	public void settrucktype(String trucktype) {
		List<WebElement> allOptions = ldriver
				.findElements(By.xpath("//div[@class = 'dropdown-menu ng-star-inserted show']//div//span"));

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(trucktype)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}

	public void settrucktype2(String trucktype) {
		List<WebElement> allOptions = ldriver
				.findElements(By.xpath("//div[@class = 'dropdown-menu ng-star-inserted show']//div//span"));

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(trucktype)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}
	
	public void settruckregnumber(String truckregnumber) {
		txtboxtruckregnumber.sendKeys(truckregnumber);

	}

	public void settruckregnumber2(String truckregnumber) {
		txtboxtruckregnumber2.sendKeys(truckregnumber);

	}

	public void setremarks(String remarks) {
		txtboxremarks.sendKeys(remarks);

	}
	
	public void setremarks2(String remarks) {
		txtboxremarks2.sendKeys(remarks);

	}

	public void clickaddsku() {
		btnaddsku.click();

	}
	
	public void clickaddsku2() {
		btnaddsku2.click();

	}

	public String setyourskucode(String yourskucode) {
		txtboxyourskucode.sendKeys(yourskucode);
		txtboxyourskucode.sendKeys(Keys.ENTER);
		return yourskucode;

	}
	
	public void setyourskucode2(String yourskucode) throws InterruptedException {
		txtboxyourskucode2.sendKeys(yourskucode);
		Thread.sleep(2000);
		txtboxyourskucode2.sendKeys(Keys.ENTER);
		

	}

	public String setskudescription(String skudescription) {
		txtboxskudescription.sendKeys(skudescription);
		return skudescription;

	}

	public void sethscode(String hscode) throws InterruptedException {
		txtboxhscode.sendKeys(hscode);
		Thread.sleep(1000);
		txtboxhscode.sendKeys(Keys.ENTER);

	}

	public void clickuomdropdown() {
		dduom.click();

	}

	public void setuom(String uom) {
		WebElement dduom = ldriver.findElement(By.xpath("(//div//select)[1]"));
		Select drop = new Select(dduom);
		drop.selectByVisibleText(uom);
	}

	public void clickweightuomdropdown() {
		ddweightuom.click();

	}

	public void setweightuom(String weightuom) {
		WebElement ddweightuom = ldriver.findElement(By.xpath("(//div//select)[2]"));
		Select drop = new Select(ddweightuom);
		drop.selectByVisibleText(weightuom);
	}

	public void setgrossweight(String grossweight) {
		txtboxgrossweight.sendKeys(grossweight);

	}

	public void setnetweight(String netweight) {
		txtboxnetweight.sendKeys(netweight);

	}

	public void clickpackagetypedropdown() {
		ddpackagetype.click();

	}

	public void setpackagetype(String packagetype) {
		List<WebElement> allOptions = ldriver
				.findElements(By.xpath("//div[@class = 'dropdown-menu ng-star-inserted show']//div//span"));

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(packagetype)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}

	public void setuomperpackage(String uomperpackage) {
		txtboxuomperpackage.sendKeys(uomperpackage);

	}

	public void clickpallettypedropdown() {
		ddpallettype.click();

	}

	public void setpallettype(String pallettype) {
		List<WebElement> allOptions = ldriver
				.findElements(By.xpath("//div//div[@class='d-flex flex-column justify-content-start']//span"));

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(pallettype)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}

	public void setpackageperpallet(String packageperpallet) {
		txtboxpackageperpallet.sendKeys(packageperpallet);

	}

	public void settotalpalletqty(String totalpalletqty) {
		txtboxtotalpalletqty.sendKeys(totalpalletqty);

	}

	public void settotalpalletqty2(String totalpalletqty) {
		txtboxtotalpalletqty2.clear();
		txtboxtotalpalletqty2.sendKeys(totalpalletqty);

	}
	
	public void settotalpackageqty(String totalpackageqty) {
		txtboxtotalpackageqty2.clear();
		txtboxtotalpackageqty2.sendKeys(totalpackageqty);

	}
	
	public String gettotalpackageqty() {
		return txtboxtotalpackageqty.getAttribute("value");

	}

	public String gettotaluomqty() {
		return txtboxtotaluomqty.getAttribute("value");

	}
	
	public void selectbatchnumber() {
		btntglbatchnumber.click();

	}
	
	public String setbatchnumber(String batchnumber) {
		txtboxbatchnumber.sendKeys(batchnumber);
		return batchnumber;

	}
	
	public void clickproductiondate() {
		datepickerproduction.click();

	}

	public void setproductionmonthyear(String productionmonthyear) {
		while (true) {
			WebElement monthyeartext = ldriver.findElement(By.xpath("//div[@class='ngb-dp-arrow']//following::div[@class='ngb-dp-month-name ng-star-inserted']"));
			String monthyear = monthyeartext.getText();
			if (monthyear.equals(productionmonthyear)) {
				break;

			}

			else {
				ldriver.findElement(By.xpath("//button[@title='Next month']//span[@class='ngb-dp-navigation-chevron']"))
						.click();
			}
		}
	}

	public void setproductionday(String productionday) {
		List<WebElement> allOptions = ldriver.findElements(By.xpath("//div[@class='btn-light ng-star-inserted']"));
		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().equals(productionday)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}

	public void clickexpirydate() {
		datepickerexpiry.click();

	}

	public void setexpirymonthyear(String expirymonthyear) {
		while (true) {
			WebElement monthyeartext = ldriver.findElement(By.xpath("//div[@class='ngb-dp-month-name ng-star-inserted']"));
			String monthyear = monthyeartext.getText();
			if (monthyear.equals(expirymonthyear)) {
				break;

			}

			else {
				ldriver.findElement(By.xpath("//button[@title='Next month']//span[@class='ngb-dp-navigation-chevron']"))
						.click();
			}
		}
	}

	public void setexpiryday(String expiryday) {
		List<WebElement> allOptions = ldriver.findElements(By.xpath("//div[@class='btn-light ng-star-inserted']"));
		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().equals(expiryday)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}

	
	public void clicksubmitsku() {
		btnsubmitsku.click();

	}

	public void clickservicesdetails() {
		lnktextinboundservicesdetails.click();

	}
	
	public void clickoutboundservicesdetails() {
		lnktextoutboundservicesdetails.click();

	}

	public void clickinboundsubmitshipment() {
		btninboundsubmitshipment.click();

	}
	
	public void clickoutboundsubmitshipment() {
		btnoutboundsubmitshipment.click();

	}

	public void clickbookandpay() {
		btnbookandpay.click();

	}
	
	public void clickbookandpay2() {
		btnbookandpay2.click();

	}


	public void clickaddservice2() {
		btnaddservice2.click();

	}

	public void clickoutboundshipment() {
		btnoutboundshipment.click();

	}
	
	public void clickdeliveryaddresspinlocation() {
		btndeliveryaddresspinlocation.click();

	}
	
	public void setpinaddress(String pinaddress) throws InterruptedException {
		txtboxpinaddress.sendKeys(pinaddress);
		Thread.sleep(5000);
		txtboxpinaddress.sendKeys(Keys.ARROW_DOWN);
		txtboxpinaddress.sendKeys(Keys.ENTER);

	}
	
	public void setmaindeliveryaddress(String maindeliveryaddress)  {
		txtboxmaindeliveryaddress.sendKeys(maindeliveryaddress);

	}
	
	public void selectbypallet() {
		btntglbypallet.click();

	}
	
	public void selectbypackage() {
		btntglbypackage.click();

	}
	
	public void clicksubmitpinaddress() {
		btnsubmitpinaddress.click();

	}
	
	public void clicksubmitoutbound() {
		btnsubmitoutbound.click();

	}
	
	public void clickviewsummary() {
		lnktextviewsummary.click();

	}
	
	public String getnettotalonviewsummary() {
		return lblnettotalonviewsummary.getText().toString();
		
	}
	
	public String getwarehousechargesonviewsummary() {
		return lblwarehousechargesonviewsummary.getText().toString();
		
	}
	
	public void clickcloseviewsummary() {
		btncloseviewsummary.click();
		
	}
	
	public String gettotalamountinskudetailsgrid() {
		return lbltotalamountinskudetailsgrid.getText().toString();
		
	}
	
	public String gettotalamountinskudetailsgrid2() {
		return lbltotalamountinskudetailsgrid2.getText().toString();
		
	}
	
	public String selectservice(String service) {
		System.out.println(service);
		String xpathExpression = String.format("//table//tr[./td/p[text()='%s']]//div[@class='switch-box']//ui-switch[@size ='small']", service);
		WebElement toggleButton = ldriver.findElement(By.xpath(xpathExpression));
		toggleButton.click(); // Click on the toggle button
		return xpathExpression;
	}

	public String getemptywoodenpalletsvalueexcludingvat(String emptywoodenpalletsvalueexcludingvat) {
		System.out.println(emptywoodenpalletsvalueexcludingvat);
		String xpathExpression = String.format("//table//tr[./td/p[text()='%s']]//td[7]", emptywoodenpalletsvalueexcludingvat);
		String lblemptywoodenpalletsvalueexcludingvat = ldriver.findElement(By.xpath(xpathExpression)).getText().toString();
		return lblemptywoodenpalletsvalueexcludingvat;
		
	}
	
	public String getemptywoodenpalletsvalueexcludingvat2(String emptywoodenpalletsvalueexcludingvat2) {
		System.out.println(emptywoodenpalletsvalueexcludingvat2);
		String xpathExpression = String.format("//table//tr[./td/p[text()='%s']]//td[7]", emptywoodenpalletsvalueexcludingvat2);
		String lblemptywoodenpalletsvalueexcludingvat2 = ldriver.findElement(By.xpath(xpathExpression)).getText().toString();
		return lblemptywoodenpalletsvalueexcludingvat2;
		
	}
	
	public String getdispatchingbypalletvalueexcludingvat(String getdispatchingbypalletvalueexcludingvat) {
		System.out.println(getdispatchingbypalletvalueexcludingvat);
		String xpathExpression = String.format("//table//tr[./td/p[text()='%s']]//td[7]", getdispatchingbypalletvalueexcludingvat);
		String lbldispatchingbypalletvalueexcludingvat = ldriver.findElement(By.xpath(xpathExpression)).getText().toString();
		return lbldispatchingbypalletvalueexcludingvat;
		
	}
	
	public String getnettotaloninboundshipment() {
		WebElement element = ldriver.findElement(By.xpath("//div//section//div//div//span[text()='Net Total']/following-sibling::span"));
	    
	    // Get the text content of the element
	    String netTotalText = element.getText().toString();
	    System.out.println("Net Total on inbound shipment: " + netTotalText);
	    return netTotalText;
		
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
