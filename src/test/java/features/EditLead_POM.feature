Feature: Edit a Lead

Background:
#Given Open the browser
#And maximize the browser
#And Set Timeouts
#And enter the URL as http://leaftaps.com/opentaps/
Given enter the username as DemoSalesManager
And enter the password as crmsfa
And click Login


Scenario Outline: Edit Lead(positive scenario)

And click CRMSFA
And click Leads Tab
And click findLeads link
And enter firstname to Search as <firstName>
And click findLeads button
And click on the first Lead that appears
And verify Page Header as <pageHeader>
And click Edit button
And clear companyName
And update companyname as <companyName>
When click update button
Then Verify company name updated as <companyName>

Examples:
|firstName|companyName|pageHeader|
|Bharath|HCL|View Lead|
|Viswa|TCS|View Lead|
