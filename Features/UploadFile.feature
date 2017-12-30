@uploadFile
Feature: UploadFile

In order to Upload a file on DataImport Section 
As a admin user
I want to click on PIM , click on Data Import, click on CSV File icon and click save

Scenario: Positive

Given User on OrangeHRM Demo GlobalHR Manager Admin page

When click on PIM , click on Data Import, click on CSV File

And user click on save 

Then Documents record should have updated.