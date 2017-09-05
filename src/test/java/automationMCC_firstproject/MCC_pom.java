package automationMCC_firstproject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MCC_pom {
	//@FindBy(linkText="Login")
	//public WebElement login;

	
//Url
	@FindBy(xpath="http://net.site4demo.com/MCC")
	public WebElement MCCurl;
		
	
//login	
	
	@FindBy(name="Email")
    public WebElement MCCusrname;
	@FindBy(name="Password")
	public WebElement MCCpwd;
	@FindBy(xpath="//button")
	public WebElement MCCloginsubbtn;
	@FindBy(xpath=".//*[@id='block-validate']/div[1]/ul/li")
	public WebElement invalidmessage;
	@FindBy(xpath=".//*[@id='logoutForm']/a/img")
	public WebElement MCClogoutbttn;
	
//forgotpassword
	
	@FindBy(xpath="html/body/div[1]/div[3]/ul/li[1]/a")
	public WebElement MCCforgotpassword;
	@FindBy(xpath=".//*[@id='Email']")
	public WebElement MCCentervalidemail;
	@FindBy(xpath=".//*[@id='block-validate']/button")
	public WebElement MCCrecoverpassword;
	
	
	
	
//	@FindBy(id="logoutbutton")
//	public WebElement logoutbtn;
//	@FindBy(linkText="Logout")
//	public WebElement logoutbutton;
//	@FindBy(xpath="(//div[@id='usernameerror'])[2]")
//	public WebElement erromsg;

//homepage links

    @FindBy(tagName="a")
    public WebElement tagname;
    
 //leave request
   
    @FindBy(xpath="//*[@id='4']/b")
    public WebElement selfservice;
    
   
    
    @FindBy(xpath=".//*[@id='maincontentdiv']/div[5]/input")
    public WebElement Applyxpath;
    
    @FindBy(xpath=".//*[@id='reason']")
    public WebElement reason;
    
    @FindBy(xpath=".//*[@id='s2id_leavetypeid']/a/div/b")
    public WebElement leavetype;
    
    @FindBy(xpath=".//*[@id='select2-drop']/ul/li[2]/div/span")
    public WebElement sicklevave;
    
    @FindBy(xpath=".//*[@id='s2id_leaveday']/a/span")
    public WebElement leave;
    
    @FindBy(xpath=".//*[@id='select2-drop']/ul/li[1]/div")
    public WebElement leaveday;
    
    @FindBy(xpath=".//*[@id='formid']/div[1]/div[5]/div/img")
    public WebElement calender;
    
    
    @FindBy(xpath=".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[3]/a")
    public WebElement calenderdate;
    
    @FindBy(xpath=".//*[@id='submitbutton']")
    public WebElement applyleave;
   
  //pendin
  
    @FindBy(xpath=".//*[@id='62']")
    public WebElement pendingleaves;
    
    @FindBy(xpath="//*[@id='pendingleaves']/table/tbody/tr[1]/td[1]/div/a[2]")
    public WebElement canceleaves;
    
    
  //Approve
    
    @FindBy(xpath="//*[@id='63']")
    public WebElement approvedleaves;
   
  //Cance
    
    @FindBy(xpath="//*[@id='64']")
    public WebElement cancelledleaves;
    
//Rejec
    
    @FindBy(xpath="//*[@id='135']")
    public WebElement rejectedleaves;
    
//My de
    
    @FindBy(xpath="//*[@id='32']")
    public WebElement Mydetails;
 
    //officia
    
    @FindBy(xpath="//*[@id='empdetails']/a")
    public WebElement Officialdetails;
  //*[@id='employeedocs']/a
  
 //Documents
    
    @FindBy(xpath="//*[@id='employeedocs']/a")
    public WebElement Documents;
    
    @FindBy(xpath="//div[2]/input")
    public WebElement newdocuments;
    
    @FindBy(xpath="//*[@id='document_name']")
    public WebElement documentname;
    
    @FindBy(xpath="//*[@id='emp_doc_form']/div[3]/input[4]")
    public WebElement docsave;
    
    @FindBy(xpath="//*[@id='emp_docs_10']/div[1]/input[2]")
    public WebElement docdelete;
    
    @FindBy(xpath="//*[@id='download_doc_10']")
    public WebElement docdownload;
    
    
   //leaves
    
    @FindBy(xpath="//*[@id='emp_leaves']/a")
    public WebElement leaves;

   //sal
    
    @FindBy(xpath="//*[@id='emp_salary']/a")
    public WebElement salaryde;

    @FindBy(xpath="//div[10]/input")
    public WebElement edit;

    @FindBy(xpath="//*[@id='s2id_currencyid']/a/span")
    public WebElement salcurre;
    
    @FindBy(xpath="//*[@id='select2-drop']/ul/li[3]/div/span")
    public WebElement inrupe;
    
    @FindBy(xpath="//*[@id='s2id_jobpayfrequency']/a/span")
    public WebElement payfrequencytype;
    
    @FindBy(xpath="//*[@id='select2-drop']/ul/li[2]/div/span")
    public WebElement payfreque;
    
    @FindBy(xpath="//*[@id='salary']")
    public WebElement salarya;
 
    @FindBy(xpath="//*[@id='bankname']")
    public WebElement bankna;
    
    @FindBy(xpath="//*[@id='accountholder_name']")
    public WebElement accountholder;
    
    @FindBy(xpath="//*[@id='formid']/div/div[6]/div/img")
    public WebElement calende;
    
    @FindBy(xpath="//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[2]/a")
    public WebElement calenderdates;
    
    @FindBy(xpath="//*[@id='s2id_accountclasstypeid']/a/span")
    public WebElement selectaccountclasstype;
    
    @FindBy(xpath=".//*[@id='select2-drop']/ul/li[4]/div/span")
    public WebElement selectaccountclasstesters;
    
    @FindBy(xpath=".//*[@id='s2id_bankaccountid']/a/span")
    public WebElement selectaccounttype;
    
    @FindBy(xpath=".//*[@id='select2-drop']/ul/li[3]/div/span")
    public WebElement selectaccounttypesalary;
    
    @FindBy(xpath="//*[@id='accountnumber']")
    public WebElement accountnumber;
    
    @FindBy(xpath="//*[@id='submitbutton']")
    public WebElement salarysave;

    //pers
    
    @FindBy(xpath="//*[@id='emppersonaldetails']/a")
    public WebElement personaldetails;
    
    @FindBy(xpath="//div[3]/input")
    public WebElement editp ;

    @FindBy(xpath="//*[@id='s2id_genderid']/a/span")
    public WebElement gendertype;
    
    @FindBy(xpath="//*[@id='select2-drop']/ul/li[3]/div/span")
    public WebElement gendermale;
    
    @FindBy(xpath="//*[@id='s2id_maritalstatusid']/a/span")
    public WebElement marritalstatus ;

    @FindBy(xpath="//*[@id='select2-drop']/ul/li[3]/div/span")
    public WebElement marrysingle ;

    @FindBy(xpath="//*[@id='s2id_nationalityid']/a/span")
    public WebElement nationality ;

    @FindBy(xpath="//*[@id='select2-drop']/ul/li[6]/div/span")
    public WebElement indian;

    @FindBy(xpath="//*[@id='s2id_ethniccodeid']/a/div/b")
    public WebElement ethniccode;

    @FindBy(xpath="//*[@id='s2id_racecodeid']/a/span")
    public WebElement racecode;
    
    @FindBy(xpath="//*[@id='s2id_languageid']/a/span")
    public WebElement language;
  
    @FindBy(xpath="//*[@id='formid']/div[1]/div[7]/div/img")
    public WebElement calenderp;
    
    @FindBy(xpath="//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[1]/a")
    public WebElement bdate;
    
    @FindBy(xpath="//*[@id='bloodgroup']")
    public WebElement bloodgroup; 
    
    @FindBy(xpath="//*[@id='submitbuttons']")
    public WebElement psave; 
    
   //Add  
    
    @FindBy(linkText="Skills")
    public WebElement addskillslink; 
    
    @FindBy(xpath="//*[@id='grid_empskills']/div[2]/input")
    public WebElement add; 
    
    @FindBy(xpath="//form[@id='formid']/div/div/div/input")
    public WebElement skillname; 
   
    @FindBy(xpath="//*[@id='yearsofexp']")
    public WebElement skillyearsexp; 
    
    @FindBy(xpath="//*[@id='s2id_competencylevelid']/a/span")
    public WebElement skillcompetelevel; 
    
    @FindBy(xpath="//*[@id='select2-drop']/ul/li[2]/div/span")
    public WebElement skillbasiclevel; 
    
    @FindBy(xpath="//*[@id='formid']/div/div[4]/div/img")
    public WebElement calendersk; 
    
    @FindBy(xpath="//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[5]")
    public WebElement calenderskdate;
    
    @FindBy(xpath="//*[@id='submitbutton']")
    public WebElement skillsave;
    
    
 // contact de
    
    @FindBy(xpath="//*[@id='empcommunicationdetails']/a")
    public WebElement contactdetails; 
    
    @FindBy(xpath="//*[@id='mydetails-height']/div[2]/div[2]/input")
    public WebElement editcontact; 
   
//    @FindBy(xpath="")
//    public WebElement ; 
//   
//    @FindBy(xpath="")
//    public WebElement ; 
//    
    
    
}

