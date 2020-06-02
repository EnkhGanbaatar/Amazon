package stepDefinition;

import org.openqa.selenium.By;

import Utilities.BrowserUtilities;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.homePage;
import pages.resultPage;

public class stepDefinition {
	homePage myhomePage = new homePage ();
	resultPage myresultPage = new resultPage();


@Given("^user is on amazon URL Home Page$")
public void user_is_on_amazon_URL_Home_Page() {
   



   
	Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
	Driver.getDriver().manage().window().maximize();
	
}

@When("^user should type Vitamin D and choose natureWise$")
public void user_should_type_Vitamin_D_and_choose_natureWise() {
	
	BrowserUtilities.waitForPageToLoad(5);
	
	myhomePage.searchButton.sendKeys(ConfigurationReader.getProperty("search"));
	
	myhomePage.submitButton.click();
	
	
}

@Then("^user should navigate to result page then user should click add button and click x button$")
public void user_should_navigate_to_result_page_then_user_should_click_add_button_and_click_x_button()  {
	
	BrowserUtilities.waitForPageToLoad(5);
 
//	BrowserUtilities.waitFor(5);
	myresultPage.vitaminB.click();
//	Driver.getDriver().findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[2]/div[6]/div/span/div/div/div[2]/h2/a")).click();
	
}

@Then("^user hover on ratings and click on (\\d+) stars rate$")
public void user_hover_on_ratings_and_click_on_stars_rate(int arg1)  {
	BrowserUtilities.waitForPageToLoad(5);

//	BrowserUtilities.waitFor(5);

	BrowserUtilities.hover(myresultPage.star);
	myresultPage.star.click();
	

	BrowserUtilities.waitFor(5);
	
	Driver.getDriver().findElement(By.xpath("//*[@id=\"histogramTable\"]/tbody/tr[1]/td[2]/a/div")).click();
//	myresultPage.rating.click();
//	Driver.getDriver().quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
