package ShopingSite.frameworkPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileReader {
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFCell cell;

	public  void getSheet(String filePath, int sheetNumber)
	{

		try {
			File source = new File(filePath);
			FileInputStream fs = new FileInputStream(source);
			wb = new XSSFWorkbook(fs);
			sheet = wb.getSheetAt(sheetNumber);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Please verify file is preset in specified location");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("unable to fetch file");
		}	
	}

	public String getCellData(int row, int column)
	{
		cell= sheet.getRow(row).getCell(column);
		String cellData= cell.getStringCellValue();
		return cellData;
	}

	public int getRowCouunt()
	{
		int rowNum = sheet.getLastRowNum();
		return rowNum + 1;
	}
}
