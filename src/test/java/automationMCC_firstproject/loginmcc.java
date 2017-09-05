package automationMCC_firstproject;



import org.openqa.selenium.By;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationMCC_Pages.MCC_loginpom;


public class loginmcc extends MCC_libraries {

	
	
	@Test
	public void login(String a,String b) throws InterruptedException
    {
	  
	 MCC_loginpom l=new MCC_loginpom(d);
	  
	  System.err.println(a);
	  System.err.println(b);
	  l.login(a, b);
	
		
//		  @Test(dataProvider="data")
//		  public void login(String a,String b) throws InterruptedException
//		    {
//			  
//			 MCC_loginpom l=new MCC_loginpom(d);
//			  
//			  System.err.println(a);
//			  System.err.println(b);
//			  l.login(a, b);


				
				
			 try{
				          System.out.println(d.findElement(By.xpath(".//*[@id='content']/div/div/h2")).getText().contains("List : MCC User"));
			    		  System.out.println("successsfully login");
			    	      l.MCClogoutbttn.click();
			    	   
		  	    }
			  	  catch (Exception e) {
			  		  
			  	
			  		
			  	System.out.println("login details are invalid");
			      
			   }
				
			   Thread.sleep(1000);   
		  	 
		  	  l.MCCusrname.clear();

			  l.MCCpwd.clear();
			 
		 	 }
		
		  

	}


