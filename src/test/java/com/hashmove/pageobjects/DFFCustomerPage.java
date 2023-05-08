package com.hashmove.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(id = "hashDatepicker2")
	@CacheLookup
	WebElement datepickerrentuntil;
	
	@FindBy(xpath = "//span[normalize-space()='BY PALLET']")
	@CacheLookup
	WebElement lnktextbypallet;
	
	@FindBy(xpath = "//span[normalize-space()='BY AREA']")
	@CacheLookup
	WebElement lnktextbyarea;
	
	@FindBy(xpath = "//label[normalize-space()='A/C Storage']")
	@CacheLookup
	WebElement lnktextacstorage;
	
	@FindBy(xpath = "//label[normalize-space()='Dry Storage']")
	@CacheLookup
	WebElement lnktextdrystorage;
	
	@FindBy(xpath = "//label[normalize-space()='Chilled Storage']")
	@CacheLookup
	WebElement lnktextchilledstorage;
	
	@FindBy(xpath = "//label[normalize-space()='Frozen Storage']")
	@CacheLookup
	WebElement lnktextfrozenstorage;

	@FindBy(xpath = "//p[normalize-space()='STANDARD SIZE']")
	@CacheLookup
	WebElement lnktextstandardsize;
	
	@FindBy(xpath = "//p[normalize-space()='EUROPEAN SIZE']")
	@CacheLookup
	WebElement lnktexteuropeansize;
	
	@FindBy(xpath = "//p[normalize-space()='CHEP']")
	@CacheLookup
	WebElement lnktextchepsize;
	
	@FindBy(xpath = "(//input[@class='form-control quantity ng-untouched ng-pristine ng-valid'])[1]")
	@CacheLookup
	WebElement txtboxquantity;
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[1]")
	@CacheLookup
	WebElement txtboxweightperpallet;
	
	@FindBy(xpath = "(//button[normalize-space()='ADD'])[1]")
	@CacheLookup
	WebElement btnaddstandard;
	
	@FindBy(xpath = "(//button[normalize-space()='ADD'])[1]")
	@CacheLookup
	WebElement btnaddeuropean;
	
	@FindBy(xpath = "//img[@alt='delete-icon']")
	@CacheLookup
	public WebElement btnclosestandandardcard;
	
	@FindBy(xpath = "//button[normalize-space()='Find Best Rates']")
	@CacheLookup
	WebElement btnfindbestrates;
	
	@FindBy(id = "dropdowncountry")
	@CacheLookup
	WebElement ddcurrency;
	
	@FindBy(xpath = "(//button[normalize-space()='Proceed'])[1]")
	@CacheLookup
	WebElement btnproceed;
	
	@FindBy(xpath = "//a[normalize-space()='MODIFY SEARCH']")
	@CacheLookup
	WebElement lnktextmodifysearch;
	
	@FindBy(xpath = "//button[normalize-space()='Yes, Modify search criteria']")
	@CacheLookup
	WebElement btnkyesmodifysearchcriteria;
	
	@FindBy(xpath = "//img[@alt='delete-icon']")
	@CacheLookup
	public WebElement btnclosestandandardcard2;
	
	@FindBy(xpath = "//div[@id='wh-st-tg']//span[contains(text(),'For Warehouse')]")
	@CacheLookup
	public WebElement ddstorageassertion;
	
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

	public void clickwarehousing() {
		btnwarehousing.click();

	}

	public void clickstoragedropdown() {
		ddstorage.click();

	}

	public void setstorage(String storage) {
		List<WebElement> allOptions = ldriver.findElements(By.xpath("//div[@aria-labelledby='wh-st-tg']//div//span"));

		for (int i = 0; i < allOptions.size(); i++) {
			
			if (allOptions.get(i).getText().toString().equals(storage)) {
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
	
	public void clickrentuntil() {
		datepickerrentuntil.click();

	}

	public void setrentuntilmonthyear(String rentuntilmonthyear) {
		while (true) {
			WebElement monthyeartext = ldriver.findElement(By.xpath("//div[@class='ngb-dp-month-name']"));
			String monthyear = monthyeartext.getText();
			if (monthyear.equals(rentuntilmonthyear)) {
				break;

			}

			else {
				ldriver.findElement(By.xpath("//button[@title='Next month']//span[@class='ngb-dp-navigation-chevron']"))
						.click();
			}
		}
	}

	public void setrentuntilday(String rentuntilday) {
		List<WebElement> allOptions = ldriver.findElements(By.xpath("//div//div//div//div//div[@class='btn-light']"));
		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().equals(rentuntilday)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}
	
	public void clickbypallet() {
		lnktextbypallet.click();

	}
	
	public void clickbyarea() {
		lnktextbyarea.click();

	}
	
	
	public void clickacstorage() {
		lnktextacstorage.click();

	}
	
	public void clickdrystorage() {
		lnktextdrystorage.click();

	}
	
	public void clickchilledstorage() {
		lnktextchilledstorage.click();

	}
	
	public void clickfrozenstorage() {
		lnktextfrozenstorage.click();

	}
	
	public void clickstandardsize() {
		lnktextstandardsize.click();

	}
	
	public void clickeuropeansize() {
		lnktexteuropeansize.click();

	}
	
	public void clickchepsize() {
		lnktextchepsize.click();

	}
	
	
	public void setquantity(String quantity) {
		txtboxquantity.sendKeys(quantity);

	}
	
	public void setweightperpallet(String weightperpallet) {
		txtboxweightperpallet.sendKeys(weightperpallet);

	}
	
	public void clickaddstandard() {
		btnaddstandard.click();

	}
	
	public void clickaddeuropean() {
		btnaddeuropean.click();

	}
	
	public void clickclosestandandardcard() {
		btnclosestandandardcard.click();

	}
	
	public void clickfindbestrates() {
		btnfindbestrates.click();

	}
	
	public void clickcurrency() {
		ddcurrency.click();

	}

	public void setcurrency(String currency) {
		List<WebElement> allOptions = ldriver.findElements(By.xpath("//div[@aria-labelledby ='dropdowncountry']//ul/li"));

		for (int i = 0; i < allOptions.size(); i++) {
			
			if (allOptions.get(i).getText().toString().equals(currency)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}
	
	public void clickproceed() {
		btnproceed.click();

	}
	
	public void clickmodifysearch() {
		lnktextmodifysearch.click();

	}
	
	public void clickyesmodifysearchcriteria() {
		btnkyesmodifysearchcriteria.click();

	}
}
