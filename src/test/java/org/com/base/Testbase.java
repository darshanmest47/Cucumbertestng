package org.com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {

	
	public static Properties prop;
	public static WebDriver driver;
	
	public Testbase() throws IOException {
		prop = new Properties();
		
		FileInputStream fis = new FileInputStream("E:\\eclipse\\POMBDD\\src\\test\\java\\org\\config\\properties\\Config.properties");
		
		prop.load(fis);
	}
	
	public void initialize() {
		String browser = prop.getProperty("BROWSER");
		
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\POMBDD\\src\\test\\java\\drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get(prop.getProperty("URL"));
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver.get(prop.getProperty("URL"));
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}
	
	public void teardown() {
		driver.quit();
	}
	

	

}
