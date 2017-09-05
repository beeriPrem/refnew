package automationMCC_firstproject;


import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
//import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;


 public class MCClogin  {
    WebDriver d;
  
  @BeforeMethod
    public void beforeMethod() {
	  System.setProperty("org.apache.commons.logging.Log","org.apache.commons.logging.impl.Jdk14Logger");
	  d= new FirefoxDriver();
	  d.manage().window().maximize();
	  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  d.manage().deleteAllCookies();
	
	  d.get("http://net.site4demo.com/MCC");
	 
  }
  
  @Test(dataProvider="data")
  public void login(String a,String b) throws InterruptedException
    {
	  
	  MCC_pom l=PageFactory.initElements(d, MCC_pom.class);
	  
	  System.err.println(a);
	  System.err.println(b);

		l.MCCusrname.sendKeys(a);
		l.MCCpwd.sendKeys(b);
		l.MCCloginsubbtn.click();
		
		
	
		
		
	 try{
		          System.out.println(d.findElement(By.xpath(".//*[@id='content']/div/div/h2")).getText().contains("List : MCC User"));
	    		  System.out.println("successsfully login");
	    	      l.MCClogoutbttn.click();
	    	      //Thread.sleep(1000);
			//  System.out.println(d.findElement(By.cssSelector("p.text-muted.text-center")).getText());
//			  System.out.println(d.findElement(By.id("Password-error")).getText());
//			  System.out.println(d.findElement(By.id("Email-error")).getText());
			  
	 	// System.out.println(d.findElement(By.cssSelector("div.alert.alert-danger")).getText());
  	  }
	  	  catch (Exception e) {
	  		  
	  		//Thread.sleep(1000);
	  		
	  	System.out.println("login details are invalid");
	      
	  }
		
	   Thread.sleep(1000);   
  	 
  	 

	 
	  
	  l.MCCusrname.clear();

	  l.MCCpwd.clear();
	  //l.MCClogoutbttn.click();
	 // d.navigate().back();
 	  }
  @DataProvider(name="data")
  public Object[][] s() throws Exception {
     
     Object[][] array= getexceldata("D:\\prem\\MCCexcelsheets\\MCC_logincredentials.xls","logincredentials");
     return array;
    }  
  public static Object[][] getexceldata(String p ,String S) throws Exception {
	    String[][] Exceldata=null;
	    FileInputStream f = new FileInputStream(p);
	 
	    Workbook w= Workbook.getWorkbook(f);
	    Sheet s= w.getSheet(S);
	    int row= s.getRows();
	    int columns= s.getColumns(); 
	    Exceldata = new String[row][columns];
	    for(int i=0;i<row;i++){
	    for (int j = 0; j < columns; j++) 
	   
	    Exceldata[i][j]=s.getCell(j, i).getContents();     
  
  }
		return Exceldata;
	}
  
   @AfterMethod
   public void afterMethod() {
	  d.close();
	  //d.quit();
  }

}
