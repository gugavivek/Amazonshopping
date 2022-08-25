import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverLogLevel;
import org.openqa.selenium.interactions.Actions;

public class Amazonshop
{
WebDriver driver;
static String url="https://www.amazon.in/";

	public  void invokebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/Guga/Documents/Selenium/chromedriver/chromedriver");
		 driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
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

	
		
		
		// TODO Auto-generated method stub
			
			
			public void search()
			{
			
			
				WebElement tabsearch=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

				tabsearch.sendKeys("Sandals");
				WebElement submit=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
				submit.click();

			}
				
				//WebElement link1=driver.findElement(By.xpath("//a[contains (text(),'Amazon Basics')]"));
				//link1.click();
		 public void endsession()
		 {
			
				driver.close();
		 }
		 
			public static void main(String[] args) {
				Amazonshop obj=new Amazonshop();
				obj.invokebrowser();
				obj.search();
				//obj.endsession();
				

					

	

	}

}
