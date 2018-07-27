package br.com.murah.audixpress.page;

import static br.com.murah.audixpress.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.com.murah.audixpress.core.DriverFactory;

public class AreaPage {
	public BotoesPage bntPage = new BotoesPage();
	int tempoX= 500;
	By campoTitulo = By.xpath("//span[text()[contains(.,'Título')]]/../../td[3]/input");
	By campoSigla = By.xpath("//span[text()[contains(.,'Sigla')]]/../../td[3]/input");
	By campoIniAtividades = By.xpath("//span[text()[contains(.,'Inicio das Atividades')]]/../../td[3]/textarea");
	By campoCategoria = By.xpath("//span[text()[contains(.,'Categoria')]]/../../td[3]/div/a");
	By categoriaValor = By.xpath("//*[text()[contains(.,'Matriz')]]");
	By campoBiReferenciada = By.xpath("//span[text()[contains(.,'Biblioteca Referenciada')]]/../../td[3]/select");
	By campoCodigo = By.xpath("//span[text()[contains(.,'Código')]]/../../td[3]/input");
	By campoQFarmaceutico = By.xpath("//span[text()[contains(.,'Quadro Farmacêutico')]]/../../td[3]/textarea");
	By campoCriticidade = By.xpath("//span[text()[contains(.,'Criticidade')]]/../../td[3]/select");
	By campoEmail = By.xpath("//span[text()[contains(.,'Email')]]/../../td[3]/span//input");
	By campoTelefone = By.xpath("//span[text()[contains(.,'Telefone')]]/../../td[3]/input");
	By campoRua = By.xpath("//span[text()[contains(.,'Rua')]]/../../td[3]/input");
	By campoNumero = By.xpath("//span[text()[contains(.,'Número')]]/../../td[3]/input");
	By campoComplemento = By.xpath("//span[text()[contains(.,'Complemento')]]/../../td[3]/input");
	By campoBairro = By.xpath("//span[text()[contains(.,'Bairro')]]/../../td[3]/input");
	By campoCidade = By.xpath("//span[text()[contains(.,'Cidade')]]/../../td[3]/input");
	By campoEstado =By.xpath("//span[text()[contains(.,'Estado')]]/../../td[3]/select");
	By campoCep = By.xpath("//span[text()[contains(.,'Cep')]]/../../td[3]/span/input");
	By campoPais = By.xpath("//span[text()[contains(.,'País')]]/../../td[3]/span/input");
	
	 
	 
	 public void preencherCampos() throws InterruptedException{
		 Thread.sleep(tempoX);
		 getDriver().findElement(campoTitulo).sendKeys("areaRobo5"); //campo unico
		 getDriver().findElement(campoSigla).sendKeys("AR");
		 getDriver().findElement(campoIniAtividades).sendKeys("AR");
		 getDriver().findElement(campoCategoria).click();
		 Thread.sleep(tempoX);
		 DriverFactory.popUp();
		 getDriver().findElement(categoriaValor).click();
		 Thread.sleep(tempoX);
		 DriverFactory.selecOption(campoBiReferenciada, "Biblioteca Importacao");
		 getDriver().findElement(campoCodigo).sendKeys("codigoAR05");  // campo unico
		 getDriver().findElement(campoQFarmaceutico).sendKeys("Validar o campo texto Quadro Farmacêutico pelo ROBO"); 
		 DriverFactory.selecOption(campoCriticidade, "Informal");
		 getDriver().findElement(campoEmail).sendKeys("xzteste@yahoo.com.br"); 
		 getDriver().findElement(campoTelefone).sendKeys("11967003082"); 
		 getDriver().findElement(campoRua).sendKeys("rua teste "); 
		 getDriver().findElement(campoNumero).sendKeys("1234 ");
		 getDriver().findElement(campoComplemento).sendKeys("Testao campo Complemento pelo Robo");
		 getDriver().findElement(campoBairro).sendKeys("Parque dos Teste");
		 getDriver().findElement(campoCidade).sendKeys("São Paulo");
		 DriverFactory.selecOption(campoEstado, "SP"); 
		 getDriver().findElement(campoCep).sendKeys("05888178");
		 getDriver().findElement(campoPais).sendKeys("Testilandy");
		 Thread.sleep(3000);
		 bntPage.salvar();
	 }
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
}
