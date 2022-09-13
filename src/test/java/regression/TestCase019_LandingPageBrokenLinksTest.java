package regression;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase019_LandingPageBrokenLinksTest {

	public static void main(String[] args) throws IOException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//String baseurl = "https://demo.opencart.com/";
		String baseurl = "http://automationpractice.com/index.php";

		driver.get(baseurl);
        
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total no of links: "+ links.size());
		
		List<WebElement> activelinks=new ArrayList<WebElement>();
        for(int i=0;i<links.size();i++)
        {
        	if(links.get(i).getAttribute("href")!=null)
        	{   
        		activelinks.add(links.get(i));
        		System.out.println(activelinks.get(i).getText());
        	}
        
        
        }              
        
        //To check connection
        for(int j=0;j<activelinks.size();j++)
        {
        	HttpURLConnection connection =(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
       connection.connect();
       String responseMsg = connection.getResponseMessage();
        connection.disconnect();
        System.out.println("Links with responseMessage"+(activelinks.get(j).getAttribute("href"))+responseMsg );
        
        
        }}}
