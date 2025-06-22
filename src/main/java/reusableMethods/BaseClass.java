package reusableMethods;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//import dev.failsafe.internal.util.Assert;

public  class BaseClass {
	public static WebDriver driver;

	protected static void browserLaunch(String browser) {
	 if(browser.equalsIgnoreCase("chrome")){
		 driver = new ChromeDriver();
	 }else if(browser.equalsIgnoreCase("edge")) {
	      driver = new EdgeDriver();
	 }else if (browser.equalsIgnoreCase("firefox")){
			 driver =new FirefoxDriver();
	 }
	 driver.manage().window().maximize();
	
		
	}
	 protected static void openUrl(String url) {
		 driver.get(url);
	 }
	 
	 protected static void inputvalue (WebElement element,String value) {
		 try {
			element.sendKeys(value);
		} catch (Exception e) {
			
		Assert.fail("erro in input value");
		}
	 }
	 protected static void clicking(WebElement element) {
		 try {
			element.click();
		} catch (Exception e) {
			Assert.fail("error in clicking element");
		}
	 }
	
	protected static void closing() {
		driver.close();
		
	}
	 protected static void terminating() {
		 driver.quit();
	 }
	 
	 protected static void navigation(String navigation) {
		 if(navigation.equalsIgnoreCase("back")) {
		 driver.navigate().back();
		 
	 }else if(navigation.equalsIgnoreCase("forward")) {
		 driver.navigate().forward();
	 }else if (navigation.equalsIgnoreCase("refresh")) {
		 driver.navigate().refresh();
	 }
	 }
	 
	
	 
	 protected static void navigateUrl(String url) {
		 driver.navigate().to(url);
	 }
	 
	 protected static void alert(String actionIntput) {
		 if(actionIntput.equalsIgnoreCase("accept")) {
		 driver.switchTo().alert().accept();
	 }else if (actionIntput.equalsIgnoreCase("dismiss")) {
		 driver.switchTo().alert().dismiss();
	 }else if(actionIntput.equalsIgnoreCase(actionIntput)){
		driver.switchTo().alert().sendKeys(actionIntput);
		 
	 }}
		 
	 
	 protected static void checkbox(WebElement element ) {
		 if(!element.isSelected()) {
		 element.click();
		 }
	 }
	 
	 protected static void checkenable(WebElement element,String enaDisSel) {
		 if(enaDisSel.equalsIgnoreCase("checkEnable")) {
			 element.isEnabled();
			 element.click();
		 }else if(enaDisSel.equalsIgnoreCase("isdisplay")) {
			 element.isDisplayed();
			 element.click();
		 }else if(enaDisSel.equalsIgnoreCase("checkSelected")) {
			 if(!element.isSelected()) {
				 element.click();
			 }
		 }
	 }
	 
	protected static void gettings(String titUrl) {
		if(titUrl.equalsIgnoreCase("title")) {
		driver.getTitle();
	}else if (titUrl.equalsIgnoreCase("url")) {
		driver.getCurrentUrl();
	}
	}
	protected static void gettxtOrTitle(WebElement element,String getTxtOrValue) {
		if(getTxtOrValue.equalsIgnoreCase("getTxt")) {
		System.out.println(element.getText());
		}else if (!getTxtOrValue.equalsIgnoreCase("getTxt")){
			System.out.println( element.getAttribute(getTxtOrValue));
			
		}
	}
	 protected static void ismultiple(WebElement element) {
		 Select select = new Select(element);
		 try {
			select.isMultiple();
				 System.out.println("it is multiple dropdown");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		}
		 protected static void implicitwait(String type, int secminhour) { 
			
			 if (type.equalsIgnoreCase("seconds")) { 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secminhour));
			 } else if (type.equalsIgnoreCase("minutes")) { 
			 driver.manage().timeouts().implicitlyWait(Duration.ofMinutes (secminhour)); 
			 }
		 }
			 
			 protected static void selectOptions (WebElement element, String type, String value) { 
				 Select select = new Select(element); 
				 
				 if (type.equalsIgnoreCase ("TEXT")) { 
				 
				 select.selectByVisibleText(value); 
				 
				 }else if (type.equalsIgnoreCase("INDEX")) { 
				
				 select.selectByIndex (Integer.parseInt(value)); 
				 
				 }else if (type.equalsIgnoreCase ("VALUE")) {  
				
				 select.selectByValue(value); }
			 }
				 
				// public String getAttribute(By locator, String attributeName) {
				    //    WebElement element = driver.findElement(locator);
				  //      return element.getAttribute(attributeName);
				 
				 
				 protected static  void   getattribute(WebElement element,String attributename) {
					element.getAttribute(attributename);
				 }
					 
					 
					 
				 
			 
				 
	

}
