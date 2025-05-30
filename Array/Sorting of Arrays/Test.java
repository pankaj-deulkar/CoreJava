import java.util.*;
public class Test{
	
	public static void main(String[] args)
	{
		int[] array={5,8,6,9,4,3,7,1,2};
		System.out.println("Before Sorting");
		for(int i:array)
		{
			System.out.println(i);
		}
		
		Arrays.sort(array);
		System.out.println("After Sorting");
		for(int i1:array)
		{
			System.out.println(i1);
		}
	}
}
		
		
		
		
		