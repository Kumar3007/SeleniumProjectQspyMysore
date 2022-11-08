package testng_programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class p14
{
		@DataProvider
		public Object[] getdata()
		{
			Object[] data= {100,25.5f,'$',"java"};
			return data;
		}
		@Test(dataProvider="getdata")
		public void script1(Object d)
		{
		System.out.println(d);
		System.out.println("..............");
		}
		
}