package regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*  This testcase is to navigate to Register Page and validating the register account title*/

public class TestCase003_RegisterPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseurl = "https://demo.opencart.com/";
        driver.get(baseurl);
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                
        //Clicking on My Account Link
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        //Click on Register 
        driver.findElement(By.linkText("Register")).click();  
      
    
        String pageTitle = driver.getTitle();
             
        System.out.println(pageTitle);
        //Validation for Register Page
        if(pageTitle.equalsIgnoreCase("REGISTER ACCOUNT"))
        {
        	System.out.println("Landed successfully on Register Account Page");
        	
        }
        
        
        
	}}


