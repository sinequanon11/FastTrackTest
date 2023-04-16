Feature: Play Game Functionality

  Background:

    Given User is on the Home Page
    When Navigate to Returning User Page
    And Enter Email and Click Submit Button

  Scenario: Play Game and Check Balance

    When Click Menu and Select Casino
      | hambmenu |
      | casino   |

    And Get the Amount

    And Play Game

    Then Play Game and Balance Should be Updated

