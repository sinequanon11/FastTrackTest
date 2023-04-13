Feature: Login Functionality

  Scenario: Login with valid username and password

    Given User is on the Home Page

    When Navigate to Returning User Page
      | returninguser |

    And Enter Email
      | enteremail | hebal92724@fitzola.com |

    And Click the Submit Button
      | submitbutton |

    Then User should login successfully