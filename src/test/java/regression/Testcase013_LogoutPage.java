package regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//To validate Logout
//Logging in->logout->click on Continue button->Landing Page
//xpath with parent to child
public class Testcase013_LogoutPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://demo.opencart.com/index.php?route=account/login";
		driver.get(baseurl);

		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("reachautotest2022@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.xpath("//li[@class ='dropdown open']/ul/li[5]")).click();
		String logoutText= driver.findElement(By.xpath("//h1[contains(text(),'Logout')]")).getText();
		if(logoutText.equals("Account Logout"))
		{
			System.out.println("Logged Off Successfully");
			
		}
		
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		String title = driver.getTitle();
		System.out.println("Landed Sucessfully on "+ title+" Page");
	}

}
