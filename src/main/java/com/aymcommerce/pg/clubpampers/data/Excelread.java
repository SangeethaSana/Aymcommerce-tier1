package com.aymcommerce.pg.clubpampers.data;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Excelread {
	WebDriver driver;

	XSSFWorkbook wb;
	XSSFSheet Sheet1;

	public Excelread(String excelpath) {
		try {
			File src = new File(excelpath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getData(int sheetNumber, int row, int column) {
		Sheet1 = wb.getSheetAt(sheetNumber);
		DataFormatter formatter = new DataFormatter();
		String data = formatter.formatCellValue(Sheet1.getRow(row).getCell(column));
		return data;
	}
}
