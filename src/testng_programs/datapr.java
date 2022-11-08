package testng_programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import apache_programs.p5_to_login_;

public class datapr
{
	@DataProvider
	public Object[] getdata()
	{
		Object[] data= {100,25.5f,'$',"java"};
		return data;
	}
	
	@DataProvider
	public Object[][] logincr()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="admin";
		data[0][1]="manager";
		data[1][0]="trainee";
		data[1][1]="trainee";
		data[2][0]="java";
		data[2][1]="selenium";
		return data;
		
	}
	
	
	@DataProvider
	public Object[][] addusr() throws Throwable
	{
		Object[][] d = new Object[1][5];
		d[0][0]=p5_to_login_.getData("adduser", 1,0);
		d[0][1]=p5_to_login_.getData("adduser", 1,1);
		d[0][2]=p5_to_login_.getData("adduser", 1,2);
		d[0][3]=p5_to_login_.getData("adduser", 1,3);
		d[0][4]=p5_to_login_.getData("adduser", 1,4);
		return d;
		
		
		
		
		
	}

	private Object p5_to_login_(String string, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}
