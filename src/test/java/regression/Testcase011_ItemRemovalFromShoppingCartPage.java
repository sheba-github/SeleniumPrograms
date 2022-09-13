package regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//add 2 different items
//Clicking on Checkout from the header links 
//removing the second item from View Shopping Cart Page 
//Used relative xpath and xpath with text()

public class Testcase011_ItemRemovalFromShoppingCartPage {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	String baseurl = "https://demo.opencart.com/";
    driver.get(baseurl);
    
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
    //Adding iMac
    driver.findElement(By.xpath("//a[text()='Desktops']")).click();
    driver.findElement(By.xpath("//a[text()='Mac (1)']")).click();
    driver.findElement(By.xpath("//a[text()='iMac']")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("button-cart")).click();
    //Adding a tablet
    driver.findElement(By.xpath("//a[text()='Tablets']")).click();
    driver.findElement(By.xpath("//a[text()='Samsung Galaxy Tab 10.1']")).click();
    driver.findElement(By.id("button-cart")).click();
    Thread.sleep(1000);

   //Item Cart updated and getting Text
    System.out.print("ItemCart Text: "+ driver.findElement(By.cssSelector("span#cart-total")).getText());

   //Clicking on Checkout from the header link and removing item from View Shopping Cart Page
    driver.findElement(By.xpath("//span[text()='Checkout']")).click();
    driver.findElement(By.xpath("//div/table/tbody/tr[2]/td[4]/div/span/button[2]")).click();
    
    
}}
