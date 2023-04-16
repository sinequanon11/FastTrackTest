Feature: Register on the Casino as New User

  Scenario: Register as a New User

    Given User is on the Home Page

    And  Navigate to Registration Page
      | newuserbutton |
      | igetitbutton  |

    And Enter Email and Click Submit Button

    And Enter Country Code and Phone Number
      | enterCountryCode | +90 |
      | enterPhoneNumber | 555 5554432|

    And Click the Submit Button
      | submitbutton |

    And Enter Full Name
      | enterFullName | Michael Case |

    And Click the Submit Button
      | submitbutton |

    And Enter Password
      | enterPassword | AaBb43201|

    And Click the Submit Button
      | submitbutton |

    And Click the Login Button
      | loginButton |

    Then Registration Complete Should be Displayed