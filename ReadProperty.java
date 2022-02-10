package SeleniumSession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=null;
		Properties prop=new Properties();
		
		FileInputStream ip=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SeleniumSessions\\src\\SeleniumSession\\config.properties ");
        prop.load(ip);
        
        System.out.println(prop.getProperty("browser"));
        
       String browsername=prop.getProperty("browser");
       
       if(browsername.equals("chrome")) {
    	   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
    	  driver= new ChromeDriver();
       }
       
       else if (browsername.equals("FF")) {
    	   driver=new FirefoxDriver();
       }
       
       else {
    	   System.out.println("No Browser Value given");
       }
       
       driver.get(prop.getProperty("url"));
       driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		
       
       driver.findElement(By.xpath("//input[@name='email']")).sendKeys(prop.getProperty("username"));
		
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}

}
