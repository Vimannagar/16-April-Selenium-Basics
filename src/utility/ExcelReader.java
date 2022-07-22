package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	
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

		String value = df.formatCellValue(sh1.getRow(6).getCell(1));

		System.out.println(value);

	}

//	WAP to print all the values of  an excel sheet 

}
