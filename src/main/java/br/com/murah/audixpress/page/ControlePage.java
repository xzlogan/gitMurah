package br.com.murah.audixpress.page;

import static br.com.murah.audixpress.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.com.murah.audixpress.core.DriverFactory;

public class ControlePage {
	public BotoesPage bntPage = new BotoesPage();
	int tempoX= 500;
	By campoTitulo = By.xpath("//span[text()[contains(.,'Título')]]/../../td[3]/input");
	By campoObjControle = By.xpath("//span[text()[contains(.,'Objetivo do Controle')]]/../../td[3]/textarea");
	By campoDescricao = By.xpath("//span[text()[contains(.,'Descrição')]]/../../td[3]/textarea");
	By campoCategoria = By.xpath("//span[text()[contains(.,'Categoria')]]/../../td[3]/div/span/a");
	By valorCategoria = By.xpath("//*[text()[contains(.,'categoriaRobo')]]");
	By campoFormaExecucao = By.xpath("//*[text()[contains(.,'Forma de Execução')]]/../../td[3]/select");
	By campoFormaAtuacao = By.xpath("//span[text()[contains(.,' Forma de Atuação')]]/../../td[3]/select");
	By campoBiReferenciada = By.xpath("//span[text()[contains(.,'Biblioteca Referenciada')]]/../../td[3]/select");
	By campoCodigo = By.xpath("//*[text()[contains(.,'Código do Controle (ACE)')]]/../../td[3]/input");
	By campoInfoAdicionais = By.xpath("//span[text()[contains(.,'Informações Adicionais')]]/../../td[3]/textarea");
	By campoStatus = By.xpath("");
	By campoDataUtlizacaoControle = By.xpath("//*[text()[contains(.,'* Data da utilização do controle')]]/../../td[3]/span/input");
	By campoFrequenciaExecucao =  By.xpath("//span[text()[contains(.,'Frequência de Execução')]]/../../td[3]/select");
	By campoCargo = By.xpath("//span[text()[contains(.,'Cargo')]]/../../td[3]/div/span/a");
	By cargoValor = By.xpath("//*[text()[contains(.,'Administrador do AudiXpress')]]");
	By campoUsuario = By.xpath("//span[text()[contains(.,'* Usuário(s)')]]/../../td[3]//a");
	By valorUsuario = By.xpath("//*[text()[contains(.,'Sidney Lira')]]/../td/input");
	By bntAdicionar = By.xpath("//*[@class= 'fa fa-plus']/../span");
	
	
	
	
	
	
    public void preencherCampos() throws InterruptedException{
		 Thread.sleep(1000);
		 getDriver().findElement(campoTitulo).sendKeys("nomeControle"); //campo unico
		 getDriver().findElement(campoObjControle).sendKeys("Validar o campo Obj de Controle pelo Robo"); 
		 getDriver().findElement(campoDescricao).sendKeys("Teste do campo Descrição pelo Robo");  
		 getDriver().findElement(campoCategoria).click(); 
		 DriverFactory.popUp();
		 getDriver().findElement(valorCategoria).click();   
		 DriverFactory.selecOption(campoFormaExecucao, "Automático");
		 DriverFactory.selecOption(campoFormaAtuacao, "Detectivo");
		 DriverFactory.selecOption(campoBiReferenciada, "Biblioteca de Controles");
		 getDriver().findElement(campoCodigo).sendKeys("codControle01");  //campo unico
		 getDriver().findElement(campoInfoAdicionais).sendKeys("Validar campo pelo Robo"); 
		 getDriver().findElement(campoDataUtlizacaoControle).sendKeys("01/06/2018"); 
		 getDriver().findElement(campoFrequenciaExecucao).sendKeys("Diário"); 
		 getDriver().findElement(campoCargo).click();
		 DriverFactory.popUp();
		 getDriver().findElement(cargoValor).click();
		 getDriver().findElement(campoUsuario).click();
		 DriverFactory.popUp();
		 getDriver().findElement(valorUsuario).click();
		 getDriver().findElement(bntAdicionar).click();
		 Thread.sleep(5000);
		 bntPage.salvar();
	 }
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
}
