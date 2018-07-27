package br.com.murah.audixpress.page;

import static br.com.murah.audixpress.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.murah.audixpress.core.DriverFactory;

public class LoginPage {

	int tempoX= 500;
	By campoLogin = By.name("j_username");
	By campoSenha = By.name("j_password");
	By bntEntrar = By.cssSelector("div.login-btn:nth-child(3) > input:nth-child(2)");//By.xpath("//*[contains(text(),'Entrar')]");
	By bntResetSenha = By.linkText("Esqueci a senha");
	By bntSair = By.xpath("//*[text()[contains(.,'Sair')]]");
	By bntUser = By.xpath("//div[text()[contains(.,'Administrador')]]"); //By.xpath("//*[@id='formMenu']/div/div[3]/div/div");
	 
	
	
	
	 public void setLogin( String texto){
		 DriverFactory.waitElement(campoLogin);
			getDriver().findElement(campoLogin).clear();
			getDriver().findElement(campoLogin).sendKeys(texto);
	}
	 public void setSenha( String texto){
			getDriver().findElement(campoSenha).clear();
			getDriver().findElement(campoSenha).sendKeys(texto);
			getDriver().findElement(bntEntrar).sendKeys(texto);
	}
	 
	 public void logar() throws InterruptedException{
		 	getDriver().get("https://dpspdev.audixpress.com.br/audixpress/login.jsf");
		 	//Thread.sleep(tempoX);
		 	
			 setLogin("adm");
			 setSenha("murah");
			 getDriver().findElement(bntEntrar).click();
			 
	 } 
	 public void desLogar() throws InterruptedException{
		 DriverFactory.moveMouse(bntUser);
		 DriverFactory.moveMouse(bntSair);
		 getDriver().findElement(bntSair).click();
		  
		 
	 } 
}
