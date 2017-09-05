package Referralmaxapplication;



import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshot {


	public class Screenshot {
			WebDriver d;
				
			@Before
			public void init() throws  Exception
			{
				d = new FirefoxDriver();
						
			}
		    @Test
		    public void testScreenshot() throws Exception {
		        
		        d.manage().window().maximize();        
		        d.get("http://www.google.com");
		        d.findElement(By.xpath(".//*[@id='mw-content-text']/div/ul[1]/li[1]")).click();
		        
		        //Current Date
		        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
				Date date = new Date();
				System.out.println(date);
				
				System.out.println(dateFormat.format(date));
		        
		        // then Augmenter will add the TakesScreenshot methods to the instance
		        File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		        FileUtils.copyFile(scrFile, new File("D:\\Target\\Results\\"+dateFormat.format(date)+".png"));
		        
//		        d.findElement(By.id("gbqfb")).click();
		        Thread.sleep(5000);
		        
		        
		    }
		    @After
		    public void stop()
		    {
		    	d.quit();
		    }
		}


	}


