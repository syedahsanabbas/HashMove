package com.hashmove.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RateRequestsPage {

	// Create object of Webdriver
	WebDriver ldriver;

	// Creating Constructor
	public RateRequestsPage(WebDriver rdriver)

	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// Identify All Web Elements on Rate Request Page

	@FindBy(xpath = "//span[@class='pull-left ng-star-inserted']")
	@CacheLookup
	WebElement lnktextfilteryourrequest;
	
	@FindBy(xpath = "//span[@class='pull-left']")
	@CacheLookup
	WebElement lnktextfilteryourrequest2;
	
	@FindBy(xpath = "//span[@class='pull-left']")
	@CacheLookup
	WebElement lnktextfilteryourrequest3;

	@FindBy(xpath = "//input[@placeholder='eg. HM-401230123912']")
	@CacheLookup
	WebElement txboxrequestnumber;
	
	@FindBy(xpath = "//input[@placeholder='eg. HM-401230123912']")
	@CacheLookup
	WebElement txboxrequestnumber2;

	@FindBy(xpath = "//input[@placeholder='eg. HM-401230123912']")
	@CacheLookup
	WebElement txboxrequestnumber3;
	
	@FindBy(xpath = "//button[@class='btn btn-primary w-100 btn-lg']")
	@CacheLookup
	WebElement btnfilterrecords;
	
	@FindBy(xpath = "//button[@class='btn btn-primary w-100 btn-lg']")
	@CacheLookup
	WebElement btnfilterrecords2;
	
	@FindBy(xpath = "//button[@class='btn btn-primary w-100 btn-lg']")
	@CacheLookup
	WebElement btnfilterrecords3;
	
	@FindBy(xpath = "//a[normalize-space()='Accept']")
	@CacheLookup
	WebElement btnaccept;
	
	@FindBy(xpath = "//a[normalize-space()='Accept']")
	@CacheLookup
	WebElement btnaccept2;

	@FindBy(xpath = "//button[normalize-space()='Provide Your Quote']")
	@CacheLookup
	WebElement btnprovideyourquote;

	@FindBy(xpath = "//input[@placeholder='e.g: Maersk Shipping']")
	@CacheLookup
	WebElement txboxshipingline;

	@FindBy(xpath = "(//div[@class='form-group combine-filed-popup-right']//input)[2]")
	@CacheLookup
	WebElement txboxratepercontainer;
	
	@FindBy(xpath = "(//div[@class='form-group combine-filed-popup-right']//input)[2]")
	@CacheLookup
	WebElement txboxratepercbm;
	
	@FindBy(xpath = "(//div[@class='form-group combine-filed-popup-right']//input)[3]")
	@CacheLookup
	WebElement txboxchargeablecbm;

	@FindBy(xpath = "(//input[@class='form-control pr-0 pl-2 ng-untouched ng-pristine ng-valid'])[1]")
	@CacheLookup
	WebElement txboxbillofloading;
	
	@FindBy(xpath = "(//input[@class='form-control pr-0 pl-2 ng-untouched ng-pristine ng-valid'])[1]")
	@CacheLookup
	WebElement txboxlcldestuffing;

	@FindBy(xpath = "(//input[@class='form-control pr-0 pl-2 ng-untouched ng-pristine ng-valid'])[1]")
	@CacheLookup
	WebElement txboxlolo;

	@FindBy(xpath = "(//input[@class='form-control pr-0 pl-2 ng-untouched ng-pristine ng-valid'])[1]")
	@CacheLookup
	WebElement txboxsealcharges;
	
	@FindBy(xpath = "(//input[@class='form-control pr-0 pl-2 ng-untouched ng-pristine ng-valid'])[1]")
	@CacheLookup
	WebElement txboxporthandling;

	@FindBy(xpath = "(//input[@class='form-control pr-0 pl-2 ng-untouched ng-pristine ng-valid'])[1]")
	@CacheLookup
	WebElement txboxterminalhandlingcharge;

	@FindBy(xpath = "//div[@class='row mt-4 validity-date']//input[@id='dpicker']")
	@CacheLookup
	public WebElement datepickerratevaliditystart;

	@FindBy(xpath = "//div[@class='row mt-4 validity-date']//input[@id='dpicker2']")
	@CacheLookup
	public WebElement datepickerratevalidityend;
	
	@FindBy(xpath = "(//span[@class = 'switch switch-medium'])[1]")
	@CacheLookup
	WebElement btntgliacceptcustomerpaymentterms;

	@FindBy(xpath = "//button[@class='btn btn-primary hvr-sweep-to-right text-uppercase ng-star-inserted']")
	@CacheLookup
	WebElement btnsaveandclose;

	@FindBy(xpath = "//button[@class='btn btn-primary hvr-sweep-to-right mb-3 pt-2 pb-2 pl-4 pr-4']")
	@CacheLookup
	WebElement btnWouldyouliketoproceed;
	
	@FindBy(xpath = "//*[name()='path' and contains(@d,'M473.677,2')]")
	@CacheLookup
	WebElement btnrefresh;
	
	@FindBy(xpath = "//span[contains(text(),'View Quotes')]")
	@CacheLookup
	WebElement lnktextviewquotes;
	
	@FindBy(xpath = "(//span[contains(text(),'Book Now')])[1]")
	@CacheLookup
	WebElement lnktextbooknow;

	// Identify Action on all Web Elements

	public void clickfilteryourrequest() {
		lnktextfilteryourrequest.click();

	}

	public void clickfilteryourrequest2() {
		lnktextfilteryourrequest2.click();

	}
	
	public void clickfilteryourrequest3() {
		lnktextfilteryourrequest3.click();

	}
	
	public void setrequestnumber(String requestnumber) {
		txboxrequestnumber.clear();
		txboxrequestnumber.sendKeys(requestnumber);

	}
	
	public void setrequestnumber2(String requestnumber) {
		txboxrequestnumber2.clear();
		txboxrequestnumber2.sendKeys(requestnumber);

	}
	
	public void setrequestnumber3(String requestnumber) {
		txboxrequestnumber3.clear();
		txboxrequestnumber3.sendKeys(requestnumber);

	}

	public void clickfilterrecords() {
		btnfilterrecords.click();

	}
	
	public void clickfilterrecords2() {
		btnfilterrecords2.click();

	}
	
	public void clickfilterrecords3() {
		btnfilterrecords3.click();

	}

	public void clickaccept() {
		btnaccept.click();

	}
	
	public void clickaccept2() {
		btnaccept2.click();

	}


	public void clickprovideyourquote() {
		btnprovideyourquote.click();

	}

	public void setshipingline(String shipingline) throws InterruptedException {
		txboxshipingline.sendKeys(shipingline);
		Thread.sleep(1000);
		txboxshipingline.sendKeys(Keys.ENTER);

	}

	public void setratepercontainer(String ratepercontainer) {
		txboxratepercontainer.sendKeys(ratepercontainer);

	}
	
	public void setratepercbm(String ratepercbm) {
		txboxratepercbm.sendKeys(ratepercbm);

	}

	public void setchargeablecbm(String chargeablecbm) {
		txboxchargeablecbm.clear();
		txboxchargeablecbm.sendKeys(chargeablecbm);

	}
	
	public void setbillofloading(String billofloading) {
		txboxbillofloading.sendKeys(billofloading);

	}
	
	public void setlcldestuffing(String lcldestuffing) {
		txboxlcldestuffing.sendKeys(lcldestuffing);

	}

	public void setlolo(String lolo) {
		txboxlolo.sendKeys(lolo);

	}

	public void setporthandling(String porthandling) {
		txboxporthandling.sendKeys(porthandling);

	}

	public void setsealcharges(String sealcharges) {
		txboxsealcharges.sendKeys(sealcharges);

	}

	public void setterminalhandlingcharge(String terminalhandlingcharge) {
		txboxterminalhandlingcharge.sendKeys(terminalhandlingcharge);

	}
	
	
	public void clickratevaliditystart() {
		datepickerratevaliditystart.click();

	}

	public void setratevaliditystartmonthyear(String ratevaliditystartmonthyear) {
		while (true) {
			WebElement monthyeartext = ldriver
					.findElement(By.xpath("(//div[@class='ngb-dp-month-name ng-star-inserted'])[1]"));
			String monthyear = monthyeartext.getText();
			if (monthyear.equals(ratevaliditystartmonthyear)) {
				break;

			}

			else {
				ldriver.findElement(By.xpath("//button[@title='Next month']//span[@class='ngb-dp-navigation-chevron']"))
						.click();
			}
		}
	}

	public void setratevaliditystartday(String ratevaliditystartday) throws InterruptedException {
		
			List<WebElement> allOptions = ldriver
					.findElements(By.xpath("(//div[@class='ngb-dp-month ng-star-inserted'])[1]//div//div//div[@class='btn-light ng-star-inserted']"));
			for (int i = 0; i < allOptions.size(); i++) {
				System.out.println("Excel" + ratevaliditystartday);
				System.out.println("Application" + allOptions.get(i).getText().toString());
				if (allOptions.get(i).getText().toString().equals(ratevaliditystartday)) {
					System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
					allOptions.get(i).click();
					break;
				}
			}
		

	}
	
	
	public void clickratevalidityend() {
		datepickerratevalidityend.click();

	}

	public void setratevalidityendmonthyear(String ratevalidityendmonthyear) {
		while (true) {
			WebElement monthyeartext = ldriver
					.findElement(By.xpath("(//div[@class='ngb-dp-month-name ng-star-inserted'])[2]"));
			String monthyear = monthyeartext.getText();
			if (monthyear.equals(ratevalidityendmonthyear)) {
				break;

			}

			else {
				ldriver.findElement(By.xpath("//button[@title='Next month']//span[@class='ngb-dp-navigation-chevron']"))
						.click();
			}
		}
	}

	public void setratevalidityendday(String ratevalidityendday) throws InterruptedException {
		
			List<WebElement> allOptions = ldriver
					.findElements(By.xpath("(//div[@class='ngb-dp-month ng-star-inserted'])[2]//div//div//div[@class='btn-light ng-star-inserted']"));
			for (int i = 0; i < allOptions.size(); i++) {
				System.out.println("Excel" + ratevalidityendday);
				System.out.println("Application" + allOptions.get(i).getText().toString());
				System.out.println("Size" + allOptions.size());
				if (allOptions.get(i).getText().toString().equals(ratevalidityendday)) {
					System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
					allOptions.get(i).click();
					break;
				}
			}
		

	}
	
	public void selectiacceptcustomerpaymentterms() {
		btntgliacceptcustomerpaymentterms.click();

	}

	public void clicksaveandclose() {
		btnsaveandclose.click();

	}
	
	public void clickWouldyouliketoproceed() {
		btnWouldyouliketoproceed.click();

	}
	
	public void clickrefresh() {
		btnrefresh.click();

	}
	
	public void clickviewquotes() {
		lnktextviewquotes.click();

	}
	
	public void clickbooknow() {
		lnktextbooknow.click();

	}

}
