import java.util.*;
public class Test{
	
	public static void main(String[] args)
	{
		String[] a={"Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange"};
		
		System.out.println("Before Sorting");
		for(String s:a)
		{
			System.out.print(s+",");
		}
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println("After Sorting");
		for(String s:a)
		{
			System.out.print(s+",");
		}
	}
}
		
		
			