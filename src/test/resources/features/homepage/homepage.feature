Feature: Home Page Validations

  Background: Navigate to App
    Given Navigate to sign in screen
    When I use Valid username and Valid password

  Scenario: Home Page Channel Filter Validations
    When Filter panel loads all items
