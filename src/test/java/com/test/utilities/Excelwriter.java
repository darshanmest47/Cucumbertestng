package com.test.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelwriter {
	
	

	public void writeData() throws IOException {
	
		
		File fs = new File("E:\\eclipse2\\Newtest\\Testdata\\towrite.xlsx");
		
	
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("mydata");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("username");
		
		XSSFCell cell1 = row.createCell(1);
		cell1.setCellValue("password");
		
		
	
		FileOutputStream fos = new FileOutputStream(fs);
		wb.write(fos);
		fos.close();

		
//		int r1=sheet.getLastRowNum();
//		System.out.println(r1);
		
	
	}

}
