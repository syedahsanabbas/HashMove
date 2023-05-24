package com.hashmove.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
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
	
	@FindBy(xpath = "(//div[@class='col-12 d-flex flex-row justify-content-between align-items-center']//div)[1]")
	@CacheLookup
	WebElement tglebtncustomclearance;
	
	@FindBy(xpath = "//input[@placeholder='eg: Port Name']")
	@CacheLookup
	public WebElement txtboxport;

	@FindBy(id = "fcl_cont_ddl")
	@CacheLookup
	WebElement ddcontainersize;

	@FindBy(xpath = "//button[contains(text(),'Add')]")
	@CacheLookup
	WebElement btnaddcustomclearance;
	
	@FindBy(xpath = "//input[@placeholder='Qty']")
	@CacheLookup
	WebElement txboxcontainerquantity;
	
	@FindBy(xpath = "(//div[@class='col-12 d-flex flex-row justify-content-between align-items-center']//div)[2]")
	@CacheLookup
	WebElement tglebtninsuranceservices;
	
	@FindBy(xpath = "//div[@class='switch-box ng-star-inserted']//span[@class='switch switch-small']")
	@CacheLookup
	WebElement tglebtniaccepttermsandconditions;
	
	@FindBy(xpath = "//input[@placeholder='0.00']")
	@CacheLookup
	WebElement txboxvalueofgoods;
	
	@FindBy(xpath = "(//li//span[@style='text-transform: uppercase !important;'])[1]")
	@CacheLookup
	WebElement lblwarehousecharges;
	
	@FindBy(xpath = "(//li//span[@class='amount-text ng-star-inserted'])[1]")
	@CacheLookup
	WebElement lblcustomclearancerate;
	
	@FindBy(xpath = "(//li//span[@class='amount-text ng-star-inserted'])[2]")
	@CacheLookup
	WebElement lblinsurancepremium;
	
	@FindBy(xpath = "(//div[@class='d-flex flex-column justify-content-between']//div//span)[2]")
	@CacheLookup
	WebElement lblgrosstotal;
	
	@FindBy(xpath = "(//div[@class='d-flex flex-column justify-content-between']//div//span)[6]")
	@CacheLookup
	WebElement lblvat;
	
	@FindBy(xpath = "(//div[@class='d-flex flex-column justify-content-between']//div//span)[8]")
	@CacheLookup
	WebElement lblnettotal;
	
	@FindBy(xpath = "//button[contains(text(),' BOOK & PAY ')]")
	@CacheLookup
	WebElement btnbookandpay;

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
	
	public void selectcustomclearance() {
		tglebtncustomclearance.click();
		
	}
	
	public String getportname() {
		return txtboxport.getAttribute("value");
		
	}
	
	public void clickcontainersizedropdown()  {
		ddcontainersize.click();
		

	}
	

	public void setcontainersize(String containersize) {
		List<WebElement> allOptions = ldriver
				.findElements(By.xpath("//div[@class='dropdown-menu show']//span"));

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().toString().contains(containersize)) {
				System.out.println("Compare equal with: " + allOptions.get(i).getText().toString());
				allOptions.get(i).click();
				break;
			}

		}
	}
	
	public void clickaddcustomclearance()  {
		btnaddcustomclearance.click();
		
	}
	
	public void setcontainerquantity(String containerquantity)  {
		txboxcontainerquantity.sendKeys(containerquantity);
		
	}
	
	public void selectinsuranceservices() {
		tglebtninsuranceservices.click();
		
	}
	
	public void setvalueofgoods(String valueofgoods)  {
		txboxvalueofgoods.sendKeys(valueofgoods);
		
	}
	
	public String getwarehousecharges() {
		return lblwarehousecharges.getText().toString();
		
	}
	
	public String getcustomclearancerate() {
		return lblcustomclearancerate.getText().toString();
		
	}
	
	public String getinsurancepremium() {
		return lblinsurancepremium.getText().toString();
		
	}
	
	
	public String getgrosstotal() {
		return lblgrosstotal.getText().toString();
		
	}
	
	
	public String getvat() {
		return lblvat.getText().toString();
		
	}
	
	public String getnettotal() {
		return lblnettotal.getText().toString();
		
	}
	
	public void selectiaccepttermsandconditions() {
		tglebtniaccepttermsandconditions.click();
		
	}
	
	public void clickbookandpay() {
		btnbookandpay.click();
		
	}
	
}


