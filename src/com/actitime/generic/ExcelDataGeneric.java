package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataGeneric
{
	public static String getData(String path,String sheetname,int row,int cell)
	{
		try 
		{
//			File file = new File(path);
			FileInputStream fis = new FileInputStream(new File(path));
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetname);
//			Row r = sh.getRow(row);
//			Cell c = r.getCell(cell);
			String data = sh.getRow(row).getCell(cell).toString();
			return data;
		} 
		catch (Exception e)
		{
			return " ";
		}
	}
	public static int getRowCount(String path,String sheetname)
	{
		try
		{
			FileInputStream fis = new FileInputStream(new File(path));
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetname);
			int rc = sh.getLastRowNum();
			return rc;
		}
		catch (Exception e)
		{
			return 0;
		}
	}
	public static int getCellCount(String path,String sheetname,int row)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(new File(path));
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetname);
			Row r = sh.getRow(row);
			short cn = r.getLastCellNum();
			return cn;
			
		}
		catch (Exception e)
		{
			return 0;
		}
	}
}
