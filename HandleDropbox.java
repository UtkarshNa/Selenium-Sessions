package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		
		
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		
		driver.findElement(By.id("businessaccount-radio")).click();
		
		driver.findElement(By.id("businessName")).sendKeys("Ram");
		driver.findElement(By.cssSelector("#businessEmail")).sendKeys("Kapooryti8765@gmail.com");
		driver.findElement(By.name("bizPassword")).sendKeys("#1Utkarsh");
		
		Select select=new Select(driver.findElement(By.id("businessCountry")));
		select.selectByVisibleText("India");
		
		driver.findElement(By.id("bizOnlyToBuy")).click();
		
		boolean bol=driver.findElement(By.xpath("//button[contains(text(), 'Register')]")).isDisplayed();
		
		System.out.println(bol);
		
		boolean nol=driver.findElement(By.xpath("//button[contains(text(), 'Register')]")).isEnabled();
		
		System.out.println(nol);
		
		driver.findElement(By.id("BUSINESS_REG_FORM_SUBMIT")).click();
		
		
		boolean ol=driver.findElement(By.id("businessaccount-radio")).isSelected();
		System.out.println(ol);
		}

}
