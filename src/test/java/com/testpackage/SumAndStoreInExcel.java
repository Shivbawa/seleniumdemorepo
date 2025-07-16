package com.testpackage;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SumAndStoreInExcel {
@SuppressWarnings("deprecation")
public static void main(String[] args) {



WebDriver driver = new ChromeDriver();

try {
driver.get("http://testing.icecostmasters.in/Account/AutomationTesting");

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.id("inputA")).sendKeys("5");
driver.findElement(By.id("inputB")).sendKeys("1");
driver.findElement(By.id("inputC")).sendKeys("11");
WebElement Submit= driver.findElement(By.className("btn btn-primary"));


int A = 5;
int B = 1;
int C = 11;

Submit.click();

Alert alert = driver.switchTo().alert();
String alertMessage = alert.getText();
System.out.println("message: " + alertMessage);

System.out.println(alertMessage);


XSSFWorkbook workbook = new XSSFWorkbook();
XSSFSheet sheet = workbook.createSheet("Sum Results");


XSSFRow headerRow = sheet.createRow(0);
headerRow.createCell(0).setCellValue("A");
headerRow.createCell(1).setCellValue("B");
headerRow.createCell(2).setCellValue("C");
headerRow.createCell(3).setCellValue("Result");

XSSFRow dataRow = sheet.createRow(1);

dataRow.createCell(0).setCellValue(A);

dataRow.createCell(1).setCellValue(B);
dataRow.createCell(2).setCellValue(C);
dataRow.createCell(3).setCellValue(alertMessage);

try (FileOutputStream fileOut = new FileOutputStream("SumResults.xlsx")) {
workbook.write(fileOut);
System.out.println("Data successfully written to Excel file.");
} catch (IOException e) {
e.printStackTrace();
}

workbook.close();

} catch (Exception e) {
e.printStackTrace();
} finally {
driver.quit();
}
}
}