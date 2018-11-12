Feature: Delete a Lead

Background:
#Given Open the browser
#And maximize the browser
#And Set Timeouts
#And enter the URL as http://leaftaps.com/opentaps/
Given enter the username as DemoSalesManager
And enter the password as crmsfa
And click Login

Scenario Outline: Delete Lead(positive scenario)

Given click CRMSFA
And click Leads Tab
And click findLeads link
And click phone Tab
And enter phone number to search as <phoneNumber>
And click findLeads button
And store the first LeadID
And click on the first Lead that appears
And click on Delete button
And click findLeads link
And enter stored LeadID
When click findLeads button
Then verify no Records present error appears 

Examples:
|phoneNumber|
|8148981817|
