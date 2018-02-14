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

public class ExcelDatarow
{

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		File file = new File("./data/input.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		 for(int i=0;i<=sh.getLastRowNum();i++)
		 {
			 Row all = sh.getRow(i);
			 for(int j=0;j<all.getLastCellNum();j++)
			 {
				 Cell a = all.getCell(j);
				 String p = a.getStringCellValue();
				 System.out.print(p+" ");

			 }
			 System.out.println();

			 		 }
	}

}
