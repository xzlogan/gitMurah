package br.com.murah.audixpress.page;

import static br.com.murah.audixpress.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.com.murah.audixpress.core.DriverFactory;

public class TestePage {
	public BotoesPage bntPage = new BotoesPage();
	int tempoX= 500;
	By campoTitulo = By.xpath("//span[text()[contains(.,'Título')]]/../../td[3]/input");
	By campoDescricao = By.xpath("//span[text()[contains(.,'Descrição')]]/../../td[3]/textarea");
	By campoProcedimentoTeste = By.xpath("//span[text()[contains(.,' Procedimento Teste')]]/../../td[3]/textarea");
	By campoFrequenciaExecicao = By.xpath("//span[text()[contains(.,' Frequência Execução')]]/../../td[3]/select");
	By campoDataInicio = By.xpath("//span[text()[contains(.,'Data Início')]]/../../td[3]/span/input"); 
	By campoPeso = By.xpath("//span[text()[contains(.,'Peso')]]/../../td[3]/input");
	By campoStatus = By.xpath("//span[text()[contains(.,'Status')]]/../../td[3]/input"); 
	By campoCodigo = By.xpath("//span[text()[contains(.,'Código')]]/../../td[3]/input"); 
	By campoCargo = By.xpath("//span[text()[contains(.,'Cargo')]]/../../td[3]/div/span/a"); 
	By valorCargo = By.xpath("//*[text()[contains(.,'Administrador do AudiXpress')]]"); 
	By campoUsuario = By.xpath("//span[text()[contains(.,'* Usuário(s)')]]/../../td[3]//a");
	By valorUsuario = By.xpath("//*[text()[contains(.,'Sidney Lira')]]/../td/input");
	By bntAdicionar = By.xpath("//*[@class= 'fa fa-plus']/../span");
	
	
	
	
    public void preencherCampos() throws InterruptedException{
		 Thread.sleep(1000);
		 getDriver().findElement(campoTitulo).sendKeys("nomeTeste"); //campo unico
		 getDriver().findElement(campoDescricao).sendKeys("Validar o Campo pelo Robo"); 
		 getDriver().findElement(campoProcedimentoTeste).sendKeys("Validar o Campo pelo Robo"); 
		 DriverFactory.selecOption(campoFrequenciaExecicao, "Diário");
		 getDriver().findElement(campoDataInicio).sendKeys("01/06/2018"); 
		 getDriver().findElement(campoPeso).sendKeys("1235"); 
		 getDriver().findElement(campoCodigo).sendKeys("codTeste"); 
		 getDriver().findElement(campoCargo).click();
		 DriverFactory.popUp();
		 getDriver().findElement(valorCargo).click();
		 getDriver().findElement(campoUsuario).click();
		 DriverFactory.popUp();
		 getDriver().findElement(valorUsuario).click();
		 getDriver().findElement(bntAdicionar).click();
		 Thread.sleep(5000);
		 bntPage.salvar();
	 }
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
}
