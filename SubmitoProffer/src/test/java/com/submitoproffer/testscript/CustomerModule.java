package com.submitoproffer.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test
public static void demo() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Reporter.log(driver.getTitle(),true);
}
	@Test
	public static void demoA() {
		
		//driver.get("https://www.instagram.com");
		Reporter.log("hai",true);
}
	
}