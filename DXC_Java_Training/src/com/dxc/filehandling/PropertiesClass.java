package com.dxc.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

	public static void main(String[] args) {
		
		Properties prop = null;
		
		try {
			FileReader fileReader = new FileReader("user.properties");
			
			prop = new Properties();
			prop.load(fileReader);
			
			String userName = prop.getProperty("userName");
			String mobNum = prop.getProperty("mobileNumber");
			
			System.out.println("User Name : " + userName);
			System.out.println("User Name : " + mobNum);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
