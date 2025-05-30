import java.util.*;
public class Test{
	
	public static void main(String [] args)
	{
		String[] arr={"e","x","b","a","c"};
		System.out.println("Before Sorting");
		for(String s:arr)
		{
			System.out.println(s);
		}
		
		Arrays.sort(arr);
		System.out.println("After Sorting");
		for(String s:arr)
		{
			System.out.println(s);
		}
	}
}
		
		
		
		