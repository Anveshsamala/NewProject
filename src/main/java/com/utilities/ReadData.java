package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	
	public static String readdatafromexcel(String sheetname, int rownumber, int cellnumber) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("c://test data//userdata1.xisl");
		Workbook w1=WorkbookFactory.create(fis);
		String s1=w1.getSheet(sheetname).getRow(rownumber).getCell(cellnumber).getStringCellValue();
		return s1;
	}

	public static void writedatainexcel(String sheetname, int rownumber, int cellnumber, int celldata) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("c://test data//userdata1.xisl");
		Workbook w1=WorkbookFactory.create(fis);
		w1.getSheet(sheetname).getRow(rownumber).createCell(cellnumber).setCellValue(celldata);
		
		FileOutputStream fos=new FileOutputStream("c://test data//userdata1.xisl");
		w1.write(fos);
	}
}
