package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlebrowse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		
		driver.get("https://www.pdftoword.com/");
		
		
		driver.findElement(By.name("file")).sendKeys("C:\\Users\\hp\\Documents\\My Docs\\EAadhaar_xxxxxxxx6589_22122020182453_859220.pdf");
	}

}
