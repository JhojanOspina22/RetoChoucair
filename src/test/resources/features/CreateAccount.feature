Feature: As user i need login in the web page OrangeHMR, register a new employee and validate your correctly register

  Background: Into the OrangeHMR page
    Given User login in page web with user "admin" and password "admin123"

  @UserRegistered
  Scenario Outline: validate employee creation successfully
    When the user enters the PIM menu
    And the user enters "<firstname>","<lastname>","<username>", "<password>" and "<confirmpassword>"
    Then the user will see your "<firstname>" and "<lastname>" in the list employees create

    Examples:
      |firstname|lastname|username|password|confirmpassword|
      |edwart|rodriguez|edwart30|ed123456|ed123456|
      |edwart|rodriguez|edwart31|ed123456|ed123456|
      |edwart|rodriguez|edwart32|ed123456|ed123456|
