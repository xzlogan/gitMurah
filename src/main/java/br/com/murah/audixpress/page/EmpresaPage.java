package br.com.murah.audixpress.page;

import static br.com.murah.audixpress.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.com.murah.audixpress.core.DriverFactory;

public class EmpresaPage {
	public BotoesPage bntPage = new BotoesPage();
	int tempoX= 500;
	By campoTitulo = By.xpath("//span[text()[contains(.,'Título')]]/../../td[3]/input");
	By campoSigla = By.xpath("//span[text()[contains(.,'Sigla')]]/../../td[3]/input");
	By campoDescricao = By.xpath("//span[text()[contains(.,'Descrição')]]/../../td[3]/textarea");
	By campoCategoria = By.xpath("//span[text()[contains(.,'Categoria')]]/../../td[3]/div/a");
	By categoriaValor = By.xpath("//*[text()[contains(.,'Matriz')]]");
	By campoBiReferenciada = By.xpath("//span[text()[contains(.,'Biblioteca Referenciada')]]/../../td[3]/select");
	By campoCodigo = By.xpath("//span[text()[contains(.,'Código')]]/../../td[3]/input");
	By campoInAdicionais = By.xpath("//span[text()[contains(.,'Informações Adicionais')]]/../../td[3]/textarea");
	By campoCriticidade = By.xpath("//span[text()[contains(.,'Criticidade')]]/../../td[3]/select");
	By campoMissao = By.xpath("//span[text()[contains(.,'Missão')]]/../../td[3]/textarea");
	By campoVisao = By.xpath("//span[text()[contains(.,'Visão')]]/../../td[3]/textarea");
	By campoValores = By.xpath("//span[text()[contains(.,'Valores')]]/../../td[3]/textarea");
	By campoCargo = By.xpath("//span[text()[contains(.,'Cargo')]]/../../td[3]/div/a");
	By cargoValor = By.xpath("//*[text()[contains(.,'Administrador do AudiXpress')]]");
	 
	 
	 public void preencherCampos() throws InterruptedException{
		 getDriver().findElement(campoTitulo).sendKeys("empresaRobo2");;
		 Thread.sleep(tempoX);
		 getDriver().findElement(campoSigla).sendKeys("roboSigla2"); 
		 Thread.sleep(tempoX);
		 getDriver().findElement(campoDescricao).sendKeys("Teste de Robo no campo de Descrição ");
		 Thread.sleep(tempoX);
		 getDriver().findElement(campoCategoria).click();
		 Thread.sleep(tempoX);
		 DriverFactory.popUp();
		 getDriver().findElement(categoriaValor).click();
		 Thread.sleep(tempoX);
		 DriverFactory.selecOption(campoBiReferenciada, "Biblioteca Importacao");
		 Thread.sleep(tempoX);
		 getDriver().findElement(campoCodigo).sendKeys("codigoRobo2");
		 Thread.sleep(tempoX);
		 getDriver().findElement(campoInAdicionais).sendKeys("Validar o campo Informações Adicionadas com o Robo");
		 Thread.sleep(tempoX);
		 DriverFactory.selecOption(campoCriticidade, "Informal");
		 Thread.sleep(tempoX);
		 getDriver().findElement(campoMissao).sendKeys("Validar o campo Missão com o Robo");
		 Thread.sleep(tempoX);
		 getDriver().findElement(campoVisao).sendKeys("Validar o campo Visão com o Robo");
		 Thread.sleep(tempoX);
		 getDriver().findElement(campoValores).sendKeys("Validar o campo Valores com o Robo");
		 Thread.sleep(tempoX);
		 getDriver().findElement(campoCargo).click();
		 Thread.sleep(tempoX);
		 DriverFactory.popUp();
		 getDriver().findElement(cargoValor).click();
		 Thread.sleep(tempoX);
		 bntPage.salvar();
	 }
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
}
