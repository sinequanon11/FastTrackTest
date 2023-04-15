Feature: Play Game Functionality

  Background:

    Given User is on the Home Page
    When Navigate to Returning User Page
      | returninguser |
    And Enter Email
      | enteremail | hebal92724@fitzola.com |
    And Click the Submit Button
      | submitbutton |

  Scenario: Play Game and Check Balance

    When Click Menu
      | hambmenu |
      | casino   |

    And Get the Amount

    And Play Game
    #  | playgame |

    Then Play Game and Balance Should be Updated

