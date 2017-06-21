package com.duoduo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Ignore;
import org.junit.Test;

public class ExcelTest {

	@Test
	@Ignore
	public void writeSheet() {
		try {
			String filePath = "C:/Users/Administrator/Desktop/test.xlsx";
			
			//workbook
			Workbook wb = new XSSFWorkbook();
			//sheet
			Sheet sheet = wb.createSheet("test1");
			//row
			Row row = sheet.createRow(0);
			//cell
			Cell cell = row.createCell(0);
			cell.setCellValue("hello");
			
			//write to file
			FileOutputStream fileOut;
			fileOut = new FileOutputStream(filePath);
			wb.write(fileOut);
			fileOut.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void readSheet() {
		try {
			String filePath = "C:/Users/Administrator/Desktop/test.xlsx";
			FileInputStream in = new FileInputStream(filePath);
			
			//workbook
			Workbook wb = new XSSFWorkbook(in);
			//sheet
			Sheet sheet = wb.getSheet("test1");
			//row
			Row row = sheet.getRow(0);
			//cell
			Cell cell = row.getCell(0);
			String cellValue = cell.getStringCellValue();
			System.out.println(cellValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
