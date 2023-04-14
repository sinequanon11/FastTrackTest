Feature: Register on the Casino as New User

  Scenario: Register as a New User

    Given User is on the Home Page

    And  Navigate to Registration Page
      | newuserbutton |
      | igetitbutton  |

    And Enter Valid Email
      | enteremail | hebal92724@fitzola.com |

    And Click the Submit Button
      | submitbutton |

    And Enter Country Code and Phone Number
      | enterCountryCode | +90 |
      | enterPhoneNumber | 555 5554432|

    And Click the Submit Button
      | submitbutton |

    And Enter Full Name
      | enterFullName | Michael Cage |

    And Click the Submit Button
      | submitbutton |

    And Enter Password
      | enterPassword | AaBb4321|

    And Click the Submit Button
      | submitbutton |

    And Click the Login Button
      | loginButton |

    Then Registration Complete Should be Displayed