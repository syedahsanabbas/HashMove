package com.hashmove.testcases;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hashmove.pageobjects.AllBookingsPage;
import com.hashmove.pageobjects.BookingDetailPage;
import com.hashmove.pageobjects.BookingProcessPage;
import com.hashmove.pageobjects.BookingsPage;
import com.hashmove.pageobjects.DFFCustomerPage;
import com.hashmove.pageobjects.DashboardPage;
import com.hashmove.pageobjects.HomePage;
import com.hashmove.pageobjects.PartnerLoginPage;
import com.hashmove.pageobjects.ThankyouBookingPage;
import com.hashmove.utilities.ScreenRecorderUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;
import io.qameta.allure.*;

//						********* TC_QA_WarehousingRateandBooking_001 *********
//		Description: Verify that DFF Customer should request and Book the Warehouse when pallet Type = Standard

public class TC_QA_WarehousingRateandBooking_001 extends BaseClass {

	@Test(priority = 0)
	@Description("Verify that DFF Customer should request and Book the Warehouse when pallet Type = Standard")
	@Severity(SeverityLevel.CRITICAL)
	@Epic("EPWH-001")
	@Feature("Feature: Verify that DFF Customer should request and Book the Warehouse when pallet Type = Standard")
	@Story("Story: Warehouse Searching and Booking")
	public void verifywarehouserateandbooking() throws Exception

	{
		System.out.println("***************TC_QA_WarehousingRateandBooking_001*******************");

		// Start Recording
		ScreenRecorderUtil.startRecord("verifywarehouserateandbooking()");

		// Open Hash Move DFF Customer Portal URL
		driver.get(qadffcustomerportalurl);

		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "HashMove – Connecting World Logistics";
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		// Maximize current window
		driver.manage().window().maximize();
		logger.info("Hash Move Login page has opened");

		Thread.sleep(8000);

		HomePage hp = new HomePage(driver);
		DFFCustomerPage dcp = new DFFCustomerPage(driver);
		BookingProcessPage bpp = new BookingProcessPage(driver);
		BookingDetailPage bdp = new BookingDetailPage(driver);
		ThankyouBookingPage tybp = new ThankyouBookingPage(driver);
		PartnerLoginPage plp = new PartnerLoginPage(driver);
		DashboardPage dp = new DashboardPage(driver);
		AllBookingsPage abp = new AllBookingsPage(driver);
		BookingsPage bp = new BookingsPage(driver);
		// Click Accept cookies button
		dcp.clickaccept();
		logger.info("Accept cookies button has clicked");

		// Click Login link
		dcp.clicklogin();
		logger.info("Login link has clicked");

		// Enter User ID
		dcp.setuserid(getCellData(1, 1, "QAWarehousing-DFF"));
		logger.info("User ID = " + cell.getStringCellValue() + " has entered");

		// Enter Password
		dcp.setpassword(getCellData(1, 2, "QAWarehousing-DFF"));
		logger.info("Password = " + cell.getStringCellValue() + " has entered");

		// Click Login Now button
		dcp.clickloginnow();
		logger.info("Login Now button has clicked!!!");

		Thread.sleep(3000);

		// Select Warehousing
		String searchcategory = getCellData(1, 3, "QAWarehousing-DFF");
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

			dcp.clickwarehousing();
			logger.info("Warehousing has selected");
			Thread.sleep(2000);
		}

		else if (searchcategory.equals("Truck - FTL")) {

			logger.info("Truck - FTL has selected");

		} else {

			System.out.println("Statement outside if...else block");

		}

		// Select Storage
		dcp.clickstoragedropdown();
		dcp.setstorage(getCellData(1, 4, "QAWarehousing-DFF"));
		logger.info("Storage = " + cell.getStringCellValue() + " has selected");
		Thread.sleep(1000);

		// Enter City
		dcp.setcity(getCellData(1, 5, "QAWarehousing-DFF"));
		logger.info("City = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Select Rent From
		dcp.clickrentfrom();

		dcp.setrentfrommonthyear(getFormulaMonthYearDateAsString(2, 6, "QAWarehousing-DFF"));
		dcp.setrentfromday(getFormulaDayDateAsString(2, 7, "QAWarehousing-DFF"));
		Thread.sleep(1000);

		// Select Rent Until
		dcp.clickrentuntil();

		dcp.setrentuntilmonthyear(getFormulaMonthYearDateAsString(2, 8, "QAWarehousing-DFF"));
		dcp.setrentuntilday(getFormulaDayDateAsString(2, 9, "QAWarehousing-DFF"));
		Thread.sleep(1000);

		// Select Storage Type
		String storagetype = getCellData(1, 10, "QAWarehousing-DFF");
		System.out.println("Storage Type : " + storagetype);

		if (storagetype.equals("A/C Storage")) {

			dcp.clickacstorage();
			logger.info("A/C Storage has selected....");

		} else if (storagetype.equals("Dry Storage")) {
			dcp.clickdrystorage();
			logger.info("Dry Storage has selected");

		}

		else if (storagetype.equals("Chilled Storage")) {
			dcp.clickchilledstorage();
			logger.info("Chilled Storage has selected");

		}

		else if (storagetype.equals("Frozen Storage")) {
			dcp.clickfrozenstorage();
			logger.info("Frozen Storage has selected");

		}

		else {

			System.out.println("Statement outside if...else block");

		}

		// Select By Pallet or By Area
		String by = getCellData(1, 11, "QAWarehousing-DFF");
		System.out.println("By : " + by);

		if (by.equals("BY PALLET")) {

			dcp.clickbypallet();
			logger.info("BY PALLET tab has selected....");

		} else if (by.equals("BY AREA")) {
			dcp.clickbyarea();
			logger.info("BY AREA tab has selected");

		}

		else {

			System.out.println("Statement outside if...else block");

		}

		// Select Pallet Type
		String pallettype = getCellData(1, 12, "QAWarehousing-DFF");
		System.out.println("Pallet Type : " + pallettype);

		if (pallettype.equals("STANDARD SIZE")) {

			dcp.clickstandardsize();
			logger.info("STANDARD SIZE pallet has selected....");
			Thread.sleep(2000);
			// Quantity has entered
			dcp.setquantitystandard(getCellData(1, 13, "QAWarehousing-DFF"));
			logger.info("Quantity " + cell.getStringCellValue() + " has entered");
			// Enter Weight
			dcp.setweightperpalletstandard(getCellData(1, 14, "QAWarehousing-DFF"));
			logger.info("Weight " + cell.getStringCellValue() + " has entered");
			Thread.sleep(2000);
			// Click Add
			dcp.clickaddstandard();
			logger.info("STANDARD SIZE pallet has added");
			// Click X button
			dcp.clickclosestandardcard();
			logger.info("STANDARD SIZE pallet card has closed");

		} else if (pallettype.equals("EUROPEAN SIZE")) {
			dcp.clickeuropeansize();
			logger.info("EUROPEAN SIZE pallet has selected");
			Thread.sleep(2000);
			// Quantity has entered
			dcp.setquantityeuropean(getCellData(1, 13, "QAWarehousing-DFF"));
			logger.info("Quantity " + cell.getStringCellValue() + " has entered");
			// Enter Weight
			dcp.setweightperpalleteuropean(getCellData(1, 14, "QAWarehousing-DFF"));
			logger.info("Weight " + cell.getStringCellValue() + " has entered");
			Thread.sleep(2000);
			// Click Add
			dcp.clickaddeuropean();
			logger.info("EUROPEAN SIZE pallet has added");
			Thread.sleep(2000);
			dcp.clickcloseeuropeancard();
			logger.info("EUROPEAN SIZE pallet card has closed");
		}

		else if (pallettype.equals("CHEP")) {
			dcp.clickchepsize();
			logger.info("CHEP pallet has selected");
			Thread.sleep(2000);
			// Quantity has entered
			dcp.setquantitychep(getCellData(1, 13, "QAWarehousing-DFF"));
			logger.info("Quantity " + cell.getStringCellValue() + " has entered");
			// Enter Weight
			dcp.setweightperpalletchep(getCellData(1, 14, "QAWarehousing-DFF"));
			logger.info("Weight " + cell.getStringCellValue() + " has entered");
			Thread.sleep(2000);
			dcp.clickaddchep();
			logger.info("CHEP SIZE pallet has added");
			Thread.sleep(2000);
			dcp.clickclosechepcard();
			logger.info("CHEP pallet card has closed");

		}

		else {

			System.out.println("Statement outside if...else block");

		}

		// Click Find Best Rates
		dcp.clickfindbestrates();
		Thread.sleep(8000);

		// Select Currency = US Dollar ( USD )
		dcp.clickcurrency();

		dcp.setcurrency(getCellData(1, 15, "QAWarehousing-DFF"));
		logger.info("Currency " + cell.getStringCellValue() + " has selected");
		Thread.sleep(2000);

		// Click Proceed button
		dcp.clickproceed();
		Thread.sleep(10000);

		// Object of Actions class to scroll up and down
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Select CUSTOM CLEARANCE
		String customclearance = getCellData(1, 16, "QAWarehousing-DFF");
		System.out.println("Custom Clearance : " + customclearance);

		if (customclearance.equals("Yes")) {

			bpp.selectcustomclearance();
			logger.info("Custom Clearance has toggle on....");
			Thread.sleep(2000);

			String expectedport = getCellData(1, 17, "QAWarehousing-DFF");
			String actualport = bpp.getportname();
			System.out.println("Actual Port Name: " + actualport);
			System.out.println("Expected Port Name: " + expectedport);

			Assert.assertEquals(actualport, expectedport, "Port Name is not as Expected!!!");

			// Select Container Size
			bpp.clickcontainersizedropdown();
			bpp.setcontainersize(getCellData(1, 18, "QAWarehousing-DFF"));
			logger.info("Container Size: " + cell.getStringCellValue() + " has selected");

			// Enter Quantity
			bpp.setcontainerquantity(getCellData(1, 19, "QAWarehousing-DFF"));
			logger.info("Quantity : " + cell.getStringCellValue() + " has entered");

			// Click Add button
			bpp.clickaddcustomclearance();
			logger.info("Add Custom Clearance button has clicked...");
			Thread.sleep(2000);

		} else if (customclearance.equals("No")) {

			logger.info("Custom Clearance has toggle off....");

		}

		else {

			System.out.println("Statement outside if...else block");

		}

		// Select INSURANCE SERVICES

		String insuranceservices = getCellData(1, 20, "QAWarehousing-DFF");
		System.out.println("Insurance Services : " + customclearance);

		if (insuranceservices.equals("Yes")) {
			bpp.selectinsuranceservices();
			logger.info("Insurance Services has toggle on....");
			Thread.sleep(3000);

			// Enter VALUE OF GOODS
			bpp.setvalueofgoods(getCellData(1, 21, "QAWarehousing-DFF"));
			logger.info("VALUE OF GOODS : " + cell.getStringCellValue() + " has entered");
			Thread.sleep(3000);

		} else if (insuranceservices.equals("No")) {

			logger.info("Insurance Services has toggle off....");

		}

		else {

			System.out.println("Statement outside if...else block");

		}

		// Add Assertion on Warehouse Charges
		String expectedwarehousecharges = getCellData(1, 22, "QAWarehousing-DFF");
		String actualwarehousecharges = bpp.getwarehousecharges();
		System.out.println("Actual Warehouse Charges : " + actualwarehousecharges);
		System.out.println("Expected Warehouse Charges : " + expectedwarehousecharges);
		Assert.assertEquals(actualwarehousecharges, expectedwarehousecharges,
				"Warehouse Charges Rates is not as Expected!!!");

		// Add Assertion on Custom Clearance
		String expectedcustomclearancerate = getCellData(1, 23, "QAWarehousing-DFF");
		String actualcustomclearancerate = bpp.getcustomclearancerate();
		System.out.println("Actual Custom Clearance Rate : " + actualcustomclearancerate);
		System.out.println("Expected Custom Clearance Rate : " + expectedcustomclearancerate);

		Assert.assertEquals(actualcustomclearancerate, expectedcustomclearancerate,
				"Custom Clearance Container Rates is not as Expected!!!");

		// Add Assertion on Insurance Premium
		String expectedinsurancepremium = getCellData(1, 24, "QAWarehousing-DFF");
		String actualinsurancepremium = bpp.getinsurancepremium();
		System.out.println("Actual Insurance Premium : " + actualinsurancepremium);
		System.out.println("Expected Insurance Premium : " + expectedinsurancepremium);

		Assert.assertEquals(actualinsurancepremium, expectedinsurancepremium,
				"Insurance Premium is not as Expected!!!");

		// Add Assertion on GROSS TOTAL
		String expectedgrosstotal = getCellData(1, 25, "QAWarehousing-DFF");
		String actualgrosstotal = bpp.getgrosstotal();
		System.out.println("ACTUAL GROSS TOTAL : " + actualgrosstotal);
		System.out.println("EXPECTED GROSS TOTAL : " + expectedgrosstotal);
		Assert.assertEquals(actualgrosstotal, expectedgrosstotal, "GROSS TOTAL is not as Expected!!!");

		// Add Assertion on VALUE ADDED TAX ( VAT )
		String expectedvat = getCellData(1, 26, "QAWarehousing-DFF");
		String actualvat = bpp.getvat();
		System.out.println("ACTUAL VALUE ADDED TAX ( VAT ) : " + actualvat);
		System.out.println("EXPECTED VALUE ADDED TAX ( VAT ) : " + expectedvat);
		Assert.assertEquals(actualvat, expectedvat, "VALUE ADDED TAX ( VAT ) is not as Expected!!!");

		// Add Assertion on NET TOTAL
		String expectednettotal = getCellData(1, 27, "QAWarehousing-DFF");
		String actualnettotal = bpp.getnettotal();
		System.out.println("ACTUAL NET TOTAL : " + actualnettotal);
		System.out.println("EXPECTED NET TOTAL : " + expectednettotal);
		Assert.assertEquals(actualnettotal, expectednettotal, "NET TOTAL is not as Expected!!!");

		// Select I accept terms & conditions

		bpp.selectiaccepttermsandconditions();
		logger.info("I accept terms & conditions has toggle on....");
		Thread.sleep(2000);

		// Click Book & Pay button
		bpp.clickbookandpay();
		logger.info("Book & Pay button has clicked....");
		Thread.sleep(8000);

		// Get Booking Number
		String bookingnumbertext = tybp.getbookingnumberforwarehouse();
		System.out.println("Booking Number Text : " + bookingnumbertext);

		// Scroll Down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Add Assertion on TOTAL (PAYABLE)
		String expectedtotalpayable = getCellData(1, 28, "QAWarehousing-DFF");
		String actualtotalpayable = tybp.gettotalpayable();
		System.out.println("ACTUAL TOTAL (PAYABLE) : " + actualtotalpayable);
		System.out.println("EXPECTED TOTAL (PAYABLE) : " + expectedtotalpayable);
		Assert.assertEquals(actualtotalpayable, expectedtotalpayable, "TOTAL (PAYABLE) is not as Expected!!!");

		// Click View Bookings
		tybp.clickviewbooking();
		logger.info("View Bookings link has clicked....");
		Thread.sleep(8000);

		// Click View Summary link
		bdp.clickviewsummary();
		logger.info("View Summary link has clicked....");
		Thread.sleep(3000);

		// Add Assertion on VIEW BILLING SUMMARY

		// Add Assertion on Warehouse Charges
		String expectedwarehousechargesonviewsummary = getCellData(1, 22, "QAWarehousing-DFF");
		String actualwarehousechargesonviewsummary = bdp.getwarehousechargesonviewsummary();
		System.out.println("Actual Warehouse Charges  : " + actualwarehousechargesonviewsummary);
		System.out.println("Expected Warehouse Charges : " + expectedwarehousechargesonviewsummary);
		Assert.assertEquals(actualwarehousechargesonviewsummary, expectedwarehousechargesonviewsummary,
				"Warehouse Charges Rates is not as Expected!!!");

		// Add Assertion on NET TOTAL
		String expectednettotalonviewsummary = getCellData(1, 27, "QAWarehousing-DFF");
		String actualnettotalonviewsummary = bdp.getnettotalonviewsummary();
		System.out.println("ACTUAL NET TOTAL ON VIEW SUMMARY : " + actualnettotalonviewsummary);
		System.out.println("EXPECTED NET TOTAL ON VIEW SUMMARY : " + expectednettotalonviewsummary);
		Assert.assertEquals(actualnettotalonviewsummary, expectednettotalonviewsummary,
				"NET TOTAL on View Summary is not as Expected!!!");

		// Close View Summary
		bdp.clickcloseviewsummary();
		logger.info("View Summary Close button has clicked....");
		Thread.sleep(2000);

		// Open Hash Move DFF Provider Portal URL
		driver.get(qaproviderportalurl);

		String ActualTitle2 = driver.getTitle();
		String ExpectedTitle2 = "HashMove – Connecting World Logistics";
		Assert.assertEquals(ExpectedTitle2, ActualTitle2);

		// Maximize current window
		driver.manage().window().maximize();
		logger.info("Hash Move Provider Portal has opened");

		Thread.sleep(8000);

		// Click Accept cookies button
		plp.clickaccept();
		logger.info("Accept cookies button has clicked");

		// Enter User ID
		plp.setuserid(getCellData(1, 1, "QAWarehousing-Provider"));
		logger.info("User ID = " + cell.getStringCellValue() + " has entered");

		// Enter Password
		plp.setpassword(getCellData(1, 2, "QAWarehousing-Provider"));
		logger.info("Password = " + cell.getStringCellValue() + " has entered");

		// Click Login Now button
		plp.clickloginnow();
		logger.info("Login Now button has clicked!!!");

		Thread.sleep(5000);

		// Click Booking Menu
		dp.clickbookingsleftmenu();
		logger.info("Booking Menu has clicked!!!");
		Thread.sleep(15000);

		// Search the Booking
		abp.clickfilteryourresult();
		logger.info("Click filter request link has clicked!!!");
		Thread.sleep(3000);

		// Enter Booking Number
		abp.setbookingnumber(bookingnumbertext);
		logger.info("Booking Number has entered!!!");
		Thread.sleep(1000);

		// Object of Actions class to scroll up and down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Click Filter Records button
		abp.clickfilterrecords();
		logger.info("Filter Records button has clicked!!!");
		Thread.sleep(2000);

		// Scroll Down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Click Booking Number link
		abp.clickbookingnumberlink();
		Thread.sleep(2000);

		// Click Update Status Link
		bdp.clickupdatestatus();
		Thread.sleep(2000);

		// Select Shipment Status
		bdp.clickshipmentstatusdropdown();
		Thread.sleep(2000);
		bdp.setshipmentstatus(getCellData(1, 3, "QAWarehousing-Provider"));
		logger.info("Shipment Status = " + cell.getStringCellValue() + " has selected");
		Thread.sleep(2000);

		// Enter Shipment Details
		bdp.setshipmentdetails(getCellData(1, 4, "QAWarehousing-Provider"));
		logger.info("Shipment Details = " + cell.getStringCellValue() + " has entered");

		// Click Submit button
		bdp.clicksubmit();
		logger.info("Submit button has clicked....");
		Thread.sleep(5000);

		// Open Hash Move DFF Customer Portal URL
		driver.get(qadffcustomerportalurl);
		logger.info("Hash Move DFF Customer Portal URL has opened....");
		Thread.sleep(5000);

		// Click Options Drop down
		dcp.clickoptionsdropdown();
		logger.info("Options Dropdown has clicked!!!");
		Thread.sleep(2000);

		// Click Bookings link
		dcp.clickbookingslink();
		logger.info("Bookings option has clicked!!!");
		Thread.sleep(8000);

		// Search the Booking
		bp.clickfilteryourresult();
		logger.info("Click filter request link has clicked!!!");
		Thread.sleep(3000);

		// Enter Booking Number
		bp.setbookingnumber(bookingnumbertext);
		logger.info("Booking Number has entered!!!");
		Thread.sleep(1000);

		// Object of Actions class to scroll up and down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Click Filter Records button
		bp.clickfilterrecords();
		logger.info("Filter Records button has clicked!!!");
		Thread.sleep(2000);

		// Scroll Down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Click Booking Number link
		bp.clickbookingnumberlink();
		logger.info("Booking Number has clicked....");
		Thread.sleep(2000);

		// Scroll Down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Click Add Services
		bdp.clickaddservice();
		logger.info("Add Services button has clicked....");
		Thread.sleep(2000);

		// Click In bound Service
		bdp.clickinboundshipment();
		logger.info("In bound Service has clicked....");
		Thread.sleep(2000);

		// Enter Reference Number
		bdp.setreferencenumber(getCellData(1, 29, "QAWarehousing-DFF"));
		logger.info("Reference Number = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Select Truck Category
		bdp.clicktruckcategorydropdown();
		Thread.sleep(2000);
		bdp.settruckcategory(getCellData(1, 30, "QAWarehousing-DFF"));
		logger.info("Truck Category = " + cell.getStringCellValue() + " has selected");

		// Select Truck Type
		bdp.clicktrucktypedropdown();
		Thread.sleep(2000);
		bdp.settrucktype(getCellData(1, 31, "QAWarehousing-DFF"));
		logger.info("Truck Type = " + cell.getStringCellValue() + " has selected");

		// Enter Truck Reg Number
		bdp.settruckregnumber(getCellData(1, 32, "QAWarehousing-DFF"));
		logger.info("Truck Reg Number = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Enter Remarks
		bdp.setremarks(getCellData(1, 33, "QAWarehousing-DFF"));
		logger.info("Remarks = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Add SKU
		bdp.clickaddsku();
		logger.info("Add SKU button has clicked....");
		Thread.sleep(2000);

		// Enter YOUR SKU CODE
		String yourskucode = bdp.setyourskucode(getCellData(1, 34, "QAWarehousing-DFF") + bdp.getSaltString());
		logger.info("YOUR SKU CODE = " + yourskucode + " has entered");

		// Enter SKU DESCRIPTION
		String yourskudescription = bdp
				.setskudescription(getCellData(1, 35, "QAWarehousing-DFF") + bdp.getSaltString());
		logger.info("SKU DESCRIPTION = " + yourskudescription + " has entered");
		Thread.sleep(1000);

		// Enter HS Code
		bdp.sethscode(getCellData(1, 36, "QAWarehousing-DFF"));
		logger.info("HS Code = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Select UOM
		bdp.clickuomdropdown();
		Thread.sleep(2000);
		bdp.setuom(getCellData(1, 37, "QAWarehousing-DFF"));
		logger.info("UOM = " + cell.getStringCellValue() + " has selected");

		// Select WEIGHT UOM
		bdp.clickweightuomdropdown();
		Thread.sleep(2000);
		bdp.setweightuom(getCellData(1, 38, "QAWarehousing-DFF"));
		logger.info("WEIGHT UOM = " + cell.getStringCellValue() + " has selected");

		// Enter GROSS WEIGHT
		bdp.setgrossweight(getCellData(1, 39, "QAWarehousing-DFF"));
		logger.info("GROSS WEIGHT = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Enter NET WEIGHT
		bdp.setnetweight(getCellData(1, 40, "QAWarehousing-DFF"));
		logger.info("NET WEIGHT = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Select PACKAGE TYPE
		bdp.clickpackagetypedropdown();
		Thread.sleep(2000);
		bdp.setpackagetype(getCellData(1, 41, "QAWarehousing-DFF"));
		logger.info("PACKAGE TYPE ( WHAT'S ON PALLET? ) = " + cell.getStringCellValue() + " has selected");

		// Enter UOM / PACKAGE
		bdp.setuomperpackage(getCellData(1, 42, "QAWarehousing-DFF"));
		logger.info("UOM / PACKAGE = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Select PALLET TYPE
		bdp.clickpallettypedropdown();
		Thread.sleep(2000);
		bdp.setpallettype(getCellData(1, 43, "QAWarehousing-DFF"));
		logger.info("PALLET TYPE= " + cell.getStringCellValue() + " has selected");

		// Enter PACKAGE / PALLET
		bdp.setpackageperpallet(getCellData(1, 44, "QAWarehousing-DFF"));
		logger.info("PACKAGE / PALLET = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Enter TOTAL PALLET QTY
		bdp.settotalpalletqty(getCellData(1, 45, "QAWarehousing-DFF"));
		logger.info("TOTAL PALLET QTY = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Add Assertion on TOTAL PACKAGE QTY
		String expectedtotalpackageqty = getCellData(1, 46, "QAWarehousing-DFF");
		String actualtotalpackageqty = bdp.gettotalpackageqty();
		System.out.println("Actual TOTAL PACKAGE QTY : " + actualtotalpackageqty);
		Assert.assertEquals(actualtotalpackageqty, expectedtotalpackageqty, "TOTAL PACKAGE QTY is not as Expected!!!");

		// Add Assertion on TOTAL UOM QTY
		String expectedtotaluomqty = getCellData(1, 47, "QAWarehousing-DFF");
		String actualtotaluomeqty = bdp.gettotaluomqty();
		System.out.println("Actual TOTAL UOM QTY : " + actualtotalpackageqty);
		Assert.assertEquals(actualtotaluomeqty, expectedtotaluomqty, "TOTAL UOM QTY is not as Expected!!!");

		// Select Do you want to add batch number for this sku?
		String addbatchnumber = getCellData(1, 48, "QAWarehousing-DFF");
		System.out.println("Batch Number toggle : " + addbatchnumber);

		if (addbatchnumber.equals("Yes")) {

			bdp.selectbatchnumber();
			logger.info("Do you want to add batch number for this sku? toggle has swtich on....");
			Thread.sleep(2000);

			// Enter BATCH NUMBER
			String batchnumber = bdp.setbatchnumber(getCellData(1, 49, "QAWarehousing-DFF") + bdp.getSaltString());
			logger.info("BATCH NUMBER = " + batchnumber + " has entered");

			// Select PRODUCTION DATE
			bdp.clickproductiondate();
			Thread.sleep(2000);
			bdp.setproductionmonthyear(getFormulaMonthYearDateAsString(1, 50, "QAWarehousing-DFF"));
			bdp.setproductionday(getFormulaDayDateAsString(1, 51, "QAWarehousing-DFF"));
			Thread.sleep(1000);

			// Select EXPIRY DATE
			bdp.clickexpirydate();
			Thread.sleep(2000);
			bdp.setexpirymonthyear(getFormulaMonthYearDateAsString(1, 52, "QAWarehousing-DFF"));
			bdp.setexpiryday(getFormulaDayDateAsString(1, 53, "QAWarehousing-DFF"));
			Thread.sleep(1000);

		} else if (addbatchnumber.equals("No")) {

			logger.info("Do you want to add batch number for this sku? toggle has swtich off....");

		}

		else {

			System.out.println("Statement outside if...else block");

		}

		// Click Submit
		bdp.clicksubmitsku();
		logger.info("Submit button has clicked....");
		Thread.sleep(2000);

		// Add Assertion on TOTAL AMOUNT in SKU Details grid
		String expectedtotalamountinskudetailsgrid = getCellData(1, 54, "QAWarehousing-DFF");
		String actualtotalamountinskudetailsgrid = bdp.gettotalamountinskudetailsgrid();
		System.out.println("Actual TOTAL AMOUNT in SKU Details grid : " + actualtotalamountinskudetailsgrid);
		System.out.println("Expected TOTAL AMOUNT in SKU Details grid : " + expectedtotalamountinskudetailsgrid);
		Assert.assertEquals(actualtotalamountinskudetailsgrid, expectedtotalamountinskudetailsgrid,
				"TOTAL AMOUNT in SKU Details grid is not as Expected!!!");

		// Scroll Down
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);

		// Click Services Details
		bdp.clickservicesdetails();
		logger.info("Services Details tab has clicked....");
		Thread.sleep(5000);

		// Select Toggle button based on Services
		bdp.selectservice(getCellData(1, 55, "QAWarehousing-DFF"));
		Thread.sleep(3000);

		// Add Assertion on EMPTY WOODEN PALLETS VALUE EXCLUDING VAT
		String expectedemptywoodenpalletsvalueexcludingvat = getCellData(1, 56, "QAWarehousing-DFF");
		String actualemptywoodenpalletsvalueexcludingvat = bdp
				.getemptywoodenpalletsvalueexcludingvat(getCellData(1, 55, "QAWarehousing-DFF"));
		System.out.println(
				"ACTUAL EMPTY WOODEN PALLETS VALUE EXCLUDING VAT : " + actualemptywoodenpalletsvalueexcludingvat);
		System.out.println(
				"EXPECTED EMPTY WOODEN PALLETS VALUE EXCLUDING VAT : " + expectedemptywoodenpalletsvalueexcludingvat);
		Assert.assertEquals(actualemptywoodenpalletsvalueexcludingvat, expectedemptywoodenpalletsvalueexcludingvat,
				"EMPTY WOODEN PALLETS VALUE EXCLUDING VAT is not as Expected!!!");

		// Add Assertion on RECEIVING BY PALLET VALUE EXCLUDING VAT
		String expectedrecevingbypalletsvalueexcludingvat = getCellData(1, 58, "QAWarehousing-DFF");
		String actualrecevingbypalletsvalueexcludingvat = bdp
				.getemptywoodenpalletsvalueexcludingvat(getCellData(1, 57, "QAWarehousing-DFF"));
		System.out.println(
				"ACTUAL RECEIVING BY PALLET VALUE EXCLUDING VAT : " + actualrecevingbypalletsvalueexcludingvat);
		System.out.println(
				"EXPECTED RECEIVING BY PALLET VALUE EXCLUDING VAT : " + expectedrecevingbypalletsvalueexcludingvat);
		Assert.assertEquals(actualrecevingbypalletsvalueexcludingvat, expectedrecevingbypalletsvalueexcludingvat,
				"EMPTY WOODEN PALLETS VALUE EXCLUDING VAT is not as Expected!!!");

		// Click Submit Shipment
		bdp.clickinboundsubmitshipment();
		logger.info("Submit Shipment button has clicked....");
		Thread.sleep(2000);

		// Add Assertion on NET TOTAL on In bound Shipment
		String expectednettotaloninboundshipment = getCellData(1, 59, "QAWarehousing-DFF");
		String actualnettotaloninboundshipment = bdp.getnettotaloninboundshipment();
		System.out.println("ACTUAL NET TOTAL on In bound Shipment : " + actualnettotaloninboundshipment);
		System.out.println("EXPECTED NET TOTAL on In bound Shipment : " + expectednettotaloninboundshipment);
		Assert.assertEquals(actualnettotaloninboundshipment, expectednettotaloninboundshipment,
				"NET TOTAL on In bound Shipment is not as Expected!!!");

		// Click Book & Pay button
		bdp.clickbookandpay();
		logger.info("Book & Pay button has clicked....");
		Thread.sleep(2000);

		// Scroll Down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		// Click Add Services
		bdp.clickaddservice2();
		logger.info("Add Services button has clicked....");
		Thread.sleep(2000);

		// Click Out bound Service
		bdp.clickoutboundshipment();
		logger.info("Out bound Service has clicked....");
		Thread.sleep(2000);

		// Enter Reference Number
		bdp.setreferencenumber2(getCellData(1, 60, "QAWarehousing-DFF"));
		logger.info("Reference Number = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Select Truck Category
		bdp.clicktruckcategorydropdown2();
		Thread.sleep(2000);
		bdp.settruckcategory2(getCellData(1, 61, "QAWarehousing-DFF"));
		logger.info("Truck Category = " + cell.getStringCellValue() + " has selected");

		// Select Truck Type
		bdp.clicktrucktypedropdown2();
		Thread.sleep(2000);
		bdp.settrucktype2(getCellData(1, 62, "QAWarehousing-DFF"));
		logger.info("Truck Type = " + cell.getStringCellValue() + " has selected");

		// Enter Truck Reg Number
		bdp.settruckregnumber2(getCellData(1, 63, "QAWarehousing-DFF"));
		logger.info("Truck Reg Number = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Click Delivery Address Pin Location
		bdp.clickdeliveryaddresspinlocation();
		logger.info("Delivery Address Pin Location has clicked....");
		Thread.sleep(2000);

		// Enter Pin Address
		bdp.setpinaddress(getCellData(1, 64, "QAWarehousing-DFF"));
		logger.info("Pin Address = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Click Submit button
		bdp.clicksubmitpinaddress();
		logger.info("Submit button has clicked....");
		Thread.sleep(2000);

		// Enter Main Delivery Address
		bdp.setmaindeliveryaddress(getCellData(1, 64, "QAWarehousing-DFF"));
		logger.info("Main Delivery Address = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Remarks
		bdp.setremarks2(getCellData(1, 65, "QAWarehousing-DFF"));
		logger.info("Remarks = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Click Add SKU
		bdp.clickaddsku2();
		logger.info("Add SKU button has clicked....");
		Thread.sleep(2000);

		// Enter YOUR SKU CODE
		bdp.setyourskucode2(yourskucode);
		logger.info("YOUR SKU CODE = " + yourskucode + " has entered");
		Thread.sleep(2000);

		// Select By Pallet or By Package
		String By = getCellData(1, 66, "QAWarehousing-DFF");
		System.out.println("Toggle is switch on for : " + By);

		if (By.equals("By Pallet")) {

			bdp.selectbypallet();
			logger.info("By Pallet toggle has swtich on....");
			Thread.sleep(2000);

			// Enter TOTAL PALLET QTY
			bdp.settotalpalletqty2(getCellData(1, 67, "QAWarehousing-DFF"));
			logger.info("TOTAL PALLET QTY = " + cell.getStringCellValue() + " has entered");
			Thread.sleep(1000);

		} else if (By.equals("By Package")) {

			logger.info("Toggle is switch on for : " + By);
			bdp.selectbypackage();
			logger.info("By Package toggle has swtich on....");
			Thread.sleep(2000);

			// Enter TOTAL PACKAGE QTY
			bdp.settotalpackageqty(getCellData(1, 68, "QAWarehousing-DFF"));
			logger.info("TOTAL PACKAGE QTY = " + cell.getStringCellValue() + " has entered");
			Thread.sleep(1000);
		}

		else {

			System.out.println("Statement outside if...else block");

		}

		// Click Submit on Out bound
		bdp.clicksubmitoutbound();
		logger.info("Submit button has clicked on Outbound....");
		Thread.sleep(2000);

		// Add Assertion on TOTAL AMOUNT in SKU Details grid
		String expectedtotalamountinskudetailsgrid2 = getCellData(1, 70, "QAWarehousing-DFF");
		String actualtotalamountinskudetailsgrid2 = bdp.gettotalamountinskudetailsgrid2();
		System.out.println("Actual TOTAL AMOUNT in SKU Details grid : " + actualtotalamountinskudetailsgrid2);
		System.out.println("Expected TOTAL AMOUNT in SKU Details grid : " + expectedtotalamountinskudetailsgrid2);
		Assert.assertEquals(actualtotalamountinskudetailsgrid2, expectedtotalamountinskudetailsgrid2,
				"TOTAL AMOUNT in SKU Details grid is not as Expected!!!");

		// Click Out bound Services Details
		bdp.clickoutboundservicesdetails();
		logger.info("Services Details tab has clicked....");
		Thread.sleep(3000);

		// Select Toggle button based on Services Details
		bdp.selectservice(getCellData(1, 71, "QAWarehousing-DFF"));
		Thread.sleep(3000);

		// Add Assertion on EMPTY WOODEN PALLETS VALUE EXCLUDING VAT
		String expectedemptywoodenpalletsvalueexcludingvat2 = getCellData(1, 72, "QAWarehousing-DFF");
		String actualemptywoodenpalletsvalueexcludingvat2 = bdp
				.getemptywoodenpalletsvalueexcludingvat2(getCellData(1, 71, "QAWarehousing-DFF"));
		System.out.println(
				"ACTUAL EMPTY WOODEN PALLETS VALUE EXCLUDING VAT : " + actualemptywoodenpalletsvalueexcludingvat2);
		System.out.println(
				"EXPECTED EMPTY WOODEN PALLETS VALUE EXCLUDING VAT : " + expectedemptywoodenpalletsvalueexcludingvat2);
		Assert.assertEquals(actualemptywoodenpalletsvalueexcludingvat2, expectedemptywoodenpalletsvalueexcludingvat2,
				"EMPTY WOODEN PALLETS VALUE EXCLUDING VAT is not as Expected!!!");

		// Add Assertion on DISPATCHING BY PALLET VALUE EXCLUDING VAT
		String expecteddispatchingbypalletvalueexcludingvat = getCellData(1, 74, "QAWarehousing-DFF");
		String actualdispatchingbypalletvalueexcludingvat = bdp
				.getdispatchingbypalletvalueexcludingvat(getCellData(1, 73, "QAWarehousing-DFF"));
		System.out.println(
				"ACTUAL DISPATCHING BY PALLET VALUE EXCLUDING VAT : " + actualdispatchingbypalletvalueexcludingvat);
		System.out.println(
				"EXPECTED DISPATCHING BY PALLET VALUE EXCLUDING VAT : " + expecteddispatchingbypalletvalueexcludingvat);
		Assert.assertEquals(actualdispatchingbypalletvalueexcludingvat, expecteddispatchingbypalletvalueexcludingvat,
				"DISPATCHING BY PALLET VALUE EXCLUDING VAT is not as Expected!!!");

		// Scroll Up
		a.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);

		// Click Submit Shipment on Out bound Shipment
		bdp.clickoutboundsubmitshipment();
		logger.info("Submit Shipment button has clicked....");
		Thread.sleep(2000);

		// Add Assertion on NET TOTAL on Out bound Shipment
		String expectednettotalonoutboundshipment = getCellData(1, 75, "QAWarehousing-DFF");
		String actualnettotalonoutboundshipment = bdp.getnettotaloninboundshipment();
		System.out.println("ACTUAL NET TOTAL on Out bound Shipment : " + actualnettotalonoutboundshipment);
		System.out.println("EXPECTED NET TOTAL on Out bound Shipment : " + expectednettotalonoutboundshipment);
		Assert.assertEquals(actualnettotalonoutboundshipment, expectednettotalonoutboundshipment,
				"NET TOTAL on Out bound Shipment is not as Expected!!!");

		// Click Book & Pay button
		bdp.clickbookandpay2();
		logger.info("Book & Pay button has clicked....");
		Thread.sleep(2000);

		// Scroll Down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);

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
