package com.hashmove.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingProcessPage {

	// Create object of Webdriver
	WebDriver ldriver;

	// Creating Constructor
	public BookingProcessPage(WebDriver rdriver)

	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// Identify All Web Elements on Booking Process Page

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	@CacheLookup
	WebElement btnnext;
	
	@FindBy(xpath = "//input[@placeholder='e.g: PO Number']")
	@CacheLookup
	WebElement txboxreferencenumber;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter any shipping instructions for this booking']")
	@CacheLookup
	WebElement txboxshippinginstructions;
	
	@FindBy(xpath = "//span[@class='mt-1 ng-star-inserted']")
	@CacheLookup
	WebElement checkboxdisclaimer;
	
	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	@CacheLookup
	WebElement btnconfirm;

	// Identify Action on all Web Elements

	
	public void clicknext() {
		btnnext.click();
		
	}
	
	public void setreferencenumber(String referencenumber) {
		txboxreferencenumber.sendKeys(referencenumber);

	}
	
	public void setshippinginstructions(String shippinginstructions) {
		txboxshippinginstructions.sendKeys(shippinginstructions);

	}
	
	public void selectdisclaimer() {
		checkboxdisclaimer.click();
		
	}
	
	public void clickconfirm() {
		btnconfirm.click();
		
	}
	
}
