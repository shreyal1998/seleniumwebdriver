package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
1) Login - @BeforeClass
2) Search - @Test
3) Adv search - @Test
4) Logout - @AfterClass
*/

public class AnnotationsDemo2 
{

	@BeforeClass
	void login()
	{
		System.out.println("This is login...");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("This is logout");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("This is search...");
	}
	
	@Test(priority=2)
	void advancedSearch()
	{
		System.out.println("The Advanced search...");
	}
		
}
