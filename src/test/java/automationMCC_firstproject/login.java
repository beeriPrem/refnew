package automationMCC_firstproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;

public class login extends MCC_pom {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d;
		//System.setProperty("webdriver.chrome.driver" , "D:\\automation libraries\\plib\\chromedriver.exe");
		//  System.setProperty("webdriver.chrome.driver" , "D:\\prem\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver" , "D:\\automation libraries\\plib\\IEDriverServer.exe");
		
		d=new FirefoxDriver();
		//d=new ChromeDriver();
		//d=new InternetExplorerDriver();
	//	firstproject_pom l=PageFactory.initElements(d, firstproject_pom.class);
		//l.url.click();
		d.get("http://net.site4demo.com/MCC");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);
		// firstproject_pom l=PageFactory.initElements(d, firstproject_pom.class);
		
	}

}
