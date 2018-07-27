package br.com.murah.audixpress.page;

import static br.com.murah.audixpress.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import br.com.murah.audixpress.core.DriverFactory;

public class ArvorePage {
	int tempoX= 3000;
	By bntArvore = By.xpath("//*[@id='mid']/span/div");
	By bntArvoreNome= By.xpath("//span[text()[contains(.,'LiraQuality')]]");
	By bntArvoreNomeExp= By.xpath("//span[text()[contains(.,'LiraQuality')]]/../../../td/div/a");
	By bntEntrar = By.cssSelector("div.login-btn:nth-child(3) > input:nth-child(2)");//By.xpath("//*[contains(text(),'Entrar')]");
	By bntResetSenha = By.linkText("Esqueci a senha");
	By bntAdicionar = By.xpath("//div[text()[contains(.,'Adicionar')]]");
	By bntEmpresa = By.xpath("//div[text()[contains(.,'Empresa')]]");
	By bntNomeEmpresa = By.xpath("//*[text()[contains(.,'EmpresaLiraQuality')]]");
	By bntArea = By.xpath("//div[text()[contains(.,'Adicionar')]]/../../div[3]/div/div[2]/div");
	By bntEditar = By.xpath("//div[text()[contains(.,'Área')]]");
	By bntModuloCore = By.xpath("//div[@class='modulos-tree']/div[2]");
	By bntModuloRisco = By.xpath("//div[@class='modulos-tree']/div[3]");
	By bntModuloAuditoria = By.xpath("//div[@class='modulos-tree']/div[4]");
	By listaAbordagem = By.xpath("//div[@class='select-tree']/div[2]");
	By bntRisco = By.xpath("//div[text()[contains(.,'Adicionar')]]/../../div[2]/div/div/div");
	By bntEmpresaNomeExp= By.xpath("//span[text()[contains(.,'EmpresaLiraQuality')]]/../../../td/div/a");
	By bntNomeRisco = By.xpath("//*[text()[contains(.,'LQ007 - RiscoLQ007')]]");
	By bntRiscoNomeExp =  By.xpath("//span[text()[contains(.,'LQ007 - RiscoLQ007')]]/../../../td/div/a");
	By bntControle = By.xpath("//div[text()[contains(.,'Adicionar')]]/../../div[3]/div/div[1]/div");
	By bntNomeControle = By.xpath("//*[text()[contains(.,'xpto041 - Solicitação de Nota fiscal')]]");
	By bntControleExecucao =  By.xpath("//div[@class='context-menu context-menu-theme-vista']/div[2]");
	By bntControleExecucaoPes =  By.xpath("//div[@class='context-menu context-menu-theme-vista']/div[4]/div/div");
    By bntTeste =  By.xpath("//div[@class='context-menu context-menu-theme-vista']/div[5]");
	By bntInserirTeste =  By.xpath("//div[@class='context-menu context-menu-theme-vista']/div[6]");
	
	 public  void getPageEmpresa() throws InterruptedException{
		 
		getDriver().findElement(bntArvore).click();
		Thread.sleep(tempoX);
		DriverFactory.bnt2(bntArvoreNome);
		Thread.sleep(tempoX);
		DriverFactory.moveMouse(bntAdicionar); 
		Thread.sleep(tempoX);
		DriverFactory.moveMouse(bntEmpresa);
		Thread.sleep(tempoX);
		getDriver().findElement(bntEmpresa).click();
		
		
	}
	public  void getPageArea() throws InterruptedException{
		getDriver().findElement(bntArvore).click();
		Thread.sleep(tempoX);
		getDriver().findElement(bntArvoreNomeExp).click();
		Thread.sleep(tempoX);
		DriverFactory.bnt2(bntNomeEmpresa);
		Thread.sleep(tempoX);
		DriverFactory.moveMouse(bntAdicionar);
		Thread.sleep(tempoX);
		DriverFactory.moveMouse(bntArea);
		Thread.sleep(tempoX);
		getDriver().findElement(bntArea).click();
	
	}
	public  void getExecucaoControle() throws InterruptedException{
		
		getDriver().findElement(bntArvore).click();
		Thread.sleep(tempoX);
		getDriver().findElement(bntModuloRisco).click();
		Thread.sleep(tempoX);
		getDriver().findElement(bntArvoreNomeExp).click();
		Thread.sleep(tempoX);
		getDriver().findElement(bntEmpresaNomeExp).click();
		Thread.sleep(tempoX);
		getDriver().findElement(bntRiscoNomeExp).click();
		Thread.sleep(tempoX);
		DriverFactory.bnt2(bntNomeControle);
		Thread.sleep(tempoX);
		DriverFactory.moveMouse(bntControleExecucao); 
		Thread.sleep(tempoX);
		DriverFactory.moveMouse(bntControleExecucaoPes); 
		Thread.sleep(tempoX);
		getDriver().findElement(bntControleExecucaoPes).click();
		Thread.sleep(tempoX);
	}
	
	public  void getTeste() throws InterruptedException{
		getDriver().findElement(bntArvore).click();
		Thread.sleep(tempoX);
		getDriver().findElement(bntModuloRisco).click();
		Thread.sleep(tempoX);
		getDriver().findElement(bntArvoreNomeExp).click();
		Thread.sleep(tempoX);
		getDriver().findElement(bntEmpresaNomeExp).click();
		Thread.sleep(tempoX);
		getDriver().findElement(bntRiscoNomeExp).click();
		Thread.sleep(tempoX);
		DriverFactory.bnt2(bntNomeControle);
		Thread.sleep(tempoX);
		DriverFactory.moveMouse(bntTeste); 
		Thread.sleep(tempoX);
		DriverFactory.moveMouse(bntInserirTeste); 
		Thread.sleep(tempoX);
		getDriver().findElement(bntInserirTeste).click();
		Thread.sleep(tempoX); 
	}
	   public  void getPageRisco() throws InterruptedException{
		getDriver().findElement(bntArvore).click();
		Thread.sleep(tempoX);
		getDriver().findElement(bntModuloRisco).click();
		Thread.sleep(tempoX);
		getDriver().findElement(bntArvoreNomeExp).click();
		Thread.sleep(tempoX);
		DriverFactory.bnt2(bntNomeEmpresa); 
		Thread.sleep(tempoX);
		DriverFactory.moveMouse(bntAdicionar);
		Thread.sleep(tempoX);
		DriverFactory.moveMouse(bntRisco);
		Thread.sleep(tempoX);
		getDriver().findElement(bntRisco).click();
		Thread.sleep(tempoX);
	}

	public  void getControle() throws InterruptedException{
		getDriver().findElement(bntArvore).click();
		Thread.sleep(tempoX);
		getDriver().findElement(bntModuloRisco).click();
		Thread.sleep(tempoX);
		getDriver().findElement(bntArvoreNomeExp).click();
		Thread.sleep(tempoX);
		getDriver().findElement(bntEmpresaNomeExp).click();
		Thread.sleep(tempoX);
		DriverFactory.bnt2(bntNomeRisco);
		Thread.sleep(tempoX);
		DriverFactory.moveMouse(bntAdicionar);
		Thread.sleep(tempoX);
		DriverFactory.moveMouse(bntControle);
		Thread.sleep(tempoX);
		getDriver().findElement(bntControle).click();
		Thread.sleep(tempoX);
	}
	 
}
