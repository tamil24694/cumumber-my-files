$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Adactine.feature");
formatter.feature({
  "name": "Validation of AdactinHotel WebApplication",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC01_Validation of getting Order Id in Adactine WebApllications",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch AdactinHotel web Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_AdactinHotel_web_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid username valid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_valid_username_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify Hotel Search page is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_Hotel_Search_page_is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select loction, select Hotel , select room type , select no of rooms , Enter checkin date , Enter checkout date , select Adult per room , select Child per room",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_select_loction_select_Hotel_select_room_type_select_no_of_rooms_Enter_checkin_date_Enter_checkout_date_select_Adult_per_room_select_Child_per_room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click the Search Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Click_the_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validate  Select Hotel page is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_validate_Select_Hotel_page_is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Radio Button then Click the Continue",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_the_Radio_Button_then_Click_the_Continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Validate Book A Hotel page is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Validate_Book_A_Hotel_page_is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter the Firstname , Enter Lastname , Enter Billing Address , Enter Vallid Credit Card Number , Select CreditCard Type , Select Expriy Month , Select Expriy Month , Enter CVV Number",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_Enter_the_Firstname_Enter_Lastname_Enter_Billing_Address_Enter_Vallid_Credit_Card_Number_Select_CreditCard_Type_Select_Expriy_Month_Select_Expriy_Month_Enter_CVV_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click BookNow Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_BookNow_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Validate Booking Confirmation page and Order ID is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Validate_Booking_Confirmation_page_and_Order_ID_is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});