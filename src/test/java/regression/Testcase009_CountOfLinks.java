package regression;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Count of Links and get Text in Account Page
//Using Tagname 
public class Testcase009_CountOfLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://demo.opencart.com/index.php?route=account/login";
		driver.get(baseurl);

		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("reachautotest2022@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//Use findElements 
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links in Accounts Page: "+ links.size());
        
		System.out.println("Linktext : ");
		
		for(int i=0;i<links.size();i++)
		{
		System.out.println(links.get(i).getText());
			
		}
		
	}

}
