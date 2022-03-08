package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
				
			}

			@FindBy(id="radiobutton_0")
			private WebElement clkRadiobtn;
			

			@FindBy(id="continue")
			private WebElement clkContinue;


			public WebElement getClkRadiobtn() {
				return clkRadiobtn;
			}


			public WebElement getClkContinue() {
				return clkContinue;
			}


}
