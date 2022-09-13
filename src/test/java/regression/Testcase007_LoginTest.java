package regression;

import org.openqa.selenium.By;
//To login successfully
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//To test successful login from the direct url
public class Testcase007_LoginTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://demo.opencart.com/index.php?route=account/login";
		driver.get(baseurl);

		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("reachautotest2022@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("test1234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
				
//Login Validation
		
		
		boolean myAccount=driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
		if(myAccount)
		{
			System.out.println("Logged in Successfully");
		}
		driver.quit();
		
	}

}
