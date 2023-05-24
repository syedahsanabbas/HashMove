package com.hashmove.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllBookingsPage {

	// Create object of Webdriver
	WebDriver ldriver;

	// Creating Constructor
	public AllBookingsPage(WebDriver rdriver)

	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// Identify All Web Elements on Rate Request Page

	@FindBy(xpath = "//span[@class='pull-left ng-star-inserted']")
	@CacheLookup
	WebElement lnktextfilteryourresult;

	@FindBy(xpath = "//input[@placeholder='eg. HM-401230123912']")
	@CacheLookup
	WebElement txboxbookingnumber;

	@FindBy(xpath = "//button[@class='btn btn-primary w-100 btn-lg']")
	@CacheLookup
	WebElement btnfilterrecords;

	@FindBy(xpath = "//a[normalize-space()='Accept']")
	@CacheLookup
	WebElement btnaccept;

	@FindBy(xpath = "//div[@class='d-flex flex-column info ml-5 pl-2 pointer']")
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

	public void clickaccept() {
		btnaccept.click();

	}

	public void clickbookingnumberlink() {
		lnktextbookingnumber.click();

	}

}
