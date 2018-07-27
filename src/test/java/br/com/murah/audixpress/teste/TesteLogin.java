package br.com.murah.audixpress.teste;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import br.com.murah.audixpress.core.DSL;
import br.com.murah.audixpress.core.DriverFactory;
import br.com.murah.audixpress.page.LoginPage;
import br.com.murah.audixpress.page.ZLinks;

import org.testng.annotations.BeforeTest;

import static br.com.murah.audixpress.core.DriverFactory.getDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TesteLogin {
	
	public LoginPage pageLogin = new LoginPage();
	public ZLinks links = new ZLinks();
	
	 
  @BeforeTest
  public void beforeTest() {
	//getDriver().get("http://192.168.0.76:8080/murah/login.jsf");
	 
	   
  }
  

  @AfterTest
  public void afterTest() {
	  DriverFactory.killDriver();
  }
  @Test
  public void logar() throws InterruptedException{
	   
	  pageLogin.logar();
	  DriverFactory.waitPage();
	  links.mouseCore();
	  Thread.sleep(3000);
	  //pageLogin.desLogar();
	 
	   
  }


 
   

}
