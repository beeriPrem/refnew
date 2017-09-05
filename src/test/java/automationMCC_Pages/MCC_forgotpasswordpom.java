package automationMCC_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automationMCC_firstproject.MCC_libraries;

public class MCC_forgotpasswordpom extends MCC_libraries{

	
		//forgotpassword
		
		@FindBy(xpath="html/body/div[1]/div[3]/ul/li[1]/a")
		public WebElement MCCforgotpassword;
		@FindBy(xpath=".//*[@id='Email']")
		public WebElement MCCentervalidemail;
		@FindBy(xpath=".//*[@id='block-validate']/button")
		public WebElement MCCrecoverpassword;
	}


