package regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch chromebrowser
//Window Maximize
//Get PageTitle and get url 
//Using Thread.sleep
//getCookies
//Using Navigation commands 
//Entering a text in Search field using xpath and cssSelector with class
//Using quit

public class Testcase002_LandingPage {

	public static void main(String[] args) throws InterruptedException {
//Setting system property
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//Storing url
		String baseurl = "https://demo.opencart.com/";
        driver.get(baseurl);
 //to get cookies
        System.out.println("cookies:"+driver.manage().getCookies());
        
// To maximize the window
		driver.manage().window().maximize();

//To get the Page title
		System.out.println("Page title of website is: " + driver.getTitle());
		
//To get CurrentURl
		
		System.out.println("Current URL is: "+driver.getCurrentUrl());
        System.out.println("***********************************");	
		
// To get PageSource 
	    System.out.println("Page Source: "+ driver.getPageSource());
	  	Thread.sleep(2000);
//to refresh the page
		driver.navigate().refresh();
		
//To navigate to google 
		driver.navigate().to("https://www.google.com/");

//To go back to democart page
		driver.navigate().back();		
		Thread.sleep(1000);
		
// To go forward to google
		driver.navigate().forward();
		Thread.sleep(2000);
		
//To go back to democart page
		
		driver.navigate().back();
		Thread.sleep(1000);

//To  enter iphone text in Search field
		
		driver.findElement(By.xpath("//input[@name ='search']")).sendKeys("iphone");
        driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();

		Thread.sleep(1000);
//Quit the browser
//If using quit and the using driver->session id is null..using webdriver after calling quit?
//if using close invalid session id
		
		driver.close();
	driver.getTitle();
		

	}

}
