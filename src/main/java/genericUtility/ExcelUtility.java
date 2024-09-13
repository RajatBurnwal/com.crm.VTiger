package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class is based on all Excel related operations
 * @author rajat burnwal
 * @version 8.28.24
 */
public class ExcelUtility {
	
	/**
	 * This generic method is used to read a single data from excel
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Exception
	 */
	public String readDataFromExcel(String sheetName, int rowNum, int cellNum) throws Exception
	{
		FileInputStream fis=new FileInputStream(IConstantUtility.excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Cell c=wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(c);
		return value;
	}
	
	/**
	 * This generic method is used to read multiple data from excel
	 * @param sheetName
	 * @param startRowNum
	 * @param startCellNum
	 * @throws Exception
	 */
	public void readMultipleDataFromExcel(String sheetName, int startRowNum, int startCellNum) throws Exception
	{
		FileInputStream fis=new FileInputStream(IConstantUtility.excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		DataFormatter df=new DataFormatter();
		for(int i=startRowNum;i<=sh.getLastRowNum();i++)
		{
			Row r=sh.getRow(i);
			for(int j=startCellNum;j<r.getLastCellNum();j++)
			{
				String value=df.formatCellValue(r.getCell(j));
				System.out.println(value);
			}
		}
	}
	
	/**
	 * This generic method is used to write data in Excel
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @param value
	 * @throws Exception
	 */
	public void writeDataOnExcel(String sheetName, int rowNum, int cellNum, String value) throws Exception
	{
		FileInputStream fis=new FileInputStream(IConstantUtility.excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		sh.createRow(rowNum).createCell(cellNum).setCellValue(value);
		
		FileOutputStream fos=new FileOutputStream(IConstantUtility.excelPath);
		wb.write(fos);
	}

}
