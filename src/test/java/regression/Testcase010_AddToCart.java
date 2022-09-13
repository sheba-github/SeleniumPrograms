package regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Adding 2 iMac to cart-------------->Item Text  displayed as 0.0 after adding
public class Testcase010_AddToCart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseurl = "https://demo.opencart.com/";
        driver.get(baseurl);
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);        
        driver.findElement(By.xpath("//a[text()='Desktops']")).click();
        driver.findElement(By.xpath("//a[text()='Mac (1)']")).click();
        driver.findElement(By.xpath("//a[text()='iMac']")).click();
        driver.findElement(By.id("input-quantity")).clear();
        driver.findElement(By.id("input-quantity")).sendKeys("2");
        driver.findElement(By.id("button-cart")).click();
        
        System.out.print("ItemCart Text: "+ driver.findElement(By.cssSelector("span#cart-total")).getText());

        
        //String itemText= driver.findElement(By.cssSelector("span#cart-total")).getText();
      
        //System.out.println("Items added to cart: "+itemText);
        
        
        
        
        
        
		
	}

}
