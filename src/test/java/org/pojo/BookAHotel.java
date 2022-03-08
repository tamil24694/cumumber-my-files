package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel extends BaseClass{
	
	public BookAHotel() {
		PageFactory.initElements(driver, this);
				
			}
			
			@FindBy(id="first_name")
			private WebElement txtFirstName;
			
			@FindBy(id="last_name")
			private WebElement txtLastName;
			
			@FindBy(id="address")
			private WebElement txtAddress;
			
			@FindBy(id="cc_num")
			private WebElement txtCCNumber;
			
			@FindBy(id="cc_type")
			private WebElement dDnCardType;
			
			@FindBy(id="cc_exp_month")
			private WebElement dDnMonth;
			
			@FindBy(id="cc_exp_year")
			private WebElement dDnYear;
			
			@FindBy(id="cc_cvv")
			private WebElement txtCVV;
			
			@FindBy(id="book_now")
			private WebElement clkBookNow;

			public WebElement getTxtFirstName() {
				return txtFirstName;
			}

			public WebElement getTxtLastName() {
				return txtLastName;
			}

			public WebElement getTxtAddress() {
				return txtAddress;
			}

			public WebElement getTxtCCNumber() {
				return txtCCNumber;
			}

			public WebElement getdDnCardType() {
				return dDnCardType;
			}

			public WebElement getdDnMonth() {
				return dDnMonth;
			}

			public WebElement getdDnYear() {
				return dDnYear;
			}

			public WebElement getTxtCVV() {
				return txtCVV;
			}

			public WebElement getClkBookNow() {
				return clkBookNow;
			}

}
