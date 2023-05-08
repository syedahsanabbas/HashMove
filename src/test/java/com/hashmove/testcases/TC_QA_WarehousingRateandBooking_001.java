package com.hashmove.testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

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

//						********* TC_QA_WarehousingRateandBooking_001 *********
//		Description: Verify that DFF Customer should request and Book the Warehouse when pallet Type = Standard

public class TC_QA_WarehousingRateandBooking_001 extends BaseClass {

	@Test(priority = 0)
	@Description("Verify that DFF Customer should request and Book the Warehouse when pallet Type = Standard")
	@Severity(SeverityLevel.CRITICAL)
	@Epic("EP001")
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

		Thread.sleep(5000);

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

		dcp.setrentfrommonthyear(getCellData(3, 6, "QAWarehouseing"));
		logger.info("Rent From Month Year " + cell.getStringCellValue() + " has selected");

		dcp.setrentfromday(getCellData(3, 7, "QAWarehouseing"));
		logger.info("Rent From Day " + cell.getStringCellValue() + " has selected");

		// Select Rent Until
		dcp.clickrentuntil();

		dcp.setrentuntilmonthyear(getCellData(3, 8, "QAWarehouseing"));
		logger.info("Rent Until Month Year " + cell.getStringCellValue() + " has selected");

		dcp.setrentuntilday(getCellData(3, 9, "QAWarehouseing"));
		logger.info("Rent Until Day " + cell.getStringCellValue() + " has selected");

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
			dcp.setquantity(getCellData(3, 13, "QAWarehouseing"));
			// Enter Weight
			dcp.setweightperpallet(getCellData(3, 14, "QAWarehouseing"));
			Thread.sleep(2000);
			// Click Add
			dcp.clickaddstandard();
			logger.info("STANDARD SIZE pallet has added");
			// Click X button
			dcp.clickclosestandandardcard();
			logger.info("STANDARD SIZE pallet card has closed");

		} else if (pallettype.equals("EUROPEAN SIZE")) {
			dcp.clickeuropeansize();
			logger.info("EUROPEAN SIZE pallet has selected");
			Thread.sleep(2000);
			// Quantity has entered
			dcp.setquantity(getCellData(3, 13, "QAWarehouseing"));
			// Enter Weight
			dcp.setweightperpallet(getCellData(3, 14, "QAWarehouseing"));
			Thread.sleep(2000);
			// Click Add
			dcp.clickaddeuropean();
			Thread.sleep(2000);
			logger.info("EUROPEAN SIZE pallet card has closed");
		}

		else if (pallettype.equals("CHEP")) {
			dcp.clickchepsize();
			logger.info("CHEP pallet has selected");
			Thread.sleep(2000);
			// Quantity has entered
			dcp.setquantity(getCellData(3, 13, "QAWarehouseing"));
			// Enter Weight
			dcp.setweightperpallet(getCellData(3, 14, "QAWarehouseing"));
			Thread.sleep(2000);

		}

		else {

			System.out.println("Statement outside if...else block");

		}

		// Click Find Best Rates
		dcp.clickfindbestrates();
		Thread.sleep(8000);

		// Select Currency = SAR
		dcp.clickcurrency();

		dcp.setcurrency(getCellData(3, 15, "QAWarehouseing"));
		logger.info("Currency " + cell.getStringCellValue() + " has selected");

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
			System.out.print("Actual Port Name: " + actualport);

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

		} else if (insuranceservices.equals("No")) {

			logger.info("Insurance Services has toggle off....");

		}

		else {

			System.out.println("Statement outside if...else block");

		}

		// Add Assertion on Custom Clearance
		String expectedcustomclearancerate = getCellData(3, 22, "QAWarehouseing");
		String actualcustomclearancerate = bpp.getcustomclearancerate();
		System.out.print("Actual Custom Clearance Rate : " + actualcustomclearancerate);

		Assert.assertEquals(actualcustomclearancerate, expectedcustomclearancerate,
				"Custom Clearance Container Rates is not as Expected!!!");

		// Add Assertion on Insurance Premium
		String expectedinsurancepremium = getCellData(3, 23, "QAWarehouseing");
		String actualinsurancepremium = bpp.getinsurancepremium();
		System.out.print("Actual Insurance Premium : " + actualcustomclearancerate);

		Assert.assertEquals(actualinsurancepremium, expectedinsurancepremium,
				"Insurance Premium is not as Expected!!!");
		
		// Select I accept terms & conditions
		
		bpp.selectiaccepttermsandconditions();
		logger.info("I accept terms & conditions has toggle on....");
		Thread.sleep(2000);
		
		// Click Book & Pay button
		bpp.clickbookandpay();
		logger.info("Book & Pay button has clicked....");
		Thread.sleep(2000);
		
		// Get Booking Number
		String bookingnumbertext = tybp.getbookingnumberforwarehouse();
		System.out.println("Booking Number Text : " + bookingnumbertext);
		
		// Scroll Down
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		
		// Click View Bookings
		tybp.clickviewbooking();
		logger.info("View Bookings link has clicked....");
		Thread.sleep(2000);
		
		
	}

}
