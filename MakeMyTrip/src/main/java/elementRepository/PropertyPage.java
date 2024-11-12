package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyPage {

	public PropertyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Homestays and more in Bangalore']")
	private WebElement bangloreProperties;

	public WebElement getBangloreProperties() {
		return bangloreProperties;
	}

	@FindBy(xpath = "//span[text()='(Lowest First)']/../..//span[text()='Price ']")
	private WebElement sortByOption_PriceLowestFirst;

	public WebElement getSortByOption_PriceLowestFirst() {
		return sortByOption_PriceLowestFirst;
	}
	public WebElement getActiveSortOptionForLowest() {
		return sortByOption_PriceLowestFirst;
	}
	public void getSortByOption_PriceLowestFirstClick() {
		getSortByOption_PriceLowestFirst().click();
	}

//		@FindBy(xpath = "//span[text()='Sri Tirumala Paradise near KSR Bengaluru Railway Station']")
	@FindBy(id = "htl_id_seo_202204071302205878")
	private WebElement clickingTheProperty;

	public WebElement getClickingTheProperty() {
		return clickingTheProperty;
	}
	public void getClickingThePropertyClick() {
		getClickingTheProperty().click();
	}

	public WebElement getPropertyTitle() {
		return clickingTheProperty;
	}

	@FindBy(xpath = "//h1[text()='Sri Tirumala Paradise near KSR Bengaluru Railway Station']")
	private WebElement particularPropertyTitle;

	public WebElement getParticularPropertyTitle() {
		return particularPropertyTitle;
	}

}
