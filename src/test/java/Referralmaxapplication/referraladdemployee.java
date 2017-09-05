package Referralmaxapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class referraladdemployee {
	WebDriver d;
	 @Test
	  public void addemployee() throws Exception {
		 
		    Thread.sleep(1000);
     	    d.findElement(By.xpath(".//*[@id='navigation']/div[2]/ul/li[1]/a/span")).click();
	        Thread.sleep(3000);
		    d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[1]/div/div/div[3]/div/form/div/div[3]/input")).click();
		    
			
			
			Thread.sleep(1000);
		////d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[6]/input")).click();
//		StringSelection ss=new StringSelection("C:\\Users\\Prem\\Desktop\\download (2).png");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//		Robot robot = new Robot();
		//                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                robot.keyPress(KeyEvent.Enter);
		
		 d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[2]/input")).click();

		
	 Runtime.getRuntime().exec("C:\\Users\\Prem\\Desktop\\Autoit\\upload employeepicture.exe");
//	
	 
	// Runtime.getRuntime().exec("C:\\Users\\Prem\\Desktop\\autoitimageupload.exe");
			  Thread.sleep(1000);
		   System.out.println("picture uploaded");
//			  //    d.findElement(starupld).click();
			      
    // Thread.sleep(1000);
			
			
			d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[3]/div[1]/input")).sendKeys("garan6");
		    d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[3]/div[2]/input")).sendKeys("garann6@yopmail.com");
		    d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[4]/div[1]/input")).sendKeys("1234567890");
            d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[4]/div[2]/input")).sendKeys("emp-1");
            d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[5]/div/input")).sendKeys("Noida-sector 63");
           Thread.sleep(3000);
            d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[7]/input")).click();
          try{
 			 
		       Thread.sleep(1000);
		          //System.out.println(d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/main/ui-view/ui-view/section/div[1]/div/div/div[1]/div/h1")).getText().contains("Manage Sales Managers"));
		          
		          System.out.println(d.findElement(By.xpath(".//*[@id='toast-container']/div/div")).getText().contains("Success! user added successfully."));
	    		  System.out.println("successsfully user added");
	    	 
	    	
 	  }
	  	  catch (Exception e) {
	  		  
	  	
	  		
	  	System.out.println("This email is already used");
	      
	  }
	}
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  
		  System.setProperty("org.apache.commons.logging.Log","org.apache.commons.logging.impl.Jdk14Logger");
			d= new FirefoxDriver();
			
//			System.setProperty("webdriver.chrome.driver","D:\\prem\\chromedriver_win32\\chromedriver.exe");
//			   d=new ChromeDriver();
			
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
			d.get("http://35.154.148.17:3000/#!/");
			d.findElement(By.xpath(".//*[@id='areatoggle loginDiv']")).click();
			d.findElement(By.xpath("//input")).sendKeys("vinayrathode2@yopmail.com");
			Thread.sleep(1000);
			d.findElement(By.xpath(".//*[@id='loginFormId']/li[2]/div/input")).sendKeys("12345678");
			Thread.sleep(3000);
            d.findElement(By.cssSelector(".btn.login_btn")).submit();
			
	  }

	  @AfterMethod
	  public void afterMethod() {
		  //d.close();
		
		  
	  }
}
