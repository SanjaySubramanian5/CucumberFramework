package org.excelutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Loading {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\\\Users\\\\Franky\\\\Desktop\\\\Fb Datas.xlsx");
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
  		System.out.println(list);
  		
  	}	
  	}
  }
	catch(Exception e) {
		e.printStackTrace();
	}
	
	    
}
}

