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

public class CreateLeads extends ProjectMethods{
	
	public CreateLeads() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLead;
	
	@And("enter companyname as (.*)")
	public CreateLeads typeCompanyName(String data) {
		type(eleCompanyName,data);
		return this;
	}
	
	@And("enter firstname as (.*)")
	public CreateLeads typeFirstName(String data) {
		type(eleFirstName,data);
		return this;
	}
	
	@And("enter lastname as (.*)")
	public CreateLeads typeLastName(String data) {
		type(eleLastName,data);
		return this;
	}
	
	@When("click Submit button")
	public ViewLeadPage clickCreateLeads() {
		click(eleCreateLead);
		return new ViewLeadPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
