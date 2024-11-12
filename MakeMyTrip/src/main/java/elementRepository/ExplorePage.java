package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorePage {

	public ExplorePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@class='mapEntry__map']")
	private WebElement exploreMap;
	public WebElement getExploreMap() {
		return exploreMap;
	}
	public void getExploreMapClick() {
		getExploreMap().click();
	}
	
	@FindBy(xpath = "//input[@placeholder='Search in Area, Property or Locality in Bangalore']")
	private WebElement searchText;
	
	public WebElement getSearchText() {
		return searchText;
	}

	@FindBy(xpath = "//button[@title='Zoom in']")
	private WebElement clickPlus;
	public WebElement getClickPlus() {
		return clickPlus;
	}
	public void getClickPlusClick() {
		getClickPlus().click();
	}
	
	@FindBy(xpath = "//span[@class='cm__modalClose modalCloseCenter']")
	private WebElement closeMap;
	public WebElement getCloseMap() {
		return closeMap;
	}
	public void getCloseMapClick() {
		getCloseMap().click();
	}
	
	@FindBy(xpath = "//a[text()='Homestays and more in Bangalore']")
	private WebElement returnBack;

	public WebElement getReturnBack() {
		return returnBack;
	}
	
}
