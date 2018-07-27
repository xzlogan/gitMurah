package br.com.murah.audixpress.core;

 
import static br.com.murah.audixpress.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {
	
	private static WebDriver driver;
	
	private DriverFactory() {}
	
	public static WebDriver getDriver(){
		if(driver == null) {
			
			switch (Propriedades.browser) {
				 case CHROME:
					 ChromeOptions chromeOptions = new ChromeOptions();
					 
					 System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+ "/plugins/chromedriver" ); 
					 chromeOptions.addArguments("--no-sandbox");
					 chromeOptions.addArguments("--disable-dev-shm-usage");
					 driver = new ChromeDriver(chromeOptions); 
					 break;
				 case FIREFOX: 
					 //System.setProperty( "webdriver.gecko.driver" ,System.getProperty("user.dir") +"/plugins/geckodriver");
					 driver = new FirefoxDriver();
					 break;
				 case PhantomJSDriver: 
						System.setProperty("phantomjs.binary.path",  System.getProperty("user.dir")+ "/plugins/phantomjs" ); 
					 driver = new PhantomJSDriver(); 
					 break;
			}
			driver.manage().window().maximize(); 
			//driver.manage().window().setSize(new Dimension(1200, 765));			
		}
		return driver;
	}

	public static void killDriver(){
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
	public static void bnt2(By elemento){
		Actions builder = new Actions(driver);
		builder.contextClick(driver.findElement(elemento)).build().perform();
		
	}
	public static void moveMouse(By elemento){
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(elemento)).build().perform();
	
	}
	public static void nextFrame(){
		driver.switchTo().frame("frameContent");
		
	}
	public static void defaultFrame(){
		driver.switchTo().defaultContent();
		
	}
	
	public static void popUp(){
		 
		driver.switchTo().activeElement() ;
		
	}
	public static void selecOption(By elemento , String option){
		 
		WebElement element = getDriver().findElement(elemento);
		Select combo = new Select(element);
		combo.selectByVisibleText(option);
		
	}
	public static void arrowRight(By elemento){
		WebElement element = driver.findElement(elemento);
		element.sendKeys(Keys.ARROW_RIGHT);
   
	}
	public static void waitElement(By elemento){
		WebElement elementoX = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(elemento));
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
	}
	public static void waitPage() throws InterruptedException{
		System.out.print("esperando");
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.withTimeout(30, TimeUnit.SECONDS); 
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);  
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
		System.out.print("acabou.......");
	}
	
}
