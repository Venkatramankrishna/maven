package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace-selenium\\Maven_Project\\Book1.xlsx");
		 FileInputStream fis = new FileInputStream(f); 
		
		 Workbook wb = new XSSFWorkbook(fis) ;
		 Sheet createSheet = wb.createSheet("Number");
		 
		
			wb.getSheet("Number").createRow(0).createCell(0).setCellValue("ODD");
			wb.getSheet("Number").createRow(0).createCell(1).setCellValue("EVEN");
			
			wb.getSheet("Number").createRow(1).createCell(0).setCellValue("one");
			wb.getSheet("Number").createRow(1).createCell(1).setCellValue("two");
			
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			
			wb.close();
		
		
		
	}

}
