package br.com.murah.audixpress.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utils {

	
	public String codNome(){
		
		Calendar c = Calendar.getInstance();  
		 
		String x = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
		x += Integer.toString(c.get(Calendar.MINUTE));
		x += Integer.toString(c.get(Calendar.DATE));
		x += Integer.toString(c.get(Calendar.MONTH));
		x += Integer.toString(c.get(Calendar.YEAR));
	 return x;
	}
public String codNomeAntigo(){
		
		Calendar c = Calendar.getInstance();  
		c.add(Calendar.YEAR,-0);
		String x = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
		x += Integer.toString(c.get(Calendar.MINUTE));
		x += Integer.toString(c.get(Calendar.DATE));
		x += Integer.toString(c.get(Calendar.MONTH));
		x += Integer.toString(c.get(Calendar.YEAR));
		return x;
	}
	public String dataAtual(){
		Calendar c = Calendar.getInstance();  
		String x = Integer.toString(c.get(Calendar.DATE));
		x += "/"+Integer.toString(c.get(Calendar.MONTH));
		x += "/"+Integer.toString(c.get(Calendar.YEAR));
		 
	 return x;
	}
	public String dataAntiga(){
		
		Calendar c = Calendar.getInstance();  
		c.add(Calendar.YEAR,-0);
		
		String x = Integer.toString(c.get(Calendar.DATE));
		x += "/"+Integer.toString(c.get(Calendar.MONTH));
		x += "/"+Integer.toString(c.get(Calendar.YEAR));
		 
		return x;
	}
	public static Date obterDataComDiferencaDias(int dias) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, dias);
		return calendar.getTime();
	}
	
	public static String obterDataFormatada(Date data) {
		DateFormat format = new SimpleDateFormat("dd/MM/YYYY");
		return format.format(data);
	}
}
