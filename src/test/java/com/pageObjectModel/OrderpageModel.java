package com.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceElements.OrderpageInterfaceElement;

import reusableMethods.BaseClass;

public class OrderpageModel extends BaseClass implements OrderpageInterfaceElement {
	 @FindBy(id = men_id)
	 private WebElement men;
	 
	 @FindBy(xpath= hoodie_xpath)
	 private WebElement hoodie;
	 
	@FindBy(linkText = marcohoodie_linktext)
	private WebElement marcohoodie;
	
	@FindBy(xpath = size_xpath)
	private WebElement sizem;
	
	@FindBy(xpath = color_xpath)
	private WebElement color;
	
	@FindBy(id = addtocart_id)
	private WebElement addtocart;
	
	



public OrderpageModel() {
	PageFactory.initElements(driver, this);
}


public void validOrderpage() {
	clicking(men);
	clicking(hoodie);
	clicking(marcohoodie);
	clicking(sizem);
	clicking(color);
	clicking(addtocart);
	implicitwait("seconds", 5);
}
}
