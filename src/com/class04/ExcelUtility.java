package com.class04;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtility {

	public static WorkBoook book;
	public static Sheet sheet;

	public static void openExcel(String filepath) {// filename=filepath same thing

		FileInputStream fis = new FileInputStream(filepath);
		try {
			fis = new FileInputStream(filepath);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}