package com.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceElements.ShoppingpageElementInterface;

import reusableMethods.BaseClass;

public class ShoppingpageModel extends BaseClass implements ShoppingpageElementInterface {
	@FindBy(xpath  = shopingcart_xpath )
	private WebElement shopingcart;
	
	@FindBy(xpath   = proceed_xpath)
	private WebElement proceed;
	
	@FindBy(xpath   = adress_xpath)
	private WebElement adress;
	
	@FindBy(xpath   = city_xpath )
	private WebElement city;
	
	@FindBy(xpath   = state_xpath)
	private WebElement state;
	
	@FindBy(xpath   = phnum_xpath)
	private WebElement phnum;
	
	@FindBy(xpath   = zipcode_xpath)
	private WebElement zipcode;
	
	@FindBy(xpath   =bestrateBtn_xpath)
	private WebElement bestrate;
	
	@FindBy(xpath   = nextBtn_xpath)
	private WebElement nextBtn;
	
	@FindBy(xpath   = placeorderBtn_xpath)
	private WebElement placeorderBtn;
	
	@FindBy(xpath   = ordernum_xpath)
	private WebElement ordernum;
	
	
	//costructor
	
	public ShoppingpageModel() {
		PageFactory.initElements(driver, this);
	}
	//actions
	
	public void  validShoppinpage() {
		
		clicking(shopingcart);
		implicitwait("seconds", 5);
		clicking(proceed);

		inputvalue(adress, "south street,USA");
		clicking(city);
		inputvalue(city, "NEW YORK");
		selectOptions(state, "index", "1");
		clicking(zipcode);
		inputvalue(zipcode, "12345");
		clicking(phnum);
		
		inputvalue(phnum, "9788087826");
		clicking(bestrate);
		clicking(nextBtn);
		
		clicking(placeorderBtn);
		implicitwait("seconds", 5);
		getattribute(ordernum, "value");
		
	}

}
