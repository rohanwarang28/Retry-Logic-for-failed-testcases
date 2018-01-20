package mytests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.EventListener;


public class Tests {
	 
	WebDriver driver;
	public EventListener eventListener;
	public  EventFiringWebDriver e_driver;
	//public static WebEventListener eventListener;

	@BeforeMethod
	public void setup(){
		
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		e_driver=new EventFiringWebDriver(driver);
		eventListener=new EventListener();
		e_driver.register(eventListener);
		driver=e_driver;
	}
   	 

  
	@Test
	public void Amazon() 
	{
		driver.get("https://www.amazon.com");
		boolean flag=driver.findElement(By.id("1253")).isDisplayed();
		//Assert.assertFalse(flag);
		
	}
	
	@Test
	public void Wordpress() 
	{   driver.get("https://www.wordpress.com");
		System.out.println("Wordpress working fine");
		
	}
	
	
	
	
}
