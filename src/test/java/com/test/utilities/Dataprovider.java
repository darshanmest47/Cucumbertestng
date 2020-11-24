package com.test.utilities;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Dataprovider {
	HashMap data = Randomtestdatagenerator.arrList();
	
	public Object dispDataProviderEmail() {
		
		
		return data.get("email");
		
	}
	
	public Object dispDataProviderPassword() {
		return data.get("password");
	}

}
