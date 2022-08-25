import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazongtry {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/Guga/Documents/Selenium/chromedriver/chromedriver");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");



		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Sandals",Keys.ENTER);

		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='a-button-text a-declarative']")));
		driver.findElement(By.xpath("//*[@class='a-button-text a-declarative']")).click();
		
		
		//driver.findElement(By.xpath("(//*[text()='Price: Low to High'])[last()]")).click();
		// TODO Auto-generated method stub
		
		WebElement sparx=driver.findElement(By.xpath("//li[@aria-label='Sparx']//label//input[@type='checkbox']"));
		sparx.click();
		
			System.out.println("Brand : Sparx");
			
		{
			System.out.println("Not Selected");

		}

	}

}
