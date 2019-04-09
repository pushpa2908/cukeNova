#Author: your.email@your.domain.com
#Feature file to verify offer test call
@tag
Feature: Verify an offer test call
  I want to verify that on offer test call is successful

  @tag1
  Scenario: Access the Application using IE
    Given I navigate the application "https://qevc81.qa1.liveops.com" on "IE" browser
    When I enter credentials "jhertsens" and "password"
    And press "button" button
    Then I should be able to access the Home Page

  @tag2
  Scenario: Test Offer Call
    Given I access the offer "Flexable Hose BOGO (19.95 + 7.99 + 7.99) (BinCheck/PCI/CCAuth) (FH19LW1) (21)"
    When I initate Test Call
    Then I enter values "TestFirstName" and "TestLastName" in Welcome screen
    And I click on "Next"
    Then I enter values in "" screen