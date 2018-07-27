package br.com.murah.audixpress.page;

import static br.com.murah.audixpress.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.com.murah.audixpress.core.DriverFactory;

public class ExecucaoControlePage {
	public BotoesPage bntPage = new BotoesPage();
	int tempoX= 500;
	 
	By campoDataAgendamento = By.xpath("//*[text()[contains(.,'Data Agendamento')]]/../../td[3]/span/input"); 
	By campoStatus = By.xpath("//*[text()[contains(.,'Status')]]/../../td[3]/select"); 
	By campoComentarios = By.xpath("//*[text()[contains(.,'Comentários')]]/../../td[3]/textarea"); 
	
    public void preencherCampos() throws InterruptedException{
		 Thread.sleep(1000);
		 bntPage.adicionar();
		  getDriver().findElement(campoDataAgendamento).sendKeys("02/06/2018"); 
		  DriverFactory.selecOption(campoStatus, "Executada");
		  getDriver().findElement(campoComentarios).sendKeys("Validar o campo pelo Robo"); 
		  bntPage.salvar();
		  
		 
	 }
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
}
