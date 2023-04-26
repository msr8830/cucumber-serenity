Feature: Access Authorization - Sign In

  Background: Navigate to Access Authorization
    Given Navigate to sign in screen

  Scenario Outline:Sign In - Successful Login to Access Authorization app
    When I use Valid username and Valid password
    Then Verify home page is loaded with "<title>"

    Examples: Home Page Title
      | title |
      | title |




