package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilityClasses.WebDriverUtility;

public class BookNowPage {
	
	public WebElement property(WebDriver driver) {
		return driver.findElement(By.id("htl_id_seo_202404151215582698"));		
	}
	public void propertyClick(WebDriver driver) {
		property(driver).click();
	}
	public WebElement getBooking(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class='appBtn filled large bkngOption__cta  ']"));
	}
	public void getBookingClick(WebDriver driver) {
		getBooking(driver).click();
	}
		
	public WebElement getAgreementDeatils(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/legal/in/eng/user_agreement.html#1']"));
	}
	public void getAgreementDeatilsClick(WebDriver driver) {
		getAgreementDeatils(driver).click();
	}
}
