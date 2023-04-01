package com.hashmove.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage {

	// Create object of Webdriver
	WebDriver ldriver;

	// Creating Constructor
	public CustomerLoginPage(WebDriver rdriver)

	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// Identify All Web Elements on Login Page

	@FindBy(id = "loginUserID")
	@CacheLookup
	WebElement txtboxuserid;
	
	@FindBy(id = "password")
	@CacheLookup
	WebElement txtboxpassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement btnloginnow;
	

	// Identify Action on all Web Elements

	public void setuserid(String userid) throws InterruptedException {
		txtboxuserid.clear();
		txtboxuserid.sendKeys(userid);
		

	}
	
	public void setpassword(String password) throws InterruptedException {
		txtboxpassword.clear();
		txtboxpassword.sendKeys(password);
		

	}
	
	public void clickloginnow() {
		btnloginnow.click();
		
	}
	
	
}
