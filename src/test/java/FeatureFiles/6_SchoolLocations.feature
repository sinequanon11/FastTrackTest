Feature: School Locations

  Background:
    Given Navigate to campus
    And Enter username and password click login button
    Then User should login successfully


  Scenario: Add School Locations
    And Navigate to Setup on LeftNav
      | setupLeftNav    |
      | schoolSetup     |
      | schoolLocations |

    And Click on the element in the Locations
      | addButton |

    And User sending the key in Locations
      | nameInput | Group_4_Location |
      | shortName | Location4        |
      | capacity  | 4                |

    And User press TAB button

    And Click on the element in the Locations
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Position
    And Navigate to Setup on LeftNav
      | setupLeftNav    |
      | schoolSetup     |
      | schoolLocations |

    And Click on the element in the Locations
      | editButton |

    And User sending the key in Positions
      | nameInput | Group_4_Location_edit |

    And Click on the element in the Positions
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Location

    And Navigate to Setup on LeftNav
      | setupLeftNav    |
      | schoolSetup     |
      | schoolLocations |

    And Click on the element in the Position Categories
      | deleteButton    |
      | deleteDialogBtn |

    Then Success message should be displayed