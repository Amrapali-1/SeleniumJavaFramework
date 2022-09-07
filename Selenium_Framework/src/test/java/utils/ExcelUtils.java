package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	 static String  projectPath;
	 static XSSFWorkbook workbook;
static XSSFSheet sheet;
public ExcelUtils(String excelPath,String sheetName) {
	try{
		projectPath=System.getProperty("user.dir");
	 workbook = new XSSFWorkbook(excelPath);
  sheet= workbook.getSheet(sheetName);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getRowCount();
		getCellDataString(0,0);
		getCellDataString(1,1);
	}
public static int getRowCount() {
	int rowCount=0;
try {
	
rowCount=sheet.getPhysicalNumberOfRows();
	System.out.println(rowCount);
} catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println(e.getMessage());
	System.out.println(e.getCause());
	e.printStackTrace();
}
return rowCount;
}
public static int getColumnCount() {
	int columnCount=0;
try {
	
	columnCount=sheet.getRow(0).getPhysicalNumberOfCells();
	System.out.println(columnCount);
} catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println(e.getMessage());
	System.out.println(e.getCause());
	e.printStackTrace();
}
return columnCount;
}
public static String getCellDataString(int rowNum,int colNum) {
	String cellData=null;
	
	try{
		
cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
System.out.println(cellData);
}catch(Exception e) {
	System.out.println(e.getMessage());
	System.out.println(e.getCause());
	e.printStackTrace();
}
	return cellData;
}
	public static void getCellDataNum(int rowNum,int colNum) {
		try{
			
	double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
	System.out.println(cellData);
	}catch(Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		e.printStackTrace();
	}

	}

}
