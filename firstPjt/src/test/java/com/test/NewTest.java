package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  System.out.println("This is my First Maven Test");
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://erail.in");
	  Thread.sleep(5000);
	  driver.close();
	  
  }
}
