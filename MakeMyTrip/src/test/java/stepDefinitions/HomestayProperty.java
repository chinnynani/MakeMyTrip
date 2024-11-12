package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.aventstack.extentreports.model.Report;

import elementRepository.HomePage;
import elementRepository.PropertyPage;
import io.cucumber.java.en.Then;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;

public class HomestayProperty {

	WebDriver driver = DriverFactory.getDriver();
	PropertyPage propertypage = new PropertyPage(driver);
	FileUtility fileUtility = new FileUtility();
	SortBy sortby = new SortBy();

	@Then("user is click on the Price\\(Lowest First) option")
	public void user_is_click_on_the_price_lowest_first_option() throws InterruptedException {
		propertypage.getSortByOption_PriceLowestFirstClick();
		Thread.sleep(3000);
		WebElement activeSortOption = propertypage.getActiveSortOptionForLowest();
        Assert.assertEquals(activeSortOption.getText(), "Price (Lowest First)", "Price (Lowest First) sort option should be selected");
		Reporter.log("Price option selected", true);
	}

	@Then("User is able to click on the property")
	public void user_is_able_to_click_on_the_property() throws InterruptedException {
		propertypage.getClickingThePropertyClick();
		Thread.sleep(2000);
		WebElement propertyTitle = propertypage.getPropertyTitle();
	    Assert.assertTrue(propertyTitle.isDisplayed(), "Property details page should be displayed");
	    Reporter.log("User clicked the property",true);
	}

	@Then("user is able to navigate to the next page")
	public void user_is_able_to_navigate_to_the_next_page() throws InterruptedException {
		Thread.sleep(3000);
		Reporter.log("user is navigated to the next page",true);
		String expectedTitle = "Sri Tirumala Paradise near KSR Bengaluru Railway Station";
        Assert.assertTrue(driver.getPageSource().contains(expectedTitle), "User should be navigated to the next page URL");
		Reporter.log("user is navigated to the next page",true);
	}
}
