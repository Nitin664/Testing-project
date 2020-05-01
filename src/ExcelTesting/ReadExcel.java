package ExcelTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException
	{
		File src = new File("C:\\Users\\Om Sai Ram\\Documents\\Test1.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
		
		System.out.println("Total row is " + rowcount);
		
		for(int i=0; i<rowcount; i++);
		{	
		
		String data0 = sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Data from Excel is " + data0);
		
		/*String data1 = sheet.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("Data from Excel is " + data1);*/
		
		wb.close();
		}
	}
}
