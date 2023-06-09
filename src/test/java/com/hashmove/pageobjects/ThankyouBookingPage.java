package com.hashmove.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankyouBookingPage {

	// Create object of Webdriver
	WebDriver ldriver;

	// Creating Constructor
	public ThankyouBookingPage(WebDriver rdriver)

	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// Identify All Web Elements on Thank you Booking Page

	@FindBy(xpath = "//span[@class='booking-id ng-star-inserted']")
	@CacheLookup
	WebElement labeltext;
	
	@FindBy(xpath = "//div[@class='total-payable-title']")
	@CacheLookup
	WebElement lbltotalpayable;
	
	@FindBy(xpath = "//a[@class='view-booking hvr-icon link-hover-1']")
	@CacheLookup
	WebElement lnktextviewbooking;
	
	@FindBy(xpath = "//span[@class='wh-booking-num pointer']")
	@CacheLookup
	WebElement labeltextwarehousebooking;


	// Identify Action on all Web Elements
	
	public String getbookingnumber() {
		return labeltext.getText();
		
	}
	
	public void clickviewbooking() {
		lnktextviewbooking.click();

	}
	
	public String gettotalpayable() {
		return lbltotalpayable.getText().toString();
		
	}
	
	public String getbookingnumberforwarehouse() {
		return labeltextwarehousebooking.getText();

	}
}
