package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{

	public EditLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCompanyName;

	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleEditButton;
	
	@And("clear companyName")
	public EditLeadPage clearCompanyName() {
		clearText(eleCompanyName);
		return this;
	}
	
	@And("update companyname as (.*)")
	public EditLeadPage typeCompanyName(String data) {
		type(eleCompanyName,data);
		return this;
	}
	
	@When("click update button")
	public ViewLeadPage clickSubmit() {
		click(eleEditButton);
		return new ViewLeadPage();
	}

}


