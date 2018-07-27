package br.com.murah.audixpress.core;

import org.openqa.selenium.WebDriver;

public class BasePage {

	protected DSL dsl;
	WebDriver driver;
	
	public BasePage() {
		dsl = new DSL();
	}
	public void setWebDriverSelenium(WebDriver driver){
		  this.driver = driver;
	}
}
