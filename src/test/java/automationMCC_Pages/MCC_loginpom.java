package automationMCC_Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import automationMCC_firstproject.MCC_libraries;

public class MCC_loginpom {
	

	
//login	
	
	@FindBy(name="Email")
     public WebElement MCCusrname;
	@FindBy(name="Password")
	public WebElement MCCpwd;
	@FindBy(xpath="//button")
	public WebElement MCCloginsubbtn;
	@FindBy(xpath=".//*[@id='block-validate']/div[1]/ul/li")
	public WebElement invalidmessage;
	@FindBy(xpath=".//*[@id='logoutForm']/a/span")
	public WebElement MCClogoutbttn;
	
 


public MCC_loginpom(WebDriver d){
	
	 PageFactory.initElements(d,this);

}
	
	
public void login(String a, String b){
	
	MCCusrname.sendKeys("Admin@admin.com");
	MCCpwd.sendKeys("Admin@1234");
	MCCloginsubbtn.click();
	
	
	
	}
} 