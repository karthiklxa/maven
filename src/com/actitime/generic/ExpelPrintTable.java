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

public class ExpelPrintTable
{

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		File file = new File("./data/input.xlsx");
		FileInputStream fis = new FileInputStream(file);
	
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			Row cc = sh.getRow(i);
			for(int j=0;j<cc.getLastCellNum();j++)
			{
				Cell allc = cc.getCell(j);
				String pdata = allc.getStringCellValue();
				System.out.print(pdata+" ");
			}
			System.out.println();
		}

	}

}
