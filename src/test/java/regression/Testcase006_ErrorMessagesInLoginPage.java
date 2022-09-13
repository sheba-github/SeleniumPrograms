package regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Using Objects and Methods
//Error messages in Login Page
//1.Invalid UserName and Password
//2.Invalid UserName and Valid Password
//3.Valid UserName and Valid Password
//Using CssSelector with Tag and Attribute ,Css with tag and id


public class Testcase006_ErrorMessagesInLoginPage {

	public static void main(String[] args) throws InterruptedException {

		// Creating object of class
		
		Testcase006_ErrorMessagesInLoginPage obj = new Testcase006_ErrorMessagesInLoginPage();
	
		// Calling as methods
		obj.InvalidUserNameAndPassword();
		obj.InvalidUserNameAndValidPassword();
		obj.ValidUserNameAndInvalidPassword();

	}

	public void InvalidUserNameAndPassword() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://demo.opencart.com/index.php?route=account/login";
		driver.get(baseurl);

		driver.manage().window().maximize();

		// providing userName and password

		driver.findElement(By.cssSelector("input#input-email")).sendKeys("reachauto222@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("test13");
		driver.findElement(By.cssSelector("input[class='btn btn-primary']")).click();

		String ErrText = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		System.out.println("Error message1: " + ErrText);

		Thread.sleep(2000);

		driver.quit();

	}

	public void InvalidUserNameAndValidPassword() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://demo.opencart.com/index.php?route=account/login";
		driver.get(baseurl);
		driver.manage().window().maximize();

		// providing userName and password

		driver.findElement(By.cssSelector("input#input-email")).sendKeys("reachauto222@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("test123");
		driver.findElement(By.cssSelector("input[class='btn btn-primary']")).click();

		String ErrText = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		System.out.println("Error message2: " + ErrText);

		Thread.sleep(2000);

		driver.quit();

	}

	public void ValidUserNameAndInvalidPassword() {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://demo.opencart.com/index.php?route=account/login";
		driver.get(baseurl);

		driver.manage().window().maximize();

		// providing userName and password

		driver.findElement(By.cssSelector("input#input-email")).sendKeys("reachauto2022@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("test12");
		driver.findElement(By.cssSelector("input[class='btn btn-primary']")).click();

		String ErrText = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		System.out.println("Error message3: " + ErrText);

	}

}
