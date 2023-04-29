package com.hashmove.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties properties;
	String path = System.getProperty("user.dir") + "\\Configuration\\Config.properties";
	// Constructor
	public ReadConfig()

	{
		try {
			properties = new Properties();
			FileInputStream fis;
			fis = new FileInputStream(path);

			properties.load(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public String getdevdffcustomerportalurl()

	{
		String value = properties.getProperty("devdffcustomerportalurl");
		if (value != null)
			return value;

		else
			throw new RuntimeException("DEV DFF Customer Portal url is not Specfied in Config file.");

	}
	
	public String getqadffcustomerportalurl()

	{
		String value = properties.getProperty("qadffcustomerportalurl");
		if (value != null)
			return value;

		else
			throw new RuntimeException("QA DFF Customer Portal url is not Specfied in Config file.");

	}

	public String getqacustomerportalurl()

	{
		String value = properties.getProperty("qacustomerportalurl");
		if (value != null)
			return value;

		else
			throw new RuntimeException("QA Customer Portal url is not Specfied in Config file.");

	}
	
	public String getprehubcustomerportalurl()

	{
		String value = properties.getProperty("prehubcustomerportalurl");
		if (value != null)
			return value;

		else
			throw new RuntimeException("Pre Hub Customer Portal url is not Specfied in Config file.");

	}
	
	public String getqaproviderportalurl()

	{
	String value = properties.getProperty("qaproviderportalurl");
	if (value != null)
	return value;

	else
	throw new RuntimeException("QA Provider Portal url is not Specfied in Config file.");

	}
	
	public String getprehubproviderportalurl()

	{
	String value = properties.getProperty("prehubproviderportalurl");
	if (value != null)
	return value;

	else
	throw new RuntimeException("Pre Hub Provider Portal url is not Specfied in Config file.");

	}

	
	public String getBrowser()

	{
		String value = properties.getProperty("browser");
		if (value != null)
			return value;

		else
			throw new RuntimeException("Browser is not Specfied in Config file.");

	}

}
