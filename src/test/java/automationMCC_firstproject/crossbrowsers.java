package automationMCC_firstproject;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.openqa.selenium.ie.InternetExplorerDriver;
 
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



public class crossbrowsers {


 public  WebDriver driver;

 @Parameters("browser")
 
 
  
 
 
  @Test public void login() throws InterruptedException {
 
  
  driver.get("http://www.store.demoqa.com"); 
 driver.findElement(By.xpath(".//*[@id='account']/a")).click();
 
    driver.findElement(By.id("log")).sendKeys("testuser_1");
 
    driver.findElement(By.id("pwd")).sendKeys("Test@123");
 
    driver.findElement(By.id("login")).click();
 
 }  

  
  
  @BeforeTest
  public void setup(String browser) throws Exception {
  

  
   if(browser.equalsIgnoreCase("firefox")) {
   
    //System.setProperty("Webdriver.gecko.driver", "");
    
    
    driver = new FirefoxDriver();
  
   
  
  }
   else if (browser.equalsIgnoreCase("ie")) { 
  
    
  
    System.setProperty("Webdriver.ie.driver", "C:\\Users\\Prem\\Downloads\\IEDriverServer.exe");
  
    driver = new InternetExplorerDriver();
  
   } 
   else{
  //If no browser passed throw exception
  throw new Exception("Browser is not correct");
 }
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


  
   }
  

  @AfterTest
  public void teardown() {
 
  driver.quit();
  }
  }