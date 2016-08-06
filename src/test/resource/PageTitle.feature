Feature: Page Title verification

 
  Scenario: To populate the specific page
    Given I navigate to the url
    When I click on the "Sport"
    Then I check I am on the confirmation page
    And I close the browser
