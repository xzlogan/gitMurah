package br.com.murah.audixpress.teste;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import br.com.murah.audixpress.core.DSL;
import br.com.murah.audixpress.core.DriverFactory;
import br.com.murah.audixpress.page.EmpresaPage;
import br.com.murah.audixpress.page.ExecucaoControlePage;
import br.com.murah.audixpress.page.AreaPage;
import br.com.murah.audixpress.page.ArvorePage;
import br.com.murah.audixpress.page.ControlePage;
import br.com.murah.audixpress.page.LoginPage;
import br.com.murah.audixpress.page.RiscoPage;
import br.com.murah.audixpress.page.TestePage;

import org.testng.annotations.BeforeTest;

import static br.com.murah.audixpress.core.DriverFactory.getDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TesteRisco {
	
	public LoginPage pageLogin = new LoginPage();
	public ArvorePage pageArvore= new ArvorePage();
	public EmpresaPage pageAdcEmpresa = new EmpresaPage();
	public AreaPage pageArea = new AreaPage();
	public RiscoPage pageRisco = new RiscoPage();
	public ControlePage pageControle = new ControlePage();
	public ExecucaoControlePage pageExecucaoControle = new ExecucaoControlePage();
	public TestePage pageTeste = new TestePage();
	 
	 
  @BeforeTest
  public void beforeTest() {
  
  }
  

  @AfterTest
  public void afterTest() {
	  DriverFactory.killDriver();
  }
  //@Test(enabled=false)  // 
    @Test(priority=1)
  public void adicionarEmpresa() throws InterruptedException{
	  pageLogin.logar();
	  Thread.sleep(1000);
	  pageArvore.getPageEmpresa();
	  Thread.sleep(1000);
	  DriverFactory.nextFrame();
	  Thread.sleep(1000);
	  pageAdcEmpresa.preencherCampos();
	  Thread.sleep(5000);
	  pageLogin.desLogar();
	
  }
  
  @Test(enabled=false)  //  @Test(priority=2)
  public void adicionarArea() throws InterruptedException{
	pageLogin.logar(); 
	Thread.sleep(1000);
	pageArvore.getPageArea();
	DriverFactory.nextFrame();
	Thread.sleep(1000);
	pageArea.preencherCampos();
	Thread.sleep(3000);
	DriverFactory.defaultFrame();
	pageLogin.desLogar();
	 
	
  }
   
   
 @Test(enabled=false)  //  @Test(priority=3)
  public void adicionarRisco() throws InterruptedException{
	  pageLogin.logar();
	  Thread.sleep(1000);
	  pageArvore.getPageRisco();
	  DriverFactory.nextFrame();
	  Thread.sleep(1000);
	  pageRisco.preencherCampos();
	  Thread.sleep(3000);
	  DriverFactory.defaultFrame();
	  pageLogin.desLogar();
	
  }
   @Test(enabled=false)  // @Test(priority=4)
  public void adicionarControle() throws InterruptedException{
	  pageLogin.logar();
	  Thread.sleep(1000);
	  pageArvore.getControle();
	  DriverFactory.nextFrame();
	  Thread.sleep(1000);
	  pageControle.preencherCampos();
	  Thread.sleep(3000);
	  DriverFactory.defaultFrame();
	  pageLogin.desLogar();
	
  }
   @Test(enabled=false)  //   @Test(priority=5)
  public void adicionarExeControle() throws InterruptedException{
	  pageLogin.logar();
	  Thread.sleep(1000);
	  pageArvore.getExecucaoControle();
	  DriverFactory.nextFrame();
	  pageExecucaoControle.preencherCampos();
	  Thread.sleep(1000);
	  DriverFactory.defaultFrame();
	  pageLogin.desLogar();
	
  }
   @Test(enabled=false)  //  @Test(priority=6)
  public void adicionarTeste() throws InterruptedException{
	  pageLogin.logar();
	  Thread.sleep(1000);
	  pageArvore.getTeste();
	  DriverFactory.nextFrame();
	  pageTeste.preencherCampos();
	  Thread.sleep(1000);
	  DriverFactory.defaultFrame();
	  pageLogin.desLogar();
	
  }  

}
