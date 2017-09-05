package Referralmaxapplication;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselection {

	
 public static void main(String[] args) throws InterruptedException {
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://toolsqa.wpengine.com/automation-practice-form");
	  Select oselect = new Select(driver.findElement(By.name("selenium_commands")));
	  //select broser comm
	//  oselect.selectByIndex(0);
	  Thread.sleep(2000);
	//  oselect.deselectByIndex(0);
	  //select navai brow
//	  oselect.selectByVisibleText("Navigation Commands");
//	  Thread.sleep(2000);
//	  oselect.deselectByVisibleText("Navigation Commands");
	
	  List<WebElement> multisize = oselect.getOptions();
	  int iListSize = multisize.size();
	  
	  for (int i =0; i<iListSize; i++){
	   String sValue = multisize.get(i).getText();
	   System.out.println(sValue);
	   //oselect.selectByIndex(i);
	   Thread.sleep(2000);
	  // oselect.deselectByIndex(i);
	  }
	  
	  driver.close();
	 }
	
	}
