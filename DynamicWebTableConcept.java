package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicWebTableConcept {

	

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.com/");
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		ClickOn(driver,driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")),40);
		
		
		
		
	}
	
	public static void ClickOn(WebDriver driver,WebElement locator,int timeout) throws InterruptedException  {
		
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("utkarshtrehan17@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("#Utkarsh95");
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		Thread.sleep(5000);
		
		
		
		driver.findElement(By.xpath("//*[@id='main-nav']/div[3]/a")).click();
		
		
		
		//String beforexpath="//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[";
		//String afterxpath="]/td[2]/a";
		
		/*for (int i=1;i<=4;i++)
		{
			String name=driver.findElement(By.xpath(beforexpath+i+afterxpath)).getText();
			System.out.println(name);
			
			if(name.equals("Meena"))
			{
				System.out.println("//*[@id="main-content"]/div/div[2]/div/table/tbody/tr["+i"]/td[1]/div/label");
			}
		
		
		}*/
		
		driver.findElement(By.xpath("//a[text()='Deepa B']/parent::td//preceding-sibling::td//input[@name='id']")).click();
		
	}

}
