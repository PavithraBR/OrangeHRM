package testCases;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.SelectClassUtil;
import pomRepository.HomePage;
import pomRepository.RecruitementPage;

public class TC05Test extends BaseTest{

	@Test
	public void addCandidateDetails() {
		HomePage homePage=new HomePage(driver);
		homePage.getRecruitementButton().click();
		RecruitementPage recruitementPage=new RecruitementPage(driver);
		recruitementPage.getAddButton().click();
		recruitementPage.getFirstNameTextField().sendKeys("Banda");
		recruitementPage.getMiddleNameTextField().sendKeys("Pavithra");
		recruitementPage.getLastNameTextField().sendKeys("R");
		recruitementPage.getEmailTextField().sendKeys("pavithrabr048@gmail.com");
		recruitementPage.getContactNoTextField().sendKeys("8073266636");
		recruitementPage.getJobVacancyDropdown().click();
		SelectClassUtil dropdown=new SelectClassUtil();
		dropdown.selectDropDown(recruitementPage.getJobVacancyDropdown(), "Associate IT Manager");
		recruitementPage.getResume().sendKeys("C:\\Users\\DELL\\Desktop\\pavithra resume  py.docx");
		recruitementPage.getKeywordsTextField().sendKeys("abc");
		recruitementPage.getCommentsTextField().sendKeys("details of Candidate");
		recruitementPage.getCheckbox().click();
		recruitementPage.getSaveButton().click();
	}
}
