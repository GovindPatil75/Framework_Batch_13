package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;

	public ExcelDataProvider() throws Exception {
		
		String path="C:\\Users\\Dell\\Desktop\\Visionfolder\\Framework_Batch_13\\TestData\\Data.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		
		wb=new XSSFWorkbook(fis);
		
		
	}
	// String data 
	public String getStringData(String sheetname,int row,int cell) {
		
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	
	// Numeric Data
	public String getNumericData(String sheetname,int row,int cell) {
		
		double data=wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
		return String.valueOf(data);
		
	}
	
}
