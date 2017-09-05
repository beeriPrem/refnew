package automationMCC_firstproject;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class Mcc_homepagelinks {
	WebDriver d;
	 MCC_pom l=PageFactory.initElements(d, MCC_pom.class);
  @Test
  public void Homepagelinks() {
	 
	  By tagname = null ;
	List<WebElement> links=d.findElements(tagname );
		
		 for(int i=0;i<links.size();i++)
		 { 
			    if(!links.get(i).getText().isEmpty())
			  {
			     String link_text=links.get(i).getText();
				 String Exp_url=links.get(i).getAttribute("href");
			     String Act_url=d.getCurrentUrl();
			     links.get(i).click();
		
			   System.out.println(link_text);
			   System.out.println(Exp_url);
			   System.out.println(Act_url);
			   if(Exp_url.contains(Act_url))
			   {
				   System.out.println(link_text+" is working correctly");
			   }
			   else
			   {
				   System.out.println(link_text+" is not working correctly");
			   }
			           d.get("http://net.site4demo.com/MCC");
	   	               links=d.findElements(tagname);
			   }
			   
		 }

  }
  @BeforeMethod
  public void beforeMethod() {
	  d= new FirefoxDriver();
	  d.manage().window().maximize();
	  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  d.get("http://net.site4demo.com/MCC");
	  l.MCCurl.click();
  }

  @AfterMethod
  public void afterMethod() {
	  d.quit();
  }

}
