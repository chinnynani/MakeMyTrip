package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.SortByPage;
import io.cucumber.java.en.Then;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;

public class SortBy{

	WebDriver driver=DriverFactory.getDriver();
	SortByPage sortbypage=new SortByPage(driver);
	FileUtility fileUtility=new FileUtility();

	@Then("selecting {int} should be displayed")
	public void selecting_should_be_displayed(Integer SortOption) throws Exception {
		
		String sortoption=fileUtility.getDataFromExcel("Sheet1", SortOption-1, 0);
		
		switch (sortoption) {
        case "Popular":
        	sortbypage.sortByOption_PopularClick();
            Thread.sleep(3000);
            String appliedSortOptionPopular = sortbypage.getActiveSortOptionForPopular();
            Assert.assertEquals(appliedSortOptionPopular, "Popular", "Popular sort option should be selected");
            Reporter.log("Popular option selected", true);
            break;
            
        case "Rating":
        	sortbypage.getSortByOption_RatingClick();
            Thread.sleep(3000);
            String appliedSortOptionRating = sortbypage.getActiveSortOptionForRating();
            Assert.assertEquals(appliedSortOptionRating, "User Rating (Highest First)", "Rating sort option should be selected");
            Reporter.log("Rating option selected", true);
            break;
            
        case "Price (Highest First)":
        	sortbypage.getSortByOption_PriceHeighestFirstClick();
            Thread.sleep(3000);
            String appliedSortOptionHigh = sortbypage.getActiveSortOptionForHighest();
            Assert.assertEquals(appliedSortOptionHigh, "Price (Highest First)", "Price (Highest First) sort option should be selected");
            Reporter.log("Price (Highest First) option selected", true);
            break;
            
        case "Price (Lowest First)":
        	sortbypage.getSortByOption_PriceLowestFirstClick();;
            Thread.sleep(3000);
            String appliedSortOptionLow = sortbypage.getActiveSortOptionForLowest();
            Assert.assertEquals(appliedSortOptionLow, "Price (Lowest First)", "Price (Lowest First) sort option should be selected");
            Reporter.log("Price (Lowest First) option selected", true);
            break;
		} 
	}
}
