package regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WishList Item removal - Page changed to Login Page
public class Testcase018_WishlistItemRemoval {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseurl = "https://demo.opencart.com/";
        driver.get(baseurl);
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
        
        //wishList before adding item
        String wishlistBeforeText=driver.findElement(By.xpath("//ul[@class='list-inline']/li[3]")).getText();
        System.out.println("WishList Text before adding items to Cart: "+ wishlistBeforeText);
        
        //Adding an item in wishlist
        
        driver.findElement(By.xpath("//a[text()='Tablets']")).click();
        driver.findElement(By.xpath("//a[text()='Samsung Galaxy Tab 10.1']")).click();  
        driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).click();
       
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//ul[@class='list-inline']/li[3]")).click();
       
    	driver.findElement(By.cssSelector("input#input-email")).sendKeys("reachautotest2022@gmail.com");
	    driver.findElement(By.cssSelector("input#input-password")).sendKeys("test123");
	    
		driver.findElement(By.xpath("//input[@type='submit']")).click();


        driver.findElement(By.xpath("//a[@data-original-title='Remove']")).click();
        String wishlistUpdatedText=driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText();
        String str=" Success: You have modified your wish list!";
        
       if(wishlistUpdatedText.equals(str))
        {
        	System.out.println("Wishlist Updated successfully");
        }
        
	}

}
