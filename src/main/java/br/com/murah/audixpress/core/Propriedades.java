package br.com.murah.audixpress.core;

public class Propriedades {
	
	public static boolean FECHAR_BROWSER = false;
	
	public static Browsers browser = Browsers.FIREFOX;
	
	public enum Browsers {
		CHROME,
		FIREFOX,
		PhantomJSDriver
	}

}
