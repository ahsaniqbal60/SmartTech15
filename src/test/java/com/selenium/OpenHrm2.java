package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenHrm2 {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	     
	   
	      String url = " https://opensource-demo.orangehrmlive.com/";
	      driver.get(url);
	      
	     

	}

}
