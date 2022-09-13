package regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TestCase for Successful Account Updation
//Clearing the field before updating
//xpath with ->starts with
//Validation - not working

public class Testcase008_AccountUpdation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://demo.opencart.com/index.php?route=account/login";
		driver.get(baseurl);

		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("input#input-email")).sendKeys("reachautotest2022@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

//Get the text and click on link

		String editAcctText = driver.findElement(By.partialLinkText("Edit")).getText();
		System.out.println(editAcctText);
		driver.findElement(By.partialLinkText("Edit")).click();

//Clear before editing else it will append old value

		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys("Saras");
		driver.findElement(By.xpath("//input[@value='Continue']")).click();

//Validation for Successful Updation

		String successUpdateText = "Success: Your account has been successfully updated";
		String updateText = driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText();
		System.out.println(updateText);
		
		if (updateText.equalsIgnoreCase(successUpdateText)) {
			driver.findElement(By.xpath("//a[starts-with(text(),'Edit your')]")).click();
			String lastnameText = driver.findElement(By.id("input-lastname")).getText();
			System.out.println(lastnameText);
			 if(lastnameText.equals("Sarav"))
		     System.out.println("Account Successfully updated!");
			 else
			 System.out.println("Account not updated");

		}

	}

}
