package utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class DataProviderHolder {
	
	
	public static String[][] dataProviderMethod() throws IOException {
File src = new File("C:\\Users\\rumoursrus\\Desktop\\Aarcha\\RealProject\\testdata.xlsx");

//load the file 
FileInputStream fis = new FileInputStream(src);

//Load the workbook from the excel file
XSSFWorkbook Wb = new XSSFWorkbook(fis);

//load the sheet
XSSFSheet sheet = Wb.getSheetAt(0);

int rowNum = sheet.getLastRowNum()+1;
int colNum = sheet.getRow(0).getLastCellNum();

//System.out.println(rowNum);
//System.out.println(colNum);
String [][] data = new String[rowNum][colNum];

for (int i=0; i<rowNum;i++) {
	for (int j=0;j<colNum;j++){
		data[i][j]= sheet.getRow(i).getCell(j).getStringCellValue();
	}
}

/*for (int i=0; i<rowNum;i++) {
	for(int j=0; j<colNum; j++) {
		System.out.println(data[i][j]);
	}
}*/
Wb.close();
return data;

	}
	
	@DataProvider(name="empLogin")
	public static Object[][] loginData() throws IOException{
		Object[][] arrayObject = dataProviderMethod();
		return arrayObject;
		
	}
	
//not required
	/*public static void main(String[] args) throws IOException {
		DataProvider dp = new DataProvider();
		dp.dataProviderMethod();	
	}*/
}
