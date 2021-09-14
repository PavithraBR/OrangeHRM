package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.BaseTest;

public class RecruitementPage extends BaseTest {

	 public RecruitementPage(WebDriver driver){
	    	PageFactory.initElements(driver, this);
	    }
	 
	 @FindBy(id="btnAdd")
	 private WebElement AddButton;
	 
	 @FindBy(id="btnDelete")
	 private WebElement DeleteButton;
	 
	 @FindBy(id="dialogDeleteBtn")
	 private WebElement OkButton;
	 
	 public WebElement getOkButton() {
		return OkButton;
	}

	@FindBy(id="addCandidate_firstName")
	 private WebElement FirstNameTextField;
	 
	 @FindBy(id="addCandidate_middleName")
	 private WebElement MiddleNameTextField;
	 
	 @FindBy(id="addCandidate_lastName")
	 private WebElement LastNameTextField;
	 
	 @FindBy(id="addCandidate_email")
	 private WebElement EmailTextField;
	 
	 @FindBy(id="addCandidate_contactNo")
	 private WebElement ContactNoTextField;
	 
	 @FindBy(id="addCandidate_vacancy")
	 private WebElement JobVacancyDropdown;
	 
     @FindBy(id="addCandidate_resume")
     private WebElement resume;
     
     @FindBy(id="addCandidate_keyWords")
     private WebElement keywordsTextField;
     
     @FindBy(id="addCandidate_comment")
     private WebElement commentsTextField;
     
     @FindBy(id="addCandidate_appliedDate")
     private WebElement appliedDate;
          
     @FindBy(id="addCandidate_consentToKeepData")
     private WebElement checkbox;
     
     @FindBy(id="btnSave")
     private WebElement SaveButton;
     
     @FindBy(id="menu_recruitment_viewCandidates")
     private WebElement CandidatesList;
     
     @FindBy(id="ohrmList_chkSelectRecord_23_4")
     private WebElement selectRecord;
     

     
	public WebElement getSelectRecord() {
		return selectRecord;
	}

	public WebElement getCandidatesList() {
		return CandidatesList;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCommentsTextField() {
		return commentsTextField;
	}

	public WebElement getAppliedDate() {
		return appliedDate;
	}

	public WebElement getKeywordsTextField() {
		return keywordsTextField;
	}

	public WebElement getAddButton() {
		return AddButton;
	}

	public WebElement getDeleteButton() {
		return DeleteButton;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getMiddleNameTextField() {
		return MiddleNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getContactNoTextField() {
		return ContactNoTextField;
	}

	public WebElement getJobVacancyDropdown() {
		return JobVacancyDropdown;
	}

	public WebElement getResume() {
		return resume;
	}
	
	@FindBy(id="menu_recruitment_viewJobVacancy")
	private WebElement vacancyBtn;

	public WebElement getVacancyBtn() {
		return vacancyBtn;
	}

}
