package testng_programs;

import org.testng.annotations.Test;

public class p21 
{
		@Test(priority=5)
		public void fb()
		{
			System.out.println("from fb");
			
		}
		
		@Test(priority=5)
		public void acti()
		{
			System.out.println("from acti");
		}
		
		@Test(priority=5)
		public void myn()
		{
			System.out.println("from myn");
		}
}
