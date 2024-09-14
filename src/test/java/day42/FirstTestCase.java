package day42;

/*
1) Open app
2) Login
3) Logout
*/

import org.testng.annotations.Test;

public class FirstTestCase {
	
  @Test(priority=0)
  public void openApp() 
  {
	  
	   System.out.println("Opening application...");
	  
  }
  
  @Test(priority=1)
  public void login()
  {
	  
	  System.out.println("Login to application...");
	  
  }
  
  @Test(priority=2)
  public void logout()
  {
	  
	  System.out.println("Logout from application...");
	  
  }
}
