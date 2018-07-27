package br.com.murah.audixpress.teste;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import br.com.murah.audixpress.core.DSL;
import br.com.murah.audixpress.core.DriverFactory;

import org.testng.annotations.BeforeTest;

import static br.com.murah.audixpress.core.DriverFactory.getDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	 
	private DSL dsl;
  @Test
  public void f() {
  }
   
  @BeforeTest
  public void beforeTest() {
	getDriver().get("http://localhost:7777/audi-web-core/login.jsf");
	
	 
  }
  

  @AfterTest
  public void afterTest() {
	  DriverFactory.killDriver();
  }

}
