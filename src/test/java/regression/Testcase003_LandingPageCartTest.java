package regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//GetText in Item Cart button in Landing Page, XPath with contains 

public class Testcase003_LandingPageCartTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "https://demo.opencart.com/";
        driver.get(baseurl);
        
		driver.manage().window().maximize();
				
        driver.findElement(By.xpath("//span[@id=\"cart-total\"]")).click();
		System.out.println(driver.findElement(By.xpath("//ul[contains(@class,'pull-right')]")).getText());

			}

}
