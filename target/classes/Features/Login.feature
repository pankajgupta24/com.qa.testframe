@Login
Feature: Sign In
  As an employee of the company
  I want to login to application with my credentails
  In order to use the application features.

  Background: User navigates to Application URL
    Given I am on the Login page URL "https://www.naukri.com/"
    Then I should see Log In Page

   @sanity
  Scenario: Sign In with valid credential
    When I enter username as "pankajgupta24@live.com"
    And I enter password as "9015pankaj"
    And click on login button
    Then I sould see application homepage
    And I sould see administrator text message on home Page

  @sanity
  Scenario Outline: Sign In with valid credentials
    When I enter username as "<userName>"
    And I enter password as "<password>"
    And click on login button
    Then I sould see application homepage
    And I sould see administrator text message on home Page

    Examples: 
      | userName				 | password   |
      | pankajgupta24@live.com   | 9015pankaj |
      | pankajkgupta242@gmail.com| 9015pankaj |
      | pankajgupta24@live.com   | 9015pankaj |