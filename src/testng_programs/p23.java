package testng_programs;

import org.testng.annotations.Test;

public class p23 
{
	public class p21 
	{
			@Test(invocationCount=5)
			public void fb()
			{
				System.out.println("from fb");
				
			}
			
			@Test(invocationCount=3)
			public void acti()
			{
				System.out.println("from acti");
			}
			
			@Test(invocationCount=5)
			public void myn()
			{
				System.out.println("from myn");
			}
	}

}
