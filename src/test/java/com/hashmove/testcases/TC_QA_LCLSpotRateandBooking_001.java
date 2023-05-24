package com.hashmove.testcases;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Date;
import java.awt.datatransfer.StringSelection;

import java.awt.Robot;

import org.openqa.selenium.Keys;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

import com.hashmove.pageobjects.BookingDetailPage;
import com.hashmove.pageobjects.BookingProcessPage;
import com.hashmove.pageobjects.CustomerLoginPage;
import com.hashmove.pageobjects.DashboardPage;
import com.hashmove.pageobjects.HomePage;
import com.hashmove.pageobjects.PartnerLoginPage;
import com.hashmove.pageobjects.RateRequestsPage;
import com.hashmove.pageobjects.ThankyouBookingPage;
import com.hashmove.utilities.ScreenRecorderUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

//						********* TC_QA_LCLSpotRateandBooking_001 *********
//		Description: Verify that Customer should request LCL Spot Rate and Book the Shipment

public class TC_QA_LCLSpotRateandBooking_001 extends BaseClass {

	@Test(priority = 0)
	@Description("Verify that LCL Search Spot Rate and Book the Shipment without creating [shipper & consignee information]")
	@Epic("EP003")
	@Feature("Feature: LCL Search Spot Rate and Book the Shipment without creating [shipper & consignee information]")
	@Story("Story: LCL Search Spot Rate and Booking")
	public void verifylclspotrateandbookingwithoutaddingshipperinfo() throws Exception

	{
		System.out.println("***************TC_QA_LCLSpotRateandBooking_001*******************");

		// Start Recording
		ScreenRecorderUtil.startRecord("verifylclspotrateandbookingwithoutaddingshipperinfo()");

		// Open Hash Move Customer Portal URL
		driver.get(qacustomerportalurl);
		logger.info("Hash Move Customer Portal Login page has opened");

		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "HashMove – Connecting World Logistics";
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		// Maximize current window
		driver.manage().window().maximize();

		Thread.sleep(10000);

		CustomerLoginPage clp = new CustomerLoginPage(driver);
		HomePage hp = new HomePage(driver);
		PartnerLoginPage plp = new PartnerLoginPage(driver);
		DashboardPage dp = new DashboardPage(driver);
		RateRequestsPage rrp = new RateRequestsPage(driver);
		BookingProcessPage bpp = new BookingProcessPage(driver);
		ThankyouBookingPage tybp = new ThankyouBookingPage(driver);
		BookingDetailPage bdp = new BookingDetailPage(driver);

		// Click Accept cookies button
		rrp.clickaccept();
		logger.info("Accept cookies button has clicked");

		// Enter User ID
		clp.setuserid(getCellData(1, 1, "QACustomerLCLTestData"));
		logger.info("User ID = " + cell.getStringCellValue() + " has entered");

		// Enter Password
		clp.setpassword(getCellData(1, 2, "QACustomerLCLTestData"));
		logger.info("Password = " + cell.getStringCellValue() + " has entered");

		// Click Login Now button
		clp.clickloginnow();
		logger.info("Login Now button has clicked!!!");

		Thread.sleep(15000);

		// Select Sea Shipment - LCL
		String searchcategory = getCellData(1, 3, "QACustomerLCLTestData");
		System.out.println("Search Category: " + searchcategory);

		if (searchcategory.equals("Sea Shipment - FCL")) {

			hp.clickseashipmentfcl();
			logger.info("Sea shipment FCL has selected....");

		} else if (searchcategory.equals("Sea Shipment - LCL")) {
			hp.clickseashipmentlcl();
			logger.info("Sea Shipment - LCL has selected");

		}

		else if (searchcategory.equals("Air Shipment"))

		{

			logger.info("Air Shipment has selected");

		} else if (searchcategory.equals("Rail Freight")) {

			logger.info("Rail Freight has selected");

		}

		else if (searchcategory.equals("Warehousing")) {

			logger.info("Warehousing has selected");

		}

		else if (searchcategory.equals("Truck - FTL")) {

			logger.info("Truck - FTL has selected");

		} else {

			System.out.println("Statement outside if...else block");

		}

		// Select Cargo Readiness Date
		hp.clickcargoreadiness();
		hp.setcargoreadinessmonthyear(getCellData(1, 4, "QACustomerLCLTestData"));
		logger.info("Cargo Readiness Month Year " + cell.getStringCellValue() + " has selected");
		hp.setcargoreadinessday(getCellData(1, 5, "QACustomerLCLTestData"));
		logger.info("Cargo Readiness Day " + cell.getStringCellValue() + " has selected");

		// Select Cargo Type
		hp.clickcargotypedropdown();
		hp.setcargotype(getCellData(1, 6, "QACustomerLCLTestData"));
		logger.info("Cargo Type = " + cell.getStringCellValue() + " has selected");

		// Enter HS Code
		hp.sethscode(getCellData(1, 7, "QACustomerLCLTestData"));
		logger.info("HS Code = " + cell.getStringCellValue() + " has entered");

		// Enter Cargo Description
		hp.setcargodescription(getCellData(1, 8, "QACustomerLCLTestData"));
		logger.info("Cargo Description = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Select Pickup Location
		hp.clickpickuplocationdropdown();
		Thread.sleep(2000);
		hp.setpickuplocation(getCellData(1, 9, "QACustomerLCLTestData"));
		logger.info("Pickup Location = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Port of Pickup
		hp.setportofpickup(getCellData(1, 10, "QACustomerLCLTestData"));
		logger.info("Port of Pickup = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Select Delivery Location
		hp.clickdeliverylocationdropdown();
		Thread.sleep(2000);

		hp.setdeliverylocation(getCellData(1, 11, "QACustomerLCLTestData"));
		logger.info("Delivery Location = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Port of Delivery
		hp.setportofdelivery(getCellData(1, 12, "QACustomerLCLTestData"));
		logger.info("Port of Delivery = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Select Package Type
		hp.clickpackagetypedropdown();
		Thread.sleep(2000);
		hp.setpackagetype(getCellData(1, 13, "QACustomerLCLTestData"));
		logger.info("Package Type = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Select Quantity
		hp.setlclquantity(getCellData(1, 17, "QACustomerLCLTestData"));
		logger.info("Quantity = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Length
		hp.setlength(getCellData(1, 18, "QACustomerLCLTestData"));
		logger.info("Length = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Width
		hp.setwidth(getCellData(1, 19, "QACustomerLCLTestData"));
		logger.info("Width = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Height
		hp.setheight(getCellData(1, 20, "QACustomerLCLTestData"));
		logger.info("Height = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Select Unit Value
		hp.clickunitdropdown();
		Thread.sleep(1000);
		hp.setunit(getCellData(1, 21, "QACustomerLCLTestData"));
		Thread.sleep(1000);

		// Enter Weight
		hp.setlclweight(getCellData(1, 22, "QACustomerLCLTestData"));
		Thread.sleep(2000);

		// Click Payment Terms
		hp.clickpaymentterms();
		logger.info("Payment Terms link has clicked");
		Thread.sleep(3000);

		// Select Payment Terms & Conditions
		String paymentterms = getCellData(1, 23, "QACustomerLCLTestData");
		System.out.println("Payment Terms : " + paymentterms);

		if (paymentterms.equals("Advance Payment at the time of Booking Confirmation")) {

			hp.selectadvancepayment();
			logger.info("Advance Payment at the time of Booking Confirmation has selected....");
			Thread.sleep(2000);
			hp.clicksavepaymentterms();

		} else if (paymentterms.equals("Days after the issuance of BL")) {

			hp.selectdaysaftertheissuanceofbl();
			logger.info("Days after the issuance of BL has selected");
			hp.setpaymenttermsdays(getCellData(1, 24, "QACustomerLCLTestData"));
			Thread.sleep(2000);
			hp.clicksavepaymentterms();
			Thread.sleep(2000);
		}

		else if (paymentterms.equals("Days from the issuance of Invoice"))

		{

			logger.info("Days from the issuance of Invoice has selected");

		} else if (paymentterms.equals("Days after the Shipment Arrival at the Port")) {

			logger.info("Days after the Shipment Arrival at the Port has selected");

		}

		else {

			System.out.println("Statement outside if...else block");

		}

		// Click Request Spot Rate
		hp.clickrequestspotrate();
		logger.info("Request Spot Rate button has clicked!!!");
		Thread.sleep(25000);

		// Storing the request number in a string
		String fullspotraterequestnumber = hp.labelrequest.getText();
		String spotraterequestnumber = fullspotraterequestnumber.substring(0,
				Math.min(fullspotraterequestnumber.length(), 14));

		System.out.println("Full Spot Rate Request number:" + fullspotraterequestnumber);
		System.out.println("Spot Rate Request number:" + spotraterequestnumber);

		// Open Hash Move Provider Portal URL
		driver.get(qaproviderportalurl);
		logger.info("Hash Move Provider Portal Login page has opened");
		Thread.sleep(10000);

		// Click Accept cookies button
		rrp.clickaccept2();
		logger.info("Accept cookies button has clicked");

		// Enter User ID
		plp.setuserid(getCellData(1, 1, "QAProviderLCLTestData"));
		logger.info("User ID = " + cell.getStringCellValue() + " has entered");

		// Enter Password
		plp.setpassword(getCellData(1, 2, "QAProviderLCLTestData"));
		logger.info("Password = " + cell.getStringCellValue() + " has entered");

		// Click Login Now button
		plp.clickloginnow();
		logger.info("Login Now button has clicked!!!");
		Thread.sleep(5000);

		// Click Spot Rate left menu
		dp.clickspotratesleftmenu();
		logger.info("Spot Rate link has clicked!!!");
		Thread.sleep(10000);

		// Search the Spot Request
		rrp.clickfilteryourrequest();
		logger.info("Click filter request link has clicked!!!");
		Thread.sleep(5000);

		// Enter Spot Request Number
		rrp.setrequestnumber(spotraterequestnumber);
		logger.info("Spot Request Number has entered!!!");
		Thread.sleep(1000);

		// Object of Actions class to scroll up and down
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Click Filter Records button
		rrp.clickfilterrecords();
		logger.info("Filter Records button has clicked!!!");
		Thread.sleep(2000);

		// Click Provide Your Quote button
		rrp.clickprovideyourquote();
		logger.info("Provide Your Quote button has clicked!!!");
		Thread.sleep(5000);

		// Enter Shipping Line
		rrp.setshipingline(getCellData(1, 3, "QAProviderLCLTestData"));
		logger.info("Shipping Line = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);

		// Enter Rate Per CBM
		rrp.setratepercbm(getCellData(1, 4, "QAProviderLCLTestData"));
		logger.info("Rate Per CBM = " + cell.getStringCellValue() + " has entered");

		// Enter Chargeable CBM
		rrp.setchargeablecbm(getCellData(1, 5, "QAProviderLCLTestData"));
		logger.info("Chargeable CBM = " + cell.getStringCellValue() + " has entered");

		// Enter Bill of Lading
		rrp.setbillofloading(getCellData(1, 6, "QAProviderLCLTestData"));
		logger.info("Bill of Lading = " + cell.getStringCellValue() + " has entered");

		// Enter LCL Destuffing
		rrp.setlcldestuffing(getCellData(1, 7, "QAProviderLCLTestData"));
		logger.info("LCL Destuffing = " + cell.getStringCellValue() + " has entered");

		// Enter Port Handling
		rrp.setporthandling(getCellData(1, 8, "QAProviderLCLTestData"));
		logger.info("Port Handling = " + cell.getStringCellValue() + " has entered");

		// Enter Terminal Handling Charge - Origin
		rrp.setterminalhandlingcharge(getCellData(1, 9, "QAProviderLCLTestData"));
		logger.info("Terminal Handling Charge - Origin = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Object of Actions class to scroll up and down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Enter Rate Validity Start Date
		rrp.clickratevaliditystart();
		rrp.setratevaliditystartmonthyear(getFormulaMonthYearDateAsString(1, 9, "QAProviderLCLTestData"));
		rrp.setratevaliditystartday(getFormulaDayDateAsString(1, 10, "QAProviderLCLTestData"));

		Thread.sleep(2000);

		// Enter Rate Validity End Date
		rrp.clickratevalidityend();
		rrp.setratevalidityendmonthyear(getFormulaMonthYearDateAsString(1, 11, "QAProviderLCLTestData"));
		rrp.setratevalidityendday(getFormulaDayDateAsString(1, 12, "QAProviderLCLTestData"));

		// Select Customer Payment Terms

		String customerpaymentterms = getCellData(1, 12, "QAProviderLCLTestData");
		System.out.println("Customer Payment Terms : " + customerpaymentterms);

		if (customerpaymentterms.equals("I ACCEPT CUSTOMER PAYMENT TERMS")) {

			rrp.selectiacceptcustomerpaymentterms();
			logger.info("I ACCEPT CUSTOMER PAYMENT TERMS has selected ...");
			Thread.sleep(2000);

		} else if (customerpaymentterms.equals("I WILL SET MY OWN PAYMENT TERMS")) {

			logger.info("I WILL SET MY OWN PAYMENT TERMS has selected ...");

		}

		else {

			System.out.println("Statement outside if...else block");

		}

		// Object of Actions class to scroll up and down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);

		// Click Save and Close
		rrp.clicksaveandclose();
		logger.info("Save and Close button has clicked!!!");
		Thread.sleep(2000);

		// Click Would you like to proceed?
		rrp.clickWouldyouliketoproceed();
		logger.info("Would you like to proceed? button has clicked!!!");
		Thread.sleep(5000);

		// Customer Book Quotes

		// Open Hash Move Customer Portal URL
		driver.get(qacustomerportalurl);
		logger.info("Hash Move Customer Portal page has opened");
		Thread.sleep(10000);

		// Click Options Drop down
		hp.clickoptionsdropdown();
		logger.info("Options Dropdown has clicked!!!");
		Thread.sleep(2000);

		hp.clickspotrates();
		logger.info("Spot Rates option has clicked!!!");
		Thread.sleep(8000);

		// Search the Spot Request
		rrp.clickfilteryourrequest2();
		logger.info("Click filter request link has clicked!!!");
		Thread.sleep(1000);

		// Enter Spot Request Number
		rrp.setrequestnumber2(spotraterequestnumber);
		logger.info("Spot Request Number has entered!!!");
		Thread.sleep(1000);

		// Object of Actions class to scroll down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Click Filter Records button
		rrp.clickfilterrecords2();
		logger.info("Filter Records button has clicked!!!");
		Thread.sleep(2000);

		// Click View Quotes
		rrp.clickviewquotes();
		logger.info("View Quotes link has clicked!!!");
		Thread.sleep(2000);

		// Click Book Now
		rrp.clickbooknow();
		logger.info("Book Now link has clicked!!!");
		Thread.sleep(5000);

		// Click Next
		bpp.clicknext();
		logger.info("Next button has clicked!!!");
		Thread.sleep(2000);

		// Object of Actions class to scroll down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Enter Reference Number (optional)
		bpp.setreferencenumber(getCellData(1, 25, "QACustomerLCLTestData"));
		logger.info("Reference Number = " + cell.getStringCellValue() + " has entered");

		// Enter Shipping Instructions
		bpp.setshippinginstructions(getCellData(1, 26, "QACustomerLCLTestData"));
		logger.info("Shipping Instructions = " + cell.getStringCellValue() + " has entered");

		// Check Disclaimer
		bpp.selectdisclaimer();
		logger.info("Disclaimer has selected");

		// Click Confirm
		bpp.clickconfirm();
		logger.info("Confirm button has clicked!!!");
		Thread.sleep(8000);

		// Get Booking Number
		String bookingnumbertext = tybp.getbookingnumber();
		System.out.println("Booking Number Text : " + bookingnumbertext);
		String bookingnumber2 = StringUtils.right(bookingnumbertext, 13);
		System.out.println("Booking Number: " + bookingnumber2);

		// Click View Booking
		tybp.clickviewbooking();
		logger.info("View Booking has clicked!!!");
		Thread.sleep(8000);

		// Object of Actions class to scroll down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Add Shipping Information //

		// Select SHIPPER NAME
		bdp.setshippername(getCellData(1, 27, "QACustomerLCLTestData"));
		logger.info("Shipper Name = " + cell.getStringCellValue() + " has entered");

		// Save Shipper Information
		bdp.clicksavemainshipperinfo();
		Thread.sleep(2000);
		logger.info("Shipper Information has added....");

		// Add Consignee Information //

		// Select Consignee Name
		bdp.setmainconsigneename(getCellData(1, 33, "QACustomerLCLTestData"));
		logger.info("Consignee Name = " + cell.getStringCellValue() + " has entered");

		// Save Consignee Information
		bdp.clicksavemainconsigneeinfo();
		Thread.sleep(5000);
		logger.info("Consignee Information has added....");

		// Object of Actions class to scroll down

		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);

		// Upload Shipment Documents

		// Upload Packet List
		bdp.clickpackagelist();
		logger.info("Package List has clicked.");
		Thread.sleep(1000);

		bdp.clickselectafile();
		logger.info("Select a file has clicked.");
		Thread.sleep(2000);

		// creating object of Robot class
		Robot rb = new Robot();

		// copying File path to Clip board
		StringSelection str = new StringSelection(System.getProperty("user.dir") + "\\UploadFiles\\Document.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// press Control+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		Thread.sleep(1000);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		// Object of Actions class to scroll up and down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Click Upload button
		bdp.clickupload();
		logger.info("Packet List Document has uploaded successfully!!!");
		Thread.sleep(2000);

		// Open Hash Move Provider Portal URL
		driver.get(qaproviderportalurl);
		logger.info("Hash Move Provider Portal page has opened");

		Thread.sleep(10000);

		// Click Booking Link
		bdp.clickbookings();
		Thread.sleep(8000);

		// Search Booking Request Number
		rrp.clickfilteryourrequest3();
		logger.info("Click filter request link has clicked!!!");
		Thread.sleep(1000);

		// Enter Booking Request Number
		rrp.setrequestnumber3(bookingnumber2);
		logger.info("Booking Request Number has entered!!!");
		Thread.sleep(1000);

		// Object of Actions class to scroll down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Click Filter Records button
		rrp.clickfilterrecords3();
		logger.info("Filter Records button has clicked!!!");
		Thread.sleep(2000);

		// Click Booking request link
		bdp.clickbookingrequestlink();
		Thread.sleep(2000);

		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Upload Loading Plan
		bdp.clickloadingplan();
		logger.info("Loading Plan has clicked.");
		Thread.sleep(1000);

		bdp.clickselectafile2();
		logger.info("Select a file has clicked.");
		Thread.sleep(1000);

		// copying File path to Clipboard

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		Thread.sleep(2000);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		Thread.sleep(2000);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Click Upload button
		bdp.clickupload2();
		logger.info("Loading Plan Document has uploaded successfully!!!");
		Thread.sleep(5000);

		// Upload Goods Declaration
		bdp.clickgoodsdeclaration();
		logger.info("Goods Declaration has clicked.");
		Thread.sleep(1000);

		// Enter GD No
		bdp.setgoodsdeclarationnumber(getCellData(1, 11, "QAProviderLCLTestData"));
		logger.info("GD No = " + cell.getStringCellValue() + " has entered");

		// Select GD Date
		bdp.clickgddate();
		bdp.setgddatemonthyear(getCellData(1, 12, "QAProviderLCLTestData"));
		logger.info("GD Date Month Year " + cell.getStringCellValue() + " has selected");
		Thread.sleep(2000);
		bdp.setgddateday(getCellData(1, 13, "QAProviderLCLTestData"));
		logger.info("GD Date Day " + cell.getStringCellValue() + " has selected");

		bdp.clickselectafile3();
		logger.info("Select a file has clicked.");
		Thread.sleep(1000);

		// copying File path to Clipboard

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		Thread.sleep(2000);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		Thread.sleep(2000);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Click Upload button
		bdp.clickupload2();
		logger.info("Loading Plan Document has uploaded successfully!!!");
		Thread.sleep(5000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		// Update Booking Status from In-Review to Confirm
		// Click Update Status
		bdp.clickupdatestatus();
		logger.info("Update Status link has clicked.");
		Thread.sleep(3000);

		// Select Shipment Status
		bdp.clickshipmentstatusdropdown();
		bdp.setshipmentstatus(getCellData(1, 11, "QAProviderLCLTestData"));
		logger.info("Shipment Status : " + cell.getStringCellValue() + " has entered.");

		// Enter Details
		bdp.setshipmentdetails(getCellData(1, 12, "QAProviderLCLTestData"));
		logger.info("Shipment Details " + cell.getStringCellValue() + " has entered.");
		Thread.sleep(2000);

		// Click Submit
		bdp.clicksubmitshipmentstatus();
		logger.info("Submit button has clicked.");
		Thread.sleep(2000);

		// Click I accept the terms & conditions
		bdp.clickiacceptthetermsandconditions();
		logger.info("I accept the terms & conditions button has clicked.");
		Thread.sleep(5000);

		// Click Update Status
		bdp.clickupdatestatus();
		logger.info("Update Status link has clicked again.");
		Thread.sleep(3000);

		// Select Shipment Status
		bdp.clickshipmentstatusdropdown2();
		bdp.setshipmentstatus2(getCellData(1, 13, "QAProviderLCLTestData"));
		logger.info("Shipment Status has updated to In Transit.");

		// Enter Details
		bdp.setshipmentdetails2(getCellData(1, 14, "QAProviderLCLTestData"));
		logger.info("Shipment Details: " + cell.getStringCellValue() + " has entered.");
		Thread.sleep(2000);

		// Click Submit
		bdp.clicksubmitshipmentstatus2();
		logger.info("Submit button has clicked.");
		Thread.sleep(5000);

		///////////

		// Click Update Status
		bdp.clickupdatestatus();
		logger.info("Update Status link has clicked again.");
		Thread.sleep(3000);

		// Select Shipment Status
		bdp.clickshipmentstatusdropdown2();
		bdp.setshipmentstatus2(getCellData(1, 15, "QAProviderLCLTestData"));
		logger.info("Shipment Status has updated to Completed.");

		// Enter Details
		bdp.setshipmentdetails2(getCellData(1, 16, "QAProviderLCLTestData"));
		logger.info("Shipment Details Completed has entered.");
		Thread.sleep(2000);

		// Click Submit
		bdp.clicksubmitshipmentstatus2();
		logger.info("Submit button has clicked.");
		Thread.sleep(5000);

		// Capturing the screenshot
		Date d = new Date();
		String FileName = "screenshot" + d.toString().replace(" ", "_").replace(":", "") + ".png";
		System.out.println(FileName);
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(System.getProperty("user.dir") + "\\ScreenShots\\" + FileName));

		// screenshot copied from buffer is saved at the mentioned path.

		System.out.println("The Screenshot is captured.");

		// Stop Recording
		// ScreenRecorderUtil.stopRecord();
		System.out.println("Test Case for LCL Spot Request has passed!!!!!!");

	}

}