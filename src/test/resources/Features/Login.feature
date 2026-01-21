Feature: Login page
  Scenario Outline: Login the user
  Given user has to launch browser
  And load application url page
  And verify application login page
  When the user has to give "<email>" and "<password>"
  Then submit the login button
  And  verify login confirmation
    Examples:
    |email               |  password|
    |m.kiruba@gmail.com  |   12345  |


