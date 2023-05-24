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
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

//						********* TestCase_SpotRateandBooking_002 *********
//		Description: Verify that Customer should request FCL Spot Rate with creating [shipper & consignee information] and Book the Shipment

public class TC_QA_FCLSpotRateandBooking_002 extends BaseClass {

	@Test(priority = 0)
	@Description("Verify that FCL Search Spot Rate and Book the Shipment with creating [shipper & consignee information]")
	@Severity(SeverityLevel.CRITICAL)
	@Epic("EP002")
	@Feature("Feature: FCL Search Spot Rate and Book the Shipment with creating [shipper & consignee information]")
	@Story("Story: FCL Search Spot Rate and Booking")
	public void verifyfclspotrateandbookingwithoutaddingshipperinfo() throws Exception

	{
		System.out.println("***************TC_QA_FCLSpotRateandBooking_002*******************");

		// Start Recording
		ScreenRecorderUtil.startRecord("verifyfclspotrateandbookingwithoutaddingshipperinfo()");

		// Open Hash Move Customer Portal URL
		driver.get(qacustomerportalurl);

		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "HashMove – Connecting World Logistics";
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		// Maximize current window
		driver.manage().window().maximize();
		logger.info("Hash Move Login page has opened");

		Thread.sleep(15000);

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
		Thread.sleep(1000);
		
		// Enter User ID
		clp.setuserid(getCellData(2, 1, "QAFCLCustomerTestData"));
		logger.info("User ID = " + cell.getStringCellValue() + " has entered");

		// Enter Password
		clp.setpassword(getCellData(2, 2, "QAFCLCustomerTestData"));
		logger.info("Password = " + cell.getStringCellValue() + " has entered");

		// Click Login Now button
		clp.clickloginnow();
		logger.info("Login Now button has clicked!!!");

		Thread.sleep(15000);

		// Select Sea Shipment - FCL
		String searchcategory = getCellData(2, 3, "QAFCLCustomerTestData");
		System.out.println("Search Category: " + searchcategory);

		if (searchcategory.equals("Sea Shipment - FCL")) {

			hp.clickseashipmentfcl();
			logger.info("Sea shipment FCL has selected....");

		} else if (searchcategory.equals("Sea Shipment - LCL")) {

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
		hp.setcargoreadinessmonthyear(getFormulaMonthYearDateAsString(2, 4, "QAFCLCustomerTestData"));
		hp.setcargoreadinessday(getFormulaDayDateAsString(2, 5, "QAFCLCustomerTestData"));

		// Select Cargo Type
		hp.clickcargotypedropdown();
		Thread.sleep(1000);
		hp.setcargotype(getCellData(2, 6, "QAFCLCustomerTestData"));
		Thread.sleep(1000);

		// Enter HS Code
		hp.sethscode(getCellData(2, 7, "QAFCLCustomerTestData"));
		logger.info("HS Code = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Cargo Description
		hp.setcargodescription(getCellData(2, 8, "QAFCLCustomerTestData"));
		logger.info("Cargo Description = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Select Pickup Location
		hp.clickpickuplocationdropdown();
		Thread.sleep(2000);
		hp.setpickuplocation(getCellData(2, 9, "QAFCLCustomerTestData"));
		logger.info("Pickup Location = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Port of Pickup
		hp.setportofpickup(getCellData(2, 10, "QAFCLCustomerTestData"));
		logger.info("Port of Pickup = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Select Delivery Location
		hp.clickdeliverylocationdropdown();
		Thread.sleep(2000);

		hp.setdeliverylocation(getCellData(2, 11, "QAFCLCustomerTestData"));
		logger.info("Delivery Location = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Port of Delivery
		hp.setportofdelivery(getCellData(2, 12, "QAFCLCustomerTestData"));
		logger.info("Port of Delivery = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Select Container Size
		hp.clickcontainersizedropdown();
		Thread.sleep(2000);
		hp.setcontainersize(getCellData(2, 13, "QAFCLCustomerTestData"));
		logger.info("Container Size = " + cell.getStringCellValue() + " has selected");

		// Enter Quantity
		hp.setquantity(getCellData(2, 14, "QAFCLCustomerTestData"));
		logger.info("Quantity = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Weight
		hp.setweight(getCellData(2, 15, "QAFCLCustomerTestData"));
		logger.info("Weight = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Click Payment Terms
		hp.clickpaymentterms();
		logger.info("Payment Terms link has clicked");
		Thread.sleep(5000);

		// Select Payment Terms & Conditions
		String paymentterms = getCellData(2, 16, "QAFCLCustomerTestData");
		System.out.println("Payment Terms : " + paymentterms);

		if (paymentterms.equals("Advance Payment at the time of Booking Confirmation")) {

			hp.selectadvancepayment();
			logger.info("Advance Payment at the time of Booking Confirmation has selected....");
			Thread.sleep(2000);
			hp.clicksavepaymentterms();

		} else if (paymentterms.equals("Days after the issuance of BL")) {

			hp.selectdaysaftertheissuanceofbl();
			logger.info("Days after the issuance of BL has selected");
			hp.setpaymenttermsdays(getCellData(2, 17, "QAFCLCustomerTestData"));
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
		logger.info("Hash Move Provider Portal URL has opened....");
		Thread.sleep(10000);

		// Click Accept cookies button
		rrp.clickaccept2();
		logger.info("Accept cookies button has clicked!!!");

		// Enter User ID
		plp.setuserid(getCellData(2, 1, "QAFCLProviderTestData"));
		logger.info("User ID = " + cell.getStringCellValue() + " has entered");

		// Enter Password
		plp.setpassword(getCellData(2, 2, "QAFCLProviderTestData"));
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
		Thread.sleep(8000);

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
		rrp.setshipingline(getCellData(2, 3, "QAFCLProviderTestData"));
		logger.info("Shipping Line = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);

		// Enter Rate Per Container
		rrp.setratepercontainer(getCellData(2, 4, "QAFCLProviderTestData"));
		logger.info("Rate Per Container = " + cell.getStringCellValue() + " has entered");

		// Enter Bill of Lading
		rrp.setbillofloading(getCellData(2, 5, "QAFCLProviderTestData"));
		logger.info("Bill of Lading = " + cell.getStringCellValue() + " has entered");

		// Enter LOLO
		rrp.setlolo(getCellData(2, 6, "QAFCLProviderTestData"));
		logger.info("LOLO = " + cell.getStringCellValue() + " has entered");

		// Enter SEAL Charges
		rrp.setsealcharges(getCellData(2, 7, "QAFCLProviderTestData"));
		logger.info("SEAL Charges = " + cell.getStringCellValue() + " has entered");

		// Enter Terminal Handling Charge - Origin
		rrp.setterminalhandlingcharge(getCellData(2, 8, "QAFCLProviderTestData"));
		logger.info("Terminal Handling Charge - Origin = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Object of Actions class to scroll up and down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);

		// Enter Rate Validity Start Date
		rrp.clickratevaliditystart();
		rrp.setratevaliditystartmonthyear(getFormulaMonthYearDateAsString(2, 9, "QAFCLProviderTestData"));
		rrp.setratevaliditystartday(getFormulaDayDateAsString(2, 10, "QAFCLProviderTestData"));

		Thread.sleep(2000);

		// Enter Rate Validity End Date
		rrp.clickratevalidityend();
		rrp.setratevalidityendmonthyear(getFormulaMonthYearDateAsString(2, 11, "QAFCLProviderTestData"));
		rrp.setratevalidityendday(getFormulaDayDateAsString(2, 12, "QAFCLProviderTestData"));

		// Select Customer Payment Terms

		String customerpaymentterms = getCellData(2, 13, "QAFCLProviderTestData");
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
		logger.info("Hash Move Customer Portal URL has opened !!!");
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
		Thread.sleep(3000);

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
		Thread.sleep(3000);

		// Click Book Now
		rrp.clickbooknow();
		logger.info("Book Now link has clicked!!!");
		Thread.sleep(5000);

		// Object of Actions class to scroll down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Click Next
		bpp.clicknext();
		logger.info("Next button has clicked!!!");
		Thread.sleep(2000);

		// Object of Actions class to scroll down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Enter Reference Number (optional)
		bpp.setreferencenumber(getCellData(2, 18, "QAFCLCustomerTestData"));
		logger.info("Reference Number = " + cell.getStringCellValue() + " has entered");

		// Enter Shipping Instructions
		bpp.setshippinginstructions(getCellData(2, 19, "QAFCLCustomerTestData"));
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
		Thread.sleep(5000);

		// Object of Actions class to scroll down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);

		// Add Shipping Information //

		// Click Add Shipper button
		bdp.clickaddshipper();
		Thread.sleep(2000);

		// Enter Shipper Name
		String shipperename = bdp.setshipperename(getCellData(2, 20, "QAFCLCustomerTestData") + bdp.getSaltString());
		logger.info("Shipper Name = " + shipperename + " has entered");

		// Enter Contact Person
		bdp.setcontactperson(getCellData(2, 21, "QAFCLCustomerTestData"));
		logger.info("Contact Person = " + cell.getStringCellValue() + " has entered");

		// Enter City
		bdp.setcity(getCellData(2, 22, "QAFCLCustomerTestData"));
		logger.info("City = " + cell.getStringCellValue() + " has entered");

		// Enter Contact Phone
		bdp.setcontactphone(getCellData(2, 23, "QAFCLCustomerTestData"));
		logger.info("Contact Phone = " + cell.getStringCellValue() + " has entered");

		// Enter Contact Email
		bdp.setcontactemail("engro" + bdp.getSaltString() + "@" + getCellData(2, 24, "QAFCLCustomerTestData"));
		logger.info("Contact Email = " + cell.getStringCellValue() + " has entered");

		// Select and Enter Address
		bdp.clickaddressicon();
		Thread.sleep(1000);

		bdp.setconsigneepinaddress(getCellData(2, 25, "QAFCLCustomerTestData"));
		logger.info("Consignee Pin Address = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Click Submit
		bdp.clicksubmitconsigneeaddress();
		Thread.sleep(2000);

		// Enter Main Address
		bdp.setconsigneemainaddress(getCellData(2, 25, "QAFCLCustomerTestData"));
		logger.info("Consignee Main Address = " + cell.getStringCellValue() + " has entered");

		// Click Save Shipper info
		bdp.clicksaveshipperinfo();
		Thread.sleep(2000);

		// Select SHIPPER NAME
		bdp.setshippername(shipperename);
		logger.info("Shipper Name = " + shipperename + " has entered");

		// Save Shipper Information
		bdp.clicksavemainshipperinfo();
		Thread.sleep(2000);
		logger.info("Shipper Information has added....");

		// Add Consignee Information //

		// Click Add Consignee button
		bdp.clickaddconsignee();
		Thread.sleep(2000);

		// Enter Consignee Name
		String consigneename = bdp.setconsigneename(getCellData(2, 26, "QAFCLCustomerTestData") + bdp.getSaltString());
		logger.info("Consignee Name = " + consigneename + " has entered");

		// Enter Contact Person
		bdp.setcontactperson2(getCellData(2, 27, "QAFCLCustomerTestData"));
		logger.info("Contact Person = " + cell.getStringCellValue() + " has entered");

		// Enter City
		bdp.setcity2(getCellData(2, 28, "QAFCLCustomerTestData"));
		logger.info("City = " + cell.getStringCellValue() + " has entered");

		// Enter Contact Phone
		bdp.setcontactphone2(getCellData(2, 29, "QAFCLCustomerTestData"));
		logger.info("Contact Phone = " + cell.getStringCellValue() + " has entered");

		// Enter Contact Email
		bdp.setcontactemail2("dell" + bdp.getSaltString() + "@" + getCellData(2, 30, "QAFCLCustomerTestData"));
		logger.info("Contact Email = " + cell.getStringCellValue() + " has entered");

		// Select and Enter Address
		bdp.clickaddressicon2();
		Thread.sleep(1000);

		bdp.setconsigneepinaddress2(getCellData(2, 31, "QAFCLCustomerTestData"));
		logger.info("Consignee Pin Address = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Click Submit
		bdp.clicksubmitconsigneeaddress2();
		Thread.sleep(2000);

		// Enter Main Address
		bdp.setconsigneemainaddress2(getCellData(2, 31, "QAFCLCustomerTestData"));
		logger.info("Consignee Main Address = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Click Save Consignee info
		bdp.clicksaveconsigneeinfo();
		Thread.sleep(2000);

		// Object of Actions class to scroll down

		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);

		// Add Consignee Information //

		// Select Consignee Name
		bdp.setmainconsigneename(consigneename);
		logger.info("Consignee Name = " + consigneename + " has entered");

		// Save Consignee Information
		bdp.clicksavemainconsigneeinfo();
		Thread.sleep(2000);
		logger.info("Consignee Information has added....");

		// Object of Actions class to scroll down

		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

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
		logger.info("Package List Document has uploaded successfully!!!");
		Thread.sleep(2000);

		// Open Hash Move Provider Portal URL
		driver.get(qaproviderportalurl);
		Thread.sleep(10000);

		// Click Booking Link
		bdp.clickbookings();
		logger.info("Booking Link has clicked!!!");
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
		logger.info("Booking request link link has clicked!!!");
		Thread.sleep(2000);

		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Upload Booking Confirmation Document (CRO/BC/SC)
		bdp.clickbookingconfirmationdocument();
		logger.info("Booking Confirmation Document (CRO/BC/SC) has clicked.");
		Thread.sleep(1000);

		bdp.clickselectafile2();
		logger.info("Select a file has clicked.");
		Thread.sleep(1000);

		// copying File path to Clip board

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// press Control+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		Thread.sleep(2000);

		// release Control+V for pasting
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
		logger.info("Document has uploaded successfully!!!");
		Thread.sleep(5000);

		// Click Update Booking Status
		bdp.clickconfirmbookingyes();
		logger.info("Confirm Booking Yes button has clicked");
		Thread.sleep(1000);

		// Enter Shipment Details
		bdp.setshipmentdetails(getCellData(2, 14, "QAFCLProviderTestData"));
		logger.info("Shipment Details = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Click Submit
		bdp.clicksubmit();
		logger.info("Submit button has clicked.");
		Thread.sleep(5000);

		// Click I accept the terms & conditions
		bdp.clickiacceptthetermsandconditions();
		logger.info("I accept the terms & conditions button has clicked.");
		Thread.sleep(2000);

		// Add Add Schedule
		bdp.clickaddschedule();
		logger.info("Add Schedule button has clicked.");
		Thread.sleep(2000);

		// Set Departure Date
		bdp.clickdeparturefrom();
		bdp.setdeparturedatemonthyear(getFormulaMonthYearDateAsString(2, 15, "QAFCLProviderTestData"));
		bdp.setdeparturedateday(getFormulaDayDateAsString(2, 16, "QAFCLProviderTestData"));
		
		// Set Arrival Date
		bdp.clickarrivalto();
		bdp.setarrivaldatemonthyear(getFormulaMonthYearDateAsString(2, 17, "QAFCLProviderTestData"));
		bdp.setarrivaldateday(getFormulaDayDateAsString(2, 18, "QAFCLProviderTestData"));
		Thread.sleep(2000);

		// Enter Vessel Name
		bdp.setvesselname(getCellData(2, 19, "QAFCLProviderTestData"));
		logger.info("Vessel Name = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Voyage Number
		bdp.setvoyagenumber(getCellData(2, 20, "QAFCLProviderTestData"));
		logger.info("Voyage Number = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Click Update Schedule
		bdp.clickupdateschedule();
		logger.info("Update Schedule button has clicked");
		Thread.sleep(5000);

		// Upload Bill of Lading
		bdp.clickbilloflading();
		logger.info("Bill of Lading has clicked.");
		Thread.sleep(1000);

		// Object of Actions class to scroll up and down
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);

		// Enter Bill Number
		bdp.setbillnumber(getCellData(2, 22, "QAFCLProviderTestData"));
		logger.info("Bill Number = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Set BL Date
		bdp.clickbldate();
		bdp.setbldatemonthyear(getFormulaMonthYearDateAsString(2, 23, "QAFCLProviderTestData"));
		bdp.setbldateday(getFormulaDayDateAsString(2, 24, "QAFCLProviderTestData"));
		Thread.sleep(1000);

		bdp.clickselectafile3();
		logger.info("Select a file has clicked.");
		Thread.sleep(1000);

		// copying File path to Clip board
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// press Control+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		Thread.sleep(1000);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		Thread.sleep(1000);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);

		// Click Upload button
		bdp.clickupload3();
		logger.info("Document has uploaded successfully!!!");
		Thread.sleep(2000);

		// Click In-Transit Yes
		bdp.clickintransityes();
		logger.info("In-Transit Yes button has clicked");
		Thread.sleep(1000);

		// Enter Shipment Details In-Transit
		bdp.setshipmentdetailsintransit(getCellData(2, 25, "QAFCLProviderTestData"));
		logger.info("Shipment Details In-Transit = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Click Submit
		bdp.clicksubmitintransit();
		logger.info("Submit button for In-Transit has clicked.");
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		// Update Booking Status from In-Transit to Complete
		// Click Update Status
		bdp.clickupdatestatus();
		logger.info("Update Status link has clicked.");
		Thread.sleep(3000);

		// Select Shipment Status
		bdp.clickshipmentstatusdropdown();
		bdp.setshipmentstatus(getCellData(2, 26, "QAFCLProviderTestData"));

		// Enter Details

		// Click Submit
		bdp.clicksubmitshipmentstatus();
		logger.info("Submit button has clicked.");

		// Capturing the screenshot
		Date d = new Date();
		String FileName = "screenshot" + d.toString().replace(" ", "_").replace(":", "") + ".png";
		System.out.println(FileName);
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(System.getProperty("user.dir") + "\\ScreenShots\\" + FileName));

		// screenshot copied from buffer is saved at the mentioned path.

		System.out.println("The Screenshot is captured.");

		// Stop Recording
		ScreenRecorderUtil.stopRecord();

	}

}