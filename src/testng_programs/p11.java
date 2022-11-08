package testng_programs;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class p11 
{
		@Parameters("madhu")
		@Test
		public void script(String data)
		{
			System.out.println("from script 1");
			System.out.println(data);
		}
}
