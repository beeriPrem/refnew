package Referralmaxapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dummy {
	WebDriver d;
	@Test
	public void registration() throws Throwable {
		
		System.setProperty("org.apache.commons.logging.Log","org.apache.commons.logging.impl.Jdk14Logger");
		d= new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		d.get("http://35.154.148.17:3000/#!/");
		
		d.findElement(By.xpath(".//*[@id='areatoggle loginDiv']")).click();
		d.findElement(By.xpath(".//*[@id='loginFormId']/li[4]/a")).click();
		
		d.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div[1]/div[1]/input")).sendKeys("vehicles");
		d.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div[1]/div[2]/input")).sendKeys("8121228721");
		d.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div[1]/div[3]/input")).sendKeys("MD");
		//d.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div[1]/div[4]/select")).click();
		
		
		Select category = new Select(d.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div[1]/div[4]/select")));
		category.selectByVisibleText("Health/Fitness");
		//fruits.selectByIndex(1);
		d.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div[1]/div[5]/textarea")).sendKeys("noida");
		d.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div[1]/div[6]/input")).sendKeys("suncity");
		d.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div[1]/div[7]/input")).sendKeys("India");
		
		Thread.sleep(4000);
	   
		d.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div[2]/div[1]/input")).sendKeys("Rock");
		d.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div[2]/div[2]/input")).sendKeys("arunnm@yopmail.com");
		
		d.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div[2]/div[3]/input")).sendKeys("12345678");
		d.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div[2]/div[4]/input")).sendKeys("12345678");
		d.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div[2]/div[5]/textarea")).sendKeys("We are Delivered the Quality and good products");
		d.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div[2]/div[6]/input")).sendKeys("UP");
		d.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div[2]/div[7]/input")).sendKeys("201301");
		
		Thread.sleep(5000);
		
		d.findElement(By.xpath(".//*[@id='registerForm']/div[3]/div[2]/input")).click();
		
		
		Thread.sleep(5000);
		
		d.findElement(By.xpath(".//*[@id='monthly_plan_div']/div[1]/div/a")).click();
		
		
		
	//d.findElement(By.xpath(".//*[@id='monthly_plan_div']/div[2]/div/a")).click();
//		
		//d.findElement(By.xpath(".//*[@id='monthly_plan_div']/div[3]/div/a")).click();
//		
		Thread.sleep(4000);
		
		d.findElement(By.xpath(".//*[@id='payment-popup']/form/div/div[1]/div/input")).sendKeys("4242424242424242");
		
		d.findElement(By.xpath(".//*[@id='payment-popup']/form/div/div[2]/div[1]/input")).sendKeys("05");
		d.findElement(By.xpath(".//*[@id='payment-popup']/form/div/div[2]/div[2]/input")).sendKeys("2021");
		d.findElement(By.xpath(".//*[@id='payment-popup']/form/div/div[2]/div[3]/input")).sendKeys("242");
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath(".//*[@id='submit_div']/input")).click();
		
//		 try{
//			 
//		       Thread.sleep(1000);
//		          //System.out.println(d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/main/ui-view/ui-view/section/div[1]/div/div/div[1]/div/h1")).getText().contains("Manage Sales Managers"));
//		          
//		          System.out.println(d.findElement(By.xpath(".//*[@id='toast-container']/div/div/div/div")).getText().contains("Success! Please check your email."));
//		          System.out.println("successfully registered the business Owner");
//	    	
//	  }
//	  	  catch (Exception e) {
//	  		  
//	  	
//	  		
//	  	System.out.println("Email details are already used");
//	      
//	  }
		
		
		
		
		
		//d.findElement(By.xpath(".//*[@id='toast-container']/div/div"));
		
		
	//	d.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div[2]/div[7]/input")).sendKeys("201301");
		
		
	}

	 @Test
	  public void addemployee() throws Exception {
		 System.setProperty("org.apache.commons.logging.Log","org.apache.commons.logging.impl.Jdk14Logger");
			d= new FirefoxDriver();
			
//			System.setProperty("webdriver.chrome.driver","D:\\prem\\chromedriver_win32\\chromedriver.exe");
//			   d=new ChromeDriver();
			
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
			d.get("http://35.154.148.17:3000/#!/");
			d.findElement(By.xpath(".//*[@id='areatoggle loginDiv']")).click();
			d.findElement(By.xpath("//input")).sendKeys("bharath3@yopmail.com");
			Thread.sleep(1000);
			d.findElement(By.xpath(".//*[@id='loginFormId']/li[2]/div/input")).sendKeys("12345678");
			Thread.sleep(3000);
         d.findElement(By.cssSelector(".btn.login_btn")).submit();
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
			  Thread.sleep(1000);
		   System.out.println("picture uploaded");
//			  //    d.findElement(starupld).click();
			      
   // Thread.sleep(1000);
			
			
			d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[3]/div[1]/input")).sendKeys("lanyath");
		    d.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div[1]/div/ui-view/ui-view/section/div[2]/form/div/div[3]/div[2]/input")).sendKeys("lanyath1@yopmail.com");
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
}
