Feature: Register on the Casino as New User


  Scenario: Register a New User

    Given User is on the Home Page

    And  Navigate to New User Page
      | humanResource_1    |


    And Click on the element in the Position Categories
      | addButton |

    And User sending the key in Position Categories
      | nameInput | Group_4444|

    And Click on the element in the Position Categories
      | saveButton |

    Then Success message should be displayed



