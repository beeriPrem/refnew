package automationMCC_firstproject;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import jxl.Sheet;
import jxl.Workbook;

public class MCC_libraries {
	   WebDriver d;
	   
	@BeforeMethod
	  public void beforeMethod() throws Throwable {
		  d= new FirefoxDriver();
		  System.setProperty("org.apache.commons.logging.Log","org.apache.commons.logging.impl.Jdk14Logger");
		  d.manage().window().maximize();
		  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  d.manage().deleteAllCookies();
		//  Thread.sleep(1000);
		  d.get("http://net.site4demo.com/MCC");
		 
	  }
	 @AfterMethod
	  public void afterMethod() {
		  d.close();
		  //d.quit();
	  }
	
// 
//	public static Object[][] getexceldata(String p ,String S) throws Exception {
//		    String[][] Exceldata=null;
//		    FileInputStream f = new FileInputStream(p);
//		 
//		    Workbook w= Workbook.getWorkbook(f);
//		    Sheet s= w.getSheet(S);
//		    int row= s.getRows();
//		    int columns= s.getColumns(); 
//		    Exceldata = new String[row][columns];
//		    for(int i=0;i<row;i++){
//		    for (int j = 0; j < columns; j++) 
//		    Exceldata[i][j]=s.getCell(j, i).getContents();     
//	  
//		     
//	}
//			return Exceldata;
//	  }  
	  

	 
	
}
