package day42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/* 
1) Open application
2) Test logo presence
3) Login
4) Close
*/

public class OrangeHRMTest {
	
  WebDriver driver;
	
  @Test(priority=1)
  void openApp() throws InterruptedException 
  {
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  
  }
  
  @Test(priority=2)
  void testLogo() throws InterruptedException
  {
	  boolean status = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
	  System.out.println("logo displayed:"+status);
	  Thread.sleep(3000);
  }
  
  @Test(priority=3)
  void testLogin() throws InterruptedException
  {
	  driver.findElement(By.xpath("//input[@placeholder=\"username\"]")).sendKeys("Admin");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@placeholder=\"password\"]")).sendKeys("admin123");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[text()=\" Login \"]")).click();
	  Thread.sleep(3000);
  }
  
  @Test(priority=4)
  void testLogout()
  {
	  driver.quit();
  }
}
