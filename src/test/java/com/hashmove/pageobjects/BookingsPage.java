package com.hashmove.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingsPage {

	// Create object of Webdriver
	WebDriver ldriver;

	// Creating Constructor
	public BookingsPage(WebDriver rdriver)

	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// Identify All Web Elements on Bookings Page

	@FindBy(xpath = "//span[@class='pull-left']")
	@CacheLookup
	WebElement lnktextfilteryourresult;

	@FindBy(xpath = "//input[@placeholder='eg. HM-401230123912']")
	@CacheLookup
	WebElement txboxbookingnumber;
	
	@FindBy(xpath = "//button[@class='btn btn-primary w-100 btn-lg']")
	@CacheLookup
	WebElement btnfilterrecords;
	
	@FindBy(xpath = "//div[@class='pr-0 col-9']")
	@CacheLookup
	WebElement lnktextbookingnumber;
	
	// Identify Action on all Web Elements

	public void clickfilteryourresult() {
		lnktextfilteryourresult.click();

	}
	
	public void setbookingnumber(String bookingnumber) {
		txboxbookingnumber.clear();
		txboxbookingnumber.sendKeys(bookingnumber);

	}

	public void clickfilterrecords() {
		btnfilterrecords.click();

	}
	
	public void clickbookingnumberlink() {
		lnktextbookingnumber.click();

	}


}
