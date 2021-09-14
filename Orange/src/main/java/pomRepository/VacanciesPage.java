package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.BaseTest;

public class VacanciesPage extends BaseTest {
	public VacanciesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		
		

		@FindBy(id="btnAdd")
		private WebElement AddBtn;
		
		@FindBy(id="addJobVacancy_jobTitle")
		private WebElement jobTitleDropdown;
		

		public WebElement getAddBtn() {
			return AddBtn;
		}

		public WebElement getJobTitleDropdown() {
			return jobTitleDropdown;
		}

		public WebElement getVacancyNameTextField() {
			return vacancyNameTextField;
		}

		public WebElement getHiringManagerTextField() {
			return hiringManagerTextField;
		}

		public WebElement getNoOfPositionsTexyField() {
			return noOfPositionsTexyField;
		}

		public WebElement getDescriptionTextField() {
			return descriptionTextField;
		}

		public WebElement getSaveButton() {
			return SaveButton;
		}

		@FindBy(id="addJobVacancy_name")
		private WebElement vacancyNameTextField;
		
		@FindBy(id="addJobVacancy_hiringManager")
		private WebElement hiringManagerTextField;
		
		@FindBy(id="addJobVacancy_noOfPositions")
		private WebElement noOfPositionsTexyField;
		
		@FindBy(id="addJobVacancy_description")
		private WebElement descriptionTextField;
		
		@FindBy(id="btnSave")
		private WebElement SaveButton;
		
		
		@FindBy(id="vacancySearch_jobVacancy")
		private WebElement vacancyDropdown;

		public WebElement getVacancyDropdown() {
			return vacancyDropdown;
		}
		
		@FindBy(id="btnSrch")
		private WebElement searchButton;


		public WebElement getSearchButton() {
			return searchButton;
		}
		
		@FindBy(id="ohrmList_chkSelectRecord_5")
		private WebElement selectRecord;


		public WebElement getSelectRecord() {
			return selectRecord;
		}
		
		@FindBy(id="btnDelete")
		private WebElement DeleteButton;


		public WebElement getDeleteButton() {
			return DeleteButton;
		}
		
		@FindBy(id="dialogDeleteBtn")
		private WebElement OkButton;


		public WebElement getOkButton() {
			return OkButton;
		}
		
		
	}


