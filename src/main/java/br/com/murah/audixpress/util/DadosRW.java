package br.com.murah.audixpress.util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import br.com.murah.audixpress.page.Importador;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
public class DadosRW {
	public String jsonFileName = System.getProperty("user.dir") + "/docs/dadosRW.json";
	public Importador importadorDados = new Importador();
	public String[] planilhasExcel =null;
	
	
	
	public void criarDados(int planilha) throws IOException{
		 planilhasExcel =  importadorDados.getPlanilha(planilha);
		FileWriter file = new FileWriter(jsonFileName);
		JSONObject obj = new JSONObject();
		int x = planilhasExcel.length;
		for(int i = 1 ; i< x ; i++){
			
			 obj.put( planilhasExcel[i],"");
			  
			}
		
       
         
        file.write(obj.toJSONString());
        file.flush();
        
	}
	public void lerDados() throws org.json.simple.parser.ParseException, FileNotFoundException, IOException{
		 JSONParser parser = new JSONParser();
		 Object obj = parser.parse(new FileReader(jsonFileName));
		 JSONObject jsonObject = (JSONObject) obj;
	     System.out.println(jsonObject);
	     String name = (String) jsonObject.get("idade");
	     System.out.println(name);
	     
	}
	
	
	
	public static void main(String[] args) throws IOException, org.json.simple.parser.ParseException {
        DadosRW dados = new DadosRW();
        dados.criarDados(1);

    }
	 

}
