package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		
		driver.get("https://ui.cogmento.com/");
		
		driver.findElement(By.name("email")).sendKeys("utkarshtrehan17@gmail.com");
		driver.findElement(By.name("password")).sendKeys("#Utkarsh95");
		driver.findElement(By.className("ui fluid large blue submit button")).click();

	}

}
