package regression;
//Testcase to enter the form and selecting the Privacy policy

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase004_RegisterPageFormTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseurl = "https://demo.opencart.com/index.php?route=account/register";
        driver.get(baseurl);
        
        driver.manage().window().maximize();
        
        driver.findElement(By.id("input-firstname")).sendKeys("Sheba");
        driver.findElement(By.name("lastname")).sendKeys("Saras");
        driver.findElement(By.id("input-email")).sendKeys("reachautotest2022@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("6475645004");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@placeholder='Password Confirm']")).sendKeys("test123");
        driver.findElement(By.name("newsletter")).click();
        driver.findElement(By.name("agree")).click();
        
		

	}

}
