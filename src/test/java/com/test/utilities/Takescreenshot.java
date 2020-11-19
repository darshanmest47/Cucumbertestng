package com.test.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.com.base.Testbase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Takescreenshot extends Testbase {

	
	
	
	public Takescreenshot() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public String screenCapture(String pathname) throws IOException {
		
		System.out.println("--------------------------");
		System.out.println("Taking screenshots");
		String path = "./Screenshots/"+pathname+".png";
		System.out.println(path);
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));
		
		System.out.println("Took Screenshot");
		
		return path;
		
		
		
		
	}

}
