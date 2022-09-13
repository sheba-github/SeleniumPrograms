package regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Adding as a wishlist item
//wishlist item not displayed before adding as wishlist
public class Testcase017_Wishlist {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseurl = "https://demo.opencart.com/";
        driver.get(baseurl);
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);        
        //wishList before adding item
        String wishlistBeforeText=driver.findElement(By.xpath("//ul[@class='list-inline']/li[3]")).getText();
        System.out.println("WishList Text before adding items to Cart: "+ wishlistBeforeText);
        
        driver.findElement(By.xpath("//a[text()='Desktops']")).click();
        driver.findElement(By.xpath("//a[text()='Mac (1)']")).click();
        driver.findElement(By.xpath("//a[text()='iMac']")).click();
        driver.findElement(By.xpath("//div[@class='button-group']/button[2]")).click();
            
        //wishList after adding item
        String wishlistAfterText=driver.findElement(By.xpath("//ul[@class='list-inline']/li[3]")).getText();
        System.out.println("WishList Text after adding items to Cart: "+wishlistAfterText);
        
	}

}
