package Referralmaxapplication;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownlist {
	
	 public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.get("http://toolsqa.wpengine.com/automation-practice-form");
	  
	   
	  Select s = new Select(driver.findElement(By.id("continents")));
     //s.getOptions();
	  Thread.sleep(2000);
//	  
//	  oprem.selectByVisibleText("South America");
//	  Thread.sleep(2000);
//	  
	//  List<WebElement> size = s.getOptions();
	  //int i=0;
	   for (int i=0; i<=6; i++){
	    String sValue = s.getOptions().get(i).getText();
	    
//	    if (sValue.equals("Australia")){
	     System.out.println(sValue);
//	     break;
	    }
	   }
	  
	  
	  
	 }


