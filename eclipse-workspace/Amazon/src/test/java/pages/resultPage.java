package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class resultPage {


	public resultPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	//div[@data-asin="B00GB85JR4"]
//	@FindBy(xpath="//div[@data-asin='B001TSBSLM']")
//	public WebElement vitaminB;
//	@FindBy(xpath = "//div[@data-asin='B001TSBSLM']")
//	public WebElement vitaminB;
//	
	//*[@id="acrPopover"]/span[1]/a/i[1]
	
//	@FindBy(xpath="//*[@id=\"acrPopover\"]/span[1]/a/i[1]")
//	public WebElement star;
//	data-asin="B076JTQR66"
	
	@FindBy(xpath = "//div[@data-asin='B076JTQR66']")
	public WebElement vitaminB;
	//*[@id="acrPopover"]/span[1]/a/i[1]
	//*[@id="histogramTable"]/tbody/tr[1]/td[2]/a/div/div
	@FindBy(xpath="//*[@id=\"acrPopover\"]/span[1]/a/i[1]")
	public WebElement star;
	
	//*[@id="histogramTable"]/tbody/tr[1]/td[2]/a/div/div
	
	//*[@id="histogramTable"]/tbody/tr[1]/td[1]/span[1]/a
	@FindBy(xpath="//*[@id=\"histogramTable\"]/tbody/tr[1]/td[1]/span[1]/a[2]")
	public WebElement rating;
	
	
}
