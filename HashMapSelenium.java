package SeleniumSession;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ui.freecrm.com/");
		
		
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		String user_value=getCredentialsMap().get("Customer"); //utkarshtrehan17@gmail.com:#Utkarsh95
		
		
		
		driver.findElement(By.name("email")).sendKeys(user_value.split(":")[0]);
		driver.findElement(By.name("password")).sendKeys(user_value.split(":")[1]);
		
	
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
		
	}
	public static HashMap<String,String> getCredentialsMap() {
		
		HashMap<String,String> user = new HashMap<String,String>();
		user.put("Customer", "utkarshtrehan17@gmail.com:#Utkarsh95");
		user.put("Admin", "utkarshtrehan17@gmail.com:#Utkarsh95");
		user.put("Seller", "utkarshtrehan17@gmail.com:#Utkarsh95");
		user.put("Distributor", "utkarshtrehan17@gmail.com:#Utkarsh95");
		user.put("DeliveryBoy", "utkarshtrehan17@gmail.com:#Utkarsh95");
		return user;
		
		
		
	}
		
		
	
		
		
		

	

}
