package automationMCC_firstproject;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class MCC_forgotpassword {
	WebDriver d;
	
	
	
@BeforeMethod
	  public void beforeMethod() {
		  d= new FirefoxDriver();
		  d.manage().window().maximize();
		  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  d.manage().deleteAllCookies();
		  d.get("http://net.site4demo.com/MCC");
		 
	  }
@AfterMethod
	  public void afterMethod() {
		d.close();
	}
	
@Test
  public void forgotpassword() {
	MCC_pom l=PageFactory.initElements(d, MCC_pom.class);
	
	l.MCCforgotpassword.click();
	l.MCCentervalidemail.sendKeys("prem.kumar@wildnettechnologi.com");
	
	l.MCCrecoverpassword.click();
	
  }

 
    
  
}
