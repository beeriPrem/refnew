package Referralmaxapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class referralforgotpassword {
	WebDriver d;
  @Test
  public void forgotpassword() throws InterruptedException {
	  
	  Thread.sleep(3000);
	 // d.findElement(By.xpath("//input")).sendKeys("transport@yopmail.com");
	  d.findElement(By.xpath(".//*[@id='loginFormId']/li[3]/a")).click();
	  d.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div[3]/form/div[1]/div/input")).sendKeys("rithikaa@yopmail.com");
	  d.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div[3]/form/button")).click();
	//  System.out.println("successsfully sent A reset password link has been sent to your email account. ");
	  
	  try{
			 
		       Thread.sleep(1000);
	          //System.out.println(d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/main/ui-view/ui-view/section/div[1]/div/div/div[1]/div/h1")).getText().contains("Manage Sales Managers"));
		          
		          System.out.println(d.findElement(By.xpath(".//*[@id='toast-container']/div/div")).getText().contains("A reset password link has been sent to your email account."));
	    		  System.out.println("successsfully sent A reset password link has been sent to your email account. ");
	    	 
    	
	  }
	  	  catch (Exception e) {
  		  
	  	
	  		
	  	System.out.println("Entered Email is invalid");
	      
	  }
	  
	  
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("org.apache.commons.logging.Log","org.apache.commons.logging.impl.Jdk14Logger");
		d= new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		d.get("http://35.154.148.17:3000/#!/");
		d.findElement(By.xpath(".//*[@id='areatoggle loginDiv']")).click();
		
		 
    	 
//		try{
//			 
//		       Thread.sleep(1000);
//		          //System.out.println(d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/main/ui-view/ui-view/section/div[1]/div/div/div[1]/div/h1")).getText().contains("Manage Sales Managers"));
//		          
//		          System.out.println(d.findElement(By.xpath(".//*[@id='toast-container']/div/div")).getText().contains("A reset password link has been sent to your email account."));
//	    		  System.out.println("successsfully sent A reset password link has been sent to your email account. ");
//	    	 
//	    	
//	  }
//	  	  catch (Exception e) {
//	  		  
	  	
//	  		
//	  	System.out.println("Entered Email is invalid");
//	      
//	  }
  }
  @AfterMethod
  public void afterMethod() {
	  d.close();
	
	  
  }
  
  
  
}
