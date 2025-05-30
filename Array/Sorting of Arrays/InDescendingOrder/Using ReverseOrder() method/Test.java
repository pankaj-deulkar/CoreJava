import java.util.*;
public class Test{
	
	public static void main(String[] args)
	{
		Integer [] a={1,5,8,7,6,3,4,92,10,-80,-15,54,101};
		System.out.println("Before Sorting");
		for(int a1:a)
		{
			System.out.println(a1);
		}
	     	
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("After Sorting");
		
		for(int a2:a)
		{
			System.out.println(a2);
		}
	}
}