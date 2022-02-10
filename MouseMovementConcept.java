package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		
		driver.get("https://www.airindia.in/");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Manage Your Trip"))).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Star Alliance Seat Assignment")).click();

	}

}
