package regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Testcase to check if image carousel is displayed or not

public class TestCase002_LandingPageCarouselTest {

	public static void main(String[] args) {
		// Setting system property

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Storing url
		String baseurl = "https://demo.opencart.com/";
		driver.get(baseurl);

		// To maximize the window
		driver.manage().window().maximize();

		// To provide Implicitwait

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//To check carousel is displayed 
		
		boolean carouselDisplay = driver.findElement(By.xpath("//div[@class='swiper-slide text-center swiper-slide-active']")).isDisplayed();
		System.out.println("Carousel display: " + carouselDisplay);

	}

}
