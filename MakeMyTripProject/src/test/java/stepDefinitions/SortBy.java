package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.HomePage;
import io.cucumber.java.en.Then;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;

public class SortBy{

	WebDriver driver=DriverFactory.getDriver();
	HomePage homepage=new HomePage(driver);
	FileUtility fileUtility=new FileUtility();

	@Then("selecting {int} should be displayed")
	public void selecting_should_be_displayed(Integer SortOption) throws Exception {
		String sortoption=fileUtility.getDataFromExcel("Sheet1", SortOption-1, 0);
		switch (sortoption) {
        case "Popular":
            homepage.getSortByOption_Popular().click();
            Thread.sleep(3000);
            String appliedSortOptionPopular = homepage.getActiveSortOptionForPopular().getText();
            Assert.assertEquals(appliedSortOptionPopular, "Popular", "Popular sort option should be selected");
            Reporter.log("Popular option selected", true);
            break;
            
        case "Rating":
            homepage.getSortByOption_Rating().click();
            Thread.sleep(3000);
            String appliedSortOptionRating = homepage.getActiveSortOptionForRating().getText();
            Assert.assertEquals(appliedSortOptionRating, "User Rating (Highest First)", "Rating sort option should be selected");
            Reporter.log("Rating option selected", true);
            break;
            
        case "Price (Highest First)":
            homepage.getSortByOption_PriceHeighestFirst().click();
            Thread.sleep(3000);
            String appliedSortOptionHigh = homepage.getActiveSortOptionForHighest().getText();
            Assert.assertEquals(appliedSortOptionHigh, "Price (Highest First)", "Price (Highest First) sort option should be selected");
            Reporter.log("Price option selected", true);
            break;
        case "Price (Lowest First)":
            homepage.getSortByOption_PriceLowestFirst().click();
            Thread.sleep(3000);
            String appliedSortOptionLow = homepage.getActiveSortOptionForLowest().getText();
            Assert.assertEquals(appliedSortOptionLow, "Price (Lowest First)", "Price (Lowest First) sort option should be selected");
            Reporter.log("Price option selected", true);
            break;
		} 
	}
}
