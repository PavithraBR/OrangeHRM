package testCases;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.SelectClassUtil;
import pomRepository.HomePage;
import pomRepository.RecruitementPage;
import pomRepository.VacanciesPage;

public class TC09Test extends BaseTest{

	
	@Test
	
	public void searchVacancy() throws InterruptedException {
		HomePage homepage=new HomePage(driver);
		homepage.getRecruitementButton().click();
		
		RecruitementPage recruitementPage=new RecruitementPage(driver);
		recruitementPage.getVacancyBtn().click();
		
		VacanciesPage vacancypage=new VacanciesPage(driver);
		vacancypage.getVacancyDropdown().click();
		
		Thread.sleep(1000);
		
		SelectClassUtil dropdown=new SelectClassUtil();
		dropdown.selectDropDown(vacancypage.getVacancyDropdown(), "James");
		
		vacancypage.getSearchButton().click();
		Thread.sleep(1000);

	}
	
	
	
}
