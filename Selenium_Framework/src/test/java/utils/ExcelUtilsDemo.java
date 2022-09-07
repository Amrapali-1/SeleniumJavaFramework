package utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath=System.getProperty("user.dir");
		ExcelUtils excel=new ExcelUtils(projectPath+"\\Excel\\Data.xlsx","Sheet1");
		excel.getRowCount();
		excel.getCellDataString(0,0);
		excel.getCellDataNum(1, 1);
	}

}
