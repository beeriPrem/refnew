package Referralmaxapplication;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Referralmaxlogin {
	WebDriver d;
  @Test
  public void Login() throws Exception {
	  
	  d.findElement(By.xpath(".//*[@id='areatoggle loginDiv']")).click();
	  
	  ////Actions a = new Actions(d);
		//WebElement mainMenu = d.findElement(By.cssSelector("#areatoggle"));
		//a.moveToElement(d.findElement(By.cssSelector("#areatoggle"))).clickAndHold().build().perform();
		////a.moveToElement(d.findElement(By.cssSelector("#areatoggle"))).clickAndHold().moveToElement(d.findElement(By.cssSelector(".btn.login_btn"))).build().perform();
		
//d.findElement(By.name(""))
		//Thread.sleep(10000);
		d.findElement(By.xpath("//input")).sendKeys("craigg@yopmail.com");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='loginFormId']/li[2]/div/input")).sendKeys("12345678");
		Thread.sleep(3000);
//		WebElement loginlink = d.findElement(By.cssSelector(".btn.login_btn"));
//		a.moveToElement(loginlink);
		//Actions a1 = new Actions(d);
		
		//a.moveToElement(d.findElement(By.cssSelector(".btn.login_btn"))).build().perform();
		
		d.findElement(By.cssSelector(".btn.login_btn")).submit();
		
		
		 try{
			 
			       Thread.sleep(1000);
			          //System.out.println(d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/main/ui-view/ui-view/section/div[1]/div/div/div[1]/div/h1")).getText().contains("Manage Sales Managers"));
			          
			          System.out.println(d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/main/ui-view/ui-view/section/div[1]/div/div/div[1]/div/h1")).getText().contains("Employees"));
		    		  System.out.println("successsfully login");
		    	 
		    	
	  	  }
		  	  catch (Exception e) {
		  		  
		  	
		  		
		  	System.out.println("login details are invalid");
		      
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
  }

  @AfterMethod
  public void afterMethod() {
	  d.close();
	
	  
  }

}
