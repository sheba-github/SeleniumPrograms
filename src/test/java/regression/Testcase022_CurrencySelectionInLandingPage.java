package regression;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//Currency selection in Landing Page
//WebDriver wait
public class Testcase022_CurrencySelectionInLandingPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "https://demo.opencart.com/";
        driver.get(baseurl);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']")).click();
		
		WebDriverWait w= new WebDriverWait(driver,50);
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='dropdown-menu")));
		

		List<WebElement> currencyOptions = driver.findElements(By.xpath("//ul[@class='dropdown-menu']"));
		
		System.out.println(currencyOptions.size());
		for(int i=0;i<currencyOptions.size();i++)
		{
			System.out.println("CurrencyOptions are: "+ currencyOptions.get(i).getText());
		}
		
		
      //  driver.findElement(By.xpath("//span[@id=\"cart-total\"]")).click();

	}

}
