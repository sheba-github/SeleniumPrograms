package regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//To get the attribute value from Contact Us page
public class TestCase024_GetAttributeContactUsPageTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "https://demo.opencart.com/";
        driver.get(baseurl);
		driver.manage().window().maximize();
		
		
		//Clicking on contact us link in Landing Page
		
		driver.findElement(By.xpath("//ul[@class='list-inline']/li[1]/a")).click();
		
		//Printing the getattribute values
		System.out.println(driver.findElement(By.xpath("//ul[@class='list-inline']/li[1]/a")).getAttribute("href"));
		System.out.println(driver.findElement(By.xpath("//label[@for='input-name']")).getAttribute("for"));
		System.out.println(driver.findElement(By.xpath("//label[@for='input-email']")).getAttribute("for"));
		System.out.println(driver.findElement(By.xpath("//label[@for='input-enquiry']")).getAttribute("for"));

		
		
	}

}
