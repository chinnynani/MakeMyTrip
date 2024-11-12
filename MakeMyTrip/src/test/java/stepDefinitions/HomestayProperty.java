package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.aventstack.extentreports.model.Report;

import elementRepository.HomePage;
import io.cucumber.java.en.Then;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;

public class HomestayProperty {

	WebDriver driver = DriverFactory.getDriver();
	HomePage homepage = new HomePage(driver);
	FileUtility fileUtility = new FileUtility();
	SortBy sortby = new SortBy();

	@Then("user is click on the Price\\(Lowest First) option")
	public void user_is_click_on_the_price_lowest_first_option() throws InterruptedException {
		homepage.getSortByOption_PriceLowestFirst().click();
		Thread.sleep(3000);
		WebElement activeSortOption = homepage.getActiveSortOptionForLowest();
        Assert.assertEquals(activeSortOption.getText(), "Price (Lowest First)", "Price (Lowest First) sort option should be selected");
		Reporter.log("Price option selected", true);
	}

	@Then("User is able to click on the property")
	public void user_is_able_to_click_on_the_property() throws InterruptedException {
		homepage.getClickingTheProperty().click();
		Reporter.log("User is selected the property");
		Thread.sleep(2000);
		WebElement propertyTitle = homepage.getPropertyTitle();
	    Assert.assertTrue(propertyTitle.isDisplayed(), "Property details page should be displayed");
	}

	@Then("user is able to navigate to the next page")
	public void user_is_able_to_navigate_to_the_next_page() throws InterruptedException {
		Thread.sleep(3000);
		Reporter.log("user is navigated to the next page");
		String expectedTitle = "Sri Tirumala Paradise near KSR Bengaluru Railway Station";
        Assert.assertTrue(driver.getPageSource().contains(expectedTitle), "User should be navigated to the next page URL");

	}
}
