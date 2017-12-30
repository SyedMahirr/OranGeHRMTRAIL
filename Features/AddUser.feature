@AddUser
Feature: AddUser

In order to add as user 
As a admin user
I want to click on admin, click on user management, click on user, click on add user, enter information and click save

Scenario: Positive

Given User on OrangeHRM Demo GlobalHR Manager Admin page

When User click on admin, click on user management, click on user, click on add user,

And User enters user inforamtion EmployeeName, UserName, ESS Role, SupervisorsRole, Admin Rolem, Status, PW and confrim Pw

And user click on save 

Then User info appears in user information list at the top