package com.hashmove.testcases;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hashmove.pageobjects.CustomerLoginPage;
import com.hashmove.pageobjects.AllUsersPage;
import com.hashmove.pageobjects.HomePage;

//						********* TestCase_UserCreation_006 *********
//		Description: Verify that Add new user with role = Partner on ELM Portal

public class TestCase_UserCreation_006 extends BaseClass {

	@Test(priority = 0)
	public void verifycreatepartneruser() throws InterruptedException, IOException

	{
		System.out.println("***************TestCase_UserCreation_006*******************");

		// Open Hash Move URL
		driver.get(qacustomerportalurl);
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "HashMove – Connecting World Logistics";
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		// Maximize current window
		driver.manage().window().maximize();
		logger.info("Hash Move Login page has opened");

		Thread.sleep(10000);

		CustomerLoginPage lp = new CustomerLoginPage(driver);
		HomePage hp = new HomePage(driver);
		AllUsersPage alp = new AllUsersPage(driver);

		// Enter User ID
		lp.setuserid(getCellData(6, 1, "TestData1"));
		logger.info("User ID = " + cell.getStringCellValue() + " has entered");

		// Enter Password
		lp.setpassword(getCellData(6, 2, "TestData1"));
		logger.info("Password = " + cell.getStringCellValue() + " has entered");

		// Click Login Now button
		lp.clickloginnow();
		logger.info("Login Now button has clicked!!!");

		// Capturing the screenshot
		Date d = new Date();
		String FileName = "screenshot" + d.toString().replace(" ", "_").replace(":", "") + ".png";
		System.out.println(FileName);
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,
				new File("C:\\Users\\SYED AHSAN ABBAS\\eclipse-workspace\\HashMove\\ScreenShots\\" + FileName));

		// screenshot copied from buffer is saved at the mentioned path.

		System.out.println("The Screenshot is captured.");

		Thread.sleep(5000);
		
		// Click Options Dropdown
		hp.clickoptionsdropdown();
		logger.info("Options Dropdown has clicked!!!");
		Thread.sleep(2000);

		hp.clickusers();
		logger.info("Users option has clicked!!!");
		Thread.sleep(5000);

		// Click a Add New user

		alp.clickaddnewuser();
		logger.info("Add a New user link has clicked!!!");
		Thread.sleep(1000);

		// Enter First Name
		alp.setfirstname(getCellData(6, 3, "TestData1"));
		logger.info("First Name = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Enter Last Name
		alp.setlastname(getCellData(6, 4, "TestData1"));
		logger.info("Last Name = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);
		
		// Enter City
		alp.setcity(getCellData(6, 5, "TestData1"));
		logger.info("Last Name = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Enter Contact
		alp.setcontact(getCellData(6, 6, "TestData1"));
		logger.info("Contact = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);

		// Enter Email
		alp.setemail(getCellData(6, 7, "TestData1"));
		logger.info("Email = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);
		
		// Select User Role
		alp.setuserrole(getCellData(6, 8, "TestData1"));
		logger.info("User Role = " + cell.getStringCellValue() + " has entered");
		Thread.sleep(1000);
		
		// Select Business Unit
		alp.clickbusinessunitdropdown();
		alp.setbusinessunit(getCellData(6, 9, "TestData1"));
		Thread.sleep(1000);
		
		// Select Agreement
		alp.selectagreement();
		logger.info("I agree to theTerms and Conditions, Privacy Policy and Software License Agreement has selected.");
		Thread.sleep(1000);
		
		// Click Create Account
		alp.clickcreateaccount();
		logger.info("Create Account button has clicked.");
		Thread.sleep(2000);
		
		// Assertion on Toaster Message
	
		String actual_error = driver.findElement(By.xpath("//div[@class='toast-top-right toast-container']")).getText();
		String expected_error = "You have been registered successfully. Please check your email to verify your account before logging in.";
		
		System.out.println("Actual Error: " + actual_error);
		System.out.println("Expected Error: " + expected_error);
		assertTrue(actual_error.contains(expected_error));
		


	}
}