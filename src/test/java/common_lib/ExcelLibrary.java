package common_lib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary 
{

	private String path;
	private String sheetName;
	private int rowNum;
	public ExcelLibrary(String path, String sheetName, int rowNum)
	{
		this.path = path;
		this.sheetName = sheetName;
		this.rowNum = rowNum;
	}
	
	public String readData(int cellNum)
	{
		try
		{
			FileInputStream fis = new FileInputStream(path);
			Workbook w1 = WorkbookFactory.create(fis);
			String data = w1.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
			return data;
		}
		catch (Exception e) 
		{
			return "";
		}
	}
	public void  writeData(int cellNum, String data)
	{
		try
		{
			FileInputStream fis = new FileInputStream(path);
			Workbook w1 = WorkbookFactory.create(fis);
			w1.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(data);
			FileOutputStream fos = new FileOutputStream(path);
			w1.write(fos);
		}
		catch (Exception e) 
		{
			
		}
	}
	
}
