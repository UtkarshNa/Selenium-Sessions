package SeleniumSession;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.LoggerFactory;

public class GenerateLogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log=	Logger.getLogger(GenerateLogs.class);
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		log.info("Launching Google ");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https//www.google.com");
		
		log.info("Google Launched");
		
		String title=driver.getTitle();
		
		log.info("Title of page is "+ title);
		
		if(title.equals("Google")){
			log.info("Correct");
			
		}
		
		else {
			log.info("Incorrect");
		}
		

	}

}
