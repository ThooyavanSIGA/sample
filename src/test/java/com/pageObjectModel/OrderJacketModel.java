package com.pageObjectModel;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceElements.OrderJacketInterfaceElement;

import reusableMethods.BaseClass;

public class OrderJacketModel extends BaseClass implements OrderJacketInterfaceElement {
	
@FindBy(id = men_id)
private WebElement men;

@FindBy(xpath = jacket_xpath)
private WebElement jacket;

@FindBy(xpath = montana_xpath)
private WebElement montana;

@FindBy(id = size_id)
private WebElement size;

@FindBy(id = color_id)
private WebElement color;

@FindBy(id = addtocart_id)
private WebElement addtocart;

public OrderJacketModel() {
	PageFactory.initElements(driver, this);
}
	
	
	public void getOrderJacketModel() {
		
		clicking(men);
		clicking(jacket);
		implicitwait("seconds", 5);
		clicking(montana);
		clicking(size);
		clicking(color);
		clicking(addtocart);
	}
}



