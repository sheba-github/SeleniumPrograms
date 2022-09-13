package regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Add 2 same items and remove 2 same items
//id,xpath and css
public class Testcase012_ItemRemoveFromCart {

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
        driver.findElement(By.cssSelector("span#cart-total")).click();
        driver.findElement(By.xpath("//button[@title='Remove']")).click();
        String itemUpdateText= driver.findElement(By.cssSelector("span#cart-total")).getText();
        System.out.println(itemUpdateText);
       // String itemText="0 item(s) - $0.00";
        if(itemUpdateText.equals("0 item(s) - $0.00")) {
        	System.out.println("Items are removed");
        }
        
        
	}

}
