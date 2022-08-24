package testngdiscussion;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DPClass {
	@DataProvider(name="testdata")
	public static String [][] dptest() throws IOException
	{
		String path = "F:\\Desktop\\VimanNagar\\16 Apr\\DataProvidersheet.xlsx";

		File src = new File(path);

//	loading the excel sheet

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheetAt(0);
		
	int	row = sh1.getLastRowNum();
	
	System.out.println("Total number of rows are :"+row);
	int column = sh1.getRow(0).getLastCellNum();
	
	System.out.println("Total number of columns are :"+column);

	String [][] data = new String[row+1][column];
	for(int i=0; i<=row; i++)
	{
		for(int j=0; j<column; j++)
		{
		data[i][j]	= sh1.getRow(i).getCell(j).getStringCellValue();
		}
	}
	
	return data;
		
	}
	
	public static void main(String[] args) throws IOException {
		dptest();
	}
	
	
	

}
