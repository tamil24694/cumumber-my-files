package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirm extends BaseClass{
	public BookingConfirm() {
		PageFactory.initElements(driver, this);
				
			}
	
			@FindBy(id="order_no")
			private WebElement Order;

			public WebElement getOrder() {
				return Order;
			} 
			

}
