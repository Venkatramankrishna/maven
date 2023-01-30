package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace-selenium\\Maven_Project\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		try (Workbook wb = new XSSFWorkbook(fis)) {
			Sheet sheetAt = wb.getSheetAt(0);
			int pnr = sheetAt.getPhysicalNumberOfRows();
			for (int i = 0; i < pnr; i++) {
				Row row = sheetAt.getRow(i);
				int pnc = row.getPhysicalNumberOfCells();
				for (int j = 0; j < pnc; j++) {
					Cell cell = row.getCell(j);
					CellType cellType = cell.getCellType();
					if (cellType.equals(CellType.STRING)) {
						String stringCellValue = cell.getStringCellValue();
						System.out.println(stringCellValue);
					}else if (cellType.equals(CellType.NUMERIC)) {
						
						double numericCellValue = cell.getNumericCellValue();
						System.out.println(numericCellValue);
						
					}
					
				}
				
			}
		}
		
		
		
		
	}

}
