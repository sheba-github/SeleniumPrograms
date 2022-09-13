package regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Login Page->FP Link->
//Back button in FP Page->FP Link ->
//give email address->continue->confirmation message 
//Forgotten password - xpath 

public class TestCase014_ForgottenPasswordPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://demo.opencart.com/index.php?route=account/login";
		driver.get(baseurl);

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/form/div[2]/a")).click();
		
		//Clicking on Back button 
		
		driver.findElement(By.xpath("//a[text()='Back']")).click();
		
		//Clicking on link again
		driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/form/div[2]/a")).click();
		
		//email address
		driver.findElement(By.id("input-email")).sendKeys("reachautotest2022@gmail.com");
		

		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		//Validation on confirmation text
		String confirmationText= driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		
		String str = " An email with a confirmation link has been sent your email address.";
		
		System.out.println("Confirmation text: "+confirmationText);
		if(confirmationText.equals(str))
		{
			System.out.println("Email Confirmation text displayed properly");
			
		}
	}

}
