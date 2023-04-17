package com.hashmove.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;

public class DFFCustomerPage {

	// Create object of Webdriver
	WebDriver ldriver;

	// Creating Constructor
	public DFFCustomerPage(WebDriver rdriver)

	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// Identify All Web Elements on Login Page

	@FindBy(xpath = "//a[normalize-space()='Accept']")
	@CacheLookup
	WebElement btnaccept;

	@FindBy(xpath = "//span[contains(text(),'LOGIN')]")
	@CacheLookup
	WebElement lnktextlogin;

	@FindBy(xpath = "//input[@placeholder='John@company.com']")
	@CacheLookup
	WebElement txtboxuserid;

	@FindBy(xpath = "//input[@placeholder='Your unique password']")
	@CacheLookup
	WebElement txtboxpassword;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement btnloginnow;

	@FindBy(xpath = "//span[normalize-space()='Warehousing']")
	@CacheLookup
	WebElement btnwarehousing;

	@FindBy(id = "wh-st-tg")
	@CacheLookup
	WebElement ddstorage;

	@FindBy(xpath = "//input[@id='typeahead-basic']")
	@CacheLookup
	WebElement txtboxcity;

	@FindBy(id = "hashDatepicker")
	@CacheLookup
	WebElement datepickerrentfrom;

	// Identify Action on all Web Elements

	public void clickaccept() {
		btnaccept.click();

	}

	public void clicklogin() {
		lnktextlogin.click();

	}

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

	@Step("Click Warehousing")
	public void clickwarehousing() {
		btnwarehousing.click();

	}

	public void clickstoragedropdown() {
		ddstorage.click();

	}

	@Step("Select Storage:{0}")
	public void setstorage(String storage) {
		List<WebElement> allOptions = ldriver.findElements(By.xpath("//div[@aria-labelledby='wh-st-tg']//div//span"));

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(storage)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}

	public void setcity(String city) throws InterruptedException {
		txtboxcity.sendKeys(city);
		Thread.sleep(2000);
		txtboxcity.sendKeys(Keys.ENTER);

	}

	public void clickrentfrom() {
		datepickerrentfrom.click();

	}

	@Step("Select Rent From Month Year")
	public void setrentfrommonthyear(String rentfrommonthyear) {
		while (true) {
			WebElement monthyeartext = ldriver.findElement(By.xpath("//div[@class='ngb-dp-month-name']"));
			String monthyear = monthyeartext.getText();
			if (monthyear.equals(rentfrommonthyear)) {
				break;

			}

			else {
				ldriver.findElement(By.xpath("//button[@title='Next month']//span[@class='ngb-dp-navigation-chevron']"))
						.click();
			}
		}
	}

	@Step("Select Rent From Day")
	public void setrentfromday(String rentfromday) {
		List<WebElement> allOptions = ldriver.findElements(By.xpath("//div//div//div//div//div[@class='btn-light']"));
		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().equals(rentfromday)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}
}
