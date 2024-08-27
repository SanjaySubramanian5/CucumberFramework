package org.excelutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	public static List<String> excelData1(String data) {
		
	File f = new File(data);
	  List<String> list = new ArrayList<String>();
	try {
			FileInputStream fi = new FileInputStream(f);
	 XSSFWorkbook book = new XSSFWorkbook(fi);
    XSSFSheet sheet = book.getSheet("Sheet1");
  
    for(int i =0;i<sheet.getPhysicalNumberOfRows(); i++) {
    	XSSFRow row = sheet.getRow(i);
    	for(int j =0; j<row.getPhysicalNumberOfCells(); j++) {
    		XSSFCell cell = row.getCell(j);
    		String cellString = cell.toString();
    		list.add(cellString);
    		
    	}	
    	}
    }
	catch(Exception e) {
		e.printStackTrace();
	}
    return list;
	
		
	
	
	}
	
}

