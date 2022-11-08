package testng_programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class p24 
{
	public class p21 
	{
			@Test
			public void login()
			{
				System.out.println("login Script");
				
			}
			
			@Test(dependsOnMethods= {"login"})
			public void users()
			{
				System.out.println("users script");
				Assert.fail();
			}
			
			@Test(dependsOnMethods= {"login","users"})
			public void adduser()
			{
				System.out.println("adduser script");
			}
	}

}


