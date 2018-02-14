package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		File file = new File("./data/input.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
	
		Row ro = sh.getRow(0);
		
		Cell ce = ro.getCell(0);
		
		String data = ce.getStringCellValue();
		System.out.println(data);
		
	}

}
