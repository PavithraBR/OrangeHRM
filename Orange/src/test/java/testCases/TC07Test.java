package testCases;

import org.testng.annotations.Test;
import genericLibrary.BaseTest;
import genericLibrary.SelectClassUtil;
import pomRepository.HomePage;
import pomRepository.RecruitementPage;

public class TC07Test extends BaseTest {

	@Test
	public void login() throws InterruptedException {
		
		HomePage homePage=new HomePage(driver);
		homePage.getRecruitementButton().click();
		
		RecruitementPage recruitementPage=new RecruitementPage(driver);
		recruitementPage.getAddButton().click();
		String s1="Banda";
		String s2="Pavithra";
		String s3="R";
		recruitementPage.getFirstNameTextField().sendKeys(s1);
		recruitementPage.getMiddleNameTextField().sendKeys(s2);
		recruitementPage.getLastNameTextField().sendKeys(s3);
		recruitementPage.getEmailTextField().sendKeys("pavithrabr0@gmail.com");
		recruitementPage.getContactNoTextField().sendKeys("8073766636");
		recruitementPage.getJobVacancyDropdown().click();
		SelectClassUtil dropdown=new SelectClassUtil();
		dropdown.selectDropDown(recruitementPage.getJobVacancyDropdown(), "Associate IT Manager");
		recruitementPage.getResume().sendKeys("C:\\Users\\DELL\\Desktop\\pavithra resume  py.docx");
		recruitementPage.getKeywordsTextField().sendKeys("abc");
		recruitementPage.getCommentsTextField().sendKeys("details of Candidate");
		recruitementPage.getCheckbox().click();
		recruitementPage.getSaveButton().click();
		recruitementPage.getCandidatesList().click();
		recruitementPage.getSearchCandidateName().sendKeys(s1+" "+s2+" "+s3);
		recruitementPage.getSearchButton().click();
		recruitementPage.getSelectRecord().click();
		Thread.sleep(1000);
		recruitementPage.getDeleteButton().click();
		Thread.sleep(1000);
		recruitementPage.getOkButton().click();
		
		}
	
}
