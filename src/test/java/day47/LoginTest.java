package day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest 
{
  WebDriver driver;	
	
  @BeforeClass
  void setUp() throws InterruptedException 
  {
	  
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  
  }
  
  @Test
  void testLogin()
  {
	  
	  LoginPage lp = new LoginPage(driver);
	  
	  lp.setUserName("Admin");
	  lp.setPassword("admin123");
	  lp.clickLogin();
	  
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	  
  }
  
  @AfterClass
  void tearDown()
  {

	 driver.quit(); 
	  
  }
  
}
