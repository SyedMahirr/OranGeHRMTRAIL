@Request_A_Quote_form
Feature: QuoteRequest

In order to request a quote for open source HRM 
As a site visitor
I want select package, Enter FirstName, LastName, CompanyName, Select Insdusty, 
Enter Job Title, Enter Business Email, Enter Contact Phone, Select Country, Select NoOfEmployees, 
Enter coupon Code, Select CoreHRModules, Select Optioanl Modules, Select Optional Plugins,Select reCpatcha and Click on Submit

Scenario: Positive

Given user on OrangeHRMQuote
When Select package, 
And Enter First Name,
And Last Name
And Company Name,
And Select Insdusty 
And Enter Job Title,
And Enter Business Email
And  Enter Contact Phone, 
And Select Country 
And Select NoOfEmployees, 
And Enter coupon Code
And Select CoreHRModules, 
And Select Optioanl Modules
And Select Optional Plugins,
And Select reCpatcha 
And Click on Submit
Then User Lands on OrangeHRM Request Quote page for Viewing the Qoute