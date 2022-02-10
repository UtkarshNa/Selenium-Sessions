package SeleniumSession;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinkTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
		        

		        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		        
		        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		        
		        
				
				driver.findElement(By.id("ap_email")).sendKeys("9210571337");
				
				driver.findElement(By.id("continue")).click();
				
				driver.findElement(By.cssSelector("#ap_password")).sendKeys("#Utkarsh95");
				
				
				
				driver.findElement(By.id("signInSubmit")).click();
				
				List<WebElement> linklist =driver.findElements(By.tagName("a"));
				linklist.addAll(driver.findElements(By.tagName("img")));
				
				System.out.println("No. of Links and Images are "+linklist.size());
				
				// taking only Active Links which have href
				List<WebElement> activeLinks=new ArrayList<WebElement>();
				
				for (int i=0;i<linklist.size();i++) {
					//System.out.println(linklist.get(i).getAttribute("href"));
					if(linklist.get(i).getAttribute("href")!=null && (!linklist.get(i).getAttribute("href").contains("javascript"))) {
						activeLinks.add(linklist.get(i));
					}
						
				}
				
				System.out.println("No. of Active Links and Images are "+activeLinks.size());
				
				
				for (int j=0;j<activeLinks.size();j++) {
					
					HttpURLConnection connection= (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
					connection.connect();
					String response=connection.getResponseMessage();
					connection.disconnect();
					System.out.println(activeLinks.get(j).getAttribute("href")+"--> "+response);
					
				}
				
				
				

	}

}
