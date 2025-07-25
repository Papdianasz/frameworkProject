Feature: Add employee scenarios

  Background:
    When user enters valid username and password
    And user clicks on login button
    Then user is able to see dashboard page
    When user clicks on om PIM option
    And user clicks on Add employee option

@AddEmp @withoutID
 Scenario: Without Id
  And user enters firstname and lastname
  And user clicks on save button
  Then employee added successfully

@AddEmp @withID
  Scenario: With manually added employeeID
  And user enters firstname, middlename and lastname
  And enters an emplyeeId manually
  And user clicks on save button
  Then employee added successfully

  @AddEmp @errorMsg
    Scenario: Error message appearance
    When user enters only firstname
    And user clicks on save button
    Then an error message should be appers
