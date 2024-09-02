package org.omkar.programsPractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksProgram {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		
		// to get all the links from the page
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links "+links.size());
		
		
		for(WebElement link:links)
		{
			String hrefValue=link.getAttribute("href");
			if(hrefValue==null || hrefValue.isEmpty())
			{
				System.out.println("Not possible to check null or empty link..");
			}
			
			
			try {
				//convert hrefValue from String to URL
				URL linkURL=new URL(hrefValue);
				
				//To open connection to the server
				HttpURLConnection conn=(HttpURLConnection) linkURL.openConnection(); //This is type casting of URL into HttpURLConnection
				
				//To sent request to the server
				conn.connect();
				if(conn.getResponseCode()>=400)
				{
					System.out.println("Broken link = "+linkURL.toString());
				}
				else
				{
					System.out.println("Not a Broken link = "+linkURL.toString());
				}
				
			}catch(Exception e)
			{
				e.getMessage();
			}
			
			
			
		}
		
		
	}

}
