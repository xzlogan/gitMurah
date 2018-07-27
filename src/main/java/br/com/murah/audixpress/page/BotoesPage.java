package br.com.murah.audixpress.page;

import static br.com.murah.audixpress.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BotoesPage {
	
	By bntSalvar = By.xpath("//span[text()[contains(.,'Salvar')]]");
	By bntVoltar = By.xpath("//span[text()[contains(.,'Voltar')]]");
	By bntAdicionar = By.xpath("//*[@class= 'fa fa-plus']/../span");
	By bntPesquisar = By.xpath("//*[@class= 'fa fa-search']/../span");
	
	public void salvar() throws InterruptedException{
		 getDriver().findElement(bntSalvar).click();
		 Thread.sleep(3000);
	 }
	public void voltar() {
		 getDriver().findElement(bntVoltar).click();
	 }
	public void adicionar() {
		 getDriver().findElement(bntAdicionar).click();
	 }
	public void pesquisar() {
			 getDriver().findElement(bntPesquisar).click();
	 }

}
