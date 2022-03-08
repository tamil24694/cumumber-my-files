package org.stepdefinition;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.baseclass.BaseClass;
import org.junit.Assert;

public class StepDefinition extends BaseClass {

	@Given("User launch AdactinHotel web Application")
	public void user_launch_AdactinHotel_web_Application() {
		setup();
		loadUrl("https://adactinhotelapp.com/index.php");
		waitImplecity(20);
		maximize();

	}

	@When("User enters valid username valid password")
	public void user_enters_valid_username_valid_password() {
		WebElement txtUsername = byId("username");
		sendKeys(txtUsername, "VikhViki7");
		WebElement txtPassword = byId("password");
		sendKeys(txtPassword, "Vikh123");

	}

	@When("User click login Button")
	public void user_click_login_Button() {
		WebElement clkLogin = byId("login");
		click(clkLogin);
	}

	@Then("User verify Hotel Search page is Displayed")
	public void user_verify_Hotel_Search_page_is_Displayed() {
		WebElement txtSearch = byxpath("//td[@class='login_title']");
		String string = getText(txtSearch);
		System.out.println(string);
		boolean b = string.contains("Search Hotel ");
		System.out.println(b);
		Assert.assertTrue("if the  title show search hotel", string.contains("Search Hotel "));

	}

	@When("User select loction, select Hotel , select room type , select no of rooms , Enter checkin date , Enter checkout date , select Adult per room , select Child per room")
	public void user_select_loction_select_Hotel_select_room_type_select_no_of_rooms_Enter_checkin_date_Enter_checkout_date_select_Adult_per_room_select_Child_per_room() {
		WebElement dDnLocation = byId("location");
		selectByVisibleText(dDnLocation, "Melbourne");
		WebElement dDnHotels = byId("hotels");
		selectByVisibleText(dDnHotels, "Hotel Creek");
		WebElement dDnRoomType = byId("room_type");
		selectByVisibleText(dDnRoomType, "Super Deluxe");
		WebElement dDnNum = byId("room_nos");
		selectByVisibleText(dDnNum, "2 - Two");
		WebElement txtCheckin = byId("datepick_in");
		jsSetAttribute(txtCheckin, "02/03/2022");
		WebElement txtCheckout = byId("datepick_out");
		jsSetAttribute(txtCheckout, "04/03/2022");
		WebElement dDnAdult = byId("adult_room");
		selectByVisibleText(dDnAdult, "2 - Two");
		WebElement dDnChild = byId("child_room");
		selectByVisibleText(dDnChild, "2 - Two");

	}

	@When("User Click the Search Button")
	public void user_Click_the_Search_Button() {
		WebElement clkSubmit = byId("Submit");
		click(clkSubmit);
	}

	@Then("User validate  Select Hotel page is Displayed")
	public void user_validate_Select_Hotel_page_is_Displayed() {
		WebElement txttxt = byxpath("//td[@class='login_title']");
		String text = getText(txttxt);
		System.out.println(text);
		Assert.assertTrue("check select hotel is there", text.contains("Select Hotel"));
	}

	@Then("Click the Radio Button then Click the Continue")
	public void click_the_Radio_Button_then_Click_the_Continue() {
		WebElement clkRadio = byId("radiobutton_0");
		click(clkRadio);
		WebElement clkContinue = byId("continue");
		click(clkContinue);
	}

	@Then("User Validate Book A Hotel page is Displayed")
	public void user_Validate_Book_A_Hotel_page_is_Displayed() {
		WebElement byxpath2 = byxpath("(//td[@class='login_title'])[2]");
		String gettext222 = gettext22(byxpath2);
		System.out.println(gettext222);
		Assert.assertTrue("Its contains book a hotel", "Book A Hotel".equalsIgnoreCase(gettext222));
	}

	@When("User Enter the Firstname , Enter Lastname , Enter Billing Address , Enter Vallid Credit Card Number , Select CreditCard Type , Select Expriy Month , Select Expriy Month , Enter CVV Number")
	public void user_Enter_the_Firstname_Enter_Lastname_Enter_Billing_Address_Enter_Vallid_Credit_Card_Number_Select_CreditCard_Type_Select_Expriy_Month_Select_Expriy_Month_Enter_CVV_Number() {
		WebElement txtFirstname = byId("first_name");
		sendKeys(txtFirstname, "tamil");
		WebElement txtLastName = byId("last_name");
		sendKeys(txtLastName, "selvan");
		WebElement txtAddress = byId("address");
		sendKeys(txtAddress, "mumbai");
		WebElement txtCard = byId("cc_num");
		sendKeys(txtCard, "5432154321543211");
		WebElement dDntype = byId("cc_type");
		selectByValue(dDntype, "VISA");
		WebElement dDnExpMonth = byId("cc_exp_month");
		selectByVisibleText(dDnExpMonth, "February");
		WebElement dDnExpYear = byId("cc_exp_year");
		selectByIndex(dDnExpYear, 12);
		WebElement txtCVV = byId("cc_cvv");
		sendKeys(txtCVV, "9999");

	}

	@When("User click BookNow Button")
	public void user_click_BookNow_Button() {
		WebElement clkBookNow = byId("book_now");
		click(clkBookNow);
	}

	@Then("User Validate Booking Confirmation page and Order ID is Displayed")
	public void user_Validate_Booking_Confirmation_page_and_Order_ID_is_Displayed() throws InterruptedException {
		
		
		Thread.sleep(6000);
		WebElement txtOrderid = byxpath("//*[@id=\"order_no\"]");
		String attribute2 = getAttribute(txtOrderid);
		System.out.println(attribute2);
		Thread.sleep(3000);
		quit();
		
	}

	@When("User enter valid {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void user_enter_valid(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8, String string9, String string10, String string11,
			String string12, String string13, String string14, String string15, String string16, String string17) throws InterruptedException {
		WebElement txtUsername = byId("username");
		sendKeys(txtUsername, string);
		WebElement txtPassword = byId("password");
		sendKeys(txtPassword, string2);
		WebElement clkLogin = byId("login");
		click(clkLogin);
		WebElement txtSearch = byxpath("//td[@class='login_title']");
		String str = getText(txtSearch);
		System.out.println(str);
		boolean b = str.contains("Search Hotel ");
		System.out.println(b);
		Assert.assertTrue("if the  title show search hotel", str.contains("Search Hotel "));
		WebElement dDnLocation = byId("location");
		selectByVisibleText(dDnLocation, string3);
		WebElement dDnHotels = byId("hotels");
		selectByVisibleText(dDnHotels, string4);
		WebElement dDnRoomType = byId("room_type");
		selectByVisibleText(dDnRoomType, string5);
		WebElement dDnNum = byId("room_nos");
		selectByVisibleText(dDnNum, string6);
		WebElement txtCheckin = byId("datepick_in");
		jsSetAttribute(txtCheckin, string7);
		WebElement txtCheckout = byId("datepick_out");
		jsSetAttribute(txtCheckout, string8);
		WebElement dDnAdult = byId("adult_room");
		selectByVisibleText(dDnAdult, string9);
		WebElement dDnChild = byId("child_room");
		selectByVisibleText(dDnChild, string10);
		WebElement clkSubmit = byId("Submit");
		click(clkSubmit);
		WebElement txttxt = byxpath("//td[@class='login_title']");
		String text = getText(txttxt);
		System.out.println(text);
		Assert.assertTrue("check select hotel is there", text.contains("Select Hotel"));
		WebElement clkRadio = byId("radiobutton_0");
		click(clkRadio);
		WebElement clkContinue = byId("continue");
		click(clkContinue);
		WebElement byxpath2 = byxpath("(//td[@class='login_title'])[2]");
		String gettext222 = gettext22(byxpath2);
		System.out.println(gettext222);
		Assert.assertTrue("Its contains book a hotel", "Book A Hotel".equalsIgnoreCase(gettext222));
		WebElement txtFirstname = byId("first_name");
		sendKeys(txtFirstname, string11);
		WebElement txtLastName = byId("last_name");
		sendKeys(txtLastName, string12);
		WebElement txtAddress = byId("address");
		sendKeys(txtAddress, string13);
		WebElement txtCard = byId("cc_num");
		sendKeys(txtCard, string14);
		WebElement dDntype = byId("cc_type");
		selectByValue(dDntype, string15);
		WebElement dDnExpMonth = byId("cc_exp_month");
		selectByVisibleText(dDnExpMonth, string16);
		WebElement dDnExpYear = byId("cc_exp_year");
		selectByIndex(dDnExpYear, 12);
		WebElement txtCVV = byId("cc_cvv");
		sendKeys(txtCVV, string17);
		WebElement clkBookNow = byId("book_now");
		click(clkBookNow);
		Thread.sleep(6000);
		WebElement txtOrderid = byxpath("//*[@id=\"order_no\"]");
		String attribute2 = getAttribute(txtOrderid);
		System.out.println(attribute2);
		Thread.sleep(3000);
		quit();
		
	}

	@Then("user verify the all pages are working properly")
	public void user_verify_the_all_pages_are_working_properly() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}
}
