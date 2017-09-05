package Referralmaxapplication;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Referralemployeeadd1{
 WebDriver d;
  @Test(dataProvider="referraladdemploye")
  public void register(String a,String b,String c,String aa,String e) throws Throwable
    {

	   // Thread.sleep(1000);
	   // d.findElement(By.xpath(".//*[@id='navigation']/div[2]/ul/li[1]/a/span")).click();
      Thread.sleep(3000);
	    d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[1]/div/div/div[3]/div/form/div/div[3]/input")).click();
	    
		
		
		Thread.sleep(1000);
	////d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[6]/input")).click();
//	StringSelection ss=new StringSelection("C:\\Users\\Prem\\Desktop\\download (2).png");
//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//	Robot robot = new Robot();
	//                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                robot.keyPress(KeyEvent.Enter);
	
	 d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[2]/input")).click();

	
Runtime.getRuntime().exec("C:\\Users\\Prem\\Desktop\\Autoit\\upload employeepicture.exe");
//	
		  Thread.sleep(1000);
	   System.out.println("picture uploaded");
//		  //    d.findElement(starupld).click();
		      
// Thread.sleep(1000);
		
		
		d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[3]/div[1]/input")).sendKeys(a);
	    d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[3]/div[2]/input")).sendKeys(b);
	    d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[4]/div[1]/input")).sendKeys(c);
      d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[4]/div[2]/input")).sendKeys(aa);
      d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[5]/div/input")).sendKeys(e);
     Thread.sleep(3000);
      d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[7]/input")).click();
    try{
		 
	       Thread.sleep(1000);
	          //System.out.println(d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/main/ui-view/ui-view/section/div[1]/div/div/div[1]/div/h1")).getText().contains("Manage Sales Managers"));
	          
	          System.out.println(d.findElement(By.xpath(".//*[@id='toast-container']/div/div")).getText().contains("Success! user added successfully."));
  		  System.out.println("successsfully user added");
  	 
  	
    }
	  catch (Exception e1) {
		  
	System.out.println("This email is already used");
    
}

    }     
  @DataProvider(name="referraladdemploye")
  public Object[][] register() throws Exception {
     
     Object[][] array= getexceldata("C:\\Users\\Prem\\Desktop\\referralofferadding.xls","addemployee");
     return array;
     
    }  
  private Object[][] getexceldata(String p, String S) throws Exception {
   String[][] Exceldata=null;
     
   FileInputStream f = new FileInputStream(p);
     
      Workbook w=Workbook.getWorkbook(f);
      Sheet s= w.getSheet(S);
      int row= s.getRows();
      int columns= s.getColumns(); 
      Exceldata = new String[row][columns];
      for(int i=0;i<row;i++){
       
      for (int j = 0; j < columns; j++) {
      Exceldata[i][j]=s.getCell(j, i).getContents();
      }
      }
   return Exceldata;

 }

  @BeforeClass
  public void beforeClass() throws InterruptedException{
  
//  @BeforeMethod
//  public void beforeMethod() throws InterruptedException {
   //d= new FirefoxDriver();
   //d.manage().window().maximize();
  
   System.setProperty("org.apache.commons.logging.Log","org.apache.commons.logging.impl.Jdk14Logger");
    d= new FirefoxDriver();
    d.manage().window().maximize();
    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    d.manage().deleteAllCookies();
    Thread.sleep(1000);
    d.get("http://35.154.148.17:3000/#!/");
    Thread.sleep(2000);
    d.findElement(By.xpath(".//*[@id='areatoggle loginDiv']")).click();
     
    d.findElement(By.xpath(".//*[@id='loginFormId']/li[1]/div/input")).sendKeys("vinayrathode1@yopmail.com");
    d.findElement(By.xpath(".//*[@id='loginFormId']/li[2]/div/input")).sendKeys("12345678");
    d.findElement(By.xpath(".//*[@id='loginFormId']/li[4]/button")).click();
    Thread.sleep(3000);
    d.findElement(By.xpath(".//*[@id='navigation']/div[2]/ul/li[1]/a/span")).click();
   
  
 }


  @AfterClass
  public void afterClass() {
 
//  @AfterMethod
//  public void afterMethod() 

 // {
   d.close();
  }
 
  }

