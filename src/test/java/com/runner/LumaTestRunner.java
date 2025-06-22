package com.runner;

import com.pageObjectModel.OrderJacketModel;

//import com.interfaceElements.OrderpageInterfaceElement;
//import com.pageObjectModel.LoginpageModel;
//import com.pageObjectModel.OrderpageModel;
//import com.pageObjectModel.ShoppingpageModel;

import pageObjectManager.PageObjectManager;
import reusableMethods.BaseClass;

public class LumaTestRunner extends BaseClass{

	public static void main(String[] args) {
		PageObjectManager pageobjectmanger = new PageObjectManager();
		browserLaunch(pageobjectmanger.getFileReader().getDataProperty("browser"));
		//openUrl("https://magento.softwaretestingboard.com/");
	  openUrl(pageobjectmanger.getFileReader().getDataProperty("url"));		
		pageobjectmanger.getLoginpagemanager().getLoginpage();
		//pageobjectmanger.geOrderpageModel().validOrderpage();
		OrderJacketModel orderjacketmodel = new  OrderJacketModel();
		orderjacketmodel.getOrderJacketModel();
		
		pageobjectmanger.getshoppingpageModel().validShoppinpage();
		
	}

}
