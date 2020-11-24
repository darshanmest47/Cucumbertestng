package org.com.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokencheck {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse2\\Newtest\\src\\test\\java\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.yahoo.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++) {
			verifyLinks(links.get(i).getAttribute("href"));
		}
		driver.quit();
	}
	
	
	public static void verifyLinks(String linksver) throws IOException {
		URL links=new URL(linksver);
		
		HttpURLConnection conn = (HttpURLConnection)links.openConnection();
		
		if(conn.getResponseCode()==200) {
			System.out.println("Link is "+linksver+" "+conn.getResponseMessage()+" "+conn.getResponseCode());
		}
		else {
			System.out.println("Link is "+linksver+" "+conn.getResponseCode()+" "+conn.getResponseMessage());
		}
	}

}
