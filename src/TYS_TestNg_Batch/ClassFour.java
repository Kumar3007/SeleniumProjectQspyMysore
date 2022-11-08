package TYS_TestNg_Batch;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ITestListenerPracice.ITestListenerClass;

@Test
@Listeners({ITestListenerClass.class})
public class ClassFour 
{
	
	public void testFourA()
	{
		System.out.println("Inside testFourA method of ClassFour");
	}	
	
	public void testFourB()
	{
		System.out.println("Inside testFourB method of ClassFour");
		Assert.assertTrue(false);
	}	
	
	
	public void testFourC()
	{
		System.out.println("Inside testFourC method of ClassFour");
	}	
	
	public void testfourD()
	{
		System.out.println("From method 4 of class four");
	}
	
}
