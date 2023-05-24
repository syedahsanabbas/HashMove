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

import com.hashmove.pageobjects.BookingDetailPage;
import com.hashmove.pageobjects.BookingProcessPage;
import com.hashmove.pageobjects.DFFCustomerPage;
import com.hashmove.pageobjects.HomePage;
import com.hashmove.pageobjects.ThankyouBookingPage;
import com.hashmove.utilities.ScreenRecorderUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;
import io.qameta.allure.*;

//						********* TC_QA_WarehousingRateandBooking_003 *********
//		Description: Verify that DFF Customer should request and Book the Warehouse when pallet Type = Chep

public class TC_QA_WarehousingRateandBooking_003 extends BaseClass {

	@Test(priority = 0)
	@Description("Verify that DFF Customer should request and Book the Warehouse when pallet Type = Chep")
	@Severity(SeverityLevel.CRITICAL)
	@Epic("EPWH-003")
	@Feature("Feature: Verify that DFF Customer should request and Book the Warehouse when pallet Type = Chep")
	@Story("Story: Warehouse Searching and Booking")
	public void verifywarehouserateandbooking() throws Exception

	{
		System.out.println("***************TC_QA_WarehousingRateandBooking_003*******************");

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

		// Click Accept cookies button
		dcp.clickaccept();
		logger.info("Accept cookies button has clicked");

		// Click Login link
		dcp.clicklogin();
		logger.info("Login link has clicked");

		// Enter User ID
		dcp.setuserid(getCellData(3, 1, "QAWarehouseing"));
		logger.info("User ID = " + cell.getStringCellValue() + " has entered");

		// Enter Password
		dcp.setpassword(getCellData(3, 2, "QAWarehouseing"));
		logger.info("Password = " + cell.getStringCellValue() + " has entered");

		// Click Login Now button
		dcp.clickloginnow();
		logger.info("Login Now button has clicked!!!");

		Thread.sleep(3000);

		// Select Warehousing
		String searchcategory = getCellData(3, 3, "QAWarehouseing");
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
		dcp.setstorage(getCellData(3, 4, "QAWarehouseing"));
		logger.info("Storage = " + cell.getStringCellValue() + " has selected");
		Thread.sleep(1000);

		// Enter City
		dcp.setcity(getCellData(3, 5, "QAWarehouseing"));
		logger.info("City = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Select Rent From
		dcp.clickrentfrom();

		dcp.setrentfrommonthyear(getFormulaMonthYearDateAsString(2, 6, "QAWarehouseing"));
		dcp.setrentfromday(getFormulaDayDateAsString(2, 7, "QAWarehouseing"));
		Thread.sleep(1000);

		// Select Rent Until
		dcp.clickrentuntil();

		dcp.setrentuntilmonthyear(getFormulaMonthYearDateAsString(2, 8, "QAWarehouseing"));
		dcp.setrentuntilday(getFormulaDayDateAsString(2, 9, "QAWarehouseing"));
		Thread.sleep(1000);

		// Select Storage Type
		String storagetype = getCellData(3, 10, "QAWarehouseing");
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
		String by = getCellData(3, 11, "QAWarehouseing");
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
		String pallettype = getCellData(3, 12, "QAWarehouseing");
		System.out.println("Pallet Type : " + pallettype);

		if (pallettype.equals("STANDARD SIZE")) {

			dcp.clickstandardsize();
			logger.info("STANDARD SIZE pallet has selected....");
			Thread.sleep(2000);
			// Quantity has entered
			dcp.setquantitystandard(getCellData(3, 13, "QAWarehouseing"));
			logger.info("Quantity " + cell.getStringCellValue() + " has entered");
			// Enter Weight
			dcp.setweightperpalletstandard(getCellData(3, 14, "QAWarehouseing"));
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
			dcp.setquantityeuropean(getCellData(3, 13, "QAWarehouseing"));
			logger.info("Quantity " + cell.getStringCellValue() + " has entered");
			// Enter Weight
			dcp.setweightperpalleteuropean(getCellData(3, 14, "QAWarehouseing"));
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
			dcp.setquantitychep(getCellData(3, 13, "QAWarehouseing"));
			logger.info("Quantity " + cell.getStringCellValue() + " has entered");
			// Enter Weight
			dcp.setweightperpalletchep(getCellData(3, 14, "QAWarehouseing"));
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

		dcp.setcurrency(getCellData(3, 15, "QAWarehouseing"));
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
		String customclearance = getCellData(3, 16, "QAWarehouseing");
		System.out.println("Custom Clearance : " + customclearance);

		if (customclearance.equals("Yes")) {

			bpp.selectcustomclearance();
			logger.info("Custom Clearance has toggle on....");
			Thread.sleep(2000);

			String expectedport = getCellData(3, 17, "QAWarehouseing");
			String actualport = bpp.getportname();
			System.out.println("Actual Port Name: " + actualport);
			System.out.println("Expected Port Name: " + expectedport);

			Assert.assertEquals(actualport, expectedport, "Port Name is not as Expected!!!");

			// Select Container Size
			bpp.clickcontainersizedropdown();
			bpp.setcontainersize(getCellData(3, 18, "QAWarehouseing"));
			logger.info("Container Size: " + cell.getStringCellValue() + " has selected");

			// Enter Quantity
			bpp.setcontainerquantity(getCellData(3, 19, "QAWarehouseing"));
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

		String insuranceservices = getCellData(3, 20, "QAWarehouseing");
		System.out.println("Insurance Services : " + customclearance);

		if (insuranceservices.equals("Yes")) {
			bpp.selectinsuranceservices();
			logger.info("Insurance Services has toggle on....");
			Thread.sleep(3000);

			// Enter VALUE OF GOODS
			bpp.setvalueofgoods(getCellData(3, 21, "QAWarehouseing"));
			logger.info("VALUE OF GOODS : " + cell.getStringCellValue() + " has entered");
			Thread.sleep(3000);

		} else if (insuranceservices.equals("No")) {

			logger.info("Insurance Services has toggle off....");

		}

		else {

			System.out.println("Statement outside if...else block");

		}

		// Add Assertion on Warehouse Charges
		String expectedwarehousecharges = getCellData(3, 22, "QAWarehouseing");
		String actualwarehousecharges = bpp.getwarehousecharges();
		System.out.println("Actual Warehouse Charges : " + actualwarehousecharges);
		System.out.println("Expected Warehouse Charges : " + expectedwarehousecharges);
		Assert.assertEquals(actualwarehousecharges, expectedwarehousecharges,
				"Warehouse Charges Rates is not as Expected!!!");

		// Add Assertion on Custom Clearance
		String expectedcustomclearancerate = getCellData(3, 23, "QAWarehouseing");
		String actualcustomclearancerate = bpp.getcustomclearancerate();
		System.out.println("Actual Custom Clearance Rate : " + actualcustomclearancerate);
		System.out.println("Expected Custom Clearance Rate : " + expectedcustomclearancerate);

		Assert.assertEquals(actualcustomclearancerate, expectedcustomclearancerate,
				"Custom Clearance Container Rates is not as Expected!!!");

		// Add Assertion on Insurance Premium
		String expectedinsurancepremium = getCellData(3, 24, "QAWarehouseing");
		String actualinsurancepremium = bpp.getinsurancepremium();
		System.out.println("Actual Insurance Premium : " + actualinsurancepremium);
		System.out.println("Expected Insurance Premium : " + expectedinsurancepremium);

		Assert.assertEquals(actualinsurancepremium, expectedinsurancepremium,
				"Insurance Premium is not as Expected!!!");

		// Add Assertion on GROSS TOTAL
		String expectedgrosstotal = getCellData(3, 25, "QAWarehouseing");
		String actualgrosstotal = bpp.getgrosstotal();
		System.out.println("ACTUAL GROSS TOTAL : " + actualgrosstotal);
		System.out.println("EXPECTED GROSS TOTAL : " + expectedgrosstotal);
		Assert.assertEquals(actualgrosstotal, expectedgrosstotal, "GROSS TOTAL is not as Expected!!!");

		// Add Assertion on VALUE ADDED TAX ( VAT )
		String expectedvat = getCellData(3, 26, "QAWarehouseing");
		String actualvat = bpp.getvat();
		System.out.println("ACTUAL VALUE ADDED TAX ( VAT ) : " + actualvat);
		System.out.println("EXPECTED VALUE ADDED TAX ( VAT ) : " + expectedvat);
		Assert.assertEquals(actualvat, expectedvat, "VALUE ADDED TAX ( VAT ) is not as Expected!!!");

		// Add Assertion on NET TOTAL
		String expectednettotal = getCellData(3, 27, "QAWarehouseing");
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
		String expectedtotalpayable = getCellData(3, 28, "QAWarehouseing");
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
		String expectedwarehousechargesonviewsummary = getCellData(3, 22, "QAWarehouseing");
		String actualwarehousechargesonviewsummary = bdp.getwarehousechargesonviewsummary();
		System.out.println("Actual Warehouse Charges  : " + actualwarehousechargesonviewsummary);
		System.out.println("Expected Warehouse Charges : " + expectedwarehousechargesonviewsummary);
		Assert.assertEquals(actualwarehousechargesonviewsummary, expectedwarehousechargesonviewsummary,
				"Warehouse Charges Rates is not as Expected!!!");

		// Add Assertion on NET TOTAL
		String expectednettotalonviewsummary = getCellData(3, 27, "QAWarehouseing");
		String actualnettotalonviewsummary = bdp.getnettotalonviewsummary();
		System.out.println("ACTUAL NET TOTAL ON VIEW SUMMARY : " + actualnettotalonviewsummary);
		System.out.println("EXPECTED NET TOTAL ON VIEW SUMMARY : " + expectednettotalonviewsummary);
		Assert.assertEquals(actualnettotalonviewsummary, expectednettotalonviewsummary,
				"NET TOTAL on View Summary is not as Expected!!!");

		// Close View Summary
		bdp.clickcloseviewsummary();
		logger.info("View Summary Close button has clicked....");
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
		bdp.setreferencenumber(getCellData(3, 29, "QAWarehouseing"));
		logger.info("Reference Number = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Select Truck Category
		bdp.clicktruckcategorydropdown();
		Thread.sleep(2000);
		bdp.settruckcategory(getCellData(3, 30, "QAWarehouseing"));
		logger.info("Truck Category = " + cell.getStringCellValue() + " has selected");

		// Select Truck Type
		bdp.clicktrucktypedropdown();
		Thread.sleep(2000);
		bdp.settrucktype(getCellData(3, 31, "QAWarehouseing"));
		logger.info("Truck Type = " + cell.getStringCellValue() + " has selected");

		// Enter Truck Reg Number
		bdp.settruckregnumber(getCellData(3, 32, "QAWarehouseing"));
		logger.info("Truck Reg Number = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Enter Remarks
		bdp.setremarks(getCellData(3, 33, "QAWarehouseing"));
		logger.info("Remarks = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Add SKU
		bdp.clickaddsku();
		logger.info("Add SKU button has clicked....");
		Thread.sleep(2000);

		// Enter YOUR SKU CODE
		String yourskucode = bdp.setyourskucode(getCellData(3, 34, "QAWarehouseing") + bdp.getSaltString());
		logger.info("YOUR SKU CODE = " + yourskucode + " has entered");

		// Enter SKU DESCRIPTION
		String yourskudescription = bdp.setskudescription(getCellData(3, 35, "QAWarehouseing") + bdp.getSaltString());
		logger.info("SKU DESCRIPTION = " + yourskudescription + " has entered");
		Thread.sleep(1000);

		// Enter HS Code
		bdp.sethscode(getCellData(3, 36, "QAWarehouseing"));
		logger.info("HS Code = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Select UOM
		bdp.clickuomdropdown();
		Thread.sleep(2000);
		bdp.setuom(getCellData(3, 37, "QAWarehouseing"));
		logger.info("UOM = " + cell.getStringCellValue() + " has selected");

		// Select WEIGHT UOM
		bdp.clickweightuomdropdown();
		Thread.sleep(2000);
		bdp.setweightuom(getCellData(3, 38, "QAWarehouseing"));
		logger.info("WEIGHT UOM = " + cell.getStringCellValue() + " has selected");

		// Enter GROSS WEIGHT
		bdp.setgrossweight(getCellData(3, 39, "QAWarehouseing"));
		logger.info("GROSS WEIGHT = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Enter NET WEIGHT
		bdp.setnetweight(getCellData(3, 40, "QAWarehouseing"));
		logger.info("NET WEIGHT = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Select PACKAGE TYPE
		bdp.clickpackagetypedropdown();
		Thread.sleep(2000);
		bdp.setpackagetype(getCellData(3, 41, "QAWarehouseing"));
		logger.info("PACKAGE TYPE ( WHAT'S ON PALLET? ) = " + cell.getStringCellValue() + " has selected");

		// Enter UOM / PACKAGE
		bdp.setuomperpackage(getCellData(3, 42, "QAWarehouseing"));
		logger.info("UOM / PACKAGE = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Select PALLET TYPE
		bdp.clickpallettypedropdown();
		Thread.sleep(2000);
		bdp.setpallettype(getCellData(3, 43, "QAWarehouseing"));
		logger.info("PALLET TYPE= " + cell.getStringCellValue() + " has selected");

		// Enter PACKAGE / PALLET
		bdp.setpackageperpallet(getCellData(3, 44, "QAWarehouseing"));
		logger.info("PACKAGE / PALLET = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Enter TOTAL PALLET QTY
		bdp.settotalpalletqty(getCellData(3, 45, "QAWarehouseing"));
		logger.info("TOTAL PALLET QTY = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Add Assertion on TOTAL PACKAGE QTY
		String expectedtotalpackageqty = getCellData(3, 46, "QAWarehouseing");
		String actualtotalpackageqty = bdp.gettotalpackageqty();
		System.out.println("Actual TOTAL PACKAGE QTY : " + actualtotalpackageqty);
		Assert.assertEquals(actualtotalpackageqty, expectedtotalpackageqty, "TOTAL PACKAGE QTY is not as Expected!!!");

		// Add Assertion on TOTAL UOM QTY
		String expectedtotaluomqty = getCellData(3, 47, "QAWarehouseing");
		String actualtotaluomeqty = bdp.gettotaluomqty();
		System.out.println("Actual TOTAL UOM QTY : " + actualtotalpackageqty);
		Assert.assertEquals(actualtotaluomeqty, expectedtotaluomqty, "TOTAL UOM QTY is not as Expected!!!");

		// Select Do you want to add batch number for this sku?
		String addbatchnumber = getCellData(3, 48, "QAWarehouseing");
		System.out.println("Batch Number toggle : " + addbatchnumber);

		if (addbatchnumber.equals("Yes")) {

			bdp.selectbatchnumber();
			logger.info("Do you want to add batch number for this sku? toggle has swtich on....");
			Thread.sleep(2000);

			// Enter BATCH NUMBER
			String batchnumber = bdp.setbatchnumber(getCellData(3, 49, "QAWarehouseing") + bdp.getSaltString());
			logger.info("BATCH NUMBER = " + batchnumber + " has entered");

			// Select PRODUCTION DATE
			bdp.clickproductiondate();
			Thread.sleep(2000);
			bdp.setproductionmonthyear(getFormulaMonthYearDateAsString(3, 50, "QAWarehouseing"));
			bdp.setproductionday(getFormulaDayDateAsString(3, 51, "QAWarehouseing"));
			Thread.sleep(1000);

			// Select EXPIRY DATE
			bdp.clickexpirydate();
			Thread.sleep(2000);
			bdp.setexpirymonthyear(getFormulaMonthYearDateAsString(3, 52, "QAWarehouseing"));
			bdp.setexpiryday(getFormulaDayDateAsString(3, 53, "QAWarehouseing"));
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
		String expectedtotalamountinskudetailsgrid = getCellData(3, 54, "QAWarehouseing");
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
		bdp.selectservice(getCellData(3, 55, "QAWarehouseing"));
		Thread.sleep(3000);

		// Add Assertion on EMPTY WOODEN PALLETS VALUE EXCLUDING VAT
		String expectedemptywoodenpalletsvalueexcludingvat = getCellData(3, 56, "QAWarehouseing");
		String actualemptywoodenpalletsvalueexcludingvat = bdp
				.getemptywoodenpalletsvalueexcludingvat(getCellData(3, 55, "QAWarehouseing"));
		System.out.println(
				"ACTUAL EMPTY WOODEN PALLETS VALUE EXCLUDING VAT : " + actualemptywoodenpalletsvalueexcludingvat);
		System.out.println(
				"EXPECTED EMPTY WOODEN PALLETS VALUE EXCLUDING VAT : " + expectedemptywoodenpalletsvalueexcludingvat);
		Assert.assertEquals(actualemptywoodenpalletsvalueexcludingvat, expectedemptywoodenpalletsvalueexcludingvat,
				"EMPTY WOODEN PALLETS VALUE EXCLUDING VAT is not as Expected!!!");

		// Add Assertion on RECEIVING BY PALLET VALUE EXCLUDING VAT
		String expectedrecevingbypalletsvalueexcludingvat = getCellData(3, 58, "QAWarehouseing");
		String actualrecevingbypalletsvalueexcludingvat = bdp
				.getemptywoodenpalletsvalueexcludingvat(getCellData(3, 57, "QAWarehouseing"));
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
		String expectednettotaloninboundshipment = getCellData(3, 59, "QAWarehouseing");
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
		bdp.setreferencenumber2(getCellData(3, 60, "QAWarehouseing"));
		logger.info("Reference Number = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Select Truck Category
		bdp.clicktruckcategorydropdown2();
		Thread.sleep(2000);
		bdp.settruckcategory2(getCellData(3, 61, "QAWarehouseing"));
		logger.info("Truck Category = " + cell.getStringCellValue() + " has selected");

		// Select Truck Type
		bdp.clicktrucktypedropdown2();
		Thread.sleep(2000);
		bdp.settrucktype2(getCellData(3, 62, "QAWarehouseing"));
		logger.info("Truck Type = " + cell.getStringCellValue() + " has selected");

		// Enter Truck Reg Number
		bdp.settruckregnumber2(getCellData(3, 63, "QAWarehouseing"));
		logger.info("Truck Reg Number = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Click Delivery Address Pin Location
		bdp.clickdeliveryaddresspinlocation();
		logger.info("Delivery Address Pin Location has clicked....");
		Thread.sleep(2000);

		// Enter Pin Address
		bdp.setpinaddress(getCellData(3, 64, "QAWarehouseing"));
		logger.info("Pin Address = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Click Submit button
		bdp.clicksubmitpinaddress();
		logger.info("Submit button has clicked....");
		Thread.sleep(2000);

		// Enter Main Delivery Address
		bdp.setmaindeliveryaddress(getCellData(3, 64, "QAWarehouseing"));
		logger.info("Main Delivery Address = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);

		// Enter Remarks
		bdp.setremarks2(getCellData(3, 65, "QAWarehouseing"));
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
		String By = getCellData(3, 66, "QAWarehouseing");
		System.out.println("Toggle is switch on for : " + By);

		if (By.equals("By Pallet")) {

			bdp.selectbypallet();
			logger.info("By Pallet toggle has swtich on....");
			Thread.sleep(2000);

			// Enter TOTAL PALLET QTY
			bdp.settotalpalletqty2(getCellData(3, 67, "QAWarehouseing"));
			logger.info("TOTAL PALLET QTY = " + cell.getStringCellValue() + " has entered");
			Thread.sleep(1000);

		} else if (By.equals("By Package")) {

			logger.info("Toggle is switch on for : " + By);
			bdp.selectbypackage();
			logger.info("By Package toggle has swtich on....");
			Thread.sleep(2000);

			// Enter TOTAL PACKAGE QTY
			bdp.settotalpackageqty(getCellData(3, 68, "QAWarehouseing"));
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
		String expectedtotalamountinskudetailsgrid2 = getCellData(3, 70, "QAWarehouseing");
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
		bdp.selectservice(getCellData(3, 71, "QAWarehouseing"));
		Thread.sleep(3000);

		// Add Assertion on EMPTY WOODEN PALLETS VALUE EXCLUDING VAT
		String expectedemptywoodenpalletsvalueexcludingvat2 = getCellData(3, 72, "QAWarehouseing");
		String actualemptywoodenpalletsvalueexcludingvat2 = bdp
				.getemptywoodenpalletsvalueexcludingvat2(getCellData(3, 71, "QAWarehouseing"));
		System.out.println(
				"ACTUAL EMPTY WOODEN PALLETS VALUE EXCLUDING VAT : " + actualemptywoodenpalletsvalueexcludingvat2);
		System.out.println(
				"EXPECTED EMPTY WOODEN PALLETS VALUE EXCLUDING VAT : " + expectedemptywoodenpalletsvalueexcludingvat2);
		Assert.assertEquals(actualemptywoodenpalletsvalueexcludingvat2, expectedemptywoodenpalletsvalueexcludingvat2,
				"EMPTY WOODEN PALLETS VALUE EXCLUDING VAT is not as Expected!!!");

		// Add Assertion on DISPATCHING BY PALLET VALUE EXCLUDING VAT
		String expecteddispatchingbypalletvalueexcludingvat = getCellData(3, 74, "QAWarehouseing");
		String actualdispatchingbypalletvalueexcludingvat = bdp
				.getdispatchingbypalletvalueexcludingvat(getCellData(3, 73, "QAWarehouseing"));
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
		String expectednettotalonoutboundshipment = getCellData(3, 75, "QAWarehouseing");
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
