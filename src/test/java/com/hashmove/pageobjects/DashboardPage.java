package com.hashmove.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	// Create object of Webdriver
	WebDriver ldriver;

	// Creating Constructor
	public DashboardPage(WebDriver rdriver)

	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// Identify All Web Elements on Dash board Page
	
	@FindBy(xpath = "//span[@class='menu-text ng-star-inserted'][normalize-space()='Spot Rates']")
	@CacheLookup
	WebElement lnktextspotrates;
	
	@FindBy(xpath = "//span[@class='menu-text ng-star-inserted'][normalize-space()='Bookings']")
	@CacheLookup
	WebElement lnktextbookings;
	

	// Identify Action on all Web Elements

	public void clickspotratesleftmenu() {
		lnktextspotrates.click();

	}
	
	public void clickbookingsleftmenu() {
		lnktextbookings.click();

	}
	
}
