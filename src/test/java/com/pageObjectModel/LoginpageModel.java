package com.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceElements.LoginPageInterfaceElement;
import com.utility.FileReaderManager;

import reusableMethods.BaseClass;

public class LoginpageModel extends BaseClass implements LoginPageInterfaceElement {
	
@FindBy(xpath = signin_xpath)
private WebElement signin;

@FindBy(id = username_id)
private WebElement username;

@FindBy(id = password_id)
private WebElement pass;

@FindBy(xpath = signinbtn_xpath)
private WebElement signinbtn;



//constructor
public LoginpageModel() {
	PageFactory.initElements(driver, this);
}
FileReaderManager reader = new FileReaderManager();

// actions
public void getLoginpage() {
	//browserLaunch(reader.getDataProperty("browser"));
	//openUrl(reader.getDataProperty("url"));
	
	clicking(signin);
	inputvalue(username,reader.getDataProperty("username"));
	inputvalue(pass, reader.getDataProperty("password"));
	clicking(signinbtn);
	
	
}


}
