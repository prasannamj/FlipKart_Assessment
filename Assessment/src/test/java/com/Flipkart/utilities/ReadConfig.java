package com.Flipkart.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	
	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configurations/Config.properties");
		
		try {
			FileInputStream fis =new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}catch(Exception e)
		{
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	
	
	public String GetAppURL()
	{
		String url = pro.getProperty("baseUrl");
		return url;
	}
	

	public String GetChromePath()
	{
		String ChromePath = pro.getProperty("ChromePath");
		return ChromePath;
	}
	
	public String GetIEPath()
	{
		String IEPath = pro.getProperty("IEPath");
		return IEPath;
	}
	public String GetFFPath()
	{
		String FFPath = pro.getProperty("firefoxPath");
		return FFPath;
	}
	
	
	public String Getbrowser()
	{
		String bsr = pro.getProperty("Browser");
		return bsr;
	}
}
