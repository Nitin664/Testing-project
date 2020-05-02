package practicetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	WebDriver driver;
	//Launch Browser
   public void launchbrowser()
   {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Om Sai Ram\\Downloads\\chromedriver_win32.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com");
	 driver.manage().window().maximize();
   }
 
}
