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

//						********* TestCase_SpotRateandBooking_002 *********
//		Description: Verify that Customer should request FCL Spot Rate and Book the Shipment

public class TestCase_FCLSpotRateandBooking_002 extends BaseClass {

	@Test(priority = 0)
	public void verifyfclspotrateandbookingwithaddingshipperinfo() throws Exception

	{
		System.out.println("***************TestCase_SpotRateandBooking_002*******************");

		// Start Recording
		ScreenRecorderUtil.startRecord("verifyfclspotrateandbookingwithaddingshipperinfo()");
		
		// Open Hash Move Customer Portal URL
		driver.get(qacustomerportalurl);

		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "HashMove – Connecting World Logistics";
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		// Maximize current window
		driver.manage().window().maximize();
		logger.info("Hash Move Login page has opened");

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
		
		// Enter User ID
		clp.setuserid(getCellData(2, 1, "QACustomerTestData"));
		logger.info("User ID = " + cell.getStringCellValue() + " has entered");

		// Enter Password
		clp.setpassword(getCellData(2, 2, "QACustomerTestData"));
		logger.info("Password = " + cell.getStringCellValue() + " has entered");

		// Click Login Now button
		clp.clickloginnow();
		logger.info("Login Now button has clicked!!!");
		

		Thread.sleep(12000);

		// Select Sea Shipment - FCL
		String searchcategory = getCellData(2, 3, "QACustomerTestData");
		System.out.println("Search Category: " + searchcategory);

		if (searchcategory.equals("Sea Shipment - FCL")) {

			hp.clickseashipmentfcl();
			logger.info("Sea shipment FCL has selected....");
			Thread.sleep(2000);

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
		Thread.sleep(8000);
		hp.clickcargoreadiness();
		hp.setcargoreadinessmonthyear(getCellData(2, 4, "QACustomerTestData"));
		logger.info("Cargo Readiness Month Year has selected");

		hp.setcargoreadinessday(getCellData(2, 5, "QACustomerTestData"));
		logger.info("Cargo Readiness Day has selected");

		// Select Cargo Type
		hp.clickcargotypedropdown();
		Thread.sleep(1000);
		hp.setcargotype(getCellData(2, 6, "QACustomerTestData"));
		logger.info("Cargo Type = " + cell.getStringCellValue() + " has selected");
		Thread.sleep(1000);

		// Enter HS Code
		hp.sethscode(getCellData(2, 7, "QACustomerTestData"));
		logger.info("HS Code = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Cargo Description
		hp.setcargodescription(getCellData(2, 8, "QACustomerTestData"));
		logger.info("Cargo Description = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Select Pickup Location
		hp.clickpickuplocationdropdown();
		Thread.sleep(2000);
		hp.setpickuplocation(getCellData(2, 9, "QACustomerTestData"));
		logger.info("Pickup Location = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Port of Pickup
		hp.setportofpickup(getCellData(2, 10, "QACustomerTestData"));
		logger.info("Port of Pickup = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Select Delivery Location
		hp.clickdeliverylocationdropdown();
		Thread.sleep(2000);

		/*
		 * Comment out for stale element issue hp.setdeliverylocation(getCellData(1, 9,
		 * "TestData2")); logger.info("Delivery Location = " + cell.getStringCellValue()
		 * + " has entered"); Thread.sleep(2000);
		 */

		// use this temp function
		hp.setdeliverylocation();
		Thread.sleep(2000);

		// Enter Port of Delivery
		hp.setportofdelivery(getCellData(2, 12, "QACustomerTestData"));
		logger.info("Port of Delivery = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Select Container Size
		hp.clickcontainersizedropdown();
		Thread.sleep(2000);
		hp.setcontainersize(getCellData(2, 13, "QACustomerTestData"));
		logger.info("Container Size = " + cell.getStringCellValue() + " has selected");

		// Enter Quantity
		hp.setquantity(getCellData(2, 14, "QACustomerTestData"));
		logger.info("Quantity = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Weight
		hp.setweight(getCellData(2, 15, "QACustomerTestData"));
		logger.info("Weight = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);
		
		// Click Payment Terms
		hp.clickpaymentterms();
		logger.info("Payment Terms link has clicked");
		Thread.sleep(5000);
		
		// Select Payment Terms & Conditions
		String paymentterms = getCellData(2, 16, "QACustomerTestData");
		System.out.println("Payment Terms : " + searchcategory);

		if (paymentterms.equals("Advance Payment at the time of Booking Confirmation")) {

			hp.selectadvancepayment();
			logger.info("Advance Payment at the time of Booking Confirmation has selected....");
			Thread.sleep(2000);
			hp.clicksavepaymentterms();

		} else if (paymentterms.equals("Days after the issuance of BL")) {
			
			hp.selectdaysaftertheissuanceofbl();
			logger.info("Days after the issuance of BL has selected");
			hp.setpaymenttermsdays(getCellData(2, 17, "QACustomerTestData"));
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
		Thread.sleep(10000);

		// Enter User ID
		plp.setuserid(getCellData(2, 1, "QAProviderTestData"));
		logger.info("User ID = " + cell.getStringCellValue() + " has entered");

		// Enter Password
		plp.setpassword(getCellData(2, 2, "QAProviderTestData"));
		logger.info("Password = " + cell.getStringCellValue() + " has entered");

		// Click Login Now button
		plp.clickloginnow();
		logger.info("Login Now button has clicked!!!");
		Thread.sleep(5000);

		// Click Accept cookies button
		rrp.clickaccept2();

		// Click Spot Rate left menu
		dp.clickspotratesleftmenu();
		logger.info("Spot Rate link has clicked!!!");
		Thread.sleep(10000);

		// Search the Spot Request
		rrp.clickfilteryourrequest();
		logger.info("Click filter request link has clicked!!!");
		Thread.sleep(1000);

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
		rrp.setshipingline(getCellData(2, 3, "QAProviderTestData"));
		logger.info("Shipping Line = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);

		// Enter Rate Per Container
		rrp.setratepercontainer(getCellData(2, 4, "QAProviderTestData"));
		logger.info("Rate Per Container = " + cell.getStringCellValue() + " has entered");

		// Enter Bill of Lading
		rrp.setbillofloading(getCellData(2, 5, "QAProviderTestData"));
		logger.info("Bill of Lading = " + cell.getStringCellValue() + " has entered");

		// Enter LOLO
		rrp.setlolo(getCellData(2, 6, "QAProviderTestData"));
		logger.info("LOLO = " + cell.getStringCellValue() + " has entered");

		// Enter SEAL Charges
		rrp.setsealcharges(getCellData(2, 7, "QAProviderTestData"));
		logger.info("SEAL Charges = " + cell.getStringCellValue() + " has entered");

		// Enter Terminal Handling Charge - Origin
		rrp.setterminalhandlingcharge(getCellData(2, 8, "QAProviderTestData"));
		logger.info("Terminal Handling Charge - Origin = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);
		
		// Object of Actions class to scroll up and down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);

		// Enter Rate Validity Start Date
		rrp.setratevaliditystartdate();
		logger.info("Rate Validity Start Date has entered");
		Thread.sleep(2000);

		// Enter Rate Validity End Date
		rrp.setratevalidityenddate();
		logger.info("Rate Validity End Date has entered");
		Thread.sleep(2000);

		// Select Customer Payment Terms

		String customerpaymentterms = getCellData(2, 9, "QAProviderTestData");
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
		bpp.setreferencenumber(getCellData(2, 18, "QACustomerTestData"));
		logger.info("Reference Number = " + cell.getStringCellValue() + " has entered");

		// Enter Shipping Instructions
		bpp.setshippinginstructions(getCellData(2, 19, "QACustomerTestData"));
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

		// Select SHIPPER NAME
		bdp.setshippername(getCellData(2, 20, "QACustomerTestData"));
		logger.info("Shipper Name = " + cell.getStringCellValue() + " has entered");

		// Save Shipper Information
		bdp.clicksaveshipperinfo();
		Thread.sleep(2000);
		logger.info("Shipper Information has added....");

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
		bdp.setmainconsigneename(getCellData(2, 26, "QACustomerTestData"));
		logger.info("Consignee Name = " + cell.getStringCellValue() + " has entered");

		// Save Consignee Information
		bdp.clicksaveconsigneeinfo2();
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

		// copying File path to Clipboard
		StringSelection str = new StringSelection(System.getProperty("user.dir") + "\\UploadFiles\\Document.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
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
		logger.info("Document has uploaded successfully!!!");
		Thread.sleep(2000);

		// Open Hash Move Provider Portal URL
		driver.get(qaproviderportalurl);
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

		// Upload Booking Confirmation Document (CRO/BC/SC)
		bdp.clickbookingconfirmationdocument();
		logger.info("Booking Confirmation Document (CRO/BC/SC) has clicked.");
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
		logger.info("Document has uploaded successfully!!!");
		Thread.sleep(5000);

		// Click Update Booking Status
		bdp.clickconfirmbookingyes();
		logger.info("Confirm Booking Yes button has clicked");
		Thread.sleep(1000);

		// Enter Shipment Details
		bdp.setshipmentdetails(getCellData(2, 10, "QAProviderTestData"));
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
		bdp.setdeparturedatemonthyear(getCellData(2, 11, "QAProviderTestData"));
		logger.info("Departure Date Month Year " + cell.getRawValue() + " has selected");

		bdp.setdeparturedateday(getCellData(2, 12, "QAProviderTestData"));
		logger.info("Departure Date Day " + cell.getRawValue()  + " has selected");

		// Set Arrival Date
		bdp.clickarrivalto();
		bdp.setarrivaldatemonthyear(getCellData(2, 13, "QAProviderTestData"));
		logger.info("Arrival Date Month Year has selected");

		bdp.setarrivaldateday(getCellData(2, 14, "QAProviderTestData"));
		logger.info("Arrival Date Day has selected");
		Thread.sleep(2000);

		// Enter Vessel Name
		bdp.setvesselname(getCellData(2, 15, "QAProviderTestData"));
		logger.info("Vessel Name = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Voyage Number
		bdp.setvoyagenumber(getCellData(2, 16, "QAProviderTestData"));
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

		// Enter Bill Number
		bdp.setbillnumber(getCellData(2, 18, "QAProviderTestData"));
		logger.info("Bill Number = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);
		
		// Object of Actions class to scroll up and down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		// Set BL Date
		bdp.clickbldate();
		bdp.setbldatemonthyear(getCellData(2, 19, "QAProviderTestData"));
		logger.info("BL Date Month Year has selected");
		

		bdp.setbldateday(getCellData(2, 20, "QAProviderTestData"));
		logger.info("BL Date Day has selected");
		Thread.sleep(1000);

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

		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Click Upload button
		bdp.clickupload3();
		logger.info("Document has uploaded successfully!!!");
		Thread.sleep(2000);

		// Click In-Transit Yes
		bdp.clickintransityes();
		logger.info("In-Transit Yes button has clicked");
		Thread.sleep(1000);

		// Enter Shipment Details In-Transit
		bdp.setshipmentdetailsintransit(getCellData(2, 21, "QAProviderTestData"));
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
		bdp.setshipmentstatus(getCellData(2, 22, "QAProviderTestData"));
		
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