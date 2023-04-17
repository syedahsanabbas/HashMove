package com.hashmove.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hashmove.pageobjects.DFFCustomerPage;
import com.hashmove.pageobjects.HomePage;

import com.hashmove.utilities.ScreenRecorderUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;
import io.qameta.allure.*;

//						********* TC_DEV_WarehousingRateandBooking_001 *********
//		Description: Verify that DFF Customer should request and Book the Warehouse when pallet Type = Standard

public class TC_DEV_WarehousingRateandBooking_001 extends BaseClass {

	@Test(priority = 0)
	@Description("Verify that DFF Customer should request and Book the Warehouse when pallet Type = Standard")
	@Severity(SeverityLevel.CRITICAL)
	@Epic("EP001")
	@Feature("Feature: Verify that DFF Customer should request and Book the Warehouse when pallet Type = Standard")
	@Story("Story: Warehouse Searching and Booking")
	public void verifywarehouserateandbooking() throws Exception

	{
		System.out.println("***************TC_DEV_WarehousingRateandBooking_001*******************");

		// Start Recording
		ScreenRecorderUtil.startRecord("verifywarehouserateandbooking()");

		// Open Hash Move DFF Customer Portal URL
		driver.get(devdffcustomerportalurl);

		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "HashMove – Connecting World Logistics";
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		// Maximize current window
		driver.manage().window().maximize();
		logger.info("Hash Move Login page has opened");

		Thread.sleep(10000);

		HomePage hp = new HomePage(driver);
		DFFCustomerPage dcp = new DFFCustomerPage(driver);

		// Click Accept cookies button
		dcp.clickaccept();
		logger.info("Accept cookies button has clicked");

		// Click Login link
		dcp.clicklogin();
		logger.info("Login link has clicked");

		// Enter User ID
		dcp.setuserid(getCellData(1, 1, "QAWarehouseing"));
		logger.info("User ID = " + cell.getStringCellValue() + " has entered");

		// Enter Password
		dcp.setpassword(getCellData(1, 2, "QAWarehouseing"));
		logger.info("Password = " + cell.getStringCellValue() + " has entered");

		// Click Login Now button
		dcp.clickloginnow();
		logger.info("Login Now button has clicked!!!");

		Thread.sleep(5000);

		// Select Warehousing
		String searchcategory = getCellData(1, 3, "QAWarehouseing");
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
		Thread.sleep(1000);
		dcp.setstorage(getCellData(1, 4, "QAWarehouseing"));
		logger.info("Storage = " + cell.getStringCellValue() + " has selected");
		Thread.sleep(1000);

		// Enter City
		dcp.setcity(getCellData(1, 5, "QAWarehouseing"));
		logger.info("City = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(2000);
		
		// Select Rent From
		dcp.clickrentfrom();
		dcp.setrentfrommonthyear(getCellData(1, 6, "QAWarehouseing"));
		logger.info("Rent From Month Year " + cell.getStringCellValue()  +  " has selected");

		dcp.setrentfromday(getCellData(1, 7, "QAWarehouseing"));
		logger.info("Rent From Day " +  cell.getStringCellValue()  + " has selected");

	}
}