Feature: Deposit Functionality

  Background:

    Given User is on the Home Page
    When Navigate to Returning User Page
    And Enter Email and Click Submit Button

  Scenario: Deposit and Check Balance

    When Click Money Button
      | moneybutton|

    And Select Direct Bank Method
      | directbank |

    And Select an Amount
      | selectamount |

    And Deposit Approved
      | depositapproved |

    Then Deposit Successful and Check Balance Matches

