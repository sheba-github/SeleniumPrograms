package regression;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Test in FireFox browser -User Registration
public class Testcase001_DemocartInFirefox {

public static void main(String[] args) {
	
System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://demo.opencart.com/");


driver.manage().window().maximize();


}}
