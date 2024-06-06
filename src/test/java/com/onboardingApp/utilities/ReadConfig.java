package com.onboardingApp.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties p;
	public ReadConfig() {
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			p = new Properties();
			p.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception is:" +e.getMessage());
		}
	}

	public String getApplicationURL() {
		String url = p.getProperty("baseURL");
		return url;
	}
	
	public String getUserName() {
		String username = p.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String pwd = p.getProperty("password");
		return pwd;
	}
	
	public String getChromerPath() {
		String chromepath = p.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirefoxPath() {
		String firefoxpath = p.getProperty("firefoxpath");
		return firefoxpath;
	}
}
