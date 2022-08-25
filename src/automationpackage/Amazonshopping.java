package automationpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Amazonshopping
{
	ChromeDriver driver;
	String url="https://www.amazon.in/";	


public void Invokebrowser() 
{
	System.setProperty("webdriver.chrome.driver", "/Users/Guga/Documents/Selenium/chromedriver/chromedriver");
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.manage().window().maximize();
	 driver.get(url);

	
	

	
	//WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
	//searchbox.sendKeys("amazon");
//searchbox.click();	
	/*WebElement firstlink=driver.findElement(By.xpath("//div[@class='pcTkSc']/div[@class='wM6W7d']/span [1]"));
	Actions action =new Actions(driver);
	action.moveToElement(firstlink).build().perform();
	firstlink.click();*/
	//WebElement searchlink=driver.findElement(By.xpath("//div/span[contains (text(),'Amazon.com Official Site - Fast Free Delivery with Prime')]"));
	//searchlink.click();

	
}
/*public void login()
{
Actions actions=new Actions(driver);
	WebElement web=driver.findElement(By.xpath("//span[contains(@class,'nav-icon nav-arrow')])"));
	actions.moveToElement(web).build().perform();
	WebElement webb=driver.findElement(By.xpath("//span[contains(text(),'Sign-In')]"));
	actions.moveToElement(webb).build().perform();
	//driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();*/
	//driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	//driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
/*	((JavascriptExecutor)getDriver()).executeScript("$('#" + "ap_email" + "').val('" + "rgugapriya@ymail.com" + "');");

	WebElement userid=driver.findElement(By.xpath("//input[@id='ap_email'and @type='email']"));
	userid.click();
	userid.sendKeys("7010324762");
	driver.findElement(By.xpath("//span[@id='continue']")).click();
	WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("Karthi@1208");
	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	
}*/
public void productsearch()

{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	WebElement tabsearch=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @class='nav-input nav-progressive-attribute']"));

	tabsearch.sendKeys("Sandals");
	WebElement submit=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	submit.click();
	//Explicit wait to wait until  the page loads 
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='a-button-text a-declarative']")));
	//using click method
	driver.findElement(By.xpath("(//*[text()='Price: Low to High'])[last()]")).click();
	
//using select method
	/*WebElement selectdropdown=driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));

	Select selcategory=new Select(selectdropdown);
	selcategory.selectByVisibleText("Price: Low to High");*/
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@aria-label='4 Stars & Up']"))).click();
	
	//WebElement ratingfilter=driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']/span[contains(text(),'4 Stars & Up')]"));
	//ratingfilter.click();
	//WebElement fourstars=driver.findElement(By.xpath("//i[contains(@class,'a-icon a-icon-star-medium a-star-medium')]"));
	//fourstars.click();
	//WebElement sparx=driver.findElement(By.xpath("//ul[@aria-labelledby='p_89-title']/li[@id='p_89/Sparx']"));
	//WebElement sparx=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@aria-labelledby='p_89-title']/li[@id='p_89/Sparx'][last()]")));
}
public void selectingbrands()
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	driver.findElement(By.xpath("//li[@aria-label='Sparx']//label//i[@class='a-icon a-icon-checkbox']")).click();


	
}
	public void soondelivery()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//li[@aria-label='Get It Today']//i[@class='a-icon a-icon-checkbox']")).click();
	}
	
	public void Pricerefinements()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[contains(text(),'Under ₹500')]")).click();
	}

	
/*public void listproducts()
{
	List<WebElement>totalsandals=driver.findElements(By.xpath("//*[@class='s-main-slot s-result-list s-search-results sg-row']"));
	System.out.println(totalsandals);
		{
		for(WebElement eachsandal:totalsandals)
		{
			String totallist=eachsandal.getText();
			System.out.println(totallist);
			System.out.println("............................................................................................");
			
		}
		}
}*/
	


	
	
public void endwindow()
{
	//driver.close();
}
}
