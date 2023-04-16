Feature: Buy Lottery Ticket Functionality

  Background:

    Given User is on the Home Page
    When Navigate to Returning User Page
    And Enter Email and Click Submit Button

  Scenario: Buy a Lottery Ticket and Check Balance

    When Click Menu and Select Lottery
      | hambmenu |
      | lottery  |

    And Get the Current Amount

    And Buy a Lottery Ticket
      | buytickets |

    Then Buy a Lottery Ticket and Balance Should be Updated

