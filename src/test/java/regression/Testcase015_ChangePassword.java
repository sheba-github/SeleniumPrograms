package regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//LoginPage->enter userName and password
//Click on Change your password
//Enter password and confirm password
//Click on continue
//Validating change password message 
//click Logout from Right links
//click login from My Account with new Password
//xpath,css
public class Testcase015_ChangePassword {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://demo.opencart.com/index.php?route=account/login";
		driver.get(baseurl);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Login
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("reachautotest2022@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("test1234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		// Change Password
		driver.findElement(By.id("input-password")).sendKeys("test123");
		driver.findElement(By.id("input-confirm")).sendKeys("test123");

		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		// Success message

		String changePasswordText = driver
				.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();

		String str = " Success: Your password has been successfully updated.";
		if (changePasswordText.equalsIgnoreCase(str)) {
			System.out.println("Password change text displayed properly");
		}

		// Click on Logout from Right links
		driver.findElement(By.xpath("//div[@class='list-group']/a[13]")).click();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();

		// Click on login with the new password
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[2]")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("reachautotest2022@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("test1234");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// Validating Successful password change
		boolean myAccount = driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
		if (myAccount) {
			System.out.println("Password Changed Successfully");
		}
	}
}
