package com.test.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class Randomtestdatagenerator {
	public static ArrayList arr = new ArrayList();
	 static HashMap hs = new HashMap();
	
	
	public static String randomUsernameGenerator() {
		String username = RandomStringUtils.randomAlphabetic(3);
		
		hs.put("username","Darshan"+username);
		return ("Darshan"+username);
	}
	
	
	public static String randomLastnameGenerator() {
		String lastname = RandomStringUtils.randomAlphabetic(3);
		hs.put("lastname","Mesta"+lastname);
		
		return ("Mesta"+lastname);
	}
	
	
	public static String randomEmailGenerator() {
		String email = RandomStringUtils.randomAlphabetic(5);
		hs.put("email","darshan"+email+"@xyz.com");
		return ("darshan"+email+"@xyz.com");
	}
	
	
	public static String randomPhoneGenerator() {
		String phone = RandomStringUtils.randomNumeric(10);
		hs.put("phone",phone);
		hs.put("password","DarshanKA47");
		return (phone);
		
	}
	
	
	public static  HashMap arrList() {
		
		
		return hs;
	}
	
	
	
	
	

}
