package br.com.murah.audixpress.page;

import static br.com.murah.audixpress.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.com.murah.audixpress.core.DriverFactory;

public class ZLinks {
	public BotoesPage bntPage = new BotoesPage();
	int tempoX= 500;
	By campoTitulo = By.className("rich-label-text-decor");//By.xpath("//div[text()[contains(.,'CORE')]]");
	 
	 
	 public void mouseCore() throws InterruptedException{
		 DriverFactory.waitElement(campoTitulo);
		 DriverFactory.moveMouse(campoTitulo);
		  
		 Thread.sleep(3000);
		 
	 }
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
}
