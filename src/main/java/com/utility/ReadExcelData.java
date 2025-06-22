package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static String  readparticularCellData(int rowvalue,int coloumnvalue) {
		String data = null;
		try {
			File file = new File("D:\\Premium IPT\\pratice Excel\\DataDriven_testData.xlsx");
			Workbook book = new XSSFWorkbook(file);
		 Sheet sheet = book.getSheet("Sheet1");
		 Row row = sheet.getRow(rowvalue);
		 Cell cell = row.getCell(coloumnvalue);
		 
		 //all cell to string data type
		 DataFormatter dataformatter = new DataFormatter();
		 
	 data =dataformatter.formatCellValue(cell);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		return data;
		
	}
	
//	public static void main(String[] args) {
//		String data = readparticularCellData(0,1);
//		System.out.println(data);
//		
//	}
	
	public static void getAllData() {
		try {

			File file = new File("D:\\\\Premium IPT\\\\pratice Excel\\\\DataDriven_testData.xlsx");
			Workbook book = new XSSFWorkbook(file);
			Sheet sheet = book.getSheet("Sheet1");
			for (int i = 1; i <=sheet.getLastRowNum(); i++) {
				
				// 1<4 --> true;
				// 2<4 --> true;
				// 3<4 --> true;
				// 4<4 --> false
				Row row = sheet.getRow(i);
				for (int j = 0; j < row.getLastCellNum(); j++) {
					Cell cell = row.getCell(j);
					DataFormatter dataFormat = new DataFormatter();
					String data = dataFormat.formatCellValue(cell);
					System.out.println(data);
				} 
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		}
	

	public static void writeData() {
		
		
		try {
			File file = new File("D:\\\\Premium IPT\\\\pratice Excel\\\\DataDriven_testData.xlsx");
			FileInputStream fileInput = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(fileInput);
			book.createSheet("MyAPR").createRow(0).createCell(0).setCellValue("Muthu");
			book.getSheet("MyAPR").createRow(1).createCell(0).setCellValue("Kumar");
			FileOutputStream fileOutput = new FileOutputStream(file);
			book.write(fileOutput);
			book.close();
			System.out.println("--Successfully created----");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

		
		
	}


