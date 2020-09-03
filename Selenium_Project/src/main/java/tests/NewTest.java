package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
	  @Test
	  public void openMyBlog() {
	driver.get("https://www.softwaretestingmaterial.com/");
	System.out.println(driver.getTitle());
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
	  
	  /*System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  */
	  System.setProperty("webdriver.chrome.driver", "F:\\Git\\GIT_Repositories\\Selenium_Project\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  
	  }
	 
	  @AfterClass
	  public void afterClass() {
	  driver.quit();
	  }
}
