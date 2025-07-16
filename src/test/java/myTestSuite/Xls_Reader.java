package myTestSuite;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class Xls_Reader {
	public static String a;
	public static String b;
	public static String c;
	public static String result;

	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream("/CostMaster/src/main/resources/excelfiles/SelBatch.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.getSheet("SelBatch.xlsx");
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(1).getLastCellNum();
		System.out.println("rowCount" + rowCount + "colCount" + colCount);
		for(int i=1;i<=rowCount;i++) {
			XSSFRow celldata=sheet.getRow(i);
			
			 a=celldata.getCell(0).getStringCellValue();
			 b=celldata.getCell(1).getStringCellValue();
			 c=celldata.getCell(2).getStringCellValue();
			 result=celldata.getCell(3).getStringCellValue();
			 System.out.println(a+b+c);
			 
			
			
		}

	}
}