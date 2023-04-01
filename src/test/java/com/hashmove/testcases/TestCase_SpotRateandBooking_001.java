package com.hashmove.testcases;

import java.io.File;
import java.io.IOException;
import java.util.Date;

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

//						********* TestCase_SpotRateandBooking_001 *********
//		Description: Verify that Customer should request Spot Rate and Book the Shipment

public class TestCase_SpotRateandBooking_001 extends BaseClass {

	@Test(priority = 0)
	public void verifyspotrateandbooking() throws InterruptedException, IOException

	{
		System.out.println("***************TestCase_SpotRateandBooking_001*******************");

		// Open Hash Move Customer Portal URL
		driver.get(baseUrl);

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

		// Enter User ID
		clp.setuserid(getCellData(1, 1, "TestData2"));
		logger.info("User ID = " + cell.getStringCellValue() + " has entered");

		// Enter Password
		clp.setpassword(getCellData(1, 2, "TestData2"));
		logger.info("Password = " + cell.getStringCellValue() + " has entered");

		// Click Login Now button
		clp.clickloginnow();
		logger.info("Login Now button has clicked!!!");

		// Capturing the screenshot
		Date d = new Date();
		String FileName = "screenshot" + d.toString().replace(" ", "_").replace(":", "") + ".png";
		System.out.println(FileName);
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\Dell PC\\eclipse-workspace\\HashMove\\ScreenShots\\" + FileName));

		// screenshot copied from buffer is saved at the mentioned path.

		System.out.println("The Screenshot is captured.");

		Thread.sleep(8000);

		// Select Sea Shipment - FCL
		String searchcategory = getCellData(1, 3, "TestData2");
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
		hp.setdate();
		logger.info("Cargo Readiness Date has selected");

		// Select Cargo Type
		hp.clickcargotypedropdown();
		Thread.sleep(1000);
		hp.setcargotype(getCellData(1, 4, "TestData2"));
		logger.info("Cargo Type = " + cell.getStringCellValue() + " has selected");
		Thread.sleep(1000);

		// Enter HS Code
		hp.sethscode(getCellData(1, 5, "TestData2"));
		logger.info("HS Code = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Cargo Description
		hp.setcargodescription(getCellData(1, 6, "TestData2"));
		logger.info("Cargo Description = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Select Pickup Location
		hp.clickpickuplocationdropdown();
		Thread.sleep(2000);
		hp.setpickuplocation(getCellData(1, 7, "TestData2"));
		logger.info("Pickup Location = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Port of Pickup
		hp.setportofpickup(getCellData(1, 8, "TestData2"));
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
		hp.setportofdelivery(getCellData(1, 10, "TestData2"));
		logger.info("Port of Delivery = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Select Container Size
		hp.clickcontainersizedropdown();
		Thread.sleep(2000);
		hp.setcontainersize(getCellData(1, 11, "TestData2"));
		logger.info("Container Size = " + cell.getStringCellValue() + " has selected");

		// Enter Quantity
		hp.setquantity(getCellData(1, 12, "TestData2"));
		logger.info("Quantity = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Weight
		hp.setweight(getCellData(1, 13, "TestData2"));
		logger.info("Weight = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

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
		driver.get("https://qahubpartner.hashmove.com/login");
		Thread.sleep(10000);

		// Enter User ID
		plp.setuserid(getCellData(1, 1, "TestData3"));
		logger.info("User ID = " + cell.getStringCellValue() + " has entered");

		// Enter Password
		plp.setpassword(getCellData(1, 2, "TestData3"));
		logger.info("Password = " + cell.getStringCellValue() + " has entered");

		// Click Login Now button
		plp.clickloginnow();
		logger.info("Login Now button has clicked!!!");
		Thread.sleep(5000);

		// Click Accept cookies button
		rrp.clickaccept();

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
		rrp.setshipingline(getCellData(1, 3, "TestData3"));
		logger.info("Shipping Line = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);

		// Enter Rate Per Container
		rrp.setratepercontainer(getCellData(1, 4, "TestData3"));
		logger.info("Rate Per Container = " + cell.getStringCellValue() + " has entered");

		// Enter Bill of Lading
		rrp.setbillofloading(getCellData(1, 5, "TestData3"));
		logger.info("Bill of Lading = " + cell.getStringCellValue() + " has entered");

		// Enter LOLO
		rrp.setlolo(getCellData(1, 6, "TestData3"));
		logger.info("LOLO = " + cell.getStringCellValue() + " has entered");

		// Enter SEAL Charges
		rrp.setsealcharges(getCellData(1, 7, "TestData3"));
		logger.info("SEAL Charges = " + cell.getStringCellValue() + " has entered");

		// Enter Terminal Handling Charge - Origin
		rrp.setterminalhandlingcharge(getCellData(1, 8, "TestData3"));
		logger.info("Terminal Handling Charge - Origin = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

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

		String customerpaymentterms = getCellData(1, 9, "TestData3");
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
		driver.get("https://qahubatco.hashmove.com/login");
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
		Thread.sleep(3000);

		// Click Next
		bpp.clicknext();
		logger.info("Next button has clicked!!!");
		Thread.sleep(2000);

		// Object of Actions class to scroll down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Enter Reference Number (optional)
		bpp.setreferencenumber(getCellData(1, 14, "TestData2"));
		logger.info("Reference Number = " + cell.getStringCellValue() + " has entered");

		// Enter Shipping Instructions
		bpp.setshippinginstructions(getCellData(1, 15, "TestData2"));
		logger.info("Shipping Instructions = " + cell.getStringCellValue() + " has entered");

		// Check Disclaimer
		bpp.selectdisclaimer();
		logger.info("Disclaimer has selected");

		// Click Accept cookies button
		rrp.clickaccept2();
		Thread.sleep(1000);

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
		Thread.sleep(2000);

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

		// Enter Consignee Name
		bdp.setconsigneename(getCellData(1, 16, "TestData2"));
		logger.info("Consignee Name = " + cell.getStringCellValue() + " has entered");

		// Enter Contact Person
		bdp.setcontactperson(getCellData(1, 17, "TestData2"));
		logger.info("Contact Person = " + cell.getStringCellValue() + " has entered");

		// Enter City
		bdp.setcity(getCellData(1, 18, "TestData2"));
		logger.info("City = " + cell.getStringCellValue() + " has entered");

		// Enter Contact Phone
		bdp.setcontactphone(getCellData(1, 19, "TestData2"));
		logger.info("Contact Phone = " + cell.getStringCellValue() + " has entered");

		// Enter Contact Email
		bdp.setcontactemail(getCellData(1, 20, "TestData2"));
		logger.info("Contact Email = " + cell.getStringCellValue() + " has entered");

		// Select and Enter Address
		bdp.clickaddressicon();
		Thread.sleep(1000);

		bdp.setconsigneepinaddress(getCellData(1, 21, "TestData2"));
		logger.info("Consignee Pin Address = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Click Submit
		bdp.clicksubmitconsigneeaddress();
		Thread.sleep(2000);

		// Enter Main Address
		bdp.setconsigneemainaddress(getCellData(1, 21, "TestData2"));
		logger.info("Consignee Main Address = " + cell.getStringCellValue() + " has entered");

		// Click Save Consignee info
		bdp.clicksaveconsigneeinfo();
		Thread.sleep(2000);

		// Select SHIPPER NAME
		bdp.setshippername(getCellData(1, 16, "TestData2"));
		logger.info("Shipper Name = " + cell.getStringCellValue() + " has entered");

		// Save Shipper Information
		bdp.clicksaveshipperinfo();
		Thread.sleep(2000);
		logger.info("Shipper Information has added....");

		// Add Consignee Information //

		// Click Add Consignee button
		bdp.clickaddconsignee();
		Thread.sleep(2000);

		// Enter Consignee Name
		bdp.setconsigneename2(getCellData(1, 17, "TestData2"));
		logger.info("Consignee Name = " + cell.getStringCellValue() + " has entered");

		// Enter Contact Person
		bdp.setcontactperson2(getCellData(1, 18, "TestData2"));
		logger.info("Contact Person = " + cell.getStringCellValue() + " has entered");

		// Enter City
		bdp.setcity(getCellData(1, 19, "TestData2"));
		logger.info("City = " + cell.getStringCellValue() + " has entered");

		// Enter Contact Phone
		bdp.setcontactphone(getCellData(1, 20, "TestData2"));
		logger.info("Contact Phone = " + cell.getStringCellValue() + " has entered");

		// Enter Contact Email
		bdp.setcontactemail(getCellData(1, 21, "TestData2"));
		logger.info("Contact Email = " + cell.getStringCellValue() + " has entered");

		// Select and Enter Address
		bdp.clickaddressicon();
		Thread.sleep(1000);

		bdp.setconsigneepinaddress(getCellData(1, 22, "TestData2"));
		logger.info("Consignee Pin Address = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Click Submit
		bdp.clicksubmitconsigneeaddress();
		Thread.sleep(2000);

		// Enter Main Address
		bdp.setconsigneemainaddress(getCellData(1, 22, "TestData2"));
		logger.info("Consignee Main Address = " + cell.getStringCellValue() + " has entered");

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

		// Select Consignee Name
		bdp.setconsigneename(getCellData(1, 17, "TestData2"));
		logger.info("Consignee Name = " + cell.getStringCellValue() + " has entered");

		// Save Consignee Information
		bdp.clicksaveshipperinfo();
		Thread.sleep(2000);
		logger.info("Consignee Information has added....");

	}

}