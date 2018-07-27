package br.com.murah.audixpress.page;

import static br.com.murah.audixpress.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.com.murah.audixpress.core.DriverFactory;

public class RiscoPage {
	public BotoesPage bntPage = new BotoesPage();
	int tempoX= 500;
	By campoTitulo = By.xpath("//span[text()[contains(.,'Título')]]/../../td[3]/input");
	By campoDescricao = By.xpath("//span[text()[contains(.,'Descrição')]]/../../td[3]/textarea");
	By campoCategoria = By.xpath("//span[text()[contains(.,'Categoria')]]/../../td[3]/span/a");
	By categoriaValor = By.xpath("//*[text()[contains(.,'categoriaRobo')]]");
	By campoBiReferenciada = By.xpath("//span[text()[contains(.,'Biblioteca Referenciada')]]/../../td[3]/select");
	By campoCodigo = By.xpath("//span[text()[contains(.,'Código do Risco')]]/../../td[3]/input");
	By campoAssertiva = By.xpath("//span[text()[contains(.,'Assertiva')]]/../../td[3]//a");
	By valorAssertiva = By.xpath("//*[text()[contains(.,'R6.1 - Falhas de sistemas')]]");
	By campoInfoAdicionais = By.xpath("//span[text()[contains(.,'Informações Adicionais')]]/../../td[3]/textarea");
	By campoImpacFinanceiro = By.xpath("//span[text()[contains(.,'Impacta financeiramente?')]]/../../td[3]/select");
	By campoAtivo = By.xpath("//span[text()[contains(.,'Ativo')]]/../../td[3]/select");
	By campoTipoRisco = By.xpath("//span[text()[contains(.,'Tipo de Risco')]]/../../td[3]/select");
	By campoOrigemRisco = By.xpath("//span[text()[contains(.,'Origem do Risco')]]/../../td[3]/select");
	By campoExistePerda = By.xpath("//span[text()[contains(.,'Existe possibilidade de perda financeira?')]]/../../td[3]/select");
	By campoCalculoPerda = By.xpath("//span[text()[contains(.,'Cálculo da Perda')]]/../../td[3]/textarea");
	By campoFluxoAprovacao = By.xpath("//span[text()[contains(.,'Fluxo de Aprovação')]]/../../td[3]/textarea");
	By valorFluxoAprovacao = By.xpath("//span[text()[contains(.,'Sign Off de Riscos')]]");
	By campoNatureza = By.xpath("//span[text()[contains(.,'Natureza')]]/../../td[3]/textarea");
    public void preencherCampos() throws InterruptedException{
		 Thread.sleep(5000);
		 getDriver().findElement(campoTitulo).sendKeys("nomeRisco1"); //campo unico
		 getDriver().findElement(campoDescricao).sendKeys("Teste do campo Descrição pelo Robo");  
		 getDriver().findElement(campoCategoria).click();
		 DriverFactory.popUp();
		 getDriver().findElement(categoriaValor).click();
		 DriverFactory.selecOption(campoBiReferenciada, "Biblioteca de Riscos");
		 getDriver().findElement(campoCodigo).sendKeys("codRisco1"); //campo unico
		 getDriver().findElement(campoAssertiva).click();
		 DriverFactory.popUp();
		 getDriver().findElement(valorAssertiva).click();
		 getDriver().findElement(campoInfoAdicionais).sendKeys("Validar o campo Informações Adicionais pelo Robo");
		 DriverFactory.selecOption(campoImpacFinanceiro, "Sim");
		 DriverFactory.selecOption(campoAtivo, "Sim");
		 DriverFactory.selecOption(campoTipoRisco, "Positivo");
		 DriverFactory.selecOption(campoOrigemRisco, "Externo");
		 DriverFactory.selecOption(campoExistePerda, "Sim");
		 getDriver().findElement(campoCalculoPerda).sendKeys("Validar o campo Cálculo da Perda");
		 getDriver().findElement(campoNatureza).sendKeys("Validar o campo Natureza");
		 Thread.sleep(5000);
		 bntPage.salvar();
	 }
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
}
