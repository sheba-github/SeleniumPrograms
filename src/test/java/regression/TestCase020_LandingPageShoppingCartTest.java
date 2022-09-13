package regression;
//Clicking on Shopping cart link from Landing page
//Using LinkText
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase020_LandingPageShoppingCartTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "https://demo.opencart.com/";
        driver.get(baseurl);
        
		driver.manage().window().maximize();
		
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);        

		
        driver.findElement(By.linkText("Shopping Cart")).click();
        driver.findElement(By.linkText("Continue")).click();

        
	}

}
