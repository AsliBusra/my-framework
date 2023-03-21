Feature: Vehicles Services Logs Function

  Background: For the scenarios in the feature file, user is expected to be on Vehicle Services Logs module.
    Given user logged in as a posmanager
    And user clicks Fleet
    And user clicks the Vehicles Services Logs module button

  Scenario: Create a vehicles services logs
    When user clicks Create button to register
    And user clicks Vehicle button
    And user should be able to car model as "Mercedes/Class A/1-MER-001"
    And user clicks Save button
    Then user sees the "Mercedes/Class A/1-MER-001" on the page

  Scenario: user cannot create a Vehicle Service Logs without selecting vehicle
    When user clicks Create button to register
    And user clicks Save button
    Then this alert message should be displayed "The following fields are invalid:Vehicle"

  Scenario:Positive scenario user can cancel creating by clicking Discard button
    When user clicks Create button to register
    And user clicks Discard button
    Then user sees the "Vehicles Services Logs"

  Scenario:Negative scenario 1 user can cancel creating by clicking Discard button
    When user clicks Create button to register
    And user clicks Vehicle button
    And user should be able to car model as "Mercedes/Class A/1-MER-001"
    And user clicks Discard button
    And user sees this warning message "The record has been modified, your changes will be discarded. Do you want to proceed?"
    And user clicks Ok button
    Then user sees the "Vehicles Services Logs"


  Scenario:Negative scenario 2 user can cancel creating by clicking Discard button
    When user clicks Create button to register
    And user clicks Vehicle button
    And user should be able to car model as "Mercedes/Class A/1-MER-001"
    And user clicks Discard button
    And user sees this warning message "The record has been modified, your changes will be discarded. Do you want to proceed?"
    And user clicks Cancel button
    Then user can not cancel creating so user can not back to Vehicles Services Logs

  Scenario: page title is changed to the new Service Logs value after user create the Service Logs
    When user clicks Create button to register
    And user clicks Vehicle button
    And user should be able to car model as "Mercedes/Class A/1-MER-001"
    And user clicks Save button
    Then user sees page title is changed to the "Mercedes/Class A/1-MER-001 - Odoo"


  Scenario: after creating a new Service Logs, “Attachment” button is displayed at the top of the page
    When user clicks Create button to register
    And user clicks Vehicle button
    And user should be able to car model as "Mercedes/Class A/1-MER-001"
    And user clicks Save button
    And user sees the "Mercedes/Class A/1-MER-001" on the page
    Then "Attachment" button is displayed at the top of the page


  Scenario: after creating a new Service Logs, “Action” button is displayed at the top of the page
    When user clicks Create button to register
    And user clicks Vehicle button
    And user should be able to car model as "Mercedes/Class A/1-MER-001"
    And user clicks Save button
    And user sees the "Mercedes/Class A/1-MER-001" on the page
    Then "Action" button is displayed at the top of the page

  @wip
  Scenario Template: user can find the new created Service Logs value under Service Logs list by using search box.
    When user clicks Create button to register
    And user enters vehicle "<Vehicle>"
    And user enters service type "<Service Type>"
    And user enters total price <Total price>
    And user enters date "<Date>"
    And user enters purchaser "<Purchaser>"
    And user enters vendor "<Vendor>"
    And user enters invoice reference <Invoice Reference>
    And user enters notes "<Notes>"
    And user clicks Save button
    And user sees the "<Vehicle>" on the page
    And user returns to the Vehicle Services Logs List by clicking the Vehicles Services Logs button
    And user enters below data in the search box along with filters on the Filters pageside.
    And user adds vehicle "<Vehicle>"
    And user adds service type "<Service Type>"
    And user adds total price <Total price>
    And user adds date "<Date>"
    And user adds purchaser "<Purchaser>"
    And user adds vendor "<Vendor>"
    And user adds invoice reference <Invoice Reference>
    And user adds notes "<Notes>"
    And user clicks Advanced Search... button
    Then user sees the "<new created>" Services Logs value.
    Examples:
      | Vehicle                    | Service Type | Total price | Date       | Purchaser | Vendor | Invoice Reference | Notes  | new created                |
      | Mercedes/Class A/1-MER-001 | Tax roll     | 100         | 03/19/2023 | Asli      | Yalcin | 100               | Thanks | Mercedes/Class A/1-MER-001 |


#  Scenario: user can change Service Logs display to Kanban/List/Graph
#    When users clicks below buttons
#      | Kanban |
#      | List   |
#      | Graph  |
#    Then user sees changed Service Logs display to Kanban/List/Graph


