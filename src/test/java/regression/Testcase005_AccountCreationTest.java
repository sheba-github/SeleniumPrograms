package regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TestCase to validate the radioButton,linkText and checkBox 
//using isDisplayed, isSelected ,isChecked and click on Continue button

public class Testcase005_AccountCreationTest {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://demo.opencart.com/index.php?route=account/register";
		driver.get(baseurl);

		driver.manage().window().maximize();
//Enter form
		driver.findElement(By.id("input-firstname")).sendKeys("Sheba");
		driver.findElement(By.name("lastname")).sendKeys("Saras");
		driver.findElement(By.id("input-email")).sendKeys("reachauto1@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("6475645004");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@placeholder='Password Confirm']")).sendKeys("test123");
		driver.findElement(By.name("newsletter")).click();
		
//To check if yes radio button is enabled        
		System.out.println("Radio button is enabled: " + driver.findElement(By.name("newsletter")).isEnabled());
		
//To check if privacy policy  is displayed
		boolean privacyPolicyPresent = driver.findElement(By.cssSelector("a.agree")).isDisplayed();
		System.out.println("The privacy policy is displayed: " + privacyPolicyPresent);
		
//To check if checkbox is selected
		
		driver.findElement(By.name("agree")).click();
		boolean agreeChkBox = driver.findElement(By.name("agree")).isSelected();
		System.out.println("The agree checkbox is selected: " + agreeChkBox);
		
//To click on Continue button

		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
//To validate if account is created
		String acctText="Congratulations! Your new account has been successfully created!";
		String text =driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
        if(text.equals(acctText))
        {
        	System.out.println("Account Created Succcessfully");
        }
	}
}
