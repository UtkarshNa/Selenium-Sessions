package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		WebDriver driver=new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        

        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        
        driver.get("https://www.facebook.com/");
        
        String text=driver.getTitle();
        
        Thread.sleep(2000);
        
        System.out.println("Text is "+text);
		
        
		
		driver.findElement(By.id("email")).sendKeys("utkarshtrehan17@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("mastmagan");
		//driver.findElement(By.name("bizPassword")).sendKeys("#1Utkarsh");
		
		//Select select=new Select(driver.findElement(By.id("businessCountry")));
		//select.selectByVisibleText("India");
		
		//driver.findElement(By.id("bizOnlyToBuy")).click();
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
        String text1=driver.getTitle();
        
        System.out.println("Now the Text is "+text1);
		
	}

}
