import java.util.LinkedHashSet;

public class A_HashSet {

	public static void main(String[] args) 
	{
		String s="welcome to bengalore welcome to testyantra";
		String[] str=s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		for (String str1 : set)
		{
		int count=0;
		
		for(int i=0;i<str.length;i++)
		{
			if(str1.equals(str[i]))
			{
				count++;
			}
		}
		if(count>1)
		{
		System.out.println(str1+" "+count);
		}
		
	}

	}
}
