@SignInTest
Feature: Sign in

  Scenario: User signs in with valid username and password
    Given user is on the sign in page
    When user enters username "standard_user"
    And user enters password "secret_sauce"
    And user clicks the login button
    Then user should be redirected to the products page