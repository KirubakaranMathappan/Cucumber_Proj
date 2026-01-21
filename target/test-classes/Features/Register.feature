Feature: Registration Page
  Scenario: Create New user
    Given the user has to launch application url
    When the user navigate to register page
    And verify the register page with proper validation
    When the user has to provide valid details for registration
    Then verify the registration successful message