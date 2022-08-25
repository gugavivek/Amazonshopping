package automationpackage;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{

String actualtitle,expectedtitle;	
ChromeDriver driver;
String baseurl="https://retail.axisbank.co.in/";


public void invokebrowser() 
{

	System.setProperty("webdriver.chrome.driver","/Users/Guga/Documents/Selenium/chromedriver/chromedriver");
	 driver=new ChromeDriver();
	 driver.get(baseurl);
	// driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

}

public String verifypagetitle() 
  {
	driver.get(baseurl);
	String expectedtitle="Axis Bank Internet Banking";
	String actualtitle=driver.getTitle();
	//Assert.(expectedtitle, actualtitle);
	if(actualtitle.contentEquals(expectedtitle))
	{
		System.out.println("Title Matching");
	}
	else
	{
			System.out.println("Title Mismatching");
	}
		return actualtitle;
  }
public void loginapplication() 
{
	WebElement userid=driver.findElement(By.name("FORM_LOGINID"));
	WebElement password=driver.findElement(By.name("pwd"));
	userid.sendKeys("849025086");
	password.sendKeys("KAR1st$0N");
	WebElement loginbutton=driver.findElement(By.name("ABCustomLoginPortletFormSubmit"));
	loginbutton.click();
	driver.manage().deleteAllCookies();
	
}


public void endsession() 
  {
	  driver.close();
  }
	
  
  }


