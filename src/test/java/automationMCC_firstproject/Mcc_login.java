package automationMCC_firstproject;

    import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	//import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
      import org.openqa.selenium.chrome.ChromeDriver;
   // import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;


	public class Mcc_login extends MCC_pom {
		WebDriver d;
		
		
		
	@Test
	public void Mcclogin() throws InterruptedException, IOException {
			MCC_pom l=PageFactory.initElements(d, MCC_pom.class);
			l.MCCusrname.sendKeys("Admin@admin.com");
			l.MCCpwd.sendKeys("Admin@1234");
			l.MCCloginsubbtn.click();
			//d.navigate().back();
			Thread.sleep(1000);
			//l.
			

		}

		
		
	@BeforeMethod
    public void beforeMethod() {
			 // d= new FirefoxDriver();
			  d.manage().window().maximize();
			  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//System.setProperty("webdriver.chrome.driver" , "D:\\automation libraries\\plib\\chromedriver.exe");
				  System.setProperty("webdriver.chrome.driver" , "D:\\prem\\chromedriver_win32\\chromedriver.exe");
				//System.setProperty("webdriver.ie.driver" , "D:\\automation libraries\\plib\\IEDriverServer.exe");
				
				
				d=new ChromeDriver();
				//d=new InternetExplorerDriver();

			   d.manage().deleteAllCookies();
			   
			   d.get("http://net.site4demo.com/MCC");
			   
//			   d.findElement(By.id("username")).sendKeys("wipl0005");
//			   d.findElement(By.id("password")).sendKeys("zupamuzap");
//			   d.findElement(By.id("loginsubmit")).click();
			
		  }
		  

	@AfterMethod
    public void afterMethod() {
			    d.close();
			 // d.quit();
		  }
	}


