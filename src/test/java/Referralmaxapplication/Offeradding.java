package Referralmaxapplication;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Offeradding {
 WebDriver d;
@Test
public void referralofferadding() throws Throwable {
       
  
  Thread.sleep(3000);
  d.findElement(By.xpath(".//*[@id='navigation']/div[2]/ul/li[5]/a/span")).click();
  
  Thread.sleep(2000);
  d.findElement(By.xpath(".//*[@id='home']/div[1]/div/form/div/div[3]/input")).click();
  Thread.sleep(2000);
  d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[1]/div/div[1]/div/input")).sendKeys("50% offer on 2 wheelers");
  
  d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[2]/div/div[1]/div/span[1]/button")).click();
  Thread.sleep(2000);
  d.findElement(By.xpath(".//*[@id='datepicker-3230-2797-25']/button")).click();
  
  Thread.sleep(1000);
  d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[2]/div/div[2]/div/span[1]/button")).click();
  Thread.sleep(2000);
  d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div/ul/li[1]/div/div/div/table/thead/tr[1]/th[3]/button")).click();
  Thread.sleep(2000);
  d.findElement(By.xpath(".//*[@id='datepicker-2667-6888-32']/button")).click();
  
  d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[3]/div/textarea")).sendKeys("KTM provides 50% offer on sports bikes");
  
  d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[5]/div/div[1]/div/textarea")).sendKeys("You are getting $25 coupon");
  
  
  d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[5]/div/div[2]/div/textarea")).sendKeys("You are getting $20 coupon");
  d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[6]/div/div[1]/div/input")).sendKeys("150");
  d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[6]/div/div[2]/div/input")).sendKeys("120");
  
  
  
 // Actions action = new Actions(d);

  // To click on the element
 // WebElement table = d.findElement(By.className("gssb_m")); 
//  List rows = table.findElements(By.tagName("tr")); 
//  Iterator i = rows.iterator(); 
//  System.out.println("-----------------------------------------"); 
//  while(i.hasNext()) { 
//          WebElement row = i.next(); 
//          List columns = row.findElements(By.tagName("td")); 
//          Iterator j = columns.iterator(); 
//          while(j.hasNext()) { 
//                  WebElement column = j.next(); 
//                  System.out.println(column.getText()); 
//          } 
//          System.out.println(""); 
//           
//  System.out.println("-----------------------------------------"); 
//  } 
 
  
  
  
  
  
  
  
  
  
//  action.moveToElement(d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[4]/div/div[1]/div/div[1]/input")).sendKeys("suncity")).key


  
  
//  d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[4]/div/div[1]/div/div[1]/input")).sendKeys("suncity");
  
  
  //  String a;
//    List<WebElement> map = d.findElement(By.tagName("html/body/div[2]")).click();
//  System.out.println(map.size());
//  for (int i=0;i<map.size();i++){
//  System.out.println(map.get(i).getAttribute("data-code"));
//  if (map.get(i).getAttribute("data-code").equalsIgnoreCase("IN--2")){
//  //System.out.println(map.get(i).);
//  Actions action = new Actions(d);
//  //WebElement we = mDriver.findElement(By.xpath("html/body/div[13]/ul/li[4]/a"));
//  action.moveToElement(map.get(i)).build().perform() ;
//  action.moveToElement(map.get(i)).click();
//  System.out.println("cccccccccccc");
//  Thread helper;
//  helper.sleep(06);
//  }
//  }
//    
    
    
    
    
  d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[2]/div[1]/input")).click();
  
 // Select s=new Select(d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/div/form/div/div[1]/div/div[2]/div[4]/div/div[1]/div/div[1]/input")).sendKeys("suncity"));
  //s.selectByIndex(2);
  
 }
  @BeforeMethod
  public void beforeMethod() throws Throwable {
   
    System.setProperty("org.apache.commons.logging.Log","org.apache.commons.logging.impl.Jdk14Logger");
    d= new FirefoxDriver();
    d.manage().window().maximize();
    d.manage().deleteAllCookies();
    Thread.sleep(1000);
    d.get("http://35.154.148.17:3000/#!/");
    Thread.sleep(2000);
    d.findElement(By.xpath(".//*[@id='areatoggle loginDiv']")).click();
     
    d.findElement(By.xpath(".//*[@id='loginFormId']/li[1]/div/input")).sendKeys("hindav@yopmail.com");
    d.findElement(By.xpath(".//*[@id='loginFormId']/li[2]/div/input")).sendKeys("12345678");
    d.findElement(By.xpath(".//*[@id='loginFormId']/li[4]/button")).click();
    
    
  // d=new FirefoxDriver();
   
   
   
   
  }

  @AfterMethod
  public void afterMethod() {
   
   
   
   
  }


 
  
}