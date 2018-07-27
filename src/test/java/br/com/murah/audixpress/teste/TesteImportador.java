package br.com.murah.audixpress.teste;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import br.com.murah.audixpress.page.Importador;
import br.com.murah.audixpress.restful.client.init.Inicializador;
import br.com.murah.audixpress.util.ArquivoExcel;
import br.com.murah.audixpress.util.Utils;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;


public class TesteImportador {
	Utils  utility = new Utils();
	 Importador importadorExcell = new Importador();
	 ArquivoExcel excell = new ArquivoExcel();
	 private String user ="adm";
	 private String senha ="murah123";
	 private String url ="http://localhost:7777/audi-web-core";
	 public String arquivo = System.getProperty("user.dir") + "/docs/importador.xlsx";
	 public void importador() throws IOException {
	 Inicializador.main(new String[]{user,senha,url,arquivo,"--debug"});
		 
	 }
	  
	 
	 @Test(priority=1)	
	 public void testeEmpreasa() throws IOException { // 11 planilha 
		 
		  for(int x =1 ; x < 12 ; x++){
			  importadorExcell.criarDados(x);
			  importador();
		  }
			 
		 
		 
	}
	  
	 
 }
