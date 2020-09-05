package com.osa.read;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileManager {

 public static void main(String[] args) {
	 
	 char k='B'-1;
	 System.out.println(k);
	 
	 
	 
	String s=FileManager.readFromExcel("MyTest.xlsx", "A:1");  
	System.out.println(s);
}
	public static String readFromExcel(String fileName, String cells) {
		String cellNumber=cells.replace(":", "").toUpperCase();
		
		String cellValue=null;
	try {
		InputStream file=new FileInputStream("src\\test\\resources\\TestData\\"+fileName);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		CellReference cellRefe=new CellReference(cellNumber);
		Row row=sheet.getRow(cellRefe.getRow());
		Cell cell=row.getCell(cellRefe.getCol());
		cellValue=cell.getStringCellValue();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	    return cellValue; 
	}


	
	
	
	
	
	
	public  static Properties readValue(String path) {
		Properties pr=new Properties();
		try {
		FileInputStream fl=new FileInputStream(path);
		pr.load(fl);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return pr;
	}
	
}
