package Referralmaxapplication;



import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Referralofferadding1{
 WebDriver d;
  @Test(dataProvider="referralofferadding")
  public void register(String a,String b,String c,String aa,String e,String f) throws Throwable
    {
 //  Thread.sleep(3000);
 // d.findElement(By.xpath(".//*[@id='navigation']/div[2]/ul/li[5]/a/span")).click();
  Thread.sleep(2000);
  d.findElement(By.xpath(".//*[@id='home']/div[1]/div/form/div/div[3]/input")).click();
  Thread.sleep(2000);
  d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[1]/div/div[1]/div/input")).sendKeys(a);
  
    d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[2]/div/div[1]/div/span[1]/button")).click();
  Thread.sleep(3000);
  
  List<WebElement> dates=d.findElements(By.xpath("//div[@class='uib-daypicker ng-scope']/table/tbody/tr/td"));
  
 int total_nodes=dates.size();
 
 for(int i=0; i<total_nodes;i++)
 {
  String date=dates.get(i).getText();
  
  if(date.equals("25")) {
   
   
   dates.get(i).click();
   break;
  } 
 }
 
 Thread.sleep(1000);
 
 
 d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[2]/div/div[2]/div/span[1]/button")).click();
 //Thread.sleep(3000);
 
 List<WebElement> dates1=d.findElements(By.xpath("//div[@class='uib-daypicker ng-scope']/table/tbody/tr/td"));
 
int total_nodes1=dates1.size();

for(int i=0; i<total_nodes1;i++)
{
 String date1=dates1.get(i).getText();
 //Thread.sleep(3000);
 if(date1.equals("25")) {
  dates1.get(i).click();
  
  Thread.sleep(1000);
  break;
 } 
}
d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[3]/div/textarea")).sendKeys(b);
// add location
d.findElement(By.xpath("//input[@name='storeLocator']")).sendKeys("Hyd");
Thread.sleep(5000);
d.findElement(By.xpath("//input[@name='storeLocator']")).sendKeys(Keys.DOWN);
d.findElement(By.xpath("//input[@name='storeLocator']")).sendKeys(Keys.ENTER);
Thread.sleep(5000);
//
//
d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[5]/div/div[1]/div/textarea")).sendKeys(c);
d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[5]/div/div[2]/div/textarea")).sendKeys(aa);
//
d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[6]/div/div[1]/div/input")).sendKeys(e);

d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[6]/div/div[2]/div/input")).sendKeys(f);

d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[2]/div[1]/input")).click();
   }
//     try{
//    System.out.println(d.findElement(By.cssSelector("div.alert.alert-danger")).getText());
//     }
//     catch (Exception e1) {
//   System.out.println("registration successful");
//     }
     
  @DataProvider(name="referralofferadding")
  public Object[][] register() throws Exception {
     
     Object[][] array= getexceldata("C:\\Users\\Prem\\Desktop\\referralofferadding.xls","offersadding");
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
     
    d.findElement(By.xpath(".//*[@id='loginFormId']/li[1]/div/input")).sendKeys("arunadluri@yopmail.com");
    d.findElement(By.xpath(".//*[@id='loginFormId']/li[2]/div/input")).sendKeys("12345678");
    d.findElement(By.xpath(".//*[@id='loginFormId']/li[4]/button")).click();
    Thread.sleep(3000);
    d.findElement(By.xpath(".//*[@id='navigation']/div[2]/ul/li[5]/a/span")).click();
  
 }


  @AfterClass
  public void afterClass() {
 
//  @AfterMethod
//  public void afterMethod() 

 // {
   d.close();
  }
 
  }

