package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ExplicitWaitConcept {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		clickOn(driver,driver.findElement(By.xpath("//a[text()='Create New Account']")),20);
		//clickOn(driver,driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")),20);
		

	}

	private static void clickOn(WebDriver driver, WebElement locator, int timeout) throws InterruptedException {
		// TODO Auto-generated method stub
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Christina");
		driver.findElement(By.name("lastname")).sendKeys("Sharon");
		
		driver.findElement(By.name("reg_email__")).sendKeys("ChristinalovesBharat@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ChristinalovesBharat@gmail.com");
		
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234tyurhh");
		
		Select select=new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("29");
		
		Select select1=new Select(driver.findElement(By.id("month")));
		select1.selectByVisibleText("Mar");
		
		Select select2=new Select(driver.findElement(By.id("year")));
		select2.selectByVisibleText("1996");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
	}

}
