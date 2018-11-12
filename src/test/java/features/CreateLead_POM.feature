Feature: Create a Lead

Background:
#Given Open the browser
#And maximize the browser
#And Set Timeouts
#And enter the URL as http://leaftaps.com/opentaps/
Given enter the username as DemoSalesManager
And enter the password as crmsfa
And click Login


Scenario Outline: Create Lead(positive scenario)

And click CRMSFA
And click Leads Tab
And click createLead link
And enter companyname as <companyName>
And enter firstname as <firstName>
And enter lastname as <lastName>
When click Submit button
Then Lead creation successful as <firstName>

Examples:
|companyName|firstName|lastName|
|HCL|Bharath|A|
|TCS|Viswa|S|
