package com.class04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelUtility {

	public static Workbook book;
	public static Sheet sheet;

	public static void openExcel(String filepath) throws FileNotFoundException {// filename=filepath same thing

		FileInputStream fis = new FileInputStream(filepath);
		try {
			fis = new FileInputStream(filepath);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}