package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	// load config.Properties 
	Properties pro;
	public ConfigDataProvider() throws Exception {
		String pathfile="C:\\Users\\Dell\\Desktop\\Visionfolder\\Framework_Batch_13\\Config\\config.Properties";
		FileInputStream file=new FileInputStream(pathfile);
		
		pro=new Properties();
		pro.load(file);
	}

	// Url
	public String getBaseUrl() {
		return pro.getProperty("BaseUrl");
	}
}
