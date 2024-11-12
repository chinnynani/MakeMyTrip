package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.ExplorePage;
import elementRepository.HomePage;
import io.cucumber.java.en.Then;
import utilPackage.DriverFactory;

public class ExploreTheMap {

	WebDriver driver = DriverFactory.getDriver();
	ExplorePage explorepage=new ExplorePage(driver);
	
	@Then("Click on the explore maps Option")
	public void click_on_the_explore_maps_option() {
		explorepage.getExploreMapClick();
	    Reporter.log("User clicked on the Explore Maps option", true);
	    WebElement mapView = explorepage.getSearchText();
        Assert.assertTrue(mapView.isDisplayed(), "Map view is not displayed");
        Reporter.log("Map view is displayed", true);
	}

	@Then("Click on the {string} button to zoom the Location")
	public void click_on_the_button_to_zoom_the_location(String string) throws InterruptedException {
		explorepage.getClickPlusClick();
	    explorepage.getClickPlusClick();
	    Reporter.log("User seen the location",true);
	    
	}

	@Then("Close the Map")
	public void close_the_map() throws InterruptedException {
		explorepage.getCloseMapClick();
	    WebElement back=explorepage.getReturnBack();
        Assert.assertTrue(back.isDisplayed(), "Map not Closed");
        Reporter.log("Closed the map",true);
	}
	
}
