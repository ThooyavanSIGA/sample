package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import reusableMethods.BaseClass;

public class getting  extends BaseClass{

	public static void main(String[] args) {
		browserLaunch("chrome");
		openUrl("https://www.flipkart.com/");
		WebElement ele =driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
		
		 //gettxtOrTitle(ele, "getTxt");
		 //gettxtOrTitle(ele, "title");
		
		ismultiple(ele);
	}

}
