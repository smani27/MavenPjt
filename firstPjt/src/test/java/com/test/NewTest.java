package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  System.out.println("This is my First Maven Test");
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  Thread.sleep(5000);
	  System.out.println("Bamboo...");
  }
}
