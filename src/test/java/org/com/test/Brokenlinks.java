package org.com.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse2\\Newtest\\src\\test\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
//		driver.get("http://www.d2dereererteewe.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getAttribute("href"));
			
			verifyLink(links.get(i).getAttribute("href"));
			
		}
		
//		for(int j=0;j<links.size();j++) {
//			links.get(j).click();
//		}
		
//		verifyLink("http://www.d2dereererteewe.com/");
		driver.quit();
	}
	
	public static void verifyLink(String urlLink) throws IOException {
		
		URL links = new URL(urlLink);
		
		HttpURLConnection conn = (HttpURLConnection)links.openConnection();
		
		if(conn.getResponseCode() == 200) {
			System.out.println(conn.getResponseMessage()+" "+conn.getResponseCode());
		}
		else {
			System.out.println(conn.getResponseMessage()+" "+conn.getResponseCode());
		}
//		else if(conn.getResponseCode() == conn.HTTP_NOT_FOUND) {
//			System.out.println(conn.getResponseMessage()+" "+conn.HTTP_NOT_FOUND+ conn.getResponseCode());
//		}
		
	}

}
