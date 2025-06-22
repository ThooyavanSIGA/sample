package com.interfaceElements;

public interface ShoppingpageElementInterface {
	String shopingcart_xpath ="//a[text()='shopping cart']";
	String proceed_xpath = "//span[normalize-space()='Proceed to Checkout']";
	String adress_xpath ="//input[@name='street[0]']";		
	String city_xpath ="//input[@name='city']";
	String state_xpath = "//select[@name='region_id']";
	String zipcode_xpath = "//input[@name='postcode']";
	String phnum_xpath ="//input[@name='telephone']";
	
	String bestrateBtn_xpath = "(//input[@name='ko_unique_3'])[1]";
	String nextBtn_xpath = "//button[@class='button action continue primary']";
	String placeorderBtn_xpath = "//span[text()='Place Order']";
	String ordernum_xpath = "//a[@classs='order-numbber']";
}
