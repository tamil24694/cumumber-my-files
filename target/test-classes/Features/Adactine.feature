Feature: Validation of AdactinHotel WebApplication

  Scenario: TC01_Validation of getting Order Id in Adactine WebApllications
    Given User launch AdactinHotel web Application
    When User enters valid username valid password
    And User click login Button
    Then User verify Hotel Search page is Displayed
    When User select loction, select Hotel , select room type , select no of rooms , Enter checkin date , Enter checkout date , select Adult per room , select Child per room
    And User Click the Search Button
    Then User validate  Select Hotel page is Displayed
    And Click the Radio Button then Click the Continue
    Then User Validate Book A Hotel page is Displayed
    When User Enter the Firstname , Enter Lastname , Enter Billing Address , Enter Vallid Credit Card Number , Select CreditCard Type , Select Expriy Month , Select Expriy Month , Enter CVV Number
    And User click BookNow Button
    Then User Validate Booking Confirmation page and Order ID is Displayed

  Scenario Outline: TC02_Validate the of AdactinHotel Booking with Valid Details
    Given User launch AdactinHotel web Application
    When User enter valid "<username>" "<password>"
    And User click login Button
    Then User verify Hotel Search page is Displayed
    When user select  "<location>" "<selecthotel>" "<room type>" "<no of rooms>" "<checkin date>" "<checkout date>" "<adult per room>" "<child per room>"
    And User Click the Search Button
    Then User validate  Select Hotel page is Displayed
    And Click the Radio Button then Click the Continue
    Then User Validate Book A Hotel page is Displayed
    When User Enter the  "<firstname>" "<lastname>" "<billing address>" "<CCNumber>" "<card type>" "<expriy month>" "<CVVNumber>"
    And User click BookNow Button
    Then User Validate Booking Confirmation page and Order ID is Displayed

    Examples: 
      | username  | password | location  | selecthotel    | room type    | no of rooms | checkin date | checkout date | adult per room | child per room | firstname | lastname | billing address | CCNumber         | card type | expriy month | CVVNumber |
      | VikhViki7 | Vikh123  | Melbourne | Hotel Creek    | Standard     | 2 - Two     | 10/03/2022   | 14/03/2022    | 2 - Two        | 2 - Two        | tamil     | selvan   | chennai         | 5432154321543211 | VISA      | January      |      5555 |
      | VikhViki7 | Vikh123  | Melbourne | Hotel Sunshine | Double       | 2 - Two     | 10/03/2022   | 14/03/2022    | 2 - Two        | 2 - Two        | tamil     | selvan   | chennai         | 5432154321543211 | VISA      | April        |      6666 |
      | VikhViki7 | Vikh123  | Brisbane  | Hotel Sunshine | Deluxe       | 2 - Two     | 10/03/2022   | 14/03/2022    | 2 - Two        | 2 - Two        | tamil     | selvan   | chennai         | 5432154321543211 | VISA      | January      |      7777 |
      | VikhViki7 | Vikh123  | London    | Hotel Sunshine | Super Deluxe | 2 - Two     | 10/03/2022   | 14/03/2022    | 2 - Two        | 2 - Two        | tamil     | selvan   | chennai         | 5432154321543211 | VISA      | March        |      3333 |
