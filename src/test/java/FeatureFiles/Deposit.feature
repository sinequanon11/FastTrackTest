Feature: Deposit Functionality

  Background:

    Given User is on the Home Page
    When Navigate to Returning User Page
      | returninguser |
    And Enter Email
      | enteremail | hebal92724@fitzola.com |
    And Click the Submit Button
      | submitbutton |

  Scenario: Deposit and Check

    When Click Money Button
      | moneybutton|

    And Select Direct Bank Method
      | directbank |

    And Select an Amount
      | selectamount |

    And Deposit Approved
      | depositapproved |

    Then Deposit Successful Should be Displayed

