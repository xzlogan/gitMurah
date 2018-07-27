package br.com.murah.audixpress.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ArquivoExcel {
	public int linha = 0;
	public int coluna = 0;
	public String excelFileName = System.getProperty("user.dir") + "/docs/importador.xlsx";
	public String sheetName = "empresa";
	public String celula = "";
	public int celulaInt = 0;
	public Calendar c = Calendar.getInstance(); 
	public String dataExcel= "";
	public Utils codNome= new Utils();
	 
	public  void setCell(int linha, int coluna, String valor ) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet(sheetName) ;
		XSSFRow row = sheet.createRow(linha);
		XSSFCell cell = row.createCell(coluna);	
		cell.setCellValue(valor);
	 	FileOutputStream fileOut = new FileOutputStream(excelFileName);
		wb.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}
	
	public  String getCell(int linha, int coluna) throws IOException {
		InputStream ExcelFileToRead = new FileInputStream(excelFileName);
		XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row = sheet.getRow(linha); 
		XSSFCell cell = row.getCell(coluna);
		celula =  cell.toString();
		return celula;
		 
	}
	public  Cell getCelulaExcel(int linha, int coluna ,int aba) throws IOException {
		InputStream ExcelFileToRead = new FileInputStream(excelFileName);
		XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
		XSSFSheet sheet = wb.getSheetAt(aba);
		XSSFRow row = sheet.getRow(linha); 
		XSSFCell cell = row.getCell(coluna);
		return cell;
		 
	}
	public  void setCelulaExcel(int linha, int coluna, Cell celula ) throws IOException {
		FileInputStream file = new FileInputStream(new File(excelFileName));
		XSSFWorkbook  wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row = sheet.getRow(linha); 
		XSSFCell cell = row.getCell(coluna);
		XSSFCellStyle cellStyle = wb.createCellStyle();
		XSSFCreationHelper createHelper = wb.getCreationHelper();
		cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd/MM/yyyy")); 
		 
		switch (celula.getCellTypeEnum()) {
        case BOOLEAN:
        	cell.setCellValue(celula.getBooleanCellValue());
            break;
        case STRING:
        	cell.setCellValue(celula.getRichStringCellValue().getString());
        	
            break;
        case NUMERIC:
        	String celulaX =  celula.toString();
        	cell.setCellValue(celulaX);
            break;
        case FORMULA:
        	
        	dataExcel  = codNome.dataAntiga();
        	cell.setCellValue(dataExcel);
        	cell.setCellStyle(cellStyle);
        	break;
        case BLANK:
 
            break;
        default:
             
    }

		
		
        file.close();
		FileOutputStream outFile = new FileOutputStream(new File(excelFileName));
		wb.write(outFile);
		outFile.close();
		
        
	}
	
	public  void upCell(int linha, int coluna, String valor ) throws IOException {
		FileInputStream file = new FileInputStream(new File(excelFileName));
		XSSFWorkbook  wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row = sheet.getRow(linha); 
		XSSFCell cell = row.getCell(coluna);
		
		if(cell != null){
			
			cell.setCellValue(valor);
			 
		}
		
        file.close();
		FileOutputStream outFile = new FileOutputStream(new File(excelFileName));
		wb.write(outFile);
		outFile.close();
		
        
	}
	 
	public void setNameSheet(String nameSheet) throws IOException{
		FileInputStream file = new FileInputStream(new File(excelFileName));
		 
		XSSFWorkbook  workbook = new XSSFWorkbook(file);
		workbook.setSheetName(0, nameSheet);
		  file.close();
			FileOutputStream outFile = new FileOutputStream(new File(excelFileName));
			workbook.write(outFile);
			outFile.close();
			
		 
	} 
	
	public  void upCelula(int linha, int coluna, String valor , int aba) throws IOException {
		FileInputStream file = new FileInputStream(new File(excelFileName));
		XSSFWorkbook  wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(aba);
		XSSFRow row = sheet.getRow(linha); 
		XSSFCell cell = row.getCell(coluna);
		if(cell != null){
			
			cell.setCellValue(valor);
		}
	    file.close();
		FileOutputStream outFile = new FileOutputStream(new File(excelFileName));
		wb.write(outFile);
		outFile.close();
	}
	public  String getCelula(int linha, int coluna, int aba) throws IOException {
		celula = "";
		InputStream ExcelFileToRead = new FileInputStream(excelFileName);
		XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
		XSSFSheet sheet = wb.getSheetAt(aba);
		XSSFRow row = sheet.getRow(linha); 
		XSSFCell cell = row.getCell(coluna);
		if(cell != null){
			celula =  cell.toString();
		}
		
		return celula;
		 
	}
	
	 
	
	public void setDadosImportador() throws IOException{
		  
		 String cod = codNome.codNomeAntigo();
		 upCelula(1,8,"Empresa"+cod,1);   
		 upCelula(1,7,"codEmpresa"+cod,1);
		 String areaSup = getCelula(1,8,1);
		 //upCelula(3,4,areaSup,1);
		 upCelula(3,8,"codArea"+cod,1);
		 upCelula(3,9,"Area"+cod,1);
		 String tituloSup = getCelula(3,9,1);
		 //upCelula(5,4,tituloSup,1);
		 upCelula(5,5,"Processo"+cod,1);
		 upCelula(5,7,"codProcesso"+cod,1);
		 upCelula(7,6,"Ativo"+cod,1);
		 upCelula(7,8,"codAtivo"+cod,1);
		 upCelula(9,5,"Risco"+cod,1);
		 upCelula(9,6,"codRisco"+cod,1);
		 upCelula(17,2,"testeControle"+cod,1);
		 upCelula(17,3,"codTesteControle"+cod,1);
	} 
 
}
