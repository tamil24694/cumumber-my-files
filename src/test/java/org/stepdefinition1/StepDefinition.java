package org.stepdefinition1;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.pojo.AdactinPojo;
import org.pojo.BookAHotel;
import org.pojo.SearchHotel;
import org.pojo.SelectHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	AdactinPojo a;
	
	SelectHotel c;
	BookAHotel d;

	@Given("User launch AdactinHotel web Application")
	public void user_launch_AdactinHotel_web_Application() {
		
	}

	@When("User enters valid username valid password")
	public void user_enters_valid_username_valid_password() {
		a = new AdactinPojo();
		sendKeys(a.getUserName(), "VikhViki7");
		sendKeys(a.getPassWord(), "Vikh123");
	}

	@When("User click login Button")
	public void user_click_login_Button() {
		a = new AdactinPojo();
		click(a.getLogin());
	}

	@Then("User verify Hotel Search page is Displayed")
	public void user_verify_Hotel_Search_page_is_Displayed() {
		a = new AdactinPojo();
		WebElement txtSearch = byxpath("//td[@class='login_title']");
		String string = getText(txtSearch);
		System.out.println(string);
		boolean b = string.contains("Search Hotel ");
		System.out.println(b);
		Assert.assertTrue("if the  title show search hotel", string.contains("Search Hotel "));
	}

	@When("User select loction, select Hotel , select room type , select no of rooms , Enter checkin date , Enter checkout date , select Adult per room , select Child per room")
	public void user_select_loction_select_Hotel_select_room_type_select_no_of_rooms_Enter_checkin_date_Enter_checkout_date_select_Adult_per_room_select_Child_per_room() {
		SearchHotel b = new SearchHotel();
		selectByVisibleText(b.getLocation(), "Melbourne");
		selectByVisibleText(b.getHotels(), "Hotel Creek");
		selectByVisibleText(b.getRoomType(), "Super Deluxe");
		selectByVisibleText(b.getNoOfRooms(), "2 - Two");
		jsSetAttribute(b.getCheckIn(), "02/03/2022");
		jsSetAttribute(b.getCheckOut(), "04/03/2022");
		selectByVisibleText(b.getNoOfAdults(), "2 - Two");
		selectByVisibleText(b.getNoOfChild(), "2 - Two");

	}

	@When("User Click the Search Button")
	public void user_Click_the_Search_Button() {
		SearchHotel b = new SearchHotel();
		click(b.getClkSubmit());
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
		c = new SelectHotel();
		click(c.getClkRadiobtn());
		click(c.getClkContinue());

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
		d = new BookAHotel();
		sendKeys(d.getTxtFirstName(), "tamil");
		sendKeys(d.getTxtLastName(), "selvan");
		sendKeys(d.getTxtAddress(), "mumbai");
		sendKeys(d.getTxtCCNumber(), "5432154321543211");
		selectByVisibleText(d.getdDnCardType(), "VISA");
		selectByVisibleText(d.getdDnMonth(), "February");
		selectByIndex(d.getdDnYear(), 12);
		sendKeys(d.getTxtCVV(), "9999");

	}

	@When("User click BookNow Button")
	public void user_click_BookNow_Button() {
		d = new BookAHotel();
		click(d.getClkBookNow());
	}

	@Then("User Validate Booking Confirmation page and Order ID is Displayed")
	public void user_Validate_Booking_Confirmation_page_and_Order_ID_is_Displayed() throws InterruptedException {
		Thread.sleep(6000);
		WebElement txtOrderid = byxpath("//*[@id=\"order_no\"]");
		String attribute2 = getAttribute(txtOrderid);
		System.out.println(attribute2);
		
	}

	@When("User enter valid {string} {string}")
	public void user_enter_valid(String string, String string2) {
		AdactinPojo a = new AdactinPojo();
		sendKeys(a.getUserName(), string);
		sendKeys(a.getPassWord(),string2 );
		
	}

	@When("user select  {string} {string} {string} {string} {string} {string} {string} {string}")
	public void user_select(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	    
		SearchHotel b = new SearchHotel();
		selectByVisibleText(b.getLocation(), string);
		selectByVisibleText(b.getHotels(), string2);
		selectByVisibleText(b.getRoomType(), string3);
		selectByVisibleText(b.getNoOfRooms(), string4);
		jsSetAttribute(b.getCheckIn(), string5);
		jsSetAttribute(b.getCheckOut(), string6);
		selectByVisibleText(b.getNoOfAdults(),string7 );
		selectByVisibleText(b.getNoOfChild(), string8);
		
		
		
		
	}
	
	

	@When("User Enter the  {string} {string} {string} {string} {string} {string} {string}")
	public void user_Enter_the(String string, String string2, String string3, String string4, String string5,
			String string6, String string7) throws InterruptedException {
		
		
		d = new BookAHotel();
		sendKeys(d.getTxtFirstName(), string);
		sendKeys(d.getTxtLastName(), string2);
		sendKeys(d.getTxtAddress(), string3);
		sendKeys(d.getTxtCCNumber(), string4);
		selectByVisibleText(d.getdDnCardType(), string5);
		selectByVisibleText(d.getdDnMonth(), string6);
		selectByIndex(d.getdDnYear(), 12);
		sendKeys(d.getTxtCVV(), string7);
		
		
		
	}

}