package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		
		
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		driver.findElement(By.id("firstname")).sendKeys("tom");
		
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Cat");
		
		//driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("Tom@gmail.com");
		
		driver.findElement(By.cssSelector("#Email")).sendKeys("utkarshtrehan17@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("#Utkarsh95");
		
		
		
        driver.findElement(By.xpath("//button[text()='Register']")).click();
 		
		
	}
}
	
