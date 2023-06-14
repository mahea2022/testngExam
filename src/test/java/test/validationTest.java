package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.NssListPage;
import utility.BrowserFactory;

public class validationTest {
	WebDriver driver;
	@Test
	public void validationTest() {
		driver = BrowserFactory.init();
		NssListPage nssListPage = PageFactory.initElements(driver, NssListPage.class);
		nssListPage.insertAddCategory();
		nssListPage.verifyDuplicateCategory();
		nssListPage.verifyDropdown();
		
		BrowserFactory.tearDown();
}
	}
