Feature: Login scenarios

  @emptyUsernameField @Login
  Scenario: Empty userName field
    When user enters only password
    And clicks on the login button
    Then user can see the Username cannot be empty error message

  @Login @EmptyPasswordField
  Scenario: Empty password field
    When user enters only username
    And clicks on the login button
    Then user can see Password is empty error message


  @Login @invalidUsername
  Scenario: Invalid userName
    When user enters an invalid userName and a valid password
    And clicks on the login button
    Then user can see the Invalid credentials error message


  @Login @invalidPassword
  Scenario: Invalid password
    When user enters an invalid password and a valid userName
    And clicks on the login button
    Then user can see the Invalid credentials error message


  @Login @validLogin
  Scenario: Valid login
    When user enters the valid userName and Password
    And clicks on the login button
    Then user can see the dashboard page







