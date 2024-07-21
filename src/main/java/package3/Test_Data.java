package package3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//DDT in POM
public class Test_Data
{
	public static String un1;//making the vari global with public so that it can be used outside the package, like DDT in package3
	public static String pwd1;
public void Data_Fetching() throws EncryptedDocumentException, IOException
{
	FileInputStream f1 = new FileInputStream("c:\\Users\\Thejashwini L\\eclipse-workspace\\Selenium_Basics\\TestData\\Thejashwini_TestData.xlsx");
	Workbook  wb = WorkbookFactory.create(f1);
	 un1 = wb.getSheet("Amazon_Cred").getRow(1).getCell(0).getStringCellValue();//since we made global no need to add String here 
	 pwd1 = wb.getSheet("Amazon_Cred").getRow(1).getCell(1).getStringCellValue();
	}
}
