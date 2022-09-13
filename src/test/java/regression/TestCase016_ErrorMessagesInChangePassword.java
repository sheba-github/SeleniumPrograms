package regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Error messages in Change Password field
//Add Error message validation
public class TestCase016_ErrorMessagesInChangePassword {

	public static void main(String[] args) {
		
		TestCase016_ErrorMessagesInChangePassword obj= new TestCase016_ErrorMessagesInChangePassword();
		obj.InvalidPasswordAndConfirm();
		obj.BlankPasswordAndConfirm();
		obj.InvalidPasswordAndValidConfirm();
		obj.ValidPasswordAndInvalidConfirm();
		
	}
	
	public void InvalidPasswordAndConfirm() {	
				
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://demo.opencart.com/index.php?route=account/login";
		driver.get(baseurl);

		driver.manage().window().maximize();
		
		//Login
				driver.findElement(By.cssSelector("input#input-email")).sendKeys("reachautotest2022@gmail.com");
				driver.findElement(By.cssSelector("input#input-password")).sendKeys("test123");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
	    //Change Password
				driver.findElement(By.id("input-password")).sendKeys("test124");
				driver.findElement(By.id("input-confirm")).sendKeys("test126");
				driver.findElement(By.xpath("//input[@value='Continue']")).click();

				driver.quit();
				
	}
	public void BlankPasswordAndConfirm(){	
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://demo.opencart.com/index.php?route=account/login";
		driver.get(baseurl);

		driver.manage().window().maximize();
		
		//Login
				driver.findElement(By.cssSelector("input#input-email")).sendKeys("reachautotest2022@gmail.com");
				driver.findElement(By.cssSelector("input#input-password")).sendKeys("test123");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
	    //Change Password
				driver.findElement(By.id("input-password")).sendKeys(" ");
				driver.findElement(By.id("input-confirm")).sendKeys(" ");
				driver.findElement(By.xpath("//input[@value='Continue']")).click();
				driver.quit();

	}
	
	public void InvalidPasswordAndValidConfirm() {	
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://demo.opencart.com/index.php?route=account/login";
		driver.get(baseurl);

		driver.manage().window().maximize();
		
		//Login
				driver.findElement(By.cssSelector("input#input-email")).sendKeys("reachautotest2022@gmail.com");
				driver.findElement(By.cssSelector("input#input-password")).sendKeys("test123");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
	    //Change Password
				driver.findElement(By.id("input-password")).sendKeys("test126");
				driver.findElement(By.id("input-confirm")).sendKeys("test1234");
				driver.findElement(By.xpath("//input[@value='Continue']")).click();
				driver.quit();

	}
	
public void ValidPasswordAndInvalidConfirm() {	
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://demo.opencart.com/index.php?route=account/login";
		driver.get(baseurl);

		driver.manage().window().maximize();
		
		//Login
				driver.findElement(By.cssSelector("input#input-email")).sendKeys("reachautotest2022@gmail.com");
				driver.findElement(By.cssSelector("input#input-password")).sendKeys("test123");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
	    //Change Password
				driver.findElement(By.id("input-password")).sendKeys("test1234");
				driver.findElement(By.id("input-confirm")).sendKeys("test124");
				driver.findElement(By.xpath("//input[@value='Continue']")).click();
	
				driver.quit();

	}
}
