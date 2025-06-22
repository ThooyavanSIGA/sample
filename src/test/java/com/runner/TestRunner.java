package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import reusableMethods.BaseClass;

public class TestRunner extends BaseClass{
	public static void main(String[]args){
	browserLaunch("chrome");
	openUrl("https://demo.automationtesting.in/Alerts.html");
	
	WebElement simple = driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']"));
	WebElement displaybtn = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	WebElement confirm = driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
	WebElement displaybtn1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	WebElement prompt = driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
	WebElement displaybtn2 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));



	clicking(simple);
	clicking(displaybtn);
	alert("accept");
	clicking(confirm);
	
	clicking(displaybtn1);
	alert("dismiss");
	
	clicking(prompt);
	clicking(displaybtn2);
	alert("thooyavan");
	alert("accept");
	
	
	
		
		
	}

}
