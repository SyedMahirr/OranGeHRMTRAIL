@filter
Feature: Filter

In order to search specific user
As a admin user
I want to click filer enter user information and click search

Scenario: Positive

Given User on OrangeHRM Demo GlobalHR Manager Admin page

When User click on filter icon

And User enters EmployeeName, UserName, ESS Role, SupervisorsRole, Admin Rolem, Status, location

And user click on search

Then User info appears