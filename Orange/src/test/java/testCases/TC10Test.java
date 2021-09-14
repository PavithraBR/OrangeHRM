package testCases;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.HomePage;
import pomRepository.RecruitementPage;
import pomRepository.VacanciesPage;

public class TC10Test extends BaseTest {
	
	@Test
	public void deleteVacancy() {
		
		
		HomePage homepage=new HomePage(driver);
		homepage.getRecruitementButton().click();

		RecruitementPage recruitementpage=new RecruitementPage(driver);
		recruitementpage.getVacancyBtn().click();
		
		VacanciesPage vacancypage=new VacanciesPage(driver);
		vacancypage.getSelectRecord().click();
		vacancypage.getDeleteButton().click();
		vacancypage.getOkButton().click();
		
		
	}

}
