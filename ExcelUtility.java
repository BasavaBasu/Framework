package com.trello.qsp.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	public String GetStringData(String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		
		 Workbook workbook = WorkbookFactory.create(new FileInputStream("./src/test/resources/trelloworkbook.xlsx"));
		 return workbook.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	}
	
	public double GetNumericData(String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		
		 Workbook workbook = WorkbookFactory.create(new FileInputStream("./src/test/resources/trelloworkbook.xlsx"));
		 return workbook.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getNumericCellValue();
	}

}
