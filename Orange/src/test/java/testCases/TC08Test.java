package testCases;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.SelectClassUtil;
import pomRepository.HomePage;
import pomRepository.RecruitementPage;
import pomRepository.VacanciesPage;

public class TC08Test extends BaseTest{

	@Test
	
	public void Vacancies() {
		HomePage homepage=new HomePage(driver);
		homepage.getRecruitementButton().click();
		
		RecruitementPage recruitementPage=new RecruitementPage(driver);
		recruitementPage.getVacancyBtn().click();
		
		VacanciesPage vacancypage=new VacanciesPage(driver);
		vacancypage.getAddBtn().click();
		vacancypage.getJobTitleDropdown().click();
		
		SelectClassUtil dropdown=new SelectClassUtil();
		dropdown.selectDropDown(vacancypage.getJobTitleDropdown(), "Chief Executive Officer");
		vacancypage.getVacancyNameTextField().sendKeys("James");
		vacancypage.getHiringManagerTextField().sendKeys("Orange Test");
		vacancypage.getNoOfPositionsTexyField().sendKeys("10");
		vacancypage.getDescriptionTextField().sendKeys("Job vacancy details");
		vacancypage.getSaveButton().click();
		
	}
}
