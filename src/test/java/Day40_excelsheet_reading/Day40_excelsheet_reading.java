package Day40_excelsheet_reading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//excel file..>work book..>sheets..>rows...>cells
public class Day40_excelsheet_reading 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Pavithra\\eclipse-workspace\\Automation_scripts\\src\\test\\java\\testdatafolder");
	XSSFWorkbook workbook = new XSSFWorkbook (file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int totalRows= sheet.getLastRowNum();
	int totalCells = sheet.getRow(1).getLastCellNum();
	System.out.println("number of rows:"+totalRows);
	System.out.println("number of cells:"+totalCells);
	//
	for(int r=0;r<=totalRows;r++)
			
	{
		XSSFRow currentRow=sheet.getRow(r);
		
		
		for(int c=0;c<totalCells;c++)
		{
			XSSFCell cell =currentRow.getCell(c);
			System.out.println(cell.toString());
		
	       }
	}
	//need to close this tab after the use of the application using method workbook.close();
		
		workbook.close();
		file.close();
	
	}
}
