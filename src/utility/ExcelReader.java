package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public void writeData() throws IOException
	{
		String path = System.getProperty("user.dir") + "\\Testdata.xlsx";

		File src = new File(path);

//	loading the excel sheet

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheetAt(0);
		
		File fout = new File(path);
		
		
		FileOutputStream fos = new FileOutputStream(fout);
//		write on existing row and existing column
		sh1.getRow(6).getCell(0).setCellValue("testvalue");
//		write on new row and new column		
		sh1.createRow(50).createCell(13).setCellValue("new row and new column test");
//		write on existing row and new column	
		sh1.getRow(15).createCell(2).setCellValue("existing row and new column");
		
		wb.write(fos);
		
		
	}
	
	
	public String readData(int row, int column) throws IOException
	{
		String path = System.getProperty("user.dir") + "\\Testdata.xlsx";

		File src = new File(path);

//	loading the excel sheet

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheetAt(0);
//	to read the string value from the sheet

//	String value = sh1.getRow(6).getCell(1).getStringCellValue();

//	System.out.println(value);

		DataFormatter df = new DataFormatter();

		String value = df.formatCellValue(sh1.getRow(row).getCell(column));

		System.out.println(value);
		
		return value;
	}
	
	
	
	public static void main(String[] args) throws IOException {

//		String path = System.getProperty("user.dir") + "\\Testdata.xlsx";
//
//		File src = new File(path);
//
////	loading the excel sheet
//
//		FileInputStream fis = new FileInputStream(src);
//
//		XSSFWorkbook wb = new XSSFWorkbook(fis);
//
//		XSSFSheet sh1 = wb.getSheetAt(0);
////	to read the string value from the sheet
//
////	String value = sh1.getRow(6).getCell(1).getStringCellValue();
//
////	System.out.println(value);
//
//		DataFormatter df = new DataFormatter();
//
//		String value = df.formatCellValue(sh1.getRow(6).getCell(1));
//
//		System.out.println(value);
		
		ExcelReader er = new ExcelReader();
		
		er.writeData();
		
		

	}

//	WAP to print all the values of  an excel sheet 

}
