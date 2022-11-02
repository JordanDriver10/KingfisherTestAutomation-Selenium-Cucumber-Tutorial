@TestTag
Feature: Sign in

  Scenario Outline: User signs in with email and password
    Given user is on the demo sign in page
    When user enters <emailAddress> and creates account
    And user enters personal information
    Then Sign in should be successful

    Examples:
      | emailAddress                  |
      | Jordan.driver@kingfisher.com  |