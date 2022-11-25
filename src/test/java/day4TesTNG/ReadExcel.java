package day4TesTNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public void testData()
	{
		File src=new File("./testdata/SapientTestData.xlsx");

		try
		{
			FileInputStream fis=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh1=wb.getSheet("LoginData");
			XSSFRow r1=sh1.getRow(0);
			XSSFCell c1=r1.getCell(0);
			int row=sh1.getPhysicalNumberOfRows();
			int col=sh1.getRow(0).getPhysicalNumberOfCells();
			//System.out.println(col);
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					String value=sh1.getRow(i).getCell(j).getStringCellValue();
					System.out.println(value);
				}
			}
//			String username=c1.getStringCellValue();
//          System.out.println(username);
//          wb.close();
		}catch(FileNotFoundException e) {
			System.out.println("Please check data file path"+e.getMessage());
		}catch(IOException e) {
			System.out.println("Something Went Wrong IO"+e.getMessage());
		}
	}

}
