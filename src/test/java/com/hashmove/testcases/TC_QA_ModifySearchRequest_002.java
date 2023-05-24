package com.hashmove.testcases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hashmove.pageobjects.DFFCustomerPage;
import com.hashmove.pageobjects.HomePage;

import com.hashmove.utilities.ScreenRecorderUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;
import io.qameta.allure.*;

//						********* TC_QA_ModifySearchRequest_002 *********
//		Description: Verify that DFF Customer should Modify Search Request when pallet Type = EUROPEAN SIZE

public class TC_QA_ModifySearchRequest_002 extends BaseClass {

	@Test(priority = 0)
	@Description("Verify that DFF Customer should Modify Search Request when pallet Type = EUROPEAN")
	@Severity(SeverityLevel.MINOR)
	@Epic("EP001")
	@Feature("Feature: Verify that DFF Customer should Modify Search Request when pallet Type = EUROPEAN")
	@Story("Story: Modify Search Request")
	public void verifymodifysearchrequest() throws Exception

	{
		System.out.println("***************TC_QA_ModifySearchRequest_001*******************");

		// Start Recording
		ScreenRecorderUtil.startRecord("verifymodifysearchrequest()");

		// Open Hash Move DFF Customer Portal URL
		driver.get(qadffcustomerportalurl);

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
		dcp.setuserid(getCellData(2, 1, "QAWarehouseing"));
		logger.info("User ID = " + cell.getStringCellValue() + " has entered");

		// Enter Password
		dcp.setpassword(getCellData(2, 2, "QAWarehouseing"));
		logger.info("Password = " + cell.getStringCellValue() + " has entered");

		// Click Login Now button
		dcp.clickloginnow();
		logger.info("Login Now button has clicked!!!");

		Thread.sleep(12000);

		// Select Warehousing
		String searchcategory = getCellData(2, 3, "QAWarehouseing");
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
			dcp.clickwarehousing();
			logger.info("Warehousing has selected");
			
		}

		else if (searchcategory.equals("Truck - FTL")) {

			logger.info("Truck - FTL has selected");

		} else {

			System.out.println("Statement outside if...else block");

		}

		// Select Storage
		dcp.clickstoragedropdown();
		dcp.setstorage(getCellData(2, 4, "QAWarehouseing"));
		logger.info("Storage = " + cell.getStringCellValue() + " has selected");
		
		// Enter City
		dcp.setcity(getCellData(2, 5, "QAWarehouseing"));
		logger.info("City = " + cell.getStringCellValue() + " has entered");
		
		// Select Rent From
		dcp.clickrentfrom();
		dcp.setrentfrommonthyear(getCellData(2, 6, "QAWarehouseing"));
		logger.info("Rent From Month Year " + cell.getStringCellValue()  +  " has selected");

		dcp.setrentfromday(getCellData(2, 7, "QAWarehouseing"));
		logger.info("Rent From Day " +  cell.getStringCellValue()  + " has selected");
		
		// Select Rent Until
		dcp.clickrentuntil();
		dcp.setrentuntilmonthyear(getCellData(2, 8, "QAWarehouseing"));
		logger.info("Rent Until Month Year " + cell.getStringCellValue()  +  " has selected");

		dcp.setrentuntilday(getCellData(2, 9, "QAWarehouseing"));
		logger.info("Rent Until Day " +  cell.getStringCellValue()  + " has selected");
		
		Thread.sleep(3000);
		
		// Select By Pallet / By Area
		String by = getCellData(2, 11, "QAWarehouseing");
		System.out.println("By : " + by);
		
		String size = getCellData(2, 12, "QAWarehouseing");
		System.out.println("Size : " + size);

		if (by.equals("BY PALLET")) {
			dcp.clickbypallet();
			Thread.sleep(1000);
			logger.info("By Pallet has selected....");
			
			if (size.equals("STANDARD SIZE"))
			{
				dcp.clickstandardsize();
				logger.info("STANDARD Size Pallet has selected....");
				Thread.sleep(1000);
				// Enter Quantity
				dcp.setquantitystandard(getCellData(2, 13, "QAWarehouseing"));
				logger.info("Quantity " +  cell.getStringCellValue()  + " has entered");
				
				// Enter WEIGHT PER PALLET
				dcp.setweightperpalletstandard(getCellData(2, 14, "QAWarehouseing"));
				logger.info("WEIGHT PER PALLET " +  cell.getStringCellValue()  + " has entered");
				
				// Click ADD button
				dcp.clickaddstandard();
				logger.info("ADD button has clicked!!!");
				
				// Click X button
				dcp.clickclosestandardcard();
				logger.info("Close X button has clicked!!!");
				
				// Click Find Best Rates
				dcp.clickfindbestrates();
				logger.info("Find Best Rates button has clicked!!!");
				Thread.sleep(3000);
			}
			
			if (size.equals("EUROPEAN SIZE"))
			{
				
				logger.info("EUROPEAN Size Pallet has selected....");
				dcp.clickeuropeansize();
				Thread.sleep(1000);
				
				// Enter Quantity
				dcp.setquantitystandard(getCellData(2, 13, "QAWarehouseing"));
				logger.info("Quantity " +  cell.getStringCellValue()  + " has entered");
				
				// Enter WEIGHT PER PALLET
				dcp.setweightperpalleteuropean(getCellData(2, 14, "QAWarehouseing"));
				logger.info("WEIGHT PER PALLET " +  cell.getStringCellValue()  + " has entered");
				
				// Click ADD button
				dcp.clickaddeuropean();
				logger.info("ADD button has clicked!!!");
				
				// Click X button
				dcp.clickclosestandardcard();
				logger.info("Close X button has clicked!!!");
				
				// Click Find Best Rates
				dcp.clickfindbestrates();
				logger.info("Find Best Rates button has clicked!!!");
				Thread.sleep(3000);
			}
			
			

		} else if (searchcategory.equals("BY AREA")) {
			dcp.clickbyarea();
			logger.info("By Area has selected....");

		}

		else {

			System.out.println("Statement outside if...else block");

		}
		
		// Click Modify Search link
		dcp.clickmodifysearch();
		System.out.println("Modify Search link has clicked");
		Thread.sleep(2000);
		
		// Click Yes, Modify search criteria button
		dcp.clickyesmodifysearchcriteria();
		logger.info("Yes, Modify search criteria button has clicked!!!");
		Thread.sleep(3000);
		
		 // Wait for the element to not be displayed
	      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	      Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[@alt='delete-icon']")));
	      
	      // Assert that the element is not displayed
	      assert element == true : "Element is still displayed";
		
		

	}
}