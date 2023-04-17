package com.hashmove.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;
import com.hashmove.utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig readConfig = new ReadConfig();
	
	String devdffcustomerportalurl = readConfig.getdevdffcustomerportalurl();
	String qacustomerportalurl = readConfig.getqacustomerportalurl();
	String qaproviderportalurl = readConfig.getqaproviderportalurl();
	String prehubcustomerportalurl = readConfig.getprehubcustomerportalurl();
	String prehubproviderportalurl = readConfig.getprehubproviderportalurl();
	
	String browser = readConfig.getBrowser();

	public static WebDriver driver;
	public static Logger logger;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static FileInputStream fis;
	
	public static String getCellData(int rownum, int col, String sheetname) throws IOException {

		fis = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(sheetname);
		row = sheet.getRow(rownum);
		cell = row.getCell(col);
		
		String data= cell.getStringCellValue();
		
	    // Check the cell type
        switch(cell.getCellType())
        {
        case STRING:
            System.out.print(cell.getStringCellValue());
            break;
              
        case NUMERIC:
            System.out.print(cell.getNumericCellValue()); 
            break;
              
        case FORMULA:
            System.out.print(cell.getStringCellValue());
            break;
            
		default:
			break;
        }
		wb.close();
		fis.close();
		return data;

	}
	

	

	@BeforeClass
	public void setup()

	{
		switch (browser.toLowerCase()) {
		case "chrome":
			
			//Create instance of ChromeOptions Class
			ChromeOptions chromeOptions = new ChromeOptions();
			
			//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
			chromeOptions.setAcceptInsecureCerts(true);
			chromeOptions.addArguments("no-sandbox");
			chromeOptions.addArguments("--remote-allow-origins=*");

			WebDriverManager.chromedriver().setup();
			
			//Creating instance of Chrome driver by passing reference of ChromeOptions object
			driver = new ChromeDriver(chromeOptions);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			//driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
			
			break;

		case "msedge":
			//Creating an object of EdgeOptions class
			EdgeOptions edgeOptions = new EdgeOptions();
					
			//Accepting the Insecure certificates through boolean parameter
			edgeOptions.setAcceptInsecureCerts(true);
			edgeOptions.addArguments("no-sandbox");
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(edgeOptions);
			break;

		case "firefox":
			
			//Creating an object of the FirefoxOptions Class
			FirefoxOptions firefoxOptions = new FirefoxOptions();
					
			//Using the setAcceptInsecureCerts() method to pass parameter as False
			firefoxOptions .setAcceptInsecureCerts(true);
			firefoxOptions.addArguments("no-sandbox");
			//Creating instance of Firefox driver by passing reference of ChromeOptions object
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(firefoxOptions);
			break;

		default:
			driver = null;
			break;
		}
		
		// For Logging
		logger = LogManager.getLogger("HashMove");

	}

	@AfterClass
	public void teardown()

	{
		driver.quit();

	}

}
