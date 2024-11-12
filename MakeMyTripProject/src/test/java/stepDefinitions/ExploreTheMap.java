package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.HomePage;
import io.cucumber.java.en.Then;
import utilPackage.DriverFactory;

public class ExploreTheMap {

	WebDriver driver = DriverFactory.getDriver();
	HomePage homepage = new HomePage(driver);
	
	@Then("Click on the explore maps Option")
	public void click_on_the_explore_maps_option() {
	    homepage.getExploreMap().click();
	    Reporter.log("User clicked on the Explore Maps option", true);
	    WebElement mapView = homepage.getSearchText();
        Assert.assertTrue(mapView.isDisplayed(), "Map view is not displayed");
        Reporter.log("Map view is displayed", true);
	}

	@Then("Click on the {string} button to zoom the Location")
	public void click_on_the_button_to_zoom_the_location(String string) throws InterruptedException {
	    homepage.getClickingPlus().click();
	    Thread.sleep(2000);
	    homepage.getClickingPlus().click();
	    Thread.sleep(2000);
	   
	    
	}

	@Then("Close the Map")
	public void close_the_map() throws InterruptedException {
		homepage.getCloseMap().click();
	    Thread.sleep(3000);
	    WebElement back=homepage.getReturnBack();
        Assert.assertTrue(back.isDisplayed(), "Map not Closed");
        Reporter.log("Closed the map");
	}
	
}