package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class homePage {
	

	public homePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "twotabsearchtextbox")
	public WebElement searchButton;

	@FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
	public WebElement submitButton;
	
}

