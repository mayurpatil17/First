package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readPropertyData(String propPath, String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
		
	}
	
	public String readExcelData(String excelPath, String sheetName, int rowCount, int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row rc = sh.getRow(rowCount);
		Cell cell = rc.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
	
		
	}
	public int rowcount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);//the path of excel file which we want to read
		Workbook wb = WorkbookFactory.create(fis);//create() will make the excel file ready for read operation
		Sheet sh = wb.getSheet(sheetName);// specify the sheet name
		int rowcount = sh.getLastRowNum();
		return rowcount;
	}

}
