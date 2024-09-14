package day44;

import org.testng.annotations.Test;

public class SignupTests 
{

	@Test(priority=1, groups = {"regression"})
	void loginByEmail()
	{
		
		System.out.println("This is login by email...");
		
	}
	
	@Test(priority=2, groups = {"regression"})
	void loginByFacebook()
	{
		
		System.out.println("This is login by facebook...");
		
	}
	
	@Test(priority=3, groups = {"regression"})
	void loginByTwitter()
	{
		
		System.out.println("This is login by twitter...");
		
	}
	
}
