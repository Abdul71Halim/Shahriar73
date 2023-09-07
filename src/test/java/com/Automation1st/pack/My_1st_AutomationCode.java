package com.Automation1st.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class My_1st_AutomationCode {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();//(Ctrl+Shift+o)
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		//driver.get("https://www.youtube.com/");
		driver.quit();
		
		WebDriver driver1 = new FirefoxDriver();//(Ctrl+Shift+o)
		driver1.manage().window().maximize();
		//driver1.get("https://www.rediff.com/");
		driver1.get("https://www.tutorialsninja.com/");
		driver1.quit();
		
		
		WebDriver driver2 = new EdgeDriver();//(Ctrl+Shift+o)
		driver2.manage().window().maximize();
		driver2.get("https://www.flipkart.com/");
		//driver2.get("https://www.youtube.com/");
		driver2.quit();
		
		//WebDriver driver3 = new SafariDriver();//(Ctrl+Shift+o)
		//driver3.manage().window().maximize();
		//driver3.get("https://www.youtube.com/");
		//driver3.quit();
		

	}

}
