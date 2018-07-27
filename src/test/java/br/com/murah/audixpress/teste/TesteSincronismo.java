package br.com.murah.audixpress.teste;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static br.com.murah.audixpress.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.murah.audixpress.core.DSL;
import br.com.murah.audixpress.core.DriverFactory;

public class TesteSincronismo {

	private DSL dsl;

	@BeforeMethod
	public void inicializa(){
		
		getDriver().get("http://localhost:7777/audi-web-core/pages/principal.jsf");
		dsl = new DSL();
	}
	
	@AfterMethod
	public void finaliza(){
		DriverFactory.killDriver();
	}
	
	@Test
	public void deveUtilizarEsperaFixa() throws InterruptedException{
		//dsl.clicarBotao("buttonDelay");
		Thread.sleep(5000);
		dsl.escrever("novoCampo", "Deu certo?");
	}
	
	 
}
