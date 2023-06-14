package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class NssListPage {
WebDriver driver;
	
	public NssListPage(WebDriver driver) {
		this.driver = driver;
		
	}
	@FindBy(how = How.CSS, using = "input[name=categorydata]") WebElement INPUT_CATEGORY_DATA;
	@FindBy(how = How.CSS, using = "input[value =\"Add category\"]") WebElement ADD_CATEGORY_BUTTON;
	@FindBy(how = How.CSS, using = "select[name=\"due_month\"]") WebElement DUE_MONTH;
	
	public void insertAddCategory() {
		INPUT_CATEGORY_DATA.sendKeys("mahea");
		ADD_CATEGORY_BUTTON.click();
		//INPUT_CATEGORY_DATA.isDisplayed();
		//Assert.assertTrue(true, "unable to display");;
		//Assert.assertTrue(INPUT_CATEGORY_DATA.isDisplayed());
		INPUT_CATEGORY_DATA.sendKeys("mahea43");
		ADD_CATEGORY_BUTTON.click();
		INPUT_CATEGORY_DATA.sendKeys("mahea2374");
		ADD_CATEGORY_BUTTON.click();
		
		
	}
	public void verifyDuplicateCategory() {
		insertAddCategory();
		
		Assert.assertEquals(true, false, "The category you want to add already exists: <duplicated category name");
	}
	public void verifyDropdown() {
	Select sel = new Select(DUE_MONTH);
	sel.getAllSelectedOptions();
	
	}
}

