package com.hashmove.testcases;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hashmove.pageobjects.CustomerLoginPage;
import com.hashmove.pageobjects.AllUsersPage;
import com.hashmove.pageobjects.HomePage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

//						********* TTestCase_UserCreation_003 *********
//		Description: Verify that Add new user with role = Consignee Admin on ELM Portal

public class TestCase_UserCreation_003 extends BaseClass {

	@Test(priority = 0)
	@Description("Verify that Add new user with role = Consignee Admin on ELM Portal")
	@Severity(SeverityLevel.CRITICAL)
	@Epic("EPUC003")
	@Feature("Feature: Add new user with role = Consignee Admin on ELM Portal")
	@Story("Story: Create New User")
	public void verifycreateconsigneeadminuser() throws InterruptedException, IOException

	{
		System.out.println("***************TestCase_UserCreation_003*******************");

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
				lp.setuserid(getCellData(3, 1, "UserCreationTestData"));
				logger.info("User ID = " + cell.getStringCellValue() + " has entered");

				// Enter Password
				lp.setpassword(getCellData(3, 2, "UserCreationTestData"));
				logger.info("Password = " + cell.getStringCellValue() + " has entered");

				// Click Login Now button
				lp.clickloginnow();
				logger.info("Login Now button has clicked!!!");

				Thread.sleep(5000);

				// Click Options Drop down
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
				alp.setfirstname(getCellData(3, 3, "UserCreationTestData"));
				logger.info("First Name = " + cell.getStringCellValue() + " has entered");
				Thread.sleep(1000);

				// Enter Last Name
				alp.setlastname(getCellData(3, 4, "UserCreationTestData"));
				logger.info("Last Name = " + cell.getStringCellValue() + " has entered");
				Thread.sleep(1000);

				// Enter City
				alp.setcity(getCellData(3, 5, "UserCreationTestData"));
				logger.info("City = " + cell.getStringCellValue() + " has entered");
				Thread.sleep(2000);

				// Enter Contact
				alp.setcontact(getCellData(3, 6, "UserCreationTestData"));
				logger.info("Contact = " + cell.getStringCellValue() + " has entered");
				Thread.sleep(1000);

				// Enter Email
				alp.setemail("test" + alp.getSaltString() + "@" + getCellData(3, 7, "UserCreationTestData"));
				logger.info("Email = " + cell.getStringCellValue() + " has entered");
				Thread.sleep(1000);

				// Select User Role
				alp.setuserrole(getCellData(3, 8, "UserCreationTestData"));
				logger.info("User Role = " + cell.getStringCellValue() + " has entered");
				Thread.sleep(1000);

				// Select Business Unit
				alp.clickbusinessunitdropdown();
				alp.setbusinessunit(getCellData(3, 9, "UserCreationTestData"));
				Thread.sleep(1000);

				// Select Agreement
				alp.selectagreement();
				logger.info("I agree to theTerms and Conditions, Privacy Policy and Software License Agreement has selected.");
				Thread.sleep(1000);
				
				// Object of Actions class to scroll up and down
				Actions a = new Actions(driver);
				a.sendKeys(Keys.PAGE_DOWN).build().perform();
				Thread.sleep(2000);

				// Click Create Account
				alp.clickcreateaccount();
				logger.info("Create Account button has clicked.");
				Thread.sleep(2000);

				// Capturing the screenshot
				Date d = new Date();
				String FileName = "screenshot" + d.toString().replace(" ", "_").replace(":", "") + ".png";
				System.out.println(FileName);
				File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(f, new File(System.getProperty("user.dir") + "\\ScreenShots\\" + FileName));

				// screenshot copied from buffer is saved at the mentioned path.

				System.out.println("The Screenshot is captured.");

				// Assertion on Toaster Message

				// String actual_error =
				// driver.findElement(By.xpath("//div[@class='toast-top-right
				// toast-container']")).getText();
				// String expected_error = "You have been registered successfully. Please check
				// your email to verify your account before logging in.";

				// System.out.println("Actual Error: " + actual_error);
				// System.out.println("Expected Error: " + expected_error);
				// assertTrue(actual_error.contains(expected_error));


	}
}