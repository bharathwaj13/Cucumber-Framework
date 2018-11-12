package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	public static String leadID;
	
	public FindLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//table[@class='x-grid3-row-table']//a")
	private WebElement eleFirstLead;
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")
	private WebElement eleFirstNameLink;
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	
	@FindBy(how=How.XPATH,using="//div[@class='x-form-element']/input[@name='id']")
	private WebElement eleLeadIDEdit;
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeads;
	
	@FindBy(how=How.XPATH,using="(//a[@class='x-tab-right'])[2]")
	private WebElement elePhoneTab;
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement elePhoneNumber;
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleLeadID;
	
	@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
	private WebElement eleNoRecordsError;
	
	@FindBy(how=How.XPATH,using="(//a[@class='x-tab-right'])[3]")
	private WebElement eleEmailTab;
	
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement eleEmailAddress;
	
	
	public ViewLeadPage clickFirstLead() {
		click(eleFirstLead);
		return new ViewLeadPage();
	}
	
	@And("enter firstname to Search as (.*)")
	public FindLeadsPage typeFirstName(String data) {
		type(eleFirstName,data);
		return this;
	}
	
	@And("click findLeads button")
	public FindLeadsPage clickFindLeads() {
		click(eleFindLeads);
		return this;
	}
	
	@And("click phone Tab")
	public FindLeadsPage clickPhoneTab() {
		click(elePhoneTab);
		return this;
	}
	
	@And("enter phone number to search as (.*)")
	public FindLeadsPage typePhoneNumber(String data) {
		type(elePhoneNumber,data);
		return this;
	}
	
	@And("store the first LeadID")
	public FindLeadsPage getLeadID() {
		leadID = getText(eleLeadID);
		return this;
	}
	
	@And("click on the first Lead that appears")
	public ViewLeadPage clickLeadID() {
		click(eleLeadID);
		return new ViewLeadPage();
	}
	
	@And("enter LeadID to search")
	public FindLeadsPage typeLeadID(String data) {
		type(eleLeadIDEdit,data);
		return this;
	}
	
	@And("enter stored LeadID")
	public FindLeadsPage typeStoredLeadID() {
		type(eleLeadIDEdit,leadID);
		return this;
	}
	
	@Then("verify no Records present error appears")
	public ViewLeadPage verifyNoRecordsError() {
		verifyDisplayed(eleNoRecordsError);
		return new ViewLeadPage();
	}
	
	public FindLeadsPage clickEmailTab() {
		click(eleEmailTab);
		return this;
	}
	
	public FindLeadsPage typeEmailAddress(String data) {
		type(eleEmailAddress,data);
		return this;
	}
	
	public ViewLeadPage clickFirstNameLink() {
		click(eleFirstNameLink);
		return new ViewLeadPage();
	}
	
	
	
	
	
	
	

}
