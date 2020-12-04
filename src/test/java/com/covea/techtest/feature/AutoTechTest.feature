Feature: Automation tech test scenarios

  @techTest
  Scenario Outline: A invalid email address is entered
    Given the user is on the quote page
    When an invalid email address is entered : "<Invalid Email>"
    Then an error is displayed
   Examples:
      |    Invalid Email    |
      |    abc^2           |

  @techTest
  Scenario Outline: A valid email address is entered
    Given the user is on the quote page
    When an valid email address is entered : "<Valid Email>"
    Then no error is displayed

    Examples:
      |    Valid Email    |
      |    a@b.c          |

  @techTest
  Scenario Outline: Email address and confirm email address do not match
    Given the user is on the quote page
    When an valid email address is entered : "<Valid Email>"
    And a different valid confirm email address is entered : "<not matching email>"
    Then an error is displayed for email not matching

    Examples:
      |    Valid Email    |   not matching email  |
      |    a@b.c          |      x@y.z            |


  @techTest
  Scenario Outline: Email address and confirm email address match
    Given the user is on the quote page
    When an valid email address is entered : "<Valid Email>"
    And a different valid confirm email address is entered : "<Valid Email>"
    Then no error is displayed for email not matching

    Examples:
      |    Valid Email    |
      |    a@b.c          |

  @techTest
  Scenario Outline: A invalid date of birth is entered
    Given the user is on the quote page
    When an date of birth is entered : "<invalid day>", "<invalid month>", "<invalid year>"
    Then an error is displayed for invalid date of birth

  Examples:
      | invalid day  |  invalid month  |  invalid year  |
      |    58        |       35        |    2050        |

#  Scenario: Postcode lookup for valid postcode
#    Given the user is on the quote page
#    When they complete the Your Details section
#    And enter a valid postcode and clicks find address
#    Then a list of addresses is shown
#
#  Scenario: Invalid account number and sort code combination
#    Given the user is on the quote page
#    When they complete all sections above Direct Debit Details
#    And enter an invalid account number / sort code combination is entered
#    Then an error is displayed
#
#  Scenario: Quote form completed
#    Given the user is on the quote page
#    When they complete all sections with valid information
#    And click continue
#    Then the summary page is displayed