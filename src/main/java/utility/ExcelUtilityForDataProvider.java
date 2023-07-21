//package utility;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
//
//public class ExcelUtilityForDataProvider {
//
//	private static XSSFWorkbook workbook;
//	private static XSSFSheet sheet;
//	private static XSSFRow row;
//	private static XSSFCell cell;
//
//	public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {
//
//		String[][] tabArray = null;
//		try {
//
//			File file = new File(
//					"D:\\Nikhil\\Automation\\UI_Automation_3\\AutomationFramework\\src\\test\\java\\testData\\testData_1.xlsx");
//
//			FileInputStream input = new FileInputStream(file);
//			workbook = new XSSFWorkbook(input);
//			sheet = workbook.getSheetAt(1);
//			int startRow = 1;
//
//			int startCol = 1;
//
//			int ci, cj;
//
//			int totalRows = sheet.getLastRowNum();
//
//			// you can write a function as well to get Column count
//
//			int totalCols = 2;
//
//			tabArray = new String[totalRows][totalCols];
//
//			ci = 0;
//
//			for (int i = startRow; i <= totalRows; i++, ci++) {
//
//				cj = 0;
//
//				for (int j = startCol; j <= totalCols; j++, cj++) {
//
//					tabArray[ci][cj] = getCellData(i, j);
//
//					System.out.println(tabArray[ci][cj]);
//
//				}
//
//			}
//
//		}
//
//		catch (FileNotFoundException e) {
//
//			System.out.println("Could not read the Excel sheet");
//
//			e.printStackTrace();
//
//		}
//
//		catch (IOException e) {
//
//			System.out.println("Could not read the Excel sheet");
//
//			e.printStackTrace();
//
//		}
//
//		return (tabArray);
//
//	}
//
//	public static String getCellData(int RowNum, int ColNum) throws Exception {
//
//		try{
//
//			cell = sheet.getRow(RowNum).getCell(ColNum);
//
//			CellType dataType = cell.getCellType();
//
//			if  (dataType == 3) {
//
//				return "";
//
//			}else{
//
//				String CellData = cell.getStringCellValue();
//
//				return CellData;
//
//			}}catch (Exception e){
//
//			System.out.println(e.getMessage());
//
//			throw (e);
//
//			}
//
//		
//
//}
//
//}
//
//
